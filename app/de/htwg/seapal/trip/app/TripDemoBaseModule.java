package de.htwg.seapal.trip.app;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

import de.htwg.seapal.common.plugin.Initializable;
import de.htwg.seapal.common.plugin.Plugin;
import de.htwg.seapal.trip.views.tui.TripTUI;

public class TripDemoBaseModule extends AbstractModule {

	@Override
	protected void configure() {
		Multibinder<Initializable> inits = Multibinder.newSetBinder(binder(), Initializable.class);
		inits.addBinding().to(TripGlobal.class);
		
		Multibinder<Plugin> plugins = Multibinder.newSetBinder(binder(), Plugin.class);
		plugins.addBinding().to(TripTUI.class);
	}

}
