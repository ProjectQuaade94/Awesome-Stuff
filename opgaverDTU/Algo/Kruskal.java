
import java.util.*;
import java.lang.*;
import java.io.*;

public class Kruskal{
	
	public class subset{
		int parent, rank;
	}

	public void KruskalMST(){
		Edge result[] = new Edge[V];
		int e = 0;
		int i = 0;
		for (i=0; i<V; ++i)
			result[i] = new Edge();

		Arrays.sort(edge);

		subset subsets[] = new subset[V];
		for(i=0; i<V; ++i)
			subsets[i]=new subset();

		for (int v = 0; v < V; ++v){
			subsets[v].parent = v;
			subsets[v].rank = 0;
		}
		i = 0;
		while (e < V - 1){
			Edge next_edge = new Edge();
			next_edge = edge[i++];

			int x = find(subsets, next_edge.src);
			int y = find(subsets, next_edge.dest);

			if (x != y){
				result[e++] = next_edge;
				Union(subsets, x, y);
			}
		}
		System.out.println("Following are the edges in the constructed MST");
		for (i = 0; i < e; ++i)
			System.out.println(result[i].src+" -- "+result[i].dest+" == "+
					result[i].weight);
	}
}