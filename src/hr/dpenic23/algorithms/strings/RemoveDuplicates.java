package hr.dpenic23.algorithms.strings;

/**
 * Algorithm for removing duplicate characters from string, without additional
 * memory (O(n^2)). The alternative is to have an additional buffer (array of
 * size 256 for ASCII) or set, hence the time complexity becomes lower (O(n)).
 * 
 * @author dpenic23
 *
 */
public class RemoveDuplicates {

	public static void main(String[] args) {

		char[] str1 = "abcd".toCharArray();
		char[] str2 = "aaaa".toCharArray();
		char[] str3 = "".toCharArray();
		char[] str4 = "aaabbb".toCharArray();
		char[] str5 = "ababababa".toCharArray();

		removeDuplicates(str1);
		removeDuplicates(str2);
		removeDuplicates(str3);
		removeDuplicates(str4);
		removeDuplicates(str5);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);

	}

	public static void removeDuplicates(char[] str) {

		int length = str.length;

		if (length <= 1) {
			return;
		}

		int tail = 1;

		for (int i = 1; i < length; i++) {

			boolean isDuplicate = false;

			for (int j = 0; j < i; j++) {
				if (str[i] == str[j]) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				str[tail] = str[i];
				tail++;
			}

		}

		for (int i = tail; i < length; i++) {
			str[i] = 0;
		}

	}

}
