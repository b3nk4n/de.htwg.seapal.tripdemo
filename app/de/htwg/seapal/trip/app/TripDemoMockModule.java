package de.htwg.seapal.trip.app;

import de.htwg.seapal.trip.models.ITrip;
import com.google.inject.AbstractModule;
import de.htwg.seapal.trip.controllers.ITripController;
import de.htwg.seapal.trip.database.ITripDatabase;


public class TripDemoMockModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(ITrip.class).to(de.htwg.seapal.trip.models.mock.Trip.class);
		bind(ITripController.class).to(de.htwg.seapal.trip.controllers.mock.TripController.class);
		bind(ITripDatabase.class).to(de.htwg.seapal.trip.database.mock.TripDb4oDatabase.class);
	}
}