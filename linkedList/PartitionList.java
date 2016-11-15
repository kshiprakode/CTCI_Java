package ctci.kshiprakode.linkedList;

import ctci.kshiprakode.linkedList.LList.Node;

public class PartitionList {

	public static void partitionList(LList list, int num)
	{
	
		Node left = null, right = null; 
		Node temp = list.head;
		
		while(temp != null)
		{
			if(temp.value > num)
			{
				if(right == null)
					right = temp;
				else
				{
					right.next = temp;
					right = right.next;
				}
				right.next = null;
			}
			else
			{
				if(left == null)
					left = temp;
				else
				{
					left.next =	left;
					left = left.next;
				}
				left.next = null;
			}
			temp = temp.next;
		}
		
		Node newHead = left;
		if(left !=null)
		{
			while(left.next != null)
			{
				left = left.next;
			}
			left.next = right;
		}
		else
			newHead = right;
		
		list.head = newHead;
		list.printList();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LList list = new LList();
		int arr[] = {9,7,4,4,4,5,5,6};
		list.createList(arr);
		System.out.print("Original LinkedList - ");
		list.printList();
		
		partitionList(list,5);
//		
//		list.createList(arr);
//		System.out.print("Original LinkedList - ");
//		list.printList();
//		
//		list.createList(arr);
//		System.out.print("Original LinkedList - ");
//		list.printList();
		
	}

}