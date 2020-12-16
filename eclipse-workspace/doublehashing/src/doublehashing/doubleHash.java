package doublehashing;

public class doubleHash {
	int tablo[] = new int[11];
	
	int hash(int anahtar) {
	  return anahtar % 11;
	  
	}
	int hash2(int anahtar) {

		return ((anahtar % 7)*3)%11;
		
	}
	void veriEkle(int anahtar) {

		int indis = hash(anahtar);
		int yeni�ndis = indis;
		int artis =0;
		while(tablo[yeni�ndis]!=0) {
			yeni�ndis = (indis+ artis*hash2(anahtar))%11;
			artis++;
		}
		tablo[yeni�ndis]=anahtar;
		
		}
	
	void listele() {
		for (int i = 0; i < 11; i++) {
			System.out.print(tablo[i] + " ");
			
			
		}
	}
	
	int ara(int anahtar) {
		int indis = hash(anahtar);
		if(anahtar == tablo[indis]) {
			return indis;
		}
			else {
				int yeni�ndis = indis;
				int artis=1;
				
				while(tablo[indis]!=0) {
					indis=(indis+artis*hash2(anahtar))%11;
			        artis++;
					if(anahtar== tablo[yeni�ndis]) {
						return yeni�ndis;
		
	}
				}
			}
		return -1;
		
	}
	void sil(int anahtar) {
		int indis = ara(anahtar);
		if(indis != -1 && tablo[indis] !=0) {
			tablo[indis]=-1;
			
		}
		
	}
	
	public static void main(String[] args) {
	doubleHash h= new doubleHash();
	h.veriEkle(15);
	h.veriEkle(18);
	h.veriEkle(8);
	h.veriEkle(19);
	h.veriEkle(9);
	System.out.println(h.ara(15));
	h.sil(9);
	h.listele();
	
	
}

}
