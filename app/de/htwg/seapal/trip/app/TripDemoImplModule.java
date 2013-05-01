package de.htwg.seapal.trip.app;

import de.htwg.seapal.trip.models.ITrip;
import com.google.inject.AbstractModule;
import de.htwg.seapal.trip.controllers.ITripController;
import de.htwg.seapal.trip.database.ITripDatabase;

public class TripDemoImplModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(ITrip.class).to(de.htwg.seapal.trip.models.impl.Trip.class);
		bind(ITripController.class).to(de.htwg.seapal.trip.controllers.impl.TripController.class);	
		bind(ITripDatabase.class).to(de.htwg.seapal.trip.database.impl.TripDb4oDatabase.class);
	}

}