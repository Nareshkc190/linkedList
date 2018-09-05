package linkedlist;

public class testLinkedList {
	
//	class a{
//		int a=4;
//	}
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(2);
		list.insert(5);
		list.insert(1);
		list.insert(34);
		System.out.println("size is "+list.size());

		list.insert(0, 9);
		list.insertAtStart(23);
		list.deleteAt(4);
		
		list.show();
		System.out.println("Size is " +list.size);
		
//		testLinkedList b = new testLinkedList();
//		a newA = b.new a();
//		System.out.println(newA.a);
		}
}