
public class BubbleSort {
		 void bubbleSort(int []array){
		     for (int i = 0; i < array.length-1; i++) {
		         for (int j = 0; j <array.length-i-1; j++) {
		             if (array[j]>array[j+1]) {
		                 int temp =array[j];
		                 array[j]=array[j+1];
		                 array[j+1]=temp;
		             }  
		         } 
		     }
		 }
		 void yazdir(int array[]){
		     int n=array.length;
		     for (int i = 0; i < n; i++) {
		         System.out.print(array[i]+" ");
		     }
		     System.out.println();
		     }
		    public static void main(String[] args) {
		        long baslamaZaman=0, bitisZaman=0;  
		         baslamaZaman=System.currentTimeMillis();
		       BubbleSort bs=new  BubbleSort();
		        int n[]={17,16,15,14,13,12,11,10};
		        bs.bubbleSort(n);
		        System.out.println("dizi sýralandý");
		        bs.yazdir(n);
		        bitisZaman=System.currentTimeMillis();
		        System.out.println("ortalama süresi: " +((double) (bitisZaman-baslamaZaman))/1000);
		    } 
		}
