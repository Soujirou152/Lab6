
public class Scratch {

	public static void main(String[] args) {
		recurse();
		StdOut.println("Hello.");
		StdOut.println("Huh?");

	}

	public static void recurse() {
		StdOut.println("and again...");
		recurse();
	}
}
