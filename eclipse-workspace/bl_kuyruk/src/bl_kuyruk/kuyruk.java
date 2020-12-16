package bl_kuyruk;
//baðlý liste ile kuyruk tanýmý
class eleman{
	int icerik;
	eleman ileri;
	
	public eleman(int icerik) {
		this.icerik=icerik;
		ileri=null;
		
	}
}

   class bkuyruk{
	eleman bas,son;
   bkuyruk(){
	bas=null;
	son=null;
   }
   boolean bosmu() {
	   return bas==null;
   }
   void push(eleman yeni) {
	   if(!bosmu()) {
		   son.ileri=yeni;
	       son=yeni;
   }
   else {
	   bas=yeni;
	   son=yeni;
   }
	   
	  
   }
	   
	  eleman pop() {
		  eleman sonuc=bas;
		  if(!bosmu()) {
			  bas=bas.ileri;
			  if(bas==null) son=null;
			  
			  
		  } 
		  
	  return sonuc;
	     
   }
   }
   
public class kuyruk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      bkuyruk k= new bkuyruk();
      k.push(new eleman(8));
      k.push(new eleman(15));
     // System.out.println(k.pop().icerik);
     // System.out.println("-------------");
      k.push(new eleman(7));
      k.push(new eleman(23));
      k.push(new eleman(35));
      k.push(new eleman(44));
      while(!k.bosmu()) {
    	  eleman s=k.pop();
    	  System.out.println(s.icerik);
      }
      System.out.println(k.bosmu());
      
      
      
	}

}

   