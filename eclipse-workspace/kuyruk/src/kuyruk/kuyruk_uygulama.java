package kuyruk;
//dizi ile
class eleman{//birden fazla veri burada tutulabilir.
	int icerik;
	public eleman(int icerik) {
		this.icerik=icerik;
		
	}
	
}
public class kuyruk_uygulama {
	
	 int sayac;
	    int front; //�n,ba�
	    int rear; //arka,son
	    int maxSize = 100;// N gibi
	    int[] dizi = new int[maxSize];

	    public kuyruk_uygulama() {
	        sayac = 0;
	        front = 1;
	        rear = 0;

	    }
	    boolean dolumu() {
	 return front==(rear+1)%maxSize;
	 
 }
	
	    boolean bosmu() {
	return front==rear;//ba�ta sonda ayn� yeri g�steriyorsa kuyruk bo�tur
}
	    public void ekle(int x) {
	        if (sayac == maxSize) {
	            System.out.println("kuyruk dolu");
	        } else {
	            sayac = sayac + 1;
	            rear = (rear + 1) % maxSize;//dizi boyutu a�mas�n diye b�l�yoruz
	            dizi[rear] = x;
	        }
	    }

	    public int sil() {
	        int x;
	        if (sayac == 0) {
	            System.out.println("kuyruk bo�");

	            return -1;
	        } else {
	            sayac = sayac - 1;
	            x = dizi[front];
	            front = (front + 1) % maxSize;
	            return x;

	        }

	    }

	public static void main(String[] args) {
		
		 kuyruk_uygulama k = new kuyruk_uygulama();
	        for (int i = 1; i <5; i++) {
	            k.ekle(i);
	            System.out.println("kuyru�a"+"--->" + i +" "+"eklendi");
	        }
	        System.out.println("______________");
	        System.out.println(" ");
	        for (int i = 1; i < 5; i++) {
	            System.out.println("kuyruktan"+"--->" + k.sil() +" "+"��kar�ld�");

	        }

	    }

	}
