package HomeWork17;


public interface Iterator {
	public boolean hasNext();

	public Object next();
}

class Collection {
	public Number[] array;

	Collection(Number[] array) {
		this.array = array;
	}

	public class Forward implements Iterator {
		private int count;

		@Override
		public boolean hasNext() {
			return count < array.length;
		}

		@Override
		public Object next() {
			int number = (int) array[count];
			if (!(number % 2 == 0)) {
				number = 0;
			}
			count++;
			return number;
		}

	}

	public Forward createForward() {
		return new Forward();
	}

	public class BackWard implements Iterator {
		int count = array.length - 1;

		@Override
		public boolean hasNext() {

			return count >= 1;
		}

		@Override
		public Object next() {
			return array[count -= 2];
		}

	}

	public BackWard createbackward() {
		return new BackWard();
	}

	// Anonim

	public Iterator createAnonymous() {
		return new Iterator() {
			private int count = array.length;

			@Override
			public boolean hasNext() {

				return count >= 2;
			}

			@Override
			public Object next() {
				int number = (int) array[count -= 3];
				if (!(number % 2 == 0)) {
					System.out.println(number);
				}
				return null;
			}

		};
	}

	// Local

	public Iterator createLocal() {
		class Local implements Iterator {
			private int count = 0;

			@Override
			public boolean hasNext() {

				return count < array.length - 4;
			}

			@Override
			public Object next() {
				int number = (int) array[count += 5];
				if (number % 2 == 0) {
					System.out.println(number - 100);
				}
				return null;
			}

		}

		return new Local();
	}

	// Static

	private static class StaticIterator implements Iterator {
		private int count = 0;
		Integer[] array;
		
		
		public StaticIterator(Integer[] array2) {
			this.array=array2;
		}
		
		@Override
		public boolean hasNext() {

			return count<array.length-1;
		}

		@Override
		public Object next() {
			int number = (int) array[count += 2];
			if (number % 2 == 0) {
				System.out.println(number +1);
			}
			return null;
		}

	}
	public static  StaticIterator createStatic(Integer[] array) {
		
		return new StaticIterator( array);
	}

}
