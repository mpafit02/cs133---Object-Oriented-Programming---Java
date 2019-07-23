package homework5;

/**
 * @author Marios Pafitis 911719, Stavroulla Koumou 970080
 */
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
 * @author Stavroulla Koumou
 *
 */
public class TestSolver {

	private static Dictionary dictionary;
	private static int numOfQuestions = 0;
	private static int score = 0;

	/**
	 * This function takes as a parameter a filename, and calculates the percentage
	 * of the questions which the function most_similar_word() (@see
	 * homework5.CosineSimilarity) selects the correct answer for. It does this with
	 * the use of a Dictionary instance that creates (@see homework5.Dictionary).
	 * 
	 * @param filename
	 *            the name of the file with the TOEFEL test to be solved;
	 * @throws IOException
	 *             in case something goes wrong with writing the answers and final
	 *             score in the AnswerSheet.txt file that is this program's output.;
	 * 
	 * @author Stavroulla Koumou
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

					String answer = CosineSimilarity.most_similar_word(questionData[0],
							Arrays.copyOfRange(questionData, 2, questionData.length),
							dictionary.getSemanticDescriptors()); // create the semantic descriptors for all
																	// the words that
					answerSheet.println(answer);

					if (answer.equals(questionData[1]))
						score++;
				}
			}

			answerSheet.print("\nScored " + score + " out of " + numOfQuestions);
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
	 * Calls the necessary methods to educate the program with the received files,
	 * and then solves the TOEFEL test that is also received as a file.
	 * <p>
	 * Correct order of received filenames: the files that will be used to educate
	 * the program come first, and the file with the questions that need solving
	 * comes last.
	 * 
	 * 
	 * @param filenames
	 *            the filenames to educate the program and the file with the test to
	 *            be solved.;
	 * @throws IOException
	 *             in case something goes wrong with the filenames received as
	 *             input.;
	 * 
	 * @author Marios Pafitis 911719, Stavroulla Koumou 970080
	 */

	public static void main(String[] filenames) throws IOException {
		// long start = System.nanoTime();

		if (filenames.length <= 1) {
			System.out.println("Error: Not enough files given.\n\nProgram terminates.");
			System.exit(0);
		}

		dictionary = new Dictionary(Arrays.copyOfRange(filenames, 0, (filenames.length - 1))); // create the dictionary
		// long start1 = System.nanoTime();
		run_similarity_test(filenames[filenames.length - 1]); // send the test file to get solved
		// System.out.println("Similarity: " + (System.nanoTime() - start1) /
		// 1000000000.0);
		// System.out.println("Total: " + (System.nanoTime() - start) / 1000000000.0);

	}

}