package medium;
import java.util.Iterator;

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
	private Iterator<Integer> iter;
	private boolean hasPeeked = false;
	private Integer peekVal = 0;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
		iter = iterator;
		
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if (hasPeeked)
        	return peekVal;
        else {
        	peekVal = iter.next();
        	hasPeeked = true;
        	return peekVal;
        }
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if (hasPeeked) {
	    	hasPeeked = false;
	    	return peekVal;
	    } else
	    	return iter.next();
	}

	@Override
	public boolean hasNext() {
		if (hasPeeked)
			return true;
		else
			return iter.hasNext();
	}
}