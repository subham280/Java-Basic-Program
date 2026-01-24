
public class RgelarExpression {

	public static void main(String[] args) {
		String input="abcdabefghabijkab";
		String exp="ab.";
		
		int prev=input.length();
		input=input.replaceAll(exp,"");
		System.out.println((prev - input.length())/exp.length());
	}

}
