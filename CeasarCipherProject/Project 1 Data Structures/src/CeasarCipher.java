
public class CeasarCipher {

	static LinkedDeque<Integer> deque = new LinkedDeque<Integer>();
	
	public CeasarCipher() {
		deque.addFirst(7);
		deque.addFirst(2);
		deque.addFirst(4);
		deque.addFirst(5);
		deque.addFirst(3);
	}
	
	@SuppressWarnings("unused")
	public static String encode(String code) {
		code = code.toLowerCase();
		String aToz = "abcdefghijklmnopqrstuvwxyz"; //just in case
		String zeroToNine = "0123456789"; //just in case
		String cipherText = " ";
		for (char character : code.toCharArray()) {
			int letterMinIndex = 'a' - 'a';
			int letterMaxIndex = 'z' - 'a';
			int value = character - 'a';
			if (value < letterMinIndex || value > letterMaxIndex) {
				cipherText += character;
				continue;
			}
			else {
				int numKey = deque.removeFirst();
				value = character + numKey;
				deque.addLast(numKey);
				char newThing = (char) (value);
				cipherText+=newThing;
			}
		}
		code = code.toString();
		return cipherText;
		
	}
	public static void main(String[] args) {
		String sentence = "This 1st Project is Very Confusing but I Will get 123it321 Done";
		@SuppressWarnings("unused")
		CeasarCipher cipher = new CeasarCipher();
		//NO NUMBERS OR SPACES DO THIS
		System.out.println(encode(sentence));
	}

}
