package hedef_tahtasi_kuyruk;

class eleman{
	int toplam;
	String atis;
	public eleman(int toplam, String atis) {
		this.toplam=toplam;
		this.atis=atis;
				
	}
}

class kuyrukk{
	eleman[]dizi;
	int bas,son;
	int N;
	
	public kuyrukk(int N) {
		dizi=new eleman[N];
		this.N=N;
		bas=0;
		son=0;
	}
	
boolean dolumu() {
	return bas==(son+1)%N;
}
boolean bosmu() {
	return bas==son;
	
}
void ekle(eleman e) {
	if(!dolumu()) {
		dizi[son]=e;
		son=(son+1)% N ;
		
	}
}
eleman sil() {
	eleman sonuc;
	if(!bosmu()) {
		sonuc=dizi[bas];
		bas=(bas+1)%N;
		return sonuc;
	}
	return null;
	
	}

	
String hedefTahtasi(int[]tahta) {
	int i,t;
	String a;
	//eleman e;
	//Kuyruk k;
	eleman e=new eleman(0, "");
	kuyrukk k= new kuyrukk(t);
	k.ekle(e);
	while(k.bosmu()) {
		e=k.sil();
		if(e.toplam==100)
			return e.atis;
		for (i = 0;  i< tahta.length; i++) {
			if(e.toplam+tahta[i] <= 100) {
				t=e.toplam+tahta[i];
				a=e.atis+ " _" + tahta[i];
				e=new eleman(t,a);
				k.ekle(e);
				
			}
			
		}
	}
	
	return null;
	
}

	
	public static void main(String[] args) {
		kuyrukk k=new kuyrukk(5);
		k.hedefTahtasi(11,21,27,33,36);
		
		
		
		
	}
}


