package library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Main class to launch the simulation
public class LibrarySimulation {

	private static final int READERS = 6; // Number of reader threads - can be modified
	private static final int EDITORS = 2; // Number of editor threads - can be modified

	public static void main(String[] args) {

		DigitalLibrary library = new DigitalLibrary();
		List<Thread> threads = new ArrayList<>();

		// Create readers
		for (int i = 1; i <= READERS; i++) {
			threads.add(new Reader(library, "Reader-" + i));
		}

		// Create editors
		for (int i = 1; i <= EDITORS; i++) {
			threads.add(new Editor(library, "Editor-" + i));
		}

		// Randomize start order
		Collections.shuffle(threads);

		// Start all threads
		for (Thread t : threads) {
			t.start();
		}

		// Wait for all to finish
		for (Thread t : threads) {
			try {
				t.join();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}

		System.out.println("\nSimulation finished!");
	}
}
