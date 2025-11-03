package library;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Monitor class representing a digital library with readers and editors
public class DigitalLibrary {

	private final List<String> books = new ArrayList<>(); // List of books in the library (shared resource)
	private int readers = 0; // number of active readers
	private boolean writing = false; // true if an editor is writing
	private final Random random = new Random();

	// Sample book titles
	private String[] titles = { "Solitud", "Incerta glòria", "Mirall trencat", "La plaça del Diamant",
			"El quadern gris", "Cementiri de sinistres", "Les veus del Pamano", "Jo confesso", "Victus" };

	public DigitalLibrary() {
		// Initialize library with some books
		books.add("La pell freda");
		books.add("El temps entre costures");
		books.add("L'ombra del vent");
		books.add("1984");
		books.add("Brave New World");
		books.add("Fahrenheit 451");
	}

	// TODO: Implement synchronization mechanisms, when necessary, to ensure thread
	// safety

	// --- Readers section ---
	public void startReading(String readerName) throws InterruptedException {
		// TODO: Wait if an editor is currently writing. Otherwise, increase the number
		// of active readers
	}

	public void readBooks(String readerName) {
		// TODO: Simulate reading by printing the list of books. (Use Thread.sleep() to
		// simulate reading time)
	}

	public void stopReading(String readerName) {
		// TODO: Decrease number of readers. If there are no more readers, notify
		// waiting editors
	}

	// --- Editors section ---
	public void startWriting(String editorName) throws InterruptedException {
		// TODO: Wait while there are readers or another editor writing. Set writing =
		// true
	}

	public void editBooks(String editorName) {
		// TODO: Simulate editing (add or remove a book randomly). Print what change was
		// made
	}

	public void stopWriting(String editorName) {
		// TODO: Set writing = false and notify all waiting threads
	}
}
