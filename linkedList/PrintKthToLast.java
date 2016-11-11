//	Implement an algorithm to print the kth to the last element of a LinkedList
// 	Time Complexity - O(n) and Space Complexity - O(1)

package ctci.kshiprakode.linkedList;

import ctci.kshiprakode.linkedList.LList.Node;

public class PrintKthToLast {

	public static void printKthToLast(LList list, int k)
	{

		int length = 0;
		Node temp = list.head;
		while(temp != null)
		{
			length++;
			if(length == k)
			{
				while(temp != null)
				{
					System.out.print(temp.value + " "); 
					temp = temp.next;
				}				
				break;
			}
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {

		LList list = new LList();
		int arr[] = {1,2,3,4,4,5,5,6};
		list.createList(arr);
		System.out.print("Original List -> ");
		list.printList();
		System.out.println();
		System.out.println("List form 4th element to Last -> ");
		printKthToLast(list, 4);
		System.out.println();
		System.out.println("List form 5th element to Last -> ");
		printKthToLast(list, 5);	
		System.out.println();
		System.out.println("List form 2th element to Last -> ");
		printKthToLast(list, 2);
		System.out.println();
		System.out.println("List form 8th element to Last -> ");
		printKthToLast(list, 8);
	}

}
