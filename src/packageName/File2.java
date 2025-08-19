package packageName;
import java.util.Scanner;
public class File2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n1 = scan.nextInt();
		System.out.print("Enter a number: ");
		int n2 = scan.nextInt();
		String buffer = scan.nextLine();
		System.out.print("Enter an operation(A,S,M,D): ");
		String op = scan.nextLine();
		scan.close();
		if (op.equals("A"))
			System.out.print(n1+n2);
		if (op.equals("S"))
			System.out.print(n1-n2);
		if (op.equals("M"))
			System.out.print(n1*n2);
		if (op.equals("D"))
			System.out.print(n1/n2);

	}

}
