package hr.dpenic23.algorithms.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * The algorithm which detects if two string are anagrams or not. The another
 * solution (O(nlogn)) is to sort the given strings and check if they are the
 * same.
 * 
 * @author dpenic23
 *
 */
public class Anagrams {

	public static void main(String[] args) {

		System.out.println(anagrams("string", "rgnsti"));
		System.out.println(anagrams("string", ""));
		System.out.println(anagrams("", ""));
		System.out.println(anagrams("a", "a"));
		System.out.println(anagrams("a", "b"));
		System.out.println(anagrams("aaaabbbb", "abababab"));

	}

	private static boolean anagrams(String s1, String s2) {

		int length = s1.length();

		if (length != s2.length()) {
			return false;
		}

		if (length == 0) {
			return true;
		}

		Map<Character, Integer> chars = new HashMap<>();

		for (int index = 0; index < length; index++) {
			char current = s1.charAt(index);

			if (chars.containsKey(current)) {
				int count = chars.get(current);
				chars.put(current, count + 1);
			} else {
				chars.put(current, 1);
			}

		}

		for (int index = 0; index < length; index++) {
			char current = s2.charAt(index);

			if (chars.containsKey(current)) {
				int count = chars.get(current);
				if (count == 0) {
					return false;
				} else {
					chars.put(current, count - 1);
				}
			} else {
				return false;
			}

		}

		return true;

	}

}
