package CircularQueue;

public class Main {
	public static void main(String[] args) {
		Queue q=new Queue();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.enQueue(50);
		q.enQueue(60);
		q.deQueue();
		q.display();	
		System.out.println();
	}
}
