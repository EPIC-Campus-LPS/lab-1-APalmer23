package packageName;
import java.util.Scanner;
public class File1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = scan.nextInt();
		scan.close();
		if (year%4==0) {
			if (year%100==0&&(year%400!=0))
			System.out.print(year+" is not a leap year.");
			else {
				System.out.print(year+" is a leap year.");
			}
		}
		else {
			System.out.print(year+" is not a leap year.");
		}

	}

}
