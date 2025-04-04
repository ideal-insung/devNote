package data_structure;

public class GraphMain {

	public static void main(String[] args) {
		
		ArrayGraph ag = new ArrayGraph(5);
		ag.addDirectArray(1, 4, 2);
		ag.addDirectArray(1, 3, 2);
		ag.addDirectArray(2, 4, 3);
		ag.addDirectArray(3, 4, 3);
		ag.addDirectArray(3, 1, 1);
		
		ag.display();
		
		LinkedListGraph llg = new LinkedListGraph(4);
		llg.addEdge(0,1);
		llg.addEdge(0,2);
		llg.addEdge(1,2);
		llg.addEdge(2,3);
		
		llg.display();
		
	}
}
