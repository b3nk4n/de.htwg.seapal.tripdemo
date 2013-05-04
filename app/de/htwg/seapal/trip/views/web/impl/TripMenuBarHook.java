package de.htwg.seapal.trip.views.web.impl;

import de.htwg.seapal.maps.views.web.hooks.MenuBarHook;

public class TripMenuBarHook implements MenuBarHook {

	@Override
	public String getMenuTitle() {
		return "Trips";
	}

	@Override
	public String getUrl() {
		return de.htwg.seapal.trip.controllers.routes.PlayTripController.trips().url();
	}

}
