import java.util.Iterator;

public class Counter implements Iterable<Integer> {

	private final int start, end;

	public Counter(int start, int end) {

		this.start = start;
		this.end = end;

	}

	public Iterator<Integer> iterator() {

		return new CounterIterator();

	}

	private class CounterIterator implements Iterator<Integer> {

		private int counter = start;

		@Override
		public boolean hasNext() {

			return counter <= end;

		}

		@Override
		public Integer next() {

			return counter++;

		}

	}

}
