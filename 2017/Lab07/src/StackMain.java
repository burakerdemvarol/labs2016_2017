/**
 * @author king
 *
 */
public class StackMain {

	public static void main(String[] args) {
		SimpleStack stack = new SimpleStack();
		System.out.println(stack.isEmpty());

		stack.push("x");
		stack.push("y");
		stack.push("z");
		stack.push("c");
		System.out.println(stack.isEmpty());
		System.out.println(stack.list.toString());

		System.out.println("Deleted item : " + stack.pop());
		System.out.println(stack.list.toString());

		String text = "67-3+";
		SimpleStack stack1 = new SimpleStack();

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) != '+' && text.charAt(i) != '-') {
				stack1.push(String.valueOf(text.charAt(i)));
			} else if (text.charAt(i) == '+') {
				System.out.println("Stack : ");
				System.out.println(stack1.list.toString());
				int number1 = Integer.parseInt(stack1.pop());
				int number2 = Integer.parseInt(stack1.pop());

				int result = number1 + number2;
				stack1.push(result + "");
				
			} else if (text.charAt(i) == '-') {
				System.out.println("Stack : ");
				System.out.println(stack1.list.toString());
				int number2 = Integer.parseInt(stack1.pop());
				int number1 = Integer.parseInt(stack1.pop());

				int result = number1 - number2;
				stack1.push(result + "");
			}
		}
		String result = stack1.pop();
		System.out.println(result);

	}

}