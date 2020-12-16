package graph;


/*import java.io.*; 
import java.util.*; 
import java.util.LinkedList; 
 class graph {
	
	  
	// kom�uluk listesi kullan�larak y�nlendirilmemi� graf s�n�f�

	   private int V; //d���m
	   private LinkedList<Integer> adj[]; //biti�iklik listesi 

	    graph(int v) 
	    { 
	        V = v; 
	        adj = new LinkedList[v]; 
	        for (int i=0; i<v; ++i) 
	            adj[i] = new LinkedList(); 
	    } 
	    //grafa kenar ekleme
	    void addEdge(int v,int w) 
	    { 
	        adj[v].add(w); 
	        adj[w].add(v); //Graph is undirected 
	    } 
	  
	   //ba�lang�� d���mne renk atama
	    void greedyColoring() 
	    { 
	        int result[] = new int[V]; 
	        Arrays.fill(result, -1); 
	        result[0]  = 0; 

	        // mevcut renkleri saklamak i�in ge�ici bir dizi olu�turuyoruz
	        boolean available[] = new boolean[V]; 
	        // ba�lang��ta t�m renkler mevcut 
	        Arrays.fill(available, true); 
	  
	        //kalan k��elere V-1 renk at�yoruz
	        for (int u = 1; u < V; u++) {
	        
	            Iterator<Integer> it = adj[u].iterator() ; 
	            while (it.hasNext()) 
	            { 
	                int i = it.next(); 
	                if (result[i] != -1) 
	                    available[result[i]] = false; 
	            } 
	            int cr; 
	            for (cr = 0; cr < V; cr++){ 
	                if (available[cr]) 
	                    break; 
	            }  result[u] = cr; // bulunan reng atama
	            //sonraki de�erler i�in tekrar true olarak s�f�rlad�k
	            Arrays.fill(available, true); 
	        } 
	  
	        //buldu�umuz sonucu yazd�r�yoruz
	        for (int u = 0; u < V; u++) 
	            System.out.println("Vertex " + u + " --->  Color "
	                                + result[u]); 
	    } 
	    public static void main(String args[]) 
	    { 
	    	long baslamaZaman=0, bitisZaman=0;  
	         baslamaZaman=System.currentTimeMillis();
	        graph g1 = new graph(9); 
	        g1.addEdge(0, 1); 
	        g1.addEdge(0, 2); 
	        g1.addEdge(1, 2); 
	        g1.addEdge(1, 3); 
	        g1.addEdge(1, 6); 
	        g1.addEdge(2, 3); 
	        g1.addEdge(2, 7); 
	        g1.addEdge(3, 4); 
	        g1.addEdge(3, 6);
	        g1.addEdge(3, 7);
	        g1.addEdge(4, 5);
	        g1.addEdge(4, 8);
	        g1.addEdge(4, 7);
	        g1.addEdge(6, 1);
	        g1.addEdge(6, 3);
	        g1.addEdge(7, 2);
	        g1.addEdge(7, 3);
	        g1.addEdge(7, 4);
	        g1.addEdge(8, 6);
	        g1.addEdge(8, 4);
	        g1.addEdge(8, 5);
	        System.out.println("Coloring of graph 1"); 
	        g1.greedyColoring(); 
	        
	        bitisZaman=System.currentTimeMillis();
	        System.out.println("�al��ma s�resi: " +((double) (bitisZaman-baslamaZaman))/1000);
	        System.out.println(); 
	        
	        graph g2 = new graph(9); 
	        g2.addEdge(0, 1); 
	        g2.addEdge(0, 2); 
	        g2.addEdge(1, 2); 
	        g2.addEdge(1, 4); 
	        g2.addEdge(2, 4); 
	        g2.addEdge(4, 3); 
	        g2.addEdge(5, 1);
	        g2.addEdge(5, 0);
	        g2.addEdge(6, 1);
	        g2.addEdge(6, 4);
	        g1.addEdge(7, 2);
	        g1.addEdge(7, 4);
	        g1.addEdge(7, 3);
	        g1.addEdge(8, 6);
	        g1.addEdge(8, 3);
	        System.out.println("Coloring of graph 2 "); 
	        g2.greedyColoring();

	        bitisZaman=System.currentTimeMillis();
	        System.out.println("�al��ma s�resi: " +((double) (bitisZaman-baslamaZaman))/1000);
	    } 
	}*/ 




