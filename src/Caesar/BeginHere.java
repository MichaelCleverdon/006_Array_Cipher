package Caesar;

import java.util.Scanner;

public class BeginHere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
			CaesarCipher myCipher = new CaesarCipher();
			
			System.out.println("Please enter the plain text to encode");
			String plainText = kbd.nextLine().toLowerCase();
			System.out.println("Please enter a key: ");
			int key = kbd.nextInt();
		
			String codedText = CaesarCipher.encode(plainText, key);
			System.out.println("Your secret message is " +codedText);
	}

}
