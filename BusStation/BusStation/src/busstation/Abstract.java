
package busstation;

import java.util.ArrayList;


public class Abstract extends BusStationLogic {

    @Override
    public boolean checkAvailability(String numberForMe1, int numOfSeats) {
        return super.checkAvailability(numberForMe1, numOfSeats); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<String> customerSearch(String map, String dest) {
        return super.customerSearch(map, dest); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String reserveTickets(String numOfTrip, String customer, int numOfSeats,boolean valid) {
        return super.reserveTickets(numOfTrip, customer, numOfSeats,valid); //To change body of generated methods, choose Tools | Templates.
    }
    
}
