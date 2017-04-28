
public class Diamonshaped {

	public static void main(String[] args) {

		int d = 1;
		int e = 4;
		int f = 7;
		int g = 1;

		for (int a = 1; a <= 5; a++) {

			System.out.println();

			for (int i = 1; i <= e; i++) {

				System.out.print(" ");

			}
			e--;

			for (int b = 1; b <= d; b++) {

				char c = '*';

				System.out.print(c);
			}

			d = d + 2;

		}

		for (int a = 1; a <= 4; a++) {

			System.out.println();

			for (int i = 1; i <= g; i++) {

				System.out.print(" ");

			}
			g++;

			for (int b = 1; b <= f; b++) {

				char c = '*';

				System.out.print(c);
			}

			f = f - 2;

		}

	}

}
