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
		library.editBooks(name);
	}
}
