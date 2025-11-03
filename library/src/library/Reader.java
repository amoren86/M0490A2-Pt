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
		try {
			// Reader lifecycle: start reading, read books, stop reading
			library.startReading(name);
			library.readBooks(name);
			library.stopReading(name);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
