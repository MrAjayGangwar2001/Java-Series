import java.util.Scanner;

public class greatest_no{
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		a = sc.nextInt();
		System.out.println("enter value of b");
		b = sc.nextInt();
		System.out.println("enter value of c");
		c = sc.nextInt();
		if (a > b) {
			if (a > c)
				System.out.print("a is greater");
			else
				System.out.print("c is greater");
		} else {
			if (b > c)
				System.out.print("b is greater");
			else
				System.out.print("c is greater");
		}
	}
}
