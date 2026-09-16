package DSA;
import java.util.*;
public class GraphDemo {
	public static void main(String[] args) {
		int vertices = 4;
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for(int i=0;i<vertices;i++) {
			graph.add(new ArrayList<>());
		}
		
		//Add edges
		graph.get(0).add(1);
		graph.get(1).add(0);
		
		graph.get(0).add(2);
		graph.get(2).add(0);
		
		graph.get(1).add(3);
		graph.get(3).add(1);
		
		graph.get(2).add(3);
		graph.get(3).add(2);
		
		//print graph
		for(int i=0;i<vertices;i++) {
			System.out.println(i+" -> "+graph.get(i));
		}
	}
}

//o/p:-
//0 -> [1, 2]
//1 -> [0, 3]
//2 -> [0, 3]
//3 -> [1, 2]
