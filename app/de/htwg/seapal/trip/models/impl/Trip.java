package de.htwg.seapal.trip.models.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import de.htwg.seapal.trip.models.AbstractTrip;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trip extends AbstractTrip{


	@Id
	private long id = 0;
	
	@Column
	private String name="Trip to hell";
	@Column
	private String startLocation = null;
	@Column
	private String endLocation = null;
	@Column
	private String skipper = null;
	@Column
	private List<String> crew = new ArrayList<String>();
	@Column
	private Date startTime = null;
	@Column
	private Date endTime = null;
	@Column
	private long duration = 0L;
	@Column
	private int motor = 0;
	@Column
	private double fuel = 0;
	@Column
	private String notes = null;
	@Column
	private Map<Long,String> map;
	
	public Trip(long l)
	{
		this.id = l;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setStartLocation(String location) {
		this.startLocation = location;
	}

	@Override
	public String getStartLocation() {
		return startLocation;
	}

	@Override
	public void setEndLocation(String location) {
		this.endLocation = location;
	}

	@Override
	public String getEndLocation() {
		return endLocation;
	}

	@Override
	public void setSkipper(String skipper) {
		this.skipper = skipper;
	}

	@Override
	public String getSkipper() {
		return skipper;
	}

	@Override
	public void addCrewMembers(List<String> crewMembers) {
		this.crew = crewMembers;
	}

	@Override
	public List<String> getCrewMembers() {
		return crew;
	}

	@Override
	public void setStartTime(Date start) {
		this.startTime = start;
	}

	@Override
	public Date getStartTime() {
		return startTime;
	}

	@Override
	public void setEndTime(Date end) {
		this.endTime = end;
	}

	@Override
	public Date getEndTime() {
		return endTime;
	}

	@Override
	public void setDuration(long timeInSeconds) {
		this.duration = timeInSeconds;
	}

	@Override
	public long getDuration() {
		return duration;
	}

	@Override
	public void setMotor(int motor) {
		this.motor = motor;
	}

	@Override
	public int getMotor() {
		return motor;
	}

	@Override
	public void setFuel(double percent) {
		this.fuel = percent;
	}

	@Override
	public double getFuel() {
		return fuel;
	}

	@Override
	public void setNotes(String text) {
		this.notes = text;
	}

	@Override
	public String getNotes() {
		return notes;
	}

	@Override
	public long getId() {
		return id;
	}

	@Override
	public Map<Long, String> getTripList() {
		return map;
	}
}