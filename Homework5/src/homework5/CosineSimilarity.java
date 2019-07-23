package homework5;

import java.util.HashMap;

/**
 * This class Calculates the cosine similarity between 2 wordsTakes a word and a
 * list of possible synonyms, and finds the synonym from that list, if that is
 * possible.
 * 
 * @author Marios Pafitis, Stavroulla Koumou
 *
 */
public class CosineSimilarity {

	/**
	 * Takes a word and a list of possible synonyms, and finds the synonym from that
	 * list, if that is possible.
	 * 
	 * @param word
	 *            the semantic descriptor vector of the word
	 * @param choices
	 *            the semantic descriptor vectors of the possible synonyms
	 * @param semaDesc
	 *            all the words known to the program
	 * @return the synonym, or a suitable message if the synonym could not be found.
	 * 
	 * @author Stavroulla
	 */
	public static String most_similar_word(String word, String[] choices,
			HashMap<String, HashMap<String, Integer>> semaDesc) {

		String mostSimilar = "Could not find synonym!";

		// get the vectors of the word and the possible answers
		HashMap<String, Integer> Qword = semaDesc.get(word);

		double mostSimilarValue = -2;
		for (int i = 0; i < choices.length; i++) { // for all the choices
			double cossim = 0;
			if ((cossim = cosine_Similarity(Qword, semaDesc.get(choices[i]))) > mostSimilarValue) {
				mostSimilar = choices[i];
				mostSimilarValue = cossim;
			}

		}
		if (mostSimilarValue == -1)
			mostSimilar = "Could not find synonym!";

		return mostSimilar;
	}

	/**
	 * Calculates the cosine similarity between 2 words. Is using the
	 * getRootOfSumOfSquares method
	 * 
	 * @param vector1
	 *            first word's vector
	 * @param vector2
	 *            second word's vector
	 * @return a double number that expresses the similarity
	 * 
	 * @author Stavroulla
	 */
	private static double cosine_Similarity(HashMap<String, Integer> vector1, HashMap<String, Integer> vector2) {
		double sim = 0;

		if (vector1 == null || vector2 == null)
			return -1; // if the similarity cannot be calculated

		for (String word : vector1.keySet()) {
			if (vector2.containsKey(word))
				sim += vector1.get(word) * vector2.get(word);
		}

		return sim * 1.0 / (getRootOfSumOfSquares(vector1) * getRootOfSumOfSquares(vector2));
	}

	/**
	 * Calculates the square root of the sum of squares of the passed vector's
	 * coordinates.
	 * 
	 * @param vector
	 * @return double the root of sum of squares
	 * 
	 * @author Stavroulla
	 */
	private static double getRootOfSumOfSquares(HashMap<String, Integer> vector) {
		double sum = 0;
		for (int x : vector.values())
			sum += x * x;

		return Math.sqrt(sum);
	}

}