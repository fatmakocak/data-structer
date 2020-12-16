package huffmancoding;
import java.util.PriorityQueue; 
import java.util.Scanner; 
import java.util.Comparator; 
 public class huffmancoding {
	    int data; 
	    char c; 
	    huffmancoding left; 
	    huffmancoding right; 
	} 
	class MyComparator implements Comparator<huffmancoding> { 
	    public int compare(huffmancoding x, huffmancoding y) { 
	        return x.data - y.data; 
	    } 
	}
	 class Huffman { 
	    public static void printCode(huffmancoding root, String s) 
	    { 
	        if (root.left 
	                == null
	            && root.right 
	                   == null
	            && Character.isLetter(root.c)) { 
	            System.out.println(root.c + ":" + s); 
	            return; 
	        } 
	        //sol alt aðaca 0
	        // sað alt aðaca 1 
	
	        printCode(root.left, s + "0"); 
	        printCode(root.right, s + "1"); 
	    } 
	    public static void main(String[] args){ 
	        Scanner s = new Scanner(System.in); 
	        int n = 6; 
	        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' }; 
	        int[] charfreq = { 5, 9, 12, 13, 16, 45 }; 
	        PriorityQueue<huffmancoding> q 
	            = new PriorityQueue<huffmancoding>(n, new MyComparator()); 
	        for (int i = 0; i < n; i++) { 
	        	huffmancoding hn = new huffmancoding(); 
	            hn.c = charArray[i]; 
	            hn.data = charfreq[i]; 
	            hn.left = null; 
	            hn.right = null; 
	            q.add(hn); 
	        } 
	        huffmancoding root = null; 
	        while (q.size() > 1) { 
	        	huffmancoding x = q.peek(); 
	            q.poll(); 
	            huffmancoding y = q.peek(); 
	            q.poll(); 
	            // new node f which is equal 
	            huffmancoding f = new huffmancoding(); 
	            f.data = x.data + y.data; 
	            f.c = '-'; 
	            f.left = x; 
	            f.right = y; 
	            root = f; 
	            q.add(f); 
	        } 
	        printCode(root, ""); 
	       System.out.println(); 
	    } 
	} 

