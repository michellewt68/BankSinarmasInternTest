import java.util.*;
public class Main2 {

	public Main2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution("(()(())())");
        solution("())");
	}
	public static int solution(String N) {
	    
	    if(N.isEmpty()) return 1;
	    
	    //kalau pjg dari string N nya 1 berarti tdk properly nested karena hanya ada 1 ( atau ) maka return 0
	    if(N.length()==1) return 0; 
	    
	    //pakai stack karena ingin pop dan push stackny untuk mengecek 
	    Stack<Character> stack = new Stack<>();     

	    for(int i=0;i<N.length();i++) {
	        switch (N.charAt(i)) {
	            case ')':
	                if (!stack.isEmpty() && stack.peek() == '(')
	                    stack.pop();
	                else return 0;
	                break;
	            default:
	                stack.push(N.charAt(i));
	                break;
	        }
	    }
	    
	    //isi stackny sudah kosong berarti properly nested maka return 1
	    
	    if(stack.size()==0) return 1;
	    else return 0;
	}
}
