package de.htwg.seapal.trip.controllers;

import java.util.Map;

import com.google.inject.Inject;

import play.*;
import play.data.Form;
import play.mvc.*;
import de.htwg.seapal.common.plugin.HookRegistry;
import de.htwg.seapal.trip.models.ITrip;
import de.htwg.seapal.trip.models.impl.Trip;
import de.htwg.seapal.trip.views.html.*;
import de.htwg.seapal.trip.views.html.index;
import views.html.*;

@SuppressWarnings("unused")
public class PlayTripController extends Controller {
	
	private Form<Trip> tripForm = Form.form(Trip.class);
	
	@Inject
	private ITripController tripController;
	
    public static Result index() {
        return ok(index.render("Index Action of Trip Demo"));
    }
  
    public Result trips() {
        return ok(trips.render("All trips", tripController.getTrips(), tripForm));
    }
    
    public Result create() {
    	  Form<Trip> filledForm = tripForm.bindFromRequest();
    	  if(filledForm.hasErrors()) {
    	    return badRequest(
    	      trips.render("create", tripController.getTrips(), filledForm)
    	    );
    	  } else {
    		tripController.createTrip(filledForm.get());
    	    return redirect(routes.PlayTripController.trips());  
    	  }
    	}
}