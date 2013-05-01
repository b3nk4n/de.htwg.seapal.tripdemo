package de.htwg.seapal.trip.controllers;

import play.*;
import play.mvc.*;
import de.htwg.seapal.trip.views.html.*;
import de.htwg.seapal.trip.views.html.index;
import views.html.*;

@SuppressWarnings("unused")
public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
  
}