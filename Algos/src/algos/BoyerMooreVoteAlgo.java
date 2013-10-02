package algos;


/*
 *  USAGE: find the majorty elemnt in a LIST. 
 */
public class BoyerMooreVoteAlgo {
	private int [] IntergerList;
	
	public BoyerMooreVoteAlgo (int[] IntegerList) {
		this.setIntergerList(IntegerList);
	}
	
	/*
	 *  We will sweep down the sequence starting with the first one
	 *  As we sweep we maintain a pair consisting of a current candidate and a counter.
	 *  Initially, the current candidate is unknown (first value is assigned) and counter is 0.
	 *  When we move the pointer forward over an element e: 
	 *     - If the counter is 0, we set the current candidate to e and we set the counter to 1.
	 *     - if the counter is not 0, we increment or decrement the counter according to whether e is the current candiate;
	 *  When we are done, the current candidate is the majority element, if there is a majority.
	 */
	public int FindMajority() {
		int currentValue  = IntergerList[0];
		int counter  = 0;
		for (int i = 0; i< IntergerList.length; i++) {
			if (currentValue == IntergerList[i]) {
				++counter;
			} else if (counter == 0) {
				currentValue = IntergerList[i];
				++ counter;
			} else {
				--counter;
			}
			System.out.println("Current max Value is " + currentValue + " value in the array is " + IntergerList[i] + " Counter = "+ counter);
		}
		
		return currentValue;
	}

	public int [] getIntergerList() {
		return IntergerList;
	}

	public void setIntergerList(int [] intergerList) {
		IntergerList = intergerList;
	}

}
