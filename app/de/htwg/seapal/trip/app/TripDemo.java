package de.htwg.seapal.trip.app;

import java.util.Scanner;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.seapal.trip.views.tui.TripTUI;
import de.htwg.seapal.trip.controllers.ITripController;


public class TripDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Set up Google Guice Dependency Injector
		Injector injector = Guice.createInjector(new TripDemoImplModule());
		
		// Build up the application, resolving dependencies automatically by Guice
		ITripController controller = injector.getInstance(ITripController.class);

		TripTUI tui = new TripTUI(controller);

		tui.printTUI();
		// continue to read user input on the tui until the user decides to quit
		boolean continu = true;
		Scanner scanner = new Scanner(System.in);
		while (continu) {
			continu = tui.processInputLine(scanner.next());
		}
    scanner.close();
	}

}
