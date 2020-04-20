package tehtava14;

public class PostFix {
	String[] parts;
	Stack stack;
	
	public PostFix(String expression) {
		stack = new Stack();
		String[] parts = expression.split(" ");
		this.parts = parts;
	}
	
	public static boolean isNumeric (String string) {
		for (char c : string.toCharArray()) {
			if (Character.isDigit(c)) {
				return true;
			}
		} return false;
	}
	
	public String calculate() {
		for (int i = 0; i < this.parts.length; i++) {
			if (isNumeric(this.parts[i])) {
				stack.push(this.parts[i]);
				stack.printItems();
			} else {
				double two = 0;
				double one = 0;
				try {
					two = Double.parseDouble(stack.pop().getData());
					one = Double.parseDouble(stack.pop().getData());
				} catch (NullPointerException e) {
					System.out.println("Virhe syötteessä!");
					return null;
				}
				double result = 0;
				//System.out.println("one on " + one + ", two on " + two);
				switch (this.parts[i]) {
					case "+":
						result = one + two;
						break;
					case "-":
						result = one - two;
						break;
					case "*":
						result = one * two;
						break;
					case "/":
						result = one / two;
						break;
				}
				stack.push(Double.toString(result));
				stack.printItems();
			}
			
		}
		String answer;
		try {
			answer = stack.pop().getData();
		} catch (NullPointerException e) {
			System.out.println("Virhe syötteessä!");
			return null;
		}
		return answer;
	}
}
