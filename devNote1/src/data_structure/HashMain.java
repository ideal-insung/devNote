package data_structure;

public class HashMain {

	
	public static void main(String[] args) {
		HashTable ht = new HashTable(4);
		ht.Hashput("Mark"  , "he is good");
		ht.Hashput("kim"   , "he is handsome");
		ht.Hashput("Jully" , "she is beautiful");
		ht.Hashput("park" , "he is kind");
		ht.Hashput("Mark"  , "changeMark");
		
		System.out.println(ht.getHashTable("Mark"));
		System.out.println(ht.getHashTable("kim"));
		System.out.println(ht.getHashTable("Jully"));
		System.out.println(ht.getHashTable("park"));
		
	}
}
