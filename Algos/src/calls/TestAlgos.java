package calls;
import algos.*;
import linkedList.*;
public class TestAlgos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSingleLinkedList();

	}
	
	public static void TestSingleLinkedList() {
		SingleLinkedList ll = new SingleLinkedList(5);
		ll.InsertNodeAtEnd(4);
		ll.InsertNodeAtEnd(6);
		ll.InsertNodeAtEnd(7);
		ll.InsertNodeAtEnd(8);
		ll.InsertAtTheBegining(10);
		ll.InsertNodeAt(12, 4);
		System.out.println("length of the linked list " + ll.length());
		System.out.println("node at 5 is " + ll.NodeAt(5).getData());
		
		
		ll.PrintLinkedList();
		ll.RemoveNodeAt(4);
		ll.RemoveNodeAtBeginning();
		ll.RemoveNodeAtEnd();
		ll.PrintLinkedList();
		ll.RemoveNode(7);
		ll.PrintLinkedList();
		ll.RemoveNode(5);
		ll.PrintLinkedList();
		ll.RemoveNode(4);
		ll.PrintLinkedList();
		ll.RemoveNode(6);
		ll.PrintLinkedList();
		ll.RemoveNode(4);
	}
	public static void TestBoyerMooreVoteAlgo () {
		int [] TestArray = {1,1,1,3,3,2,2,3,3,3,2,3,3};
		BoyerMooreVoteAlgo boyer = new BoyerMooreVoteAlgo(TestArray);
		System.out.println("max occurence elemnt in the array is " + boyer.FindMajority());
	}
}
