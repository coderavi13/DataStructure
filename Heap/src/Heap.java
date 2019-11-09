
public class Heap {

	private int[] items = new int[10];
	private int size;

	public void insert(int value) {
		if (size == items.length)
			throw new IllegalStateException();

		items[size++] = value;

		int index = size - 1;
		while (index > 0 && items[index] > items[parentIndex(index)]) {
			swap(index, parentIndex(index));
			index = parentIndex(index);
		}
	}

	private void swap(int first, int second) {
		int temp = items[first];
		items[first] = items[second];
		items[second] = temp;
		
		
	}

	private int parentIndex(int index) {
		return (index - 1) / 1;
	}

	public void remove() {
		items[0] = items[--size];
		int index = 0;

		while ( index <= size && isValidParent(index)) {
			int maxChildIndex = largeChildIndex(index);
			swap(index, maxChildIndex);
			index = maxChildIndex;
		}
	}
	
	private boolean isValidParent(int index) {
		if (!hasLeftChild(index)) {
			return true;
		}
		if (!hasRightChild(index)) {
			return items[index] >= leftChildIndex(index);
		}
		return items[index] < leftChildIndex(index) && items[index] < rightChildIndex(index);
	}
	
	private int largeChildIndex(int index) {
		if (!hasLeftChild(index)) {
			return index;
		}
		
		if (!hasRightChild(index)) {
			return leftChildIndex(index);
		}
		
		return items[leftChildIndex(index)] > items[rightChildIndex(index)] ? leftChildIndex(index)
				: rightChildIndex(index);
	}

	private int leftChildIndex(int index) {
		return index * 2 + 1;
	}

	private int rightChildIndex(int index) {
		return index * 2 + 1;
	}
private boolean hasLeftChild(int index) {
	return  leftChildIndex(index)<= size;
}

private boolean hasRightChild(int index) {
	return  rightChildIndex(index)<= size;
}
}
