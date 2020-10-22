package code;

public class Main {

	public static void main(String[] args) {
		
		LinkedList LL = new LinkedList();
		
		LL.push(1);
		LL.push(2);
		LL.push(3);
		LL.push(4);
		LL.push(5);
		
		LL.display();
		LL.pop(1);
		LL.display();
		LL.pop(5);
		LL.display();
		LL.pop(3);
		LL.display();
		LL.pop(4);
		LL.display();
		LL.pop(2);
		LL.display();
		LL.pop();
		LL.display();
		

	}

}
