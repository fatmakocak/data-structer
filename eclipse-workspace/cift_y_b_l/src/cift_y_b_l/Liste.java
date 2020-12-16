package cift_y_b_l;

class ciftEleman{
	
	int icerik;
	ciftEleman ileri;
	ciftEleman geri;
	int veri;
	
	public ciftEleman(int icerik) {
		
		this.icerik=icerik;
		ileri=null;
		geri=null;
		veri=icerik;
		
		
	}
}


public class Liste {
	
	ciftEleman bas;
	ciftEleman son;
	 
	public Liste() {
		bas=null;
		son=null;
		
	}
void basaEkle(ciftEleman yeni) {
	if(son==null) {
		bas=yeni;
		son=yeni;
	}
	else {
		yeni.ileri=bas;
		bas.geri=yeni;
		bas=yeni;
		
	}
}

 public boolean arayaEkle(int anahtar, int yeni) {
	ciftEleman temp=bas;
	while(temp.veri!=anahtar) {
		temp=temp.ileri;
		
		if(temp==null) 
			
			return false;
		}
		ciftEleman d=new ciftEleman(yeni);
		if(temp==son) {
			d.ileri=null;
			son=d;
		}
		else {
			d.ileri=temp.ileri;
			temp.ileri.geri=d;
		}
		d.geri=temp;
		temp.ileri=d;
		
		return true;
}


public ciftEleman secilisil(int anahtar) {
	ciftEleman temp=bas;
	while(temp.veri!=anahtar) {
		temp=temp.ileri;
		
		if(temp==null)
			return null;
	
	
	if(temp==bas)
		bas=temp.ileri;
	else
		temp.geri.ileri=temp.ileri;
	if(temp==son)
		son=temp.geri;
	else {
		temp.ileri.geri=temp.geri;
		//return temp;
		
	}

	
	}
	return temp;
	}


	public static void main(String[] args) {
	Liste l=new Liste();
	l.basaEkle(new ciftEleman(5));
	l.basaEkle(new ciftEleman(15));
	l.basaEkle(new ciftEleman(43));
	l.arayaEkle(15, 4);
	l.secilisil(15);
	
	ciftEleman tmp= l.bas;
	while(tmp!=null) {
		System.out.print(tmp.icerik+" <-->");
		tmp=tmp.ileri;
		

	}

}
}

