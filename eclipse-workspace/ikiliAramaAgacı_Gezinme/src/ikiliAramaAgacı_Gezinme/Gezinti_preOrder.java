package ikiliAramaAgacý_Gezinme;
import java.util.Stack;
class eleman{
	int icerik;
	eleman sag,sol;
	
	public eleman(int icerik) {
		this.icerik=icerik;
		sag=null;
		sol=null;
		
	}
}
  class ikiliAramaAgacý {
	eleman kok = null ;
	
 public boolean Arama(int e) {
	 eleman d;
	 d=kok;
	 while(d!=null) {
		 if(d.icerik==e)
			 return true;
		 else
			if(d.icerik>e)
				d=d.sol;
			else
				d=d.sag;
	 }
	 return false;
	 
		 
	 }
 public void ekleme(int e) {
	 eleman y=null;
	 eleman x=kok;
	 eleman z= new eleman(e);
	 while(x!=null) {
		 y=x;
		 if(e<x.icerik)
			 x=x.sol;
		 else
			 x=x.sag;
	 }
	 if(y==null)
		 kok=z;
	 else
		 if(e<y.icerik)
			 y.sol=z;
		 else
			 y.sag=z;
 }

    	 public void preOrder() {
    		eleman d=kok;
    		 Stack <eleman> s= new Stack<eleman>();
    		 if(d==null) {
    			 return;
    		 }
    			 s.push(d);
    			 while(!s.isEmpty()) {
    				 d=s.pop();
    				 System.out.print(d.icerik+ " ");
    				 if(d.sag!=null) {
    					 s.push(d.sag);
    				 }
    				 if(d.sol!=null) {
    					 s.push(d.sol);
    				 }
    			 }
    			 System.out.println("");
    			 
    				 }
    	 public void inOrder() {
    		 eleman d=kok;
    		 Stack <eleman> s= new Stack<eleman>();
    		 if(d==null) {
    			 return;
    		 }
    			 while(d!=null || !s.isEmpty()) {
    				 while(d!=null) {
    					 s.push(d);
    					 d=d.sol;
    				 }
    				 d=s.pop();
    				 System.out.print(d.icerik+ " ");
    				 d=d.sag;
    			 }
    			 System.out.println(" ");
    			 
    					 
    				 }
    	 public void postorder() {
    		 eleman d=kok;
    		 Stack <eleman> s1= new Stack<eleman>();
    		 Stack <eleman> s2= new Stack<eleman>();
    		 if(d==null) {
    			 return;
    		 }
    		 s1.push(d);
    		 while(!s1.isEmpty()) {
    			 d=s1.pop();
    			 s2.push(d);
    			 if(d.sol!=null)
    				 s1.push(d.sol);
    			 if(d.sag!=null)
    				 s1.push(d.sag);
    		 }
    		 while(!s2.isEmpty()) {
    			 System.out.print(s2.pop().icerik+ " ");
    		 }
    		 System.out.println(" ");
    		 
    		 }
    		 
    	 }
    			
public class Gezinti_preOrder {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ikiliAramaAgacý a= new ikiliAramaAgacý();
		
		a.ekleme(50);
		a.ekleme(30);
		a.ekleme(20);
		a.ekleme(40);
		a.ekleme(70);
		a.ekleme(60);
		a.ekleme(80);
		System.out.println("aðacýn preorder'a göre sýralý hali");
		a.preOrder();
		System.out.println("aðacýn inorder'a göre sýralý hali");
		a.inOrder();
		System.out.println("aðacýn postorder'a göre sýralý hali");
		a.postorder();
	}
}





