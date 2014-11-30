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

	/**
	 * Sort it using heap sort
	 */
	public int [] sort ()
	{
	}

    public void heapify ()
    {
        boolean hasSwapped = false;

        do
        {
            hasSwapped = false;
            for ( int i = data.length - 1; i > 0; i-- )
            {
                if ( data[i] > data[parent ( i )] )
                {
                    hasSwapped = true;
                    int temp = data[i];
                    data[i] = data[parent ( i )];
                    data[parent ( i )] = temp;
                }
            }
        }while ( hasSwapped );
    }
	//Helper functions

	/**
	 * Swap the data
	 * @param from from index
	 * @param to to index
	 * @return true if sucess, false if error
	 */
	private boolean swap ( int from, int to ) {
		if ( from >= data.length || to >= data.length || from == to ) return false;
		int temp = data[to];
		data[to] = data[from];
		data[from] = temp;
		return true;
	}
	
	/**
	 * Gets the index of the left child of the given node
	 * @param childOf The index of the parent
	 * @return The index of the left child
	 */
	private int leftChild ( int childOf )
	{
        return ( 2*childOf ) + 1;
	}

	/**
	 * Gets the index of the right child of the given node
	 * @param childOf The index of the parent
	 * @return The index of the right child
	 */
	private int rightChild ( int childOf )
	{
        return ( 2*childOf ) + 2;
	}

	/**
	 * Gets the index of the right child of the given node
	 * @param parentOf The index of the child
	 * @return The index of the parent
	 */
	private int parent ( int parentOf )
	{
        if ( parentOf == 0 )
        {
            return 0;
        }

        return ( parentOf - 1 ) / 2;
	}
}
