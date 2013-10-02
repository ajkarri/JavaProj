package linkedList;

public class ListNode {
	private int _data;
	private ListNode _next;
	
	public ListNode(int data) {
		_data = data;
		_next = null;
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
}
