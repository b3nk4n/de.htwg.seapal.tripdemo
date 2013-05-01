package de.htwg.seapal.trip.database.impl;

import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.query.Predicate;

import de.htwg.seapal.trip.database.ITripDatabase;
import de.htwg.seapal.trip.models.ITrip;
import de.htwg.seapal.trip.models.impl.Trip;

public class TripDb4oDatabase implements ITripDatabase {

	private ObjectContainer db;
	private int tripId = 0;
	
	public TripDb4oDatabase() {
		db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"trip.data");
	}
	
	@Override
	public long  newTrip() {
		ITrip trip = new Trip();
		trip.setId(tripId);
		tripId++;
		long tId = trip.getId();
		saveTrip(trip);
		return tId;
	}
	
	@Override
	public void saveTrip(ITrip trip) {
		db.store(trip);
	}

	@Override
	public boolean containsTrip(long tripId) {	
		return (getTripById(tripId) == null) ? false : true;
	}

	@Override
	public ITrip getTripById(final long tripId) {
		
		List <ITrip> trips = db.query(new Predicate<ITrip>() {

			private static final long serialVersionUID = 1L;

			public boolean match(ITrip trip) {
				return trip.getId() == tripId;
			}
		});
		
		if (trips.isEmpty()) {
			return null;			
		} 
		return trips.get(0);
	}

	@Override
	public void deleteTripById(long tripId) {
		db.delete(getTripById(tripId));
	}
	
	public void closeDb() {
		db.close();
	}

}