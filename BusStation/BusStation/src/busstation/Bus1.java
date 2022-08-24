package busstation;

import java.util.ArrayList;

public interface Bus1 {

    public boolean managerValidate(String username, String pass);

    public boolean driverValidate(String username, String pass);

    public boolean customerValidate(String username, String pass);

    public void saveTrips(ArrayList<String> list);

    public void saveCustomer(ArrayList<String> list);

    public void saveDrivers(ArrayList<String> list);

}
