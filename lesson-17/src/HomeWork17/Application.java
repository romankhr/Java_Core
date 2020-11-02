package HomeWork17;

public class Application {

	public static void main(String[] args) {

		Integer[] array = { 2, 5, 7, 2, 12, 4, -5, 7, 3, 23, 77, -55, 66 };

		Collection collection = new Collection(array);

		Iterator forward = collection.createForward();
		while (forward.hasNext()) {
			System.out.println(forward.next());
		}
		System.out.println("-----------");

		Iterator backward = collection.createbackward();
		while (backward.hasNext()) {
			System.out.println(backward.next());
		}
		System.out.println("\n-----Anonim------\n");
		Iterator anonim = collection.createAnonymous();
		while (anonim.hasNext()) {
			anonim.next();
		}

		System.out.println("\n-----Local------\n");
		Iterator local = collection.createLocal();
		while (local.hasNext()) {
			local.next();
		}

		System.out.println("\n-----Static------\n");
		Iterator staticw = Collection.createStatic(array);
		while (staticw.hasNext()) {
			staticw.next();
		}
	}

}
