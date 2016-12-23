package hr.dpenic23.algorithms.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * The algorithm for checking if the provided string contains unique characters,
 * i.e. if all the characters in the string are different. Alternative solutions
 * are to keep track of each characters' occurrence (O(n) time and 256 places
 * for ASCII) or sort the string (O(nlogn)) and check for adjacent characters.
 * 
 * @author dpenic23
 *
 */
public class UniqueCharacters {

	public static void main(String[] args) {

		System.out.println(uniqueCharacters("string"));
		System.out.println(uniqueCharacters("aaaaa"));
		System.out.println(uniqueCharacters("b"));
		System.out.println(uniqueCharacters(""));
		System.out.println(uniqueCharacters("bbaa"));

	}

	private static boolean uniqueCharacters(String string) {

		Set<Character> set = new HashSet<>();
		int length = string.length();

		for (int index = 0; index < length; index++) {
			char current = string.charAt(index);
			if (set.contains(current)) {
				return false;
			} else {
				set.add(current);
			}
		}

		return true;

	}

}
