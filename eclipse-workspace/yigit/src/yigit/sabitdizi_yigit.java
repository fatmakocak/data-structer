package yigit;
class eleman{
	int icerik;
	public eleman(int icerik) {
		this.icerik=icerik;
		
	}
}
    class yigitlar{
    	eleman[]dizi;
    	int ust;
    	int N;
    	
    	public yigitlar(int N) {
    		this.N=N;
    		dizi=new eleman[N];
    		ust=-1;//baþlangýçta boþ bir yýðýt
    	}
    	boolean bosmu() {
    		return ust==-1;
    	}
    	boolean dolumu() {
    		return ust == N-1;
    	}
    	void push(eleman e) {
    		if(!dolumu()) {
    			ust++;
    			dizi[ust]=e;
    			
    		}
    	}
    	eleman pop() {
    		if(!bosmu()) {
    			ust--;
    			return dizi[ust+1];
    		}
    		return  null;
    		
    		}	
    	
    eleman top() {
    	if(!bosmu()) {
    		return dizi[ust];
    	}
    	else {
    		return null;
    		
    		
    	}
    }
    	
    }
    

public class sabitdizi_yigit {
	

	public static void main(String[] args) {
		
       yigitlar y =new yigitlar(15);
       y.push(new eleman(21));
       y.push(new eleman(30));
       y.push(new eleman(5));
       y.pop();
       y.push(new eleman(7));
       y.push(new eleman(3));
       y.push(new eleman(18));
       y.pop();
       System.out.println(y.top().icerik);
       
      /* for (int i = 0; i < 10; i++) {
    	   y.push(new eleman(i));
       }
       while(!y.bosmu()) {
    	  System.out.println(y.pop().icerik);
    	   
		
	}
	}*/
	}
}

