
public class ReverseString {

	
	
	public static void main (String[] args) {
		
		String before = "Love Light"; //Name of String to Reverse
		
		System.out.println("String before reverse:  " + before);
		
		
		StackInterface<Character> from = new ArrayStack();
		
		
		for(int i =0; i < before.length(); i++) { //Pushing letters to stack
			from.push(before.charAt(i));
		}
		
		String after= "";
		
		while (!from.isEmpty()){ // Concatenates popped characters from stack into a single string	
			after =after += from.pop();	
		}

		System.out.println("String after reverse:  " +after);
	
		
		
		
	
}

	
	
}