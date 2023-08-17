import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");

		Scanner input = new Scanner(System.in);
		System.out.print("Masukan data : ");
		String userInput = input.nextLine();

		System.out.println("Hallo "+userInput);

		input.close();
	}
}