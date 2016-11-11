package ctci.kshiprakode.linkedList;

import ctci.kshiprakode.linkedList.LList.Node;

public class DeleteMiddleNode {
	
	public static void deleteMiddleNode(Node node)
	{
		node.value = node.next.value;
		node.next = node.next.next;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LList list = new LList();
		int arr[] = {1,2,3,4,4,5,5,6};
		list.createList(arr);
		System.out.print("Original List -> ");
		list.printList();
		System.out.println();
		System.out.print("Delete the 4th element - > ");
		deleteMiddleNode(list.head.next.next.next);
		list.printList();
		
		System.out.print("\nDelete the 5th element - > ");
		deleteMiddleNode(list.head.next.next.next.next);
		list.printList();

		System.out.print("\nDelete the 2th element - > ");
		deleteMiddleNode(list.head.next);
		list.printList();
	}
}
