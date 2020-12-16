package tekyonlu_bl;



class Ogrenci{
	
	
	   int no;
	   String ad;
	   String soyad;
	   int vize;
	   int genel;
	   Ogrenci ileri;
       int icerik;
	   
	  public Ogrenci(int no, String ad, String soyad,int vize, int genel){
		   this.no=no;
		   this.ad=ad;
		   this.soyad=soyad;
		   this.vize=vize;
		   this.genel=genel;
		  
		   ileri=null;
		   
	   }

}
	

     public class tekyonlu_bl {
	
	Ogrenci bas, son=null;
	
	
	 void basaEkle(Ogrenci yeni) {
		if(son==null) {
			bas=yeni;
			son=yeni;
		}
		else {
			yeni.ileri=bas;
			bas=yeni;
		}
		
			
	 }
	 void sonaEkle(Ogrenci yeni) {
		 if(bas==null) {
			 bas=yeni;
			 son=yeni;
		 }
		 else {
			 son.ileri=yeni;
			 son=yeni;
		 }
	 }
	 void arayaEkle(Ogrenci yeni, Ogrenci once) {
			if(bas==null) {
				bas=yeni;
			}
			else {
				yeni.ileri=once.ileri;
				once.ileri=yeni;
				
			}
	 }
	 
	 void goster() {
		 Ogrenci tmp=bas;
		 while(tmp!=null) {
			 System.out.print(tmp.no + tmp.ad + tmp.soyad + tmp.vize + tmp.genel+"-->");
			 tmp=tmp.ileri;
			 
		 }
	 }
	 public void ortBul() {
		 double ort=0;
		 Ogrenci gecici=bas;
		 while(gecici!=null) {
			 ort=gecici.vize*0.4 + gecici.genel*0.6;
			 System.out.println("\nÖðrenci no:" + gecici.no +"-->"+"ortalama notu:"+ort);
			 gecici=gecici.ileri;
			 
		 }
	 }
	 Ogrenci ara(int no) {
		 Ogrenci tmp=bas;
		 while(tmp!=null) {
			 if(tmp.icerik==no)
				 return tmp;
			 tmp=tmp.ileri;
		 }
		 return null;
		 
		 }
	 
	
     
	public static void main(String[] args) {
		tekyonlu_bl bl= new tekyonlu_bl();
		bl.basaEkle(new Ogrenci(78,"fatma","cantekin",24,66));
		bl.basaEkle(new Ogrenci(78,"alperen","cantekin",66,24));
		bl.sonaEkle(new Ogrenci(1,"a", "f",2,3));
		bl.arayaEkle((new Ogrenci(2,"c", "d",2,3)), new Ogrenci(78,"fatma","cantekin",24,66));
		bl.goster();
		bl.ortBul();
		
	
		
	}
     }
     




