package homework5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * This class creates a dictionary. In essence, it receives the files that will
 * be used to create a dictionary, reads them, and creates semantic descriptors
 * for all the words that have appeared in, at least, one of the sub-ArrayLists
 * (that represent books and sentences) in the passed nested ArrayList.
 * 
 * In essence, a semantic descriptor is a HashMap that has each of the
 * aforementioned words as keys, and another HashMap, that is their vector, as
 * the value assigned to the key.
 * 
 * A word's vector is created by locating all the sub-lists (sentences) that the
 * word appears in, and counting the appearance of each of the rest of the words
 * in the aforementioned sub-lists; the numbers of the appearance of each, are
 * the vector's coordinates.
 * 
 * @author Marios Pafitis, Stavroulla Koumou
 *
 */
public class Dictionary {

	HashMap<String, HashMap<String, Integer>> semanticDescriptors = new HashMap<String, HashMap<String, Integer>>();
	ArrayList<ArrayList<ArrayList<String>>> sentenceLists;

	/**
	 * Constructor that creates the sentence lists from the files
	 * 
	 * @param filenames
	 * 
	 * @author Stavroulla
	 */
	public Dictionary(String[] filenames) {
		long start = System.nanoTime();
		sentenceLists = get_sentence_lists_from(filenames);

		System.out.println("Semantics: " + (System.nanoTime() - start) / 1000000000.0);

	}

	/**
	 * Returns a mutable HashMap, the semantic descriptors, after having created the
	 * new semantic descriptors
	 * 
	 * @return HashMap<String, HashMap<String, Integer>>, the semantic descriptors,
	 *         after having created the new semantic descriptors
	 * 
	 * @author Stavroulla
	 */
	public HashMap<String, HashMap<String, Integer>> getSemanticDescriptors(String[] words) { // it in the comments
		return build_semantic_descriptors(sentenceLists, words);
	}

	/**
	 * Is using the method getSentenceLists(filename) for each book to read it and
	 * return an ArrayList with the sentences of the book
	 * 
	 * @param filenames
	 *            that represent the books which I want to learn
	 * @return ArrayList<ArrayList<ArrayList<String>>>, the words fore each sentence
	 *         for each book. Book<Sentences<Words>>
	 * 
	 * @author Marios
	 */
	private ArrayList<ArrayList<ArrayList<String>>> get_sentence_lists_from(String[] filenames) {
		long start = System.nanoTime();
		ArrayList<ArrayList<ArrayList<String>>> book = new ArrayList<>();
		for (int i = 0; i < filenames.length; i++)
			book.add(getSentenceLists(filenames[i]));
		System.out.println("Read: " + (System.nanoTime() - start) / 1000000000.0);
		return book;
	}

	/**
	 * It reads the book with the use of the Scanner Class. It separates each
	 * sentence. Then it separates each word from the sentence and store it into the
	 * ArrayList.
	 * 
	 * @param filename
	 *            the book that I want to read
	 * @return ArrayList<ArrayList<String>> which are the sentences in the book
	 *         containing the words
	 * 
	 * @author Marios
	 */
	private ArrayList<ArrayList<String>> getSentenceLists(String filename) {
		Scanner scan;
		String[] text;
		ArrayList<String> list;
		ArrayList<ArrayList<String>> sentences = new ArrayList<>(10000);
		try {
			scan = new Scanner(new File(filename));
			scan.useDelimiter("[.?!]+");
			while (scan.hasNext()) {
				String sentence = scan.next();
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
	 * This method takes as parameter the book (ArrayList), and the words that I
	 * want to create the Semantic Descriptors.
	 * 
	 * @param book
	 *            that I want to create the semantic descriptors
	 * @param words
	 *            that we want to build the semantic descriptor of
	 * @return HashMap<String, HashMap<String, Integer>> the semantic descriptor
	 * 
	 * @author Stavroulla
	 */
	public HashMap<String, HashMap<String, Integer>> build_semantic_descriptors(
			ArrayList<ArrayList<ArrayList<String>>> books, String[] words) {
		for (String word : words) { // for every word that we want to build the semantic descriptor of
			if (!semanticDescriptors.containsKey(word)) { // if the word is not already in the map
				HashMap<String, Integer> wordVector = new HashMap<String, Integer>(); // create a vector for it
				for (ArrayList<ArrayList<String>> sentenceList : books) { // for every book
					for (ArrayList<String> wordList : sentenceList) { // for every sentence
						if (wordList.contains(word)) { // if the word i am looking for is in the sentence
							for (String otherWord : wordList) // for every word in the sentence
								if (otherWord != null) { // if it is not null
									if (!otherWord.equals(word)) // if is not the one we are working on
										// if not already in the sub map, put it OR this is the first word to go in
										if (wordVector == null || !wordVector.containsKey(otherWord))
											wordVector.put(otherWord, 1);
										else // else increment current value
											wordVector.put(otherWord, (wordVector.get(otherWord) + 1));
									semanticDescriptors.put(word, wordVector); // put the word in the hashmap
								}
						}
					}
				}
			}
		}
		return semanticDescriptors;
	}

	/**
	 * A print method that prints the ArrayList which represents the books with the
	 * sentences with the words
	 * 
	 * @param list
	 *            that I want to print
	 * 
	 * @author Marios
	 */
	private void printAvailableSentenceList(ArrayList<ArrayList<String>> list) {
		System.out.print("[");
		for (int i = 0; i < list.size(); i++) {
			System.out.print("[");
			for (int j = 0; j < list.get(i).size(); j++) {
				System.out.print("\'" + list.get(i).get(j) + "\'");
				if (j != list.get(i).size() - 1) {
					System.out.print(", ");
				} else {
					System.out.print("]");
				}
			}
			if (i != list.size() - 1) {
				System.out.println(", ");
			} else {
				System.out.println("]");
			}
		}
	}

	/**
	 * A print method that prints the Semantic Descriptors
	 * 
	 * @author Stavroulla
	 */
	public void print_semantic_descriptors() {
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