package packageName;
import java.util.Scanner;
public class File3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a username: ");
		String u = scan.nextLine();
		System.out.print("Enter a password: ");
		String p = scan.nextLine();
		scan.close();
		if ((u.toLowerCase().equals("admin"))&&(p.equals("1234password")))
			System.out.print("Login Successful!");
		else
			System.out.print("Login failed. Please try again.");
	}
}
