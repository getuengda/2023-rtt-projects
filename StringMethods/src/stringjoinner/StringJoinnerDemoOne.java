package stringjoinner;


public class StringJoinnerDemoOne {
	

	public static void main(String[] args) {
		String[] str = { "a", "b", "c", "d", "e" };

		// In the box was a tire, a saw, a pig

		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
			if (i < str.length - 1) {
				System.out.print(",");
			}
		}

	}

}
