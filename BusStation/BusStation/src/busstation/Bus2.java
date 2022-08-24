package busstation;

import java.util.ArrayList;

public interface Bus2 extends Bus1 {

    public ArrayList<String> listVehicles();

    public ArrayList<String> listTrips();

    public ArrayList<String> listDrivers();

    public ArrayList<String> listDriversWithAssignedTrips();

    public ArrayList<String> customerTrip();

}
