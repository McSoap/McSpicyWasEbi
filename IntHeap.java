/**
 * Heap class to do heaps!
 * @author Jia Xun
 */
class IntHeap {
	int [] data = null; //Stores data
	int elementCount = 0;

	IntHeap (int defaultSize) {
		data = new int[defaultSize];
	}

	IntHeap () {
		data = new int[10];
	}
	/**
	 * Insert
	 * @param n Number to insert.
	 */
	public void insert (int n) {
		//Checks if heap gets too big
		if ( elementCount >= data.length ) {
			//Double the array size
			int [] temp = data;
			data = new int[temp.length*2];
			for ( int i = 0; i < temp.length; i++ ) {
				data[i] = temp[i];
			}
		}

		data[elementCount] = n;
		elementCount++;

		//Sort it to the right place
		//TODO
	}


	public void remove (int n) {

	}


	public int [] sort () {

	}


	//Helper functions

	/**
	 * Gets the index of the left child of the given node
	 * @param childOf The index of the parent
	 * @return The index of the left child
	 */
	private int leftChild(int childOf) {

	}

	/**
	 * Gets the index of the right child of the given node
	 * @param childOf The index of the parent
	 * @return The index of the right child
	 */
	private int rightChild(int childOf) {

	}

	/**
	 * Gets the index of the right child of the given node
	 * @param parentOf The index of the child
	 * @return The index of the parent
	 */
	private int parent(int parentOf) {

	}
}