//	Write a code that removes duplicate elements from a unsorted linkedlist
//	1. Sort and check consecutive elements - O(n*lg n)
//	2. Using HashMap to keep a check of elements appeared Time: O(n), Space: O(n)
//	3. Using no temporary buffer, check every 2 elements - Time: O(n^2)

package ctci.kshiprakode.linkedList;

import java.util.HashSet;
import ctci.kshiprakode.linkedList.LList.Node;

public class RemoveDups {
	
	public static void removeDupsSorted(LList list){
	
		Node temp = list.head;
		while(temp.next !=  null)
		{
			if(temp.value == temp.next.value)
			{
				temp.next = temp.next.next;
			}
			else
				temp = temp.next;
		}
		System.out.print("\nRemove Duplicates Sorted- ");
		list.printList();
		System.out.println("\n");
	}
	
	public static void removeDups(LList list){
		
		HashSet<Integer> hash = new HashSet<Integer>();
		
		Node temp = list.head;
		hash.add(temp.value);
		while(temp.next !=  null)
		{
			if(hash.contains(temp.next.value))
			{
				temp.next = temp.next.next;
			}
			else
			{
				hash.add(temp.next.value);
				temp = temp.next;
			}
		}
		
		System.out.print("\nRemove Duplicates HashMap - ");
		list.printList();
		System.out.println("\n");
	}

	public static void removeDupsNoBuffer(LList list){
		
		Node temp = list.head;
		while(temp !=  null)
		{
			Node nextNode = temp;
			while(nextNode.next != null)
			{
				if(temp.value == nextNode.next.value)
				{
					nextNode.next = nextNode.next.next;
				}
				else
					nextNode = nextNode.next;
			}
			temp = temp.next;
		}
		System.out.print("\nRemove Duplicates No Temporary Buffer - ");
		list.printList();
		System.out.println("\n");
	}

	public static void main(String args[])
	{
		LList list = new LList();
		int arr[] = {1,2,3,4,4,5,5,6};
		list.createList(arr);
		System.out.print("Original LinkedList - ");
		list.printList();
		removeDupsSorted(list);
		list.createList(arr);
		System.out.print("Original LinkedList - ");
		list.printList();
		removeDups(list);
		list.createList(arr);
		System.out.print("Original LinkedList - ");
		list.printList();
		removeDupsNoBuffer(list);
	}
}
