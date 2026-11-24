package library;

//Thread representing a reader who reads books in the digital library
public class Reader extends Thread {

	private final DigitalLibrary library;
	private final String name;

	public Reader(DigitalLibrary library, String name) {
		this.library = library;
		this.name = name;
	}

	@Override
	public void run() {
		library.readBooks(name);
	}
}
