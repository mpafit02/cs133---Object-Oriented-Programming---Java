package homework5;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * This class is the Main Class. It uses the Classes CosineSimilarity and
 * Dictionary. It creates a dictionary object to teach the system how to find
 * synonyms. It uses the run_similarity_test to answer the questions and
 * calculate the percentage of the right answers
 * 
 * @author Marios Pafitis, Stavroulla Koumou
 *
 */
public class TestSolver {

	private static Dictionary dictionary;
	private static int numOfQuestions = 0;
	private static int score = 0;

	/**
	 * This function is taking as a parameter a filename. It calculates the
	 * percentage of the questions which the function most_similar_word() chooses
	 * the correct answer while it is using the data of the semantic descriptor
	 * 
	 * @param filename
	 * @throws IOException
	 * 
	 * @author Stavroulla
	 */
	public static void run_similarity_test(String filename) throws IOException {
		PrintWriter answerSheet = new PrintWriter("Answer Sheet.txt");
		BufferedReader source;
		try {
			source = new BufferedReader(new FileReader(filename));
			String Qdata;

			while ((Qdata = source.readLine()) != null) { // while more questions/lines in the file
				String[] questionData = Qdata.split(" ");
				if (questionData != null) {
					if (questionData.length <= 1)
						throw new NullPointerException("Error: Not a compatible question.");

					numOfQuestions++;
					String[] choices = Arrays.copyOfRange(questionData, 2, questionData.length);
					String answer = CosineSimilarity.most_similar_word(questionData[0], choices,
							dictionary.getSemanticDescriptors(questionData)); // create the semantic descriptors for all
																				// the words that
					answerSheet.println(answer);

					if (answer.equals(questionData[1]))
						score++;
				}
			}
			answerSheet.print("Scored " + score + " out of " + numOfQuestions);
			answerSheet.close();
			source.close();
		} catch (FileNotFoundException e1) { // need messages here
			System.out.println("Error: The test file cannot be found.\n\nProgram terminates.");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("Error: IO Exception.\n\nProgram terminates.");
			System.exit(0);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println("\n\nProgram terminates.");
			System.exit(0);
		}

	}

	/**
	 * SUPPOSITION ABOUT THE FILE NAMES: the last filename is the TestFile with the
	 * questions that need solving.
	 * 
	 * 
	 * @param filenames
	 * @throws IOException
	 * 
	 * @author Stavroulla
	 */
	public static void main(String[] filenames) throws IOException { // MAYBE THROW AN EXCEPTION??
		long start = System.nanoTime();

		if (filenames.length <= 1) {
			System.out.println("Error: Not enough files given.\n\nProgram terminates.");
			System.exit(0);
		}

		dictionary = new Dictionary(Arrays.copyOfRange(filenames, 0, (filenames.length - 1))); // create the dictionary
		long start1 = System.nanoTime();
		run_similarity_test(filenames[filenames.length - 1]); // send the test file to get solved
		System.out.println("Similarity: " + (System.nanoTime() - start1) / 1000000000.0);

		System.out.println("Total: " + (System.nanoTime() - start) / 1000000000.0);

	}

}