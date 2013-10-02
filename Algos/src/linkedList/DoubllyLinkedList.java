package linkedList;

public class DoubllyLinkedList implements ILinkedList{
	ListNode headNode;
	private int noOfNodes;
	
	public DoubllyLinkedList(int data) {
		headNode = new ListNode(data);
		noOfNodes = 1;
	}
	

	public ListNode InsertNodeAtEnd(int data) {
		return InsertNodeAt(data,noOfNodes+1);
	}
	

	public ListNode InsertAtTheBegining(int data) {
		return InsertNodeAt(data, 1);
	}
	

	public ListNode InsertNodeAt(int data, int pos) {
		
		if ((pos > noOfNodes+1) || (pos < 1)){
			System.out.println("Enter a valid position");
			return null;
		}
		if (pos == 1) { // insert at beginning
			ListNode newNode = CreateNewNode(data);
			newNode.setNext(headNode);
			newNode.setPrevious(headNode.getprevious());
			headNode = newNode;
		} else { // insert in middle or end
			int currentPos = 1;
			ListNode previousNode = headNode;
			while (currentPos < pos-1){
		
				previousNode = previousNode.getNext();
				currentPos++;
			}
			//System.out.println("CurrentNode Node " +previousNode.getData() + " ,Current Positon" +currentPos);
			ListNode tempNode = previousNode.getNext();
			previousNode.setNext(CreateNewNode(data));
			previousNode.getNext().setNext(tempNode);
		
		}
	
		noOfNodes++;
		
		return headNode;
	}
	

	public ListNode CreateNewNode(int data) {
		return new ListNode(data);
		
	}

	public int length() {
		int length = 0;
		ListNode currentNode = headNode;
		while (currentNode != null){
			currentNode = currentNode.getNext();
			length++;
		}
		return length;
	}
	
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
	

	public void PrintLinkedList() {
		ListNode currentNode = headNode;
		System.out.print(" Linked List:: ");
		while (currentNode != null){
			System.out.print(currentNode.getData() + " ");
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}
	

	public  Boolean IsEmpty() {
		if( length() == 0) {
			return true;
		}
		
		return false;
	}


	@Override
	public ListNode RemoveNode(int data) {
		ListNode previousNode = headNode;
		Boolean found = false;
		
		if ((headNode!=null) && (data == headNode.getData())) {
			headNode = headNode.getNext();
			found = true;
			previousNode = null;
			
		} else {
			while ((previousNode !=null) && (previousNode.getNext() !=null)){
				//System.out.println("CurrentNode Node " +previousNode.getData() );
			
				previousNode = previousNode.getNext();
				if (data == previousNode.getNext().getData()) {
					found = true;
					break;
				}
			}
			//System.out.println("CurrentNode Node " +previousNode.getData() );
			if (found) {
				ListNode tempNode = previousNode.getNext();
				previousNode.setNext(previousNode.getNext().getNext());		
				tempNode = null;
				noOfNodes--;
				return headNode;
			} 
		}
		
		if(!found) {
			System.out.println("Didn't find data " + data + " in the linked list ... bool ");
		}
		return null;
	}


	@Override
	public ListNode RemoveNodeAt(int pos ) {
		if ((pos > noOfNodes+1) || (pos < 1)){
			System.out.println("Enter a valid position");
			return null;
		}
		if (pos == 1) { // insert at beginning
			ListNode currentNode = headNode;
			headNode = headNode.getNext();
			currentNode = null;
		} else { // insert in middle or end
			int currentPos = 1;
			ListNode previousNode = headNode;
			while (currentPos < pos-1){
				//System.out.println("CurrentNode Node " +previousNode.getData() + " ,Current Positon" +currentPos);
				previousNode = previousNode.getNext();
				currentPos++;
			}
			//System.out.println("CurrentNode Node " +previousNode.getData() + " ,Current Positon" +currentPos);
			ListNode tempNode = previousNode.getNext();
			previousNode.setNext(previousNode.getNext().getNext());
			tempNode = null;
		
		}
	
		noOfNodes--;
		
		return headNode;
	
	}


	@Override
	public ListNode RemoveNodeAtEnd() {
		// TODO Auto-generated method stub
		return RemoveNodeAt(noOfNodes);
	}


	@Override
	public ListNode RemoveNodeAtBeginning() {
		// TODO Auto-generated method stub
		return RemoveNodeAt(1);
	}


}
