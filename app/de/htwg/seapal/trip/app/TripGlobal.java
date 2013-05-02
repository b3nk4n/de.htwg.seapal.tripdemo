package de.htwg.seapal.trip.app;

import play.Application;
import play.GlobalSettings;
import play.Logger;


import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.seapal.common.modules.ReflectionModule;

public class TripGlobal extends GlobalSettings {
	private static Injector INJECTOR;

	public static Injector createInjector() {
		return Guice.createInjector(new ReflectionModule(), new TripDemoImplModule());
	}

	@Override
	public <A> A getControllerInstance(Class<A> controllerClass)
			throws Exception {
		if (INJECTOR == null) {
			INJECTOR = createInjector();
		}

		return INJECTOR.getInstance(controllerClass);
	}


	@Override
	public void onStop(Application app) {
		Logger.info("Trip app shutdown...");
	}
}
