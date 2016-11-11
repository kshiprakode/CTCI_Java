package ctci.kshiprakode.linkedList;

public class LList {

	static Node head;
	
	class Node{
		int value;
		Node next;
		
		Node(int val)
		{
			value = val;
			next = null;
		}
		
	}
	
	public void createList(int arr[])
	{
		for(int i = 0 ; i < arr.length; i++)
		{
			if(head == null)
			{
				head = new Node(arr[i]);
			}
			else
			{
				Node temp = head;
				while(temp.next != null)
					temp = temp.next;
				temp.next = new Node(arr[i]);
			}			
		}
	}
	
	public void printList()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
	}
		
}
