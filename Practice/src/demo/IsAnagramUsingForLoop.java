package demo;

public class IsAnagramUsingForLoop {

	public static boolean IsAnagram(String a, String b) {
		String str1 = a.toLowerCase().replace(" ", "");
		String str2 = b.toLowerCase().replace(" ", "");
		int[] freqArr = new int[256];
		for (int i = 0; i < a.length(); i++) {
			freqArr[str1.charAt(i)]++;
		}
		for (int i = 0; i < b.length(); i++) {
			freqArr[str2.charAt(i)]--;
		}
		for (int i = 0; i < freqArr.length; i++) {
			if (freqArr[i] != 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String a = "Listen";
		String b = "Silent";
		boolean ret = IsAnagram(a, b);
		if (ret) {
			System.out.println("a and b are anagram");
		} else {
			System.out.println("a and b arenot anagram");
		}

	}

}
