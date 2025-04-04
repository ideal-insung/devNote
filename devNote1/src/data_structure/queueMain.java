package data_structure;

public class queueMain {
	public static void main(String[] args) {
		//ArrayQueue queue = new ArrayQueue(5);
		//queue.enQueue("A");  //A
		//queue.enQueue("B");  //AB
		//queue.enQueue("C");  //ABC
		//queue.enQueue("D");  //ABCD
		//queue.enQueue("E");  //ABCDE
		//
		//queue.deQueue();     //BCDE
		//queue.deQueue();     //CDE
		//queue.enQueue("F");  //CDEF
		//
		//for(int i = queue.front; i<queue.front+queue.cnt; i++) {
		//	System.out.println(String.valueOf(queue.data[i%queue.size]));
		//}
		
		LinkedListQueue llq =  new LinkedListQueue();
		llq.enQueue("A");
		llq.enQueue("B");
		llq.enQueue("C");
		llq.enQueue("D");
		llq.enQueue("E");
		
		llq.deQueue();
		llq.deQueue();
		
		llq.enQueue("F");
		llq.enQueue("G");
		
		while(!llq.isEmpty()) {
			System.out.println(llq.deQueue());
		}
		
	}
}
