package linkedList;

public class ListNode {
	private int _data;
	private ListNode _next;
	private ListNode _previous;
	
	public ListNode(int data) {
		_data = data;
		_next = null;
		_previous = null;
	}

	public int getData() {
		return _data;
	}

	public void setData(int data) {
		_data = data;
	}
	
	public void setNext(ListNode next) {
		_next = next;
	}
	
	public ListNode getNext() {
		return _next;
	}
	
	public void setPrevious(ListNode previous) {
		_previous = previous;
	}
	
	public ListNode getprevious() {
		return _previous;
	}
}
