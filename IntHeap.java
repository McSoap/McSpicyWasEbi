/**
 * Heap class to do heaps!
 * @author Jia Xun
 */
class IntHeap {
	int [] data; //Stores data

	/**
	 * Insert
	 * @param n Number to insert.
	 */
	 //cjx is an ebi
	 //atomz520 : McSoap
	public void insert (int n)
	{

	}
	public void remove (int n) {

	}

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
        }while ( hasSwapped )
    }
	//Helper functions

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
