package linkedList;

/**
 * @author karri_000
 *
 */
public class SingleLinkedList {
	ListNode headNode;
	private int noOfNodes;
	
	public SingleLinkedList(int data) {
		headNode = new ListNode(data);
		noOfNodes = 0;
	}
	
	/**
	 * InsertNodeAtEnd
	 * @param data - Data to be inserted
	 * @return headNode or NULL if any error
	 */
	public ListNode InsertNodeAtEnd(int data) {
		if (headNode == null) {
			headNode = CreateNewNode(data);
		} else {
			ListNode currentNode = headNode;
			while (currentNode.getNext() != null){
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(CreateNewNode(data));
		}
		
		noOfNodes++;
		
		return headNode;
	}
	

	/**
	 * InsertAtTheBegining
	 * @param data - Data to be inserted
	 * @return headNode or NULL if error
	 */
	public ListNode InsertAtTheBegining(int data) {
		return InsertNodeAt(data, 1);
	}
	
	
	
	/**
	 * InsertNodeAt
	 * @param data - Data to be inserted
	 * @param pos - Position in the Linked List
	 * @return headNode or NULL if error
	 */
	public ListNode InsertNodeAt(int data, int pos) {
		
		if ((pos > noOfNodes) || (pos < 1)){
			System.out.println("Enter a valid position");
			return null;
		}
		if (pos == 1) {
			ListNode newNode = CreateNewNode(data);
			newNode.setNext(headNode);
			headNode = newNode;
		} else {
			int currentPos = 1;
			ListNode currentNode = headNode;
			while ((currentNode != null)){
				if (currentPos == pos) {
					ListNode tempNode = currentNode.getNext();
					currentNode.setNext(CreateNewNode(data));
					currentNode.getNext().setNext(tempNode);
					break;
				}
				currentNode = currentNode.getNext();
				currentPos++;
			}
		}
		
		noOfNodes++;
		
		return headNode;
	}
	
	/**
	 * CreateNewNode
	 * @param data -Data for the new ndoe
	 * @return
	 */
	private ListNode CreateNewNode(int data) {
		return new ListNode(data);
		
	}
	/**
	 * length
	 * @return length of linked list
	 */
	public int length() {
		int length = 0;
		ListNode currentNode = headNode;
		while (currentNode != null){
			currentNode = currentNode.getNext();
			length++;
		}
		return length;
	}
	
	/**
	 * NodeAt
	 * @param pos - Position
	 * @return Node at requested Position
	 */
	public ListNode NodeAt(int pos) {
		ListNode currentNode = headNode;
		if ((headNode == null)) {
			System.out.println("List is empty");
			return null;
		} else if (pos > noOfNodes){
			System.out.println("Enter a valid position");
			return null;
		}
		
		int currentPos = 1;
		while ((currentNode != null)){
			if (currentPos == pos) {
				break;
			}
			currentNode = currentNode.getNext();
			currentPos++;
		}
		
		return currentNode;
	}
	
	/**
	 * PrintLinkedList
	 *  Print the Linked List
	 */
	public void PrintLinkedList() {
		ListNode currentNode = headNode;
		System.out.print(" Linked List:: ");
		while (currentNode != null){
			System.out.print(currentNode.getData() + " ");
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}
	
	/**
	 * IsEmpty
	 * @return TRUE or FALSE
	 */
	public  Boolean IsEmpty() {
		if( length() == 0) {
			return true;
		}
		
		return false;
	}
}
