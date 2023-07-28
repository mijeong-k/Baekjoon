package q10845;

public class QueueMake {
	private int arr[];
	private int front;
	private int back;

	public QueueMake(int size) {
		arr = new int[size];
		front = -1;
		back = -1;
	}

	public void push(int X) {
		if(front == -1 && back == -1) {
			arr[++back] = X;
			++front;
		}else {
			arr[++back] = X;
		}
	}
	public void pop() {
		if(back-front+1==0) {
			System.out.println("-1");
		}else {
			System.out.println(front++);
		}
		
	}
	
	public void empty() {
		if(back-front+1==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

	public int size() {
		if(front==-1 && back ==-1) {
			return 0;
		}else {
			return back-front+1;
		}
	}

	public void front() {
		if(size()==0) {
			System.out.println("-1");
		}else {
			System.out.println(arr[front]);
		}
	}
	
	public void back() {
		if(size()==0) {
			System.out.println("-1");
		}
		System.out.println(arr[back]);
	}
}