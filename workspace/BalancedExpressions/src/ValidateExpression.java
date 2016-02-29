import java.util.Stack;

public class ValidateExpression {
	public static void main(String[] args){
		boolean blnAnswer = CheckExpression(args[0]);
		String strAnswer ="";
		if(blnAnswer){
			strAnswer = "La expresion es valida";
		}else{
			strAnswer = "La expresion no es valida";
		}
		System.out.println(strAnswer);
	}
	private static boolean CheckExpression(String expression){
		Stack<Character> stackExpressions = new Stack<Character>();
		boolean blnExpressionVerified= true;
		int position = 0;
		char charPosString;
		
		while((blnExpressionVerified != false) && (position < expression.length())){
			charPosString = expression.charAt(position);
			switch(charPosString){
				case '(': {
					stackExpressions.push(charPosString);
					break;
				}
				case '[': {
					stackExpressions.push(charPosString);
					break;
				}
				case '{': {
					stackExpressions.push(charPosString);
					break;
				}
				case ')': {
					char charLastUsed = stackExpressions.lastElement();
					if(charLastUsed != '('){
						blnExpressionVerified = false;
					}else{
						stackExpressions.pop();
					}
					break;
				}
				case ']': {
					char charLastUsed = stackExpressions.lastElement();
					if(charLastUsed != '['){
						blnExpressionVerified = false;
					}else{
						stackExpressions.pop();
					}
					break;
				}
				case '}': {
					char charLastUsed = stackExpressions.lastElement();
					if(charLastUsed != '{'){
						blnExpressionVerified = false;
					}else{
						stackExpressions.pop();
					}
					break;
				}
			}
			position++;
		}
		
		return blnExpressionVerified;
	}
}
