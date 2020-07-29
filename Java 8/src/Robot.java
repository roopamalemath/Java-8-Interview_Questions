class Robot {

	static void finalPosition(String move) {
		int l = move.length();
		int countUp = 0, countDown = 0;
		int countLeft = 0, countRight = 0;

		for (int i = 0; i < l; i++) {

			if (move.charAt(i) == 'U')
				countUp++;

			else if (move.charAt(i) == 'D')
				countDown++;

			else if (move.charAt(i) == 'L')
				countLeft++;

			else if (move.charAt(i) == 'R')
				countRight++;
		}

			try {
				System.out
						.println("Final Position : (" + (countRight - countLeft) + ", " + (countUp - countDown) + ")");
			} catch (Exception e) {
				System.out.println("Exception Occured");
			}
		}
	

	public static void main(String[] a) {
		String move = "DLLRU";
		finalPosition(move);
	}
}
