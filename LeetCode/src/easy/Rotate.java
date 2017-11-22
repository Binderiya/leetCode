package easy;
import java.util.ArrayList;
import java.util.Scanner;

public class Rotate {

	public static void main(String args[]) {
		int[][] clock = new int[2][2];
		clock[0][0] = 1;
		clock[0][1] = 2;

		clock[1][0] = 3;
		clock[1][1] = 4;

		System.out.println(print(clock));
		System.out.println("Rotated:");
		System.out.println(print(rotate(clock)));
	}

	public static int[][] rotate(int[][] clock) {

		int x = 2;
		int y = 0;
		for (int i = 0; i < 2; i++) {
			if (x >= 0) {
				for (int l = 0; l < 2; l++) {
					int tmp = clock[l][x];
					clock[l][x] = clock[i][l];
					clock[i][l] = tmp;

				}
				if (x > 0) {
					x = x - 1;
				}
			}

		}
		return clock;
	}

	public static String print(int[][] clock) {

		String output = "";
		for (int i = 0; i < 2; i++) {
			for (int l = 0; l < 2; l++) {
				output += clock[i][l];
				output += " ";
			}
			output += "\n";

		}
		return output;
	}

}
