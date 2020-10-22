package code;

public class LinkedList {
	
	private Node first;
	private Node last;
	private int size;
	
	public void push(int number)
	{
		Node temp = new Node(number);
		
		if(first == null)
			first = temp;
		else{
			temp.setPrev(last);
			last.setNext(temp);	
		}
		last = temp;
		size++;
	}
	
	public void display()
	{
		Node temp = first; //set temp to be the first item
		
		while(temp != null) //as long as temp is not null
		{
			System.out.print( temp.getData() + " "); // print temp's data
			temp = temp.getNext();//move temp to the next Node
		}
		
		System.out.println();
		
		temp = last;
		while(temp != null)
		{
			System.out.print( temp.getData() + " ");
			temp = temp.getPrev();
		}
		System.out.println();
		
	}
	
	public void pop(){//removes the last item from the list
		
		if(first != null)
		{
			if(first != last)//more than one item in list
			{
				last = last.getPrev();
				last.setNext(null);
			}
			else//one item in list
			{
				last = last.getPrev();
				first = null;
			}
		}
	}
	
	public Node find(int target){
		
		Node temp = first;
		
		while(temp != null)
		{
			if(temp.getData() == target)
				return temp;
			else
				temp = temp.getNext();
		}
		
		return temp;
	}
	
	public void pop(int target)
	{
		if(first != null)
		{
			Node temp = find(target);
			if(first == last && temp == first)
			{
				first = null;
				last = null;
			}
			else if(temp == first)
			{
				first = first.getNext();
				first.setPrev(null);
			}
			else if(temp == last)
			{
				last = last.getPrev();
				last.setNext(null);
			}
			else
			{
				temp.getPrev().setNext( temp.getNext() );
				temp.getNext().setPrev( temp.getPrev() );
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public LinkedList(){
		first = null;
		last = null;
		size = 0;
	}

	public Node getFirst() {
		return first;
	}
	public void setFirst(Node first) {
		this.first = first;
	}
	public Node getLast() {
		return last;
	}
	public void setLast(Node last) {
		this.last = last;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	

}
