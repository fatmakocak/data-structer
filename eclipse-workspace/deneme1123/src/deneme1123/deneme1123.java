package deneme1123;

class Eleman{
	int icerik;
	Eleman ileri;
	
	 public Eleman(int icerik){
		this.icerik=icerik;
		ileri=null;
	}
}
		
		   class Liste{
			Eleman bas;
			Eleman son;
			Liste(){
				bas=null;
				son=null;
				
			}
		 
		 
			void basaEkle(Eleman yeni) {
				if(son==null) { //liste de hiç eleman yoksa
					bas=yeni;
				    son=yeni;
				}
				else {
				    	yeni.ileri=bas;
				    	bas=yeni;
				    	
				    }
				
			}
			void sonaEkle(Eleman yeni) {
				if(bas==null) {
					bas=yeni;
					son=yeni;
				}
				else {
					son.ileri=yeni;
					son=yeni;
					
				}
			}
			/*void arayaEkle(Eleman yeni, Eleman once) {
				if(bas==null) {
					bas=yeni;
				}
				else {
					yeni.ileri=once.ileri;
					once.ileri=yeni;
					
				}
				
			*/
		   
		   Eleman ara(int deger) {
			   Eleman tmp=bas;
			   while(tmp!=null) {
				   if(tmp.icerik==deger) 
					   return tmp;
					   tmp=tmp.ileri;
				   }
				   return null;
				   
				   }
		   void basSil() {
			   bas=bas.ileri;
			   if(bas==null)
				   son=null;
			   
		   
			   }
		
		  
		   }
		   

public class deneme1123 {

	public static void main(String[] args) {
		 Liste l1=new Liste();
			l1.basaEkle(new Eleman(5));
			l1.basaEkle(new Eleman(12));
			l1.basaEkle(new Eleman(14));
			l1.basaEkle(new Eleman(8));
			l1.sonaEkle(new Eleman(44));
			l1.basSil();
			
			
			
			Eleman tmp= l1.bas;
			while(tmp!=null) {
				System.out.print(tmp.icerik+"-->");
				tmp=tmp.ileri;

	}
			Eleman aranan = l1.ara(5);
			//System.out.print(aranan.icerik);
			if(aranan==null) {
				System.out.print("bulunamadý");
			}
				else {
					System.out.println(" ");
					System.out.print("aranan eleman bulundu"+":" + aranan.icerik);
					
				}
			}
			

}


