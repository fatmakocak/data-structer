package hashing_algorithm;
 //LINEAR PROBING

public class hashing {
	int tablo[] = new int[10];
	
	int hash(int anahtar) {
		return anahtar % 10;
		
	}

	void veriEkle ( int anahtar) {
		int indis = hash(anahtar);
		while(tablo[indis]!=0) { // dolu ise bir sonrakine geç
			indis = (indis+1) % 10;
				
		}
		tablo[indis]=anahtar;
		
	}
	void listele() {
		for(int i=0; i<10; i++ ) {
			System.out.print(tablo[i] + " ");
			
		}
	}
	int ara(int anahtar) {
		int indis = hash(anahtar);
		if(anahtar == tablo[indis]) {
			return indis;
		}
			else {
				while(tablo[indis]!=0) {
					indis=(indis+1)%10;
			
					if(anahtar== tablo[indis]) {
						return indis;
						
					
				}
			}
			
			}
		return -1;
		}
	void sil(int anahtar) {
		int indis=ara(anahtar);
		if(indis != -1 && tablo[indis] != 0) {
		tablo [indis] = -1;
		
		}
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       hashing h= new hashing();
       h.veriEkle(15);
       h.veriEkle(5);
       h.veriEkle(18);
       h.veriEkle(9);
       h.veriEkle(19);
       System.out.println(h.ara(15));
       h.sil(5);
       h.listele();
       
		
		
	}

}
