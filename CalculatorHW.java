/*
 * Zhongtian Zhai
 * zzhai4@u.rochester.edu
 * last modified at 16 Sep,2023
 * Assignment name: CalculatorHW
*/
import java.util.Scanner;

public class CalculatorHW {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNextLine()) {
			String linecontent = s.nextLine();
			if (linecontent.length() == 0)
				break;
			Scanner line = new Scanner(linecontent);
			double value = line.nextDouble();
			String unit1 = line.next().toLowerCase();
			line.next();
			String unit2 = line.next().toLowerCase();
			if (unit1.equals(unit2)) {
				System.out.println("1.000\n");
			} else if (unit1.equals("f") && unit2.equals("c")) {
				System.out.printf("%.3f\n", (5.0 / 9) * (value - 32.0));
			} else if (unit1.equals("c") && unit2.equals("f")) {
				System.out.printf("%.3f\n", (9.0 / 5) * value + 32);
			} else if (unit1.equals("kg") && unit2.equals("lb")) {
				System.out.printf("%.3f\n", 2.20462 * value);
			} else if (unit1.equals("lb") && unit2.equals("kg")) {
				System.out.printf("%.3f\n", 0.453592 * value);
			} else if (unit1.equals("m") && unit2.equals("ft")) {
				System.out.printf("%.3f\n", 3.28084 * value);
			} else if (unit1.equals("ft") && unit2.equals("m")) {
				System.out.printf("%.3f\n", 0.3048 * value);
			} else if (unit1.equals("h") && unit2.equals("min")) {
				System.out.printf("%.3f\n", 60 * value);
			} else if (unit1.equals("min") && unit2.equals("h")) {
				System.out.printf("%.3f\n", 0.0166667 * value);
			} else
				System.out.println("***Unable to convert from " + unit1 + " to " + unit2 + "***");
		}
	}
}
