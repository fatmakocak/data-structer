package infix_postfix_islemler;

class Stack{
	int top, N;
	char []a;
	
	boolean isEmpty() {
		return top==-1;
	}
	boolean isFull() {
		return top==N-1;
	}
	Stack(int N){
		top=-1;
		a=new char[N];
		this.N=N;
	}
	void push(char x) {
		if(!isFull()) {
			top++;
			a[top]=x;
		}
	}
	char pop() {
		if(!isEmpty()) {
			top=top-1;
			char x= a[top+1];
			return x;
		}
		return ' ';
	}
	char peek() {
		return a[top];
		
		}
	}
	

public class parantez_hesaplama {
	static boolean eslesme(char c1, char c2) {
		       if(c1=='(' && c2== ')')
			return true;
		else if (c1== '{' && c2=='}')
			return true;
		else if (c1== '[' && c2==']')
			return true;
		else 
			return false;
	
	}
       static boolean dengelimi(String str) {
    	   
    	   //boþ yýðýt tanýmla
    	   
    	   Stack st = new Stack(100);
    	   for (int i = 0; i < str.length(); i++) {
    		   
    		   //eðer str[i] parantez açma ise ekle
    		   
    		   if(str.charAt(i)== '{'  ||  str.charAt(i)=='('  ||  str.charAt(i)=='[')
    			   st.push(str.charAt(i));
    		   if(str.charAt(i)== '}'  ||  str.charAt(i)==')'  ||  str.charAt(i)==']')
    			  if(st.isEmpty())
    				  return false;
    			  else if (!eslesme(st.pop(),str.charAt(i)))
    				  return false;
    		   
			
		}
    	   return st.isEmpty();
    	   
       }
       
       

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
         String s = "{{()}[]";
         if(dengelimi(s))
        	 System.out.println("dengeli parantez");
         else
        	 System.out.println("parantezler dengeli deðil");
         
	}
 
}
