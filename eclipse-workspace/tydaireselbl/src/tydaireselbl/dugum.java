package tydaireselbl;

  class dugum {
	
	dugum ileri;
	int icerik;

	public dugum(int icerik) {
		this.icerik=icerik;
	
	}
	// class liste{
		//dugum bas;
		//dugum son;
		
	 public static class  tydaireselbl {
		 
		 dugum bas;
		 dugum son;
		 
			void ekle(dugum temp) {
				//dugum temp=new dugum();
				if(son==null) {
					temp.ileri=temp;
					son=temp;
				}
				else {
					temp.ileri=temp;
					son.ileri=temp;
					son=temp;
					
				}
			}
			void sil(int e) {
				dugum temp= son.ileri.ileri;
				dugum onceki = son.ileri;
				if(son.ileri.icerik==e) {
					son.ileri=son.ileri.ileri;
				}
				else {
					while(temp!=son.ileri) {
						if(temp.icerik==e) {
							onceki.ileri=temp.ileri;
							if(temp==son) {
								son=onceki;
							}
						}
						onceki=temp;
						temp=temp.ileri;
						
						
							}
							
						}
			}
					
			
			void listele() {
				dugum temp=son.ileri.ileri;
				System.out.println(son.ileri.icerik);
				while(temp!=son.ileri) {
					System.out.println(temp.icerik);
					temp=temp.ileri;
					
				}
			}
	 
			public static void main(String[] args) {	
				
				tydaireselbl dl= new tydaireselbl();
				dl.ekle(new dugum(5));
				dl.ekle(new dugum(8));
				dl.ekle(new dugum(14));
				dl.sil(5);
				dl.listele();
				
				
			
		
						

			}


	 }}
 
	 
	
