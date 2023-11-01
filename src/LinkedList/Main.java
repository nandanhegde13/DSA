package LinkedList;

class LinkedList
{

	class Node{
		int data;
		Node next;

	   public Node(int data)
	   {
		   this.data = data;
	   }
	   
	}
	
	Node head = null;
	

   public void pushFirst(int data)
   {
	   Node newNode =new Node(data);
	   
	   if(head == null)
	   {   
		  
		   head = newNode;		   
	   }
	   else {
		   Node temp = head;
		   head = newNode;
		   head.next = temp;
	   }
   }
   
   
   
   public void pushLast(int data)
   {
	   Node newNode = new Node(data);
	   
	   if (head == null)
	   {
		   head = newNode;
	   }
	   Node current = head;
	   while(current.next!=null)
	   {
		   current = current.next;
	   }
	   current.next = newNode; 
   }
   
   
  
   
   
   public void print()
   {
	   Node current = head;
	   if(head == null)
	   {
		  System.out.println("List is empty"); 
	   }
	   else {
	   
	   System.out.println("Adding element to list");
	   while(current!=null)
	   {
		   if(current.next ==null)
		   {
			   System.out.print(current.data );
			   
		   }
		   else {
			   System.out.print(current.data +"-->" );
			   
			   
		   }
		   current = current.next;
	   }
	   
	 }
	   
   }

}

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         LinkedList l = new LinkedList();
         
         l.pushFirst(20);
         l.pushFirst(30);
         l.pushFirst(10);
         l.pushLast(50);
         l.print();
	}
}
