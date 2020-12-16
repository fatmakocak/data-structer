package deneme;

public class  projem {
	static int projem(int n) {
		switch(n) {
		default:
			return (projem(n-1) + projem(n-2));
		case 1:
		case 2:
		}
		return 1;
		
		}
		 

public static void main(String[] args) {
	
	System.out.println(projem(20));
	
	
		
	
		
		
		
	}

}
