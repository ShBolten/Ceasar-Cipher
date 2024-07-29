import java.util.Scanner;
import java.util.Stack;

public class Sort{

	public static void main(String[] args) {
		LinkedDeque<String> d = new LinkedDeque<String>();
		Stack<String> s = new Stack<String>();
		@SuppressWarnings("resource")
		Scanner userInput= new Scanner(System.in); 
		String w = "";
		while (!w.equals("QUIT")) {
			System.out.print("Enter a string: ");
			w = userInput.next();
			if (d.isEmpty())
				d.addFirst(w);
			else {
				if (w.compareTo(d.peekFirst()) < 0)
					d.addFirst(w);
				else if (w.compareTo(d.peekLast()) > 0)
					d.addLast(w);
				else {
					while (w.compareTo(d.peekFirst()) > 0) {
						String elem = d.removeFirst();
						s.push(elem);
					}
						d.addFirst(w);
						while (!s.isEmpty()) {
							d.addFirst(s.pop());
					}
				}
			}
		}
		if (d.peekFirst().equals("QUIT"))
			d.removeFirst();
		else if (d.peekLast().equals("QUIT"))
			d.removeLast();
		System.out.println(d.toString());
	}
}
