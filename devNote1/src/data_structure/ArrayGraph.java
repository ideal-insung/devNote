package data_structure;
public class ArrayGraph {
	private int size;
	private int [][]array;
	
	public ArrayGraph(int size){
		this.size = size;
		this.array = new int[size][size];
	}
	
	public void addDirectArray(int x, int y ,int cost) {
		for(int i=0; i<this.size ;i++) {
			for(int j=0; j<this.size; j++) {
				array[x][y] = cost;
				array[y][x] = cost;
			}
		}
	}
	
	public void display() {
		for(int i=0; i<this.size ;i++) {
			for(int j=0; j<this.size; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}
