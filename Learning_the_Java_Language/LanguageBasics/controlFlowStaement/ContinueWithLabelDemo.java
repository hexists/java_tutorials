class ContinueWithLabelDemo {
	public static void main(String[] args) {

		String searchMe = "Look for a substring in me";
		String substring = "sub";
		boolean foundIt = false;

		int max = searchMe.length() - substring.length();

	test:
		for (int i = 0; i <= max; i++) {
			int n = substring.length();
			int j = i;
			int k = 0;
			System.out.println("i : " + i + ", j : " + j + ", k : " + k);
			while (n-- != 0) {
				System.out.println("n : " + n);
				if (searchMe.charAt(j++) != substring.charAt(k++)) {
					continue test;
				}
			}
			System.out.println("FoundIt");
			foundIt = true;
			break test;
		}
		System.out.println(foundIt ? "Found it" : "Didn't find it");
	}
}
