package set_01_project_03;

import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
    Scanner scan = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;

    a = scan.nextInt();
    b = scan.nextInt();
    c = scan.nextInt();

    scan.close();

    if(a == b && b == c) {
    	System.out.println("OK");
    } else {
    	System.out.println("NOT OK");
    }

	}
}
