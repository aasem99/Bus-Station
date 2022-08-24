package busstation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.*;

public class BusStationLogic implements Bus1, Bus2 {

    public BusStationLogic() {

    }

    @Override
    public boolean managerValidate(String username, String pass) {
        boolean check = false;
        String filename = "managerspass.txt";
        ArrayList<String> managersList = new ArrayList<String>();
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            int i = 0;
            while (br.ready()) {
                managersList.add(i, br.readLine());
                i++;
            }
            System.out.println(managersList.get(1));
            for (int j = 0; j < managersList.size(); j += 2) {
                if (username.equalsIgnoreCase(managersList.get(j)) && pass.equalsIgnoreCase(managersList.get(j + 1))) {
                    check = true;
                    System.out.println(check);
                    break;
                }
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable To Open The File : " + filename);
        } catch (IOException ex) {
            System.out.println("Error Reading The File : " + filename);
        }
        System.out.println(check);
        return check;
    }

    @Override
    public boolean driverValidate(String username, String pass) {
        boolean check = false;
        String filename = "driverspass.txt";
        ArrayList<String> driverList = new ArrayList<String>();
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            int i = 0;
            while (br.ready()) {
                driverList.add(i, br.readLine());
                i++;
            }
            System.out.println(driverList.get(1));
            for (int j = 0; j < driverList.size(); j += 2) {
                if (username.equalsIgnoreCase(driverList.get(j)) && pass.equalsIgnoreCase(driverList.get(j + 1))) {
                    check = true;
                    System.out.println(check);
                    break;
                }

            }

            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable To Open The File : " + filename);
        } catch (IOException ex) {
            System.out.println("Error Reading The File : " + filename);
        }
        System.out.println(check);
        return check;
    }

    @Override
    public boolean customerValidate(String username, String pass) {
        boolean check = false;
        String filename = "customerspass.txt";
        ArrayList<String> customersList = new ArrayList<String>();
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            int i = 0;
            while (br.ready()) {
                customersList.add(i, br.readLine());
                i++;
            }
            System.out.println(customersList.get(1));
            for (int j = 0; j < customersList.size(); j += 2) {
                if (username.equalsIgnoreCase(customersList.get(j)) && pass.equalsIgnoreCase(customersList.get(j + 1))) {
                    check = true;
                    System.out.println(check);
                    break;
                }
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable To Open The File : " + filename);
        } catch (IOException ex) {
            System.out.println("Error Reading The File : " + filename);
        }
        System.out.println(check);
        return check;

    }

    @Override
    public ArrayList<String> listVehicles() {
        String filename = "vehicles.txt";
        ArrayList<String> listOfVehicles = new ArrayList<String>();
        try {
            FileReader fr2 = new FileReader(filename);
            BufferedReader br2 = new BufferedReader(fr2);
            int i = 0;
            while (br2.ready()) {
                listOfVehicles.add(i, br2.readLine() + "\n");
                i++;
            }
            br2.close();

        } catch (FileNotFoundException ex) {
            System.out.println("unable to open file '" + filename + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + filename + "'");
        }

        return listOfVehicles;
    }

    @Override
    public ArrayList<String> listTrips() {
        String filename = "trips.txt";
        ArrayList<String> listOfTrips = new ArrayList<String>();

        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            int i = 0;
            while (br.ready()) {
                listOfTrips.add(i, br.readLine());
                i++;
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("unable to open file '" + filename + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + filename + "'");
        }
        return listOfTrips;

    }

    @Override
    public ArrayList<String> listDrivers() {
        String filename = "drivers.txt";
        ArrayList<String> listOfDrivers = new ArrayList<String>();
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            String line = null;
            int i = 0;
            while (br.ready()) {
                listOfDrivers.add(i, br.readLine());
                i++;
            }
            fr.close();
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("unable to open file '" + filename + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + filename + "'");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("IndexOutOfBoundsException");
        }
        return listOfDrivers;
    }

    @Override
    public ArrayList<String> customerTrip() {
        String filename = "tripsOfCustomers.txt";
        ArrayList<String> customer = new ArrayList<String>();

        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            int i = 0;
            while (br.ready()) {
                customer.add(i, br.readLine());
                i++;
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found : " + filename);
        } catch (IOException ex) {
            System.out.println("Error Reading File : " + filename);
        }

        return customer;
    }

    @Override
    public ArrayList<String> listDriversWithAssignedTrips() {
        String filename = "driversWithAssignedTrip.txt";
        ArrayList<String> driverAssignedTrips = new ArrayList<String>();
        int i = 0;
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);

            while (br.ready()) {
                driverAssignedTrips.add(i, br.readLine());
                i++;
            }
            fr.close();
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found : " + filename);
        } catch (IOException ex) {
            System.out.println("Error Reading File : " + filename);
        }

        return driverAssignedTrips;

    }

    @Override
    public void saveTrips(ArrayList<String> list) {
        String filename = "trips.txt";

        try {

            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i));
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found : " + filename);
        } catch (IOException ex) {
            System.out.println("Error Reading File : " + filename);
        }

    }

    @Override
    public void saveCustomer(ArrayList<String> list) {

        String filename = "tripsOfCustomers.txt";

        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i));
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found : " + filename);
        } catch (IOException ex) {
            System.out.println("Error Reading File : " + filename);
        }
    }

    @Override
    public void saveDrivers(ArrayList<String> list) {
        String filename = "driversWithAssignedTrip.txt";

        try {

            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i));
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found : " + filename);
        } catch (IOException ex) {
            System.out.println("Error Reading File : " + filename);
        }

    }

    public ArrayList<String> customerSearch(String map, String dest) {

        ArrayList<String> body = new ArrayList<String>();

        for (int i = 0; i < listTrips().size() - 4; i++) {

            if (map.equalsIgnoreCase(listTrips().get(i + 2)) && dest.equalsIgnoreCase(listTrips().get(i + 3))) {

                body.add(listTrips().get(i));
                body.add(listTrips().get(i + 1));
                body.add(listTrips().get(i + 2));
                body.add(listTrips().get(i + 3));
                body.add(listTrips().get(i + 4));
                body.add(listTrips().get(i + 5));
                body.add(listTrips().get(i + 6));
                body.add(listTrips().get(i + 7));
                body.add(listTrips().get(i + 8));
            }
        }
        if (body.isEmpty()) {
            body.add(0, "Doesn't Exist");
        }
        return body;

    }

    public boolean checkAvailability(String numberForMe1, int numOfSeats) {
        boolean check = false;
        for (int i = 0; i < listTrips().size(); i++) {
            if (numberForMe1.equalsIgnoreCase(listTrips().get(i))) {
                Integer seatsNumber6 = new Integer(listTrips().get(i + 7));
                if (numOfSeats <= seatsNumber6) {
                    check = true;
                }
            }
        }
        return check;
    }

    public String reserveTickets(String numOfTrip, String customer, int numOfSeats, boolean valid) {

        String ticketDet = "";
        String filename = "trips.txt";
        String line = null;
        Integer d = new Integer(numOfTrip);
        String z = d.toString();
        ArrayList<String> body = new ArrayList<String>();
        body = listTrips();
        ArrayList<String> body1 = new ArrayList<String>();
        body1 = customerTrip();
        String trip = "";
        String price = "";
        String price2 = "";

        for (int i = 0; i < body.size(); i++) {
            if (z.equalsIgnoreCase(body.get(i))) {
                Integer numofRemSeats = new Integer(body.get(i + 7));
                Integer diff = new Integer(numofRemSeats - numOfSeats);
                String j = diff.toString();
                body.remove(i + 7);
                body.add(i + 7, j);
                trip += "Trip Number : " + body.get(i) + "\n";
                trip += "Type : " + body.get(i + 1) + "\n";
                trip += "From : " + body.get(i + 2) + "\n";
                trip += "To : " + body.get(i + 3) + "\n";
                trip += "Date : " + body.get(i + 4) + "\n";
                trip += "Type Of Vehicle : " + body.get(i + 5) + "\n";
                trip += "number Of Stops : " + body.get(i + 6) + "\n";
                trip += "number Of Seats : " + body.get(i + 7) + "\n";
                trip += "Price/Seat : " + body.get(i + 8) + "\n";
                price = body.get(i + 8);
                price2 = body.get(i + 8);
                Integer price3 = new Integer(price2);
                for (int t = 0; t < body1.size(); t++) {
                    if (customer.equalsIgnoreCase(body1.get(t))) {

                        body1.add(t + 1, body.get(i));
                        saveCustomer(body1);
                        body1.add(t + 2, "Type : " + body.get(i + 1));
                        saveCustomer(body1);
                        body1.add(t + 3, "From : " + body.get(i + 2));
                        saveCustomer(body1);
                        body1.add(t + 4, "To : " + body.get(i + 3));
                        saveCustomer(body1);
                        body1.add(t + 5, "Date : " + body.get(i + 4));
                        saveCustomer(body1);
                        body1.add(t + 6, "Type Of Vehicle : " + body.get(i + 5));
                        saveCustomer(body1);
                        body1.add(t + 7, "Number Of Stops : " + body.get(i + 6));
                        saveCustomer(body1);
                        body1.add(t + 8, "Number Of Seats : " + body.get(i + 7));
                        saveCustomer(body1);
                        if (valid = false) {//FALSE MEANS ONE_WAY_TRIP..........
                            body1.add(t + 9, "Price/Seat: " + body.get(i + 8) + "\t\tYour Reserve : " + numOfSeats + " Tickets For : "
                                    + (numOfSeats * price3) + " $"+"  FOR ONE_WAY_TRIP ");
                            saveCustomer(body1);
                        } else {//TRUE MEANS ROUND_TRIP.........................
                            body1.add(t + 9, "Price/Seat: " + body.get(i + 8) + "\t\tYour Reserve : " + numOfSeats + " Tickets For : "
                                    + (numOfSeats * price3*1.7) + " $"+"  FOR ROUND_TRIP");
                            saveCustomer(body1);
                        }

                    }

                }
                saveTrips(body);
                numofRemSeats -= numOfSeats;
            }
        }
        if (valid = false) {
            Integer priceForCustomer = new Integer(price);
            Integer Price4 = new Integer(numOfSeats * priceForCustomer);
            String oneWayTripFinalPrice;
            oneWayTripFinalPrice = Price4.toString() + " $ For : " + numOfSeats + " Tickets FOR ONE_WAY_TRIP";
            return oneWayTripFinalPrice;
        } else {
            Double priceForRoundTripCustomer = new Double(price);
            Double PriceRoundTrip = new Double(numOfSeats * priceForRoundTripCustomer * 1.7);
            String roundTripFinalPrice;
            System.out.println(PriceRoundTrip);
            roundTripFinalPrice = PriceRoundTrip.toString() + " $ For : " + numOfSeats + " Tickets FOR ROUND_TRIP";
            return roundTripFinalPrice;
        }
    }

}
