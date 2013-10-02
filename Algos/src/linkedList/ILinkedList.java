package linkedList;

public interface ILinkedList {
	
	/**
	 * InsertNodeAtEnd
	 * @param data - Data to be inserted
	 * @return headNode or NULL if any error
	 */
	public ListNode InsertNodeAtEnd(int data) ;
	
	/**
	 * InsertAtTheBegining
	 * @param data - Data to be inserted
	 * @return headNode or NULL if error
	 */
	public ListNode InsertAtTheBegining(int data);
	
	/**
	 * InsertNodeAt
	 * @param data - Data to be inserted
	 * @param pos - Position in the Linked List
	 * @return headNode or NULL if error
	 */
	public ListNode InsertNodeAt(int data, int pos);
	
	/**
	 * RemoveNode
	 * @param data - Data to be Removed
	 * @return headNode or NULL if error
	 */
	public ListNode RemoveNode(int data);
	
	/**
	 * RemoveNodeAtEnd
	 * @param 
	 * @return headNode or NULL if error
	 */
	public ListNode RemoveNodeAtEnd();
	
	/**
	 * RemoveNodeAtBeginning
	 * @param 
	 * @return headNode or NULL if error
	 */
	public ListNode RemoveNodeAtBeginning();
	
	/**
	 * RemoveNodeAt
	 * @param pos - Position in the Linked List
	 * @return headNode or NULL if error
	 */
	public ListNode RemoveNodeAt(int pos);

	
	/**
	 * CreateNewNode
	 * @param data -Data for the new node
	 * @return
	 */
	public ListNode CreateNewNode(int data);
	
	/**
	 * length
	 * @return length of linked list
	 */
	public int length();
	
	/**
	 * NodeAt
	 * @param pos - Position
	 * @return Node at requested Position
	 */
	public ListNode NodeAt(int pos);
	
	/**
	 * PrintLinkedList
	 *  Print the Linked List
	 */
	public void PrintLinkedList() ;
	
	/**
	 * IsEmpty
	 * @return TRUE or FALSE
	 */
	public  Boolean IsEmpty() ;

}
