package linkedlist;

public class LinkedList {
	Node head;
	int size;
	
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head ==null) {
			head = node;
		size++;}
		else
		{
			Node n = head;
			while(n.next!=null)
				n=n.next;
			n.next=node;
			size++;
		}
	}
	
	
	
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head=node;
		size++;
	}
	
	public int size(){
		Node node = head;
		int counter =1;
		while(node.next!=null) {
			counter++;
			node = node.next;
		}
		return counter;
		
	}
	
	public void deleteAt(int index) {
		if(index==0) {
			head=head.next;
		size--;}
		else
		{
			Node n = head;
			Node n1 = null;
			for(int i=0;i<index-1;i++)
				n=n.next;
			n1=n.next;
			n.next=n1.next;
			n1=null;
			size--;
		}
	}
	
	public void insert(int index,int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		Node n = head;
		if(index==0) {
			insertAtStart(data);
		}
		else if(index<=size) {
		for(int i=0;i<index-1;i++) 
			n = n.next;
	
		node.next=n.next;
		n.next = node;
		size++;
		}
		else
			System.out.println("Index out of Bound !!");
	}
	
	public void show() {
		Node node = head;
		while(node.next!=null) {
			System.out.println(node.data);
		    node = node.next;
		}
		System.out.println(node.data);
	}
}
class Node {
	int data;
	Node next;	
}