package homework5;

/**
 * @author Marios Pafitis 911719, Stavroulla Koumou 970080
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * This class creates a dictionary.
 * <p>
 * It receives the files that will be used to create a dictionary, reads them,
 * and creates semantic descriptors for all the words that have appeared in, at
 * least, in one of the read files.
 * <p>
 * A dictionary is, in essence, a HashMap that has each of the aforementioned
 * words as keys, and another HashMap, that is their vector, as the value
 * assigned to the key.
 * 
 * @author Marios Pafitis, Stavroulla Koumou
 *
 */
public class Dictionary {

	HashMap<String, HashMap<String, Integer>> semanticDescriptors = new HashMap<String, HashMap<String, Integer>>();

	/**
	 * Constructor that creates the sentence lists from the files.
	 * 
	 * @param filenames
	 *            the files to create the semantic descriptors from.;
	 * 
	 * @author Stavroulla Koumou
	 */
	public Dictionary(String[] filenames) {
		// long start = System.nanoTime();
		semanticDescriptors = build_semantic_descriptors(get_sentence_lists_from(filenames));
		// System.out.println("Semantics: " + (System.nanoTime() - start) /
		// 1000000000.0);

	}

	/**
	 * Returns a mutable HashMap that consists of the semantic descriptor vectors of
	 * each unique word in the read files.
	 * 
	 * @return HashMap<String, HashMap<String, Integer>>, the semantic descriptors;
	 * 
	 * @author Stavroulla
	 */
	public HashMap<String, HashMap<String, Integer>> getSemanticDescriptors() {
		return semanticDescriptors;
	}

	/**
	 * Uses the method getSentenceLists(filename) to read each book (file), and
	 * returns an ArrayList with the read books.
	 * 
	 * @param filenames
	 *            that represent the books which I want to learn;
	 * @return ArrayList<ArrayList<ArrayList<String>>>, the words fore each sentence
	 *         for each book. Book<Sentences<Words>>;
	 * 
	 * @author Marios Pafitis
	 */
	private ArrayList<ArrayList<ArrayList<String>>> get_sentence_lists_from(String[] filenames) {
		// long start = System.nanoTime();
		ArrayList<ArrayList<ArrayList<String>>> book = new ArrayList<>();
		for (int i = 0; i < filenames.length; i++)
			book.add(getSentenceLists(filenames[i]));
		// System.out.println("Read: " + (System.nanoTime() - start) / 1000000000.0);
		return book;
	}

	/**
	 * Reads the book with the use of the Scanner Class, breaks down each sentence
	 * into the words that make it up, and saves said words into ArrayLists.
	 * <p>
	 * Each sentence is an ArrayList, that belongs to a bigger ArrayList which
	 * represents the book (file) that the sentences were read from.
	 * 
	 * @param filename
	 *            the book (file) to be read;
	 * @return ArrayList<ArrayList<String>> an ArrayList which represents the read
	 *         book (file) that contains sentences broken down into words in the
	 *         form of ArrayLists<String>;
	 * 
	 * @author Marios Pafitis
	 */
	private ArrayList<ArrayList<String>> getSentenceLists(String filename) {
		Scanner scan;
		String[] text;
		ArrayList<String> list;
		String sentence;
		ArrayList<ArrayList<String>> sentences = new ArrayList<>(10000);
		try {
			scan = new Scanner(new File(filename));
			scan.useDelimiter("[.?!]+");
			while (scan.hasNext()) {
				sentence = scan.next();
				list = new ArrayList<String>();
				text = sentence.split("[\\W]+");
				for (int i = 0; i < text.length; i++) {
					if (!text[i].equals("")) {
						list.add(text[i].toLowerCase());
					}
				}
				if (!list.isEmpty()) {
					sentences.add(list);
				}
			}
			scan.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} // printAvailableSentenceList(sentences);
		return sentences;

	}

	/**
	 * Creates the semantic descriptor vectors of all the books (files) that have
	 * been read.
	 * <p>
	 * <p>
	 * A word's semantic descriptor vector is created by locating all the sentences
	 * that the word appears in, and counting the appearance of each of the rest of
	 * the words in the aforementioned sentences; the numbers of the appearance of
	 * each, are the vector's coordinates.
	 * 
	 * 
	 * 
	 * @param books
	 *            the books (files) that have been read;
	 * @return HashMap<String, HashMap<String, Integer>> the semantic descriptor
	 *         vectors of all the words that appear at least once in the read books
	 *         (files);
	 * 
	 * @author Stavroulla Koumou
	 */
	private HashMap<String, HashMap<String, Integer>> build_semantic_descriptors(
			ArrayList<ArrayList<ArrayList<String>>> books) {

		HashMap<String, HashMap<String, Integer>> map = new HashMap<String, HashMap<String, Integer>>();

		HashMap<String, Integer> wordVector;

		for (ArrayList<ArrayList<String>> book : books)
			for (ArrayList<String> sentenceInBook : book) {
				for (String word : sentenceInBook) {

					if (!map.containsKey(word))
						wordVector = new HashMap<String, Integer>();
					else
						wordVector = map.get(word);

					for (String otherWord : sentenceInBook)
						if (otherWord != null) {
							if (!otherWord.equals(word))
								if (!wordVector.containsKey(otherWord))
									wordVector.put(otherWord, 1);
								else
									wordVector.put(otherWord, (wordVector.get(otherWord) + 1));

							map.put(word, wordVector);
						}
				}
			}
		return map;

	}

	/**
	 * Prints the sentences and words in the received ArrayList which represents a
	 * read book (file).
	 * <p>
	 * (Used for testing.)
	 * 
	 * @param book
	 *            the book to be printed;
	 * 
	 * @author Marios Pafitis
	 */
	private void printAvailableSentenceList(ArrayList<ArrayList<String>> book) {
		System.out.print("[");
		for (int i = 0; i < book.size(); i++) {
			System.out.print("[");
			for (int j = 0; j < book.get(i).size(); j++) {
				System.out.print("\'" + book.get(i).get(j) + "\'");
				if (j != book.get(i).size() - 1) {
					System.out.print(", ");
				} else {
					System.out.print("]");
				}
			}
			if (i != book.size() - 1) {
				System.out.println(", ");
			} else {
				System.out.println("]");
			}
		}
	}

	/**
	 * Prints all the available words and their semantic vector descriptors in this
	 * dictionary instance.
	 * <p>
	 * (Used for testing.)
	 * 
	 *
	 * @author Stavroulla Koumou
	 */
	private void print_semantic_descriptors() {
		for (String word : semanticDescriptors.keySet()) {
			HashMap<String, Integer> vector = semanticDescriptors.get(word);
			System.out.print(word + " = ");
			for (String otherW : vector.keySet()) {
				System.out.print(otherW + " : " + vector.get(otherW) + ", ");
			}
			System.out.println();
		}
	}

}