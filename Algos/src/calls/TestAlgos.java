package calls;
import algos.*;
public class TestAlgos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBoyerMooreVoteAlgo();

	}

	public static void TestBoyerMooreVoteAlgo () {
		int [] TestArray = {1,1,1,3,3,2,2,3,3,3,2,3,3};
		BoyerMooreVoteAlgo boyer = new BoyerMooreVoteAlgo(TestArray);
		System.out.println("max occurence elemnt in the array is " + boyer.FindMajority());
	}
}
