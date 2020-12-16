package quadraticHash;

public class hash {
	
    int tablo[] = new int[10];
	int hashFonksiyonu(int anahtar) {
		return anahtar % 10;
		
	}

	void veriEkle ( int anahtar) {
		int indis = hashFonksiyonu(anahtar);
		int yeniİndis = indis;
		int artis = 0;
		
		while(tablo[yeniİndis]!=0) { // dolu ise bir sonrakine geç
			yeniİndis = (indis+artis*artis) % 10;
				artis++;
				
		}
		tablo[yeniİndis]=anahtar;
		
	}
	void listele() {
		for(int i=0; i<10; i++ ) {
			System.out.print(tablo[i] + " ");
			
		}
	}
	int ara(int anahtar) {
		int indis = hashFonksiyonu(anahtar);
		if(anahtar == tablo[indis]) {
			return indis;
		}
			else {
				int yeniİndis = indis;
				int artis=1;
				
				while(tablo[indis]!=0) {
					indis=(indis+artis*artis)%10;
			        artis++;
					if(anahtar== tablo[yeniİndis]) {
						return yeniİndis;
						
					
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
	       hash h= new hash();
	       h.veriEkle(15);
	       h.veriEkle(5);
	       h.veriEkle(18);
	       h.veriEkle(9);
	       h.veriEkle(19);
	       h.veriEkle(25);
	       System.out.println(h.ara(15));
	       h.sil(15);
	       h.listele();
	       

	}

}
