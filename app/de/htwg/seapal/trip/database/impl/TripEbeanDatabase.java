package de.htwg.seapal.trip.database.impl;

import java.util.ArrayList;
import java.util.List;

import com.avaje.ebean.Ebean;

import de.htwg.seapal.trip.database.ITripDatabase;
import de.htwg.seapal.trip.models.ITrip;
import de.htwg.seapal.trip.models.impl.Trip;

public class TripEbeanDatabase implements ITripDatabase {

	@Override
	public long newTrip() {
		Trip trip = new Trip();
		trip.setId(System.currentTimeMillis());
		Ebean.save(trip);
		return trip.getId();
	}

	@Override
	public void saveTrip(ITrip trip) {
		Ebean.save(trip);
	}

	@Override
	public boolean containsTrip(long tripId) {
		return getTripById(tripId) != null;
	}

	@Override
	public ITrip getTripById(long tripId) {
		return Ebean.find(Trip.class, tripId);
	}
	
	@Override
	public List<ITrip> getAllTrips() {
		return Ebean.find(ITrip.class).findList();
	}

	@Override
	public void deleteTripById(long tripId) {
		Ebean.delete(Trip.class, tripId);
	}
	
	
}
