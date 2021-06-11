package Flight;

import Flight.Plane.Plane;
import Flight.Plane.PlaneType;
import Person.Passenger.Passenger;
import Person.Staff.Pilot;
import Person.Staff.Staff;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private Plane plane;
    private ArrayList<Staff> crew;
    private ArrayList<Passenger> manifest;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(
                  Plane plane,
                  Pilot pilot,
                  ArrayList<Staff> crew,
                  ArrayList<Passenger> manifest,
                  String flightNumber,
                  String destination,
                  String departureAirport,
                  String departureTime) {
        this.plane = plane;
        this.pilot = pilot;
        this.crew = crew;
        this.manifest = manifest;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<Staff> getCrew() {
        return crew;
    }

    public ArrayList<Passenger> getManifest() {
        return manifest;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getAvailableSeats() {
        int capacity = PlaneType.BOEING747.getCapacity();
        int reservedSeats = manifest.size();
        int availableSeats = capacity - reservedSeats;
        return availableSeats;

    }

    public void addToManifest(Passenger passenger) {
        int capacity = PlaneType.BOEING747.getCapacity();
        int reservedSeats = manifest.size();
        int availableSeats = capacity - reservedSeats;
        if (availableSeats > 0) {
            manifest.add(passenger);
        }
    }
}
