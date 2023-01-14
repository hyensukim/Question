package day15_230114;

import java.util.*;

public class ExpValidCheck {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Usage : java ExpValidCheck \"EXPRESSION?\"");
			System.out.println("Example : java ExpValidCheck\"((2+3)*1)+3\"");
			System.exit(0);
		}
	
		Stack stack = new Stack();
		String expression = args[0];
		
		System.out.println("expression : " + expression);
		
		try {
			for(int i=0; i <expression.length(); i++) {
				char ch = expression.charAt(i);
				if(ch == '(') {
					stack.push(ch+"");
				}else if(ch==')') {
					stack.pop();
				}
			}
			
			if(stack.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			}else {
				System.out.println("괄호가 일치하지 않습니다");
			}
			
		}catch(EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다.");
		}
	}	
}
/* 예상 결과
 * c:\jdk1.8\work\chll>java ExpValidCheck
 * Usage : java ExpValidCheck "EXPRESSION"
 * Example : java EXpValidCheck "(2+3)*1)+3"
 * 
 * c:\jdk1.8\work\chll>java ExvalidCheck (2+3)*1
 * expression : (2+3)*1
 * 괄호가 일치합니다.
 */