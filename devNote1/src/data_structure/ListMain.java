package data_structure;

public class ListMain {
	public static void main(String[] args) {
		linkList list = new linkList();
		list.add(60);
		list.add(70);
		list.add(50);
		list.add(30);
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.addFirst(10);
		System.out.println(list.toString());
		list.addLast(100);
		System.out.println(list.toString());
		list.remove();
		System.out.println(list.toString());
		list.removeFirst();
		System.out.println(list.toString());
		list.removeLast();
		System.out.println(list.toString());
		list.add(3, "E");
		System.out.println(list.toString());
		list.remove("C");
		System.out.println(list.toString());
		
	}
}
