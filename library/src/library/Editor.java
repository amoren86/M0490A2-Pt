package library;

//Thread representing an editor who edits books in the digital library
public class Editor extends Thread {

	private final DigitalLibrary library;
	private final String name;

	public Editor(DigitalLibrary library, String name) {
		this.library = library;
		this.name = name;
	}

	@Override
	public void run() {
		try {
			// Editor lifecycle: start writing, edit books, stop writing
			library.startWriting(name);
			library.editBooks(name);
			library.stopWriting(name);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
