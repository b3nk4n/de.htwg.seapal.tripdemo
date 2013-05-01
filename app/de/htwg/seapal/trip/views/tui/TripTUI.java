package de.htwg.seapal.trip.views.tui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.google.inject.Inject;

import de.htwg.seapal.trip.controllers.ITripController;
import de.htwg.seapal.common.observer.*;
import de.htwg.seapal.common.plugin.Plugin;
import de.htwg.seapal.trip.models.ITrip;
import de.htwg.seapal.trip.models.impl.Trip;


public class TripTUI implements Plugin, IObserver{
	
	private ITripController controller;
	private ITrip trip;

	@Inject
	public TripTUI(ITripController controller) {
		this.controller = controller;
		controller.addObserver(this);
	}

  @Override
	public void update(Event e) {
		printTUI();
	}

  @Override
	public boolean processInputLine(String line) {
		boolean continuee = true;
		Scanner scanner = new Scanner(line);
		
		switch(scanner.next()) {
			case "q": 	// speichere Trip JETZT;
            continuee = false;
            System.out.println("Saved Trip and quit");
						break;
			case "createTrip":	
				trip = new Trip();
				trip.setId(scanner.nextInt());
						break;
			case "name":
						trip.setName(scanner.next());
						System.out.println();
						break;
			case "start_location":
				trip.setStartLocation(scanner.next());
				System.out.println();
				break;
			case "end_location":
				trip.setEndLocation(scanner.next());
				System.out.println();
				break;
			case "skipper":
				trip.setSkipper(scanner.next());
				System.out.println();
				break;
			case "crew_member":
				trip.addCrewMembers(addCrewMember(scanner));
				System.out.println();
				break;
			case "start_time":				
				trip.setStartTime(getParsedDate(scanner));
				System.out.println();
				break;
			case "end_time":
				trip.setEndTime(getParsedDate(scanner));
				System.out.println();
				break;
			case "duration":
				trip.setDuration(scanner.nextLong());
				System.out.println();
				break;
			case "motor":
				trip.setMotor(scanner.nextInt());
				System.out.println();
				break;
			case "fuel":
				trip.setFuel(scanner.nextDouble());
				System.out.println();
				break;
			case "notes":
				trip.setNotes(scanner.next());
				System.out.println();
				break;
			default:
        System.out.println("unknown command");
        break;
		}
		return continuee;
	}
	
	public void printTUI() {
    StringBuilder str = new StringBuilder();
    str.append("\n");
    str.append("Commands for Trip: \n");
    str.append("q: Save Trip and quit\n");
    str.append("createTrip (int id)\n");
    str.append("name (String)\n");
    str.append("start_location (String)\n");
    str.append("end_location (String)\n");
    str.append("skipper (String)\n");
    str.append("crew_member \n");
    str.append("start_time (Date dd.MM.yyyy)\n");
    str.append("end_time (Date dd.MM.yyyy)\n");
    str.append("duration (int) (in days)\n");
    str.append("motor (int)\n");
    str.append("fuel (double) (in percent)\n");
    str.append("notes (String)\n");
    str.append("\n");
	
		System.out.println(str.toString());
	}
	
	@Override
	public String getMenuEntry() {
		return "Trip";
	}

	@Override
	public char getMenuKey() {
		return 'b';
	}

	private Date getParsedDate(Scanner scanner)
	{
		boolean correctInput = false;
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		do
		{
			try {
				return formatter.parse(scanner.next());
			} catch (ParseException e) {
				System.out.println("Wrong date format! correct format: 31.10.1989");
			}
		}
		while(correctInput);
        
		
		return new Date();
	}
	
	private List<String> addCrewMember(Scanner scanner)
	{
		List<String> list = new ArrayList<String>();
		
		System.out.println("Enter name of crew member, to cancel enter q");
		
		boolean finished = false;
		String input ="";
		do
		{
			input = scanner.next();
			if(input.length() == 1 && input.charAt(0) == 'q')
				finished = true;
			else
				list.add(input);
		}
		while(!finished); 
		
		return list;
	}
	
}