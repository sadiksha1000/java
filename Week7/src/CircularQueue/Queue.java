//Design a circular queue with implementation of following operations:front(),Rear(),enQueue(int val),deQueue(int val),IsEmpty(),isFUll().

package CircularQueue;

public class Queue {
	int queue[]=new int[6];
	int size;
	int rear;
	int front;
	
	//insert data at rear
	public void enQueue(int value) {
		if(!isFull()) {
			queue[rear]=value;
			rear=(rear+1)%6;
			size=size+1;
		}else {
			System.out.println("Queue is full");
		}
	}
	
	//remove data from front
	public void deQueue(){
		if(!isEmpty()) {
			front=(front+1)%6;
			size=size-1;
		}else {
			System.out.println("Queue is empty");
		}
	}
	
	//checks if queue is empty
	public boolean isEmpty() {
		return size==0;
	}
	
	//checks if queue is full
	public boolean isFull() {
		return size==6;
	}
	
	public void display() {
		System.out.print("Element in queue:");
		for (int i=0;i<size;i++) {
			System.out.print(queue[(front+i)%6]+" ");
		}
		
	System.out.println("\nActual array:");
	for(int i:queue) {
		System.out.print(i+" ");
	}
	}
	
}

