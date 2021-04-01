//a)provided set of binary numbers in a linked list, find all unique permutations and return each integer value of generated permutations as 
//linked list.[3Marks]

import java.util.*;

public class Question1 {
	
	static LinkedList<Integer> decimalNumbers = new LinkedList();
	
	//defining the structure of node
	public static class Node{
		int data;
		Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
	
}
	static Node head=null;
	static Node tail=null;
	static int[]list=new int[3];
	
	public static void addNode(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=head;
		}else {
			tail.next=newNode;
			tail=newNode;
		}
	}
		
	public static int size() {
		int count=0;
		Node current=head;
		while(current!=null) {
			count++;
			current=current.next;
		}
		return count;
	}
	
	public static int get(int i) {
		Node current=head;
		if(size()>0 && i<size()) {
			for(int j=0;j<i;j++) {
				current=current.next;
			}
			return current.data;
		}
		return -1;
	}
	
	public static void printLinkedList() {
		
		Node current=head;
		while(current!=null) {
			System.out.print(current.data);
			current=current.next;
			System.out.print("->");
		}
		System.out.println();
	}
	
	
	public static int[] list() {
		for(int i=0;i<list.length;i++) {
			list[i]=get(i);
		}
		return list;
	}
	
	//function to check for redundant inputs
	static boolean shouldSwap(int arr[],int start, int curr) {
		for(int i=start;i<curr;i++) {
			if(arr[i]==arr[curr]) {
				return false;
			}
		}
		return true;
	}
	
	//swapping two values
	static void swap(int arr[],int i, int j) {
		int c=arr[i];
		arr[i]=arr[j];
		arr[j]=c;
	}
	
	//function to find permutations of linked list
	static void findPermutations(int arr[],int index,int n) {
		if(index>=n) {
			printArray(arr);
			return;
		}
		for(int i=index;i<n;i++) {
			boolean check=shouldSwap(arr,index,i);
			if(check) {
				swap(arr,index,i);
				findPermutations(arr,index+1,n);
				swap(arr,index,i);
			}
		}
	}
	
	public static void printArray(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println( );
		int newnumber  = Conversion(a);
		decimalNumbers.add(newnumber);		
	}
	
	//converting binary input into decimal equivalent
	public static int Conversion(int array[]) {
		int number = 0;
		int multiplier=4;
		for(int i=0;i<array.length;i++) {
			if(array[i]==1) {
				number+=multiplier;	
			}else {
				number+=0;
			}
			multiplier/=2;
		}
		return number;
	}
	
	public static void main(String[] args) {
		Question1 q=new Question1();
		System.out.println("Input Linked List:");
		q.addNode(1);
		q.addNode(0);
		q.addNode(1);
		q.printLinkedList();
		list();
		System.out.println("Unique permutations of given linked list:");
		int n=list.length;
		findPermutations(list,0,n);
		System.out.println("The updated linked list:");
		System.out.println(decimalNumbers);
		
	}
}
