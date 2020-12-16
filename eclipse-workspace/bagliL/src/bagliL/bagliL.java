package bagliL;


class Eleman{
	int icerik;
	Eleman ileri;
	
	 public Eleman(int icerik){
		this.icerik=icerik;
		ileri=null;
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
		   
		   }
		   
    public static void main(String[] args) {
    Liste l1=new Liste();
	l1.basaEkle(new Eleman(5));
	l1.basaEkle(new Eleman(12));
	l1.basaEkle(new Eleman(14));
	l1.basaEkle(new Eleman(8));
	
	Eleman tmp= l1.bas;
	while(tmp!=null) {
		System.out.print(tmp.icerik+"-->");
		tmp=tmp.ileri;
		
	}
		
		
		
	}
	}


