package bl_Yigit;

class Dugum{
	int icerik;
	Dugum ileri;
	public Dugum(int icerik) {
		this.icerik=icerik;
		ileri=null;
		
	}
	
}

 class bl_yigit {
	 Dugum ust;
	 public bl_yigit() {
		 ust=null;
		 
	 }
   boolean bosMu() {
	   return ust==null;
	   
   }
   void yiginpush(Dugum d) {
	   if(bosMu()) {
		   ust=d;
	   }
	   else {
		   d.ileri=ust;
		   ust=d;
		   
	   }
   }
   Dugum yiginpop() {
	   Dugum e=ust;
	   if(!bosMu()) {
		   ust=ust.ileri;  
	   }
	return e;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bl_yigit bl=new bl_yigit();
		bl.yiginpush(new Dugum(10));
		bl.yiginpush(new Dugum(20));
		System.out.println(bl.yiginpop().icerik);
		bl.yiginpush(new Dugum(8));
		bl.yiginpush(new Dugum(14));
		bl.yiginpush(new Dugum(15));
		while(!bl.bosMu()) {
			System.out.println(bl.yiginpop().icerik);
		}

	}

}
