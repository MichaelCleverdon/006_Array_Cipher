package Caesar;

public class CaesarCipher {


private static String alpha = "abcdefghijklmnopqrstuvwxyz";
private static int alphaLength = alpha.length();
	public static String encode(String plainText, int key ) {
		String codedWord = "";
		System.out.println("Text, alpha length = " + alpha.length());
		System.out.println("test, first char is: " + alpha.charAt(0));
		System.out.println("test, first char is: " + alpha.charAt(alpha.length()-1));
		// TODO Auto-generated method stub
		
		for (int i = 0; i < alpha.length(); i++) {
			//System.out.println(alpha.charAt(i));
		}
		System.out.println("\n\n");
		for (int i=0; i <= plainText.length()-1; i++) {
			int inx = alpha.indexOf(plainText.charAt(i));
			int shiftInx = (inx + key) % alpha.length();
			
			
			if (shiftInx >=alphaLength) {
				shiftInx = shiftInx - alphaLength;
			}
			codedWord += alpha.charAt(shiftInx);
			
		//	codedWord += plainText.charAt(i);
		}
		
		return codedWord;
		
	}

	
	
}
