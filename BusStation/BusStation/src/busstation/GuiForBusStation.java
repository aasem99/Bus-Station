package busstation;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.FontPosture;
import java.util.ArrayList;
import javafx.event.EventType;
import javafx.scene.control.RadioButton;

public class GuiForBusStation {

    Scene checkScene;
    Stage stage;
    BusStationLogic logic = new BusStationLogic();
    private String x;
    private String y;
    private String name;
    private String numberForMe;
    public String numberForMe1;

    public GuiForBusStation(Stage stage) {
        this.stage = stage;
    }

    public Scene getScene() {
        return this.checkScene;
    }

    public void prepareScene() {

        //CHECKBOX_SCENE........................................................
        CheckBox employeeBox = new CheckBox("Employee");
        CheckBox customerBox = new CheckBox("Customer");
        Button ok = new Button("OK");
        ok.setTextFill(Color.BLACK);
        ok.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        Label check = new Label("");
        check.setTextFill(Color.BLACK);
        check.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        GridPane grid1 = new GridPane();
        grid1.setVgap(8);
        grid1.add(employeeBox, 0, 0);
        grid1.add(customerBox, 0, 1);
        grid1.add(ok, 0, 2);
        grid1.add(check, 0, 3);
        checkScene = new Scene(grid1, 300, 125);
        //End Of CHECKBOX_SCENE.................................................

        //loginFormEmployee_Scene...............................................
        Label employeeUsernameField = new Label("USERNAME: ");
        employeeUsernameField.setTextFill(Color.BLACK);
        employeeUsernameField.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        Label validationLabel = new Label("");
        validationLabel.setTextFill(Color.BLACK);
        validationLabel.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        Label employeePasswordField = new Label("PASSWORD: ");
        employeePasswordField.setTextFill(Color.BLACK);
        employeePasswordField.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        TextField employeeName = new TextField();
        PasswordField employeePass = new PasswordField();
        CheckBox managerBox = new CheckBox("Manager");
        CheckBox driverBox = new CheckBox("Driver");
        Button employeeConfirm = new Button("Confirm");
        employeeConfirm.setTextFill(Color.BLACK);
        employeeConfirm.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        Button employeeReturn = new Button("Return");
        employeeReturn.setTextFill(Color.BLACK);
        employeeReturn.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        GridPane employeeGrid = new GridPane();
        employeeGrid.setVgap(8);
        employeeGrid.add(employeeUsernameField, 0, 0);
        employeeGrid.add(employeePasswordField, 0, 1);
        employeeGrid.add(employeeName, 1, 0);
        employeeGrid.add(employeePass, 1, 1);
        employeeGrid.add(employeeConfirm, 0, 2);
        employeeGrid.add(managerBox, 0, 3);
        employeeGrid.add(driverBox, 0, 4);
        employeeGrid.add(validationLabel, 0, 5);
        employeeGrid.add(employeeReturn, 0, 6);
        Scene loginformEmployeeScene = new Scene(employeeGrid, 400, 250);
        //End Of loginFormEmployee_Scene........................................

        //loginFormCustomer_Scene...............................................
        Label customerUsername = new Label("USERNAME: ");
        customerUsername.setTextFill(Color.BLACK);
        customerUsername.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        Label validationLabel2 = new Label("");
        validationLabel2.setTextFill(Color.BLACK);
        validationLabel2.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        Label customerPasswordField = new Label("PASSWORD: ");
        customerPasswordField.setTextFill(Color.BLACK);
        customerPasswordField.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        TextField customerName = new TextField();
        PasswordField customerPass = new PasswordField();
        Button customerConfirm = new Button("Confirm");
        customerConfirm.setTextFill(Color.BLACK);
        customerConfirm.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        Button customerReturn = new Button("Return");
        customerReturn.setTextFill(Color.BLACK);
        customerReturn.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        GridPane customerGrid = new GridPane();
        customerGrid.setVgap(8);
        customerGrid.add(customerUsername, 0, 1);
        customerGrid.add(customerPasswordField, 0, 2);
        customerGrid.add(customerName, 1, 1);
        customerGrid.add(customerPass, 1, 2);
        customerGrid.add(customerConfirm, 0, 3);
        customerGrid.add(validationLabel2, 0, 4);
        customerGrid.add(customerReturn, 0, 5);
        Scene loginformCustomerScene = new Scene(customerGrid, 300, 200);
        //End Of loginFormCustomer_Scene........................................

        //CustomerMenu_Scene....................................................
        Label welcomeToCustomer = new Label("");
        welcomeToCustomer.setTextFill(Color.BLACK);
        welcomeToCustomer.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        Label reserveTrip = new Label("ReserveTrip");
        reserveTrip.setTextFill(Color.BLACK);
        reserveTrip.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        Label myTrips = new Label("MyTrips");
        myTrips.setTextFill(Color.BLACK);
        myTrips.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        Button reserve = new Button("Reserve");
        reserve.setTextFill(Color.BLACK);
        reserve.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        Button showMyTrips = new Button("Show");
        showMyTrips.setTextFill(Color.BLACK);
        showMyTrips.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        Button cancelTrip = new Button("Cancel Trip");
        Button returnToCustomerScene = new Button("Return");
        returnToCustomerScene.setTextFill(Color.BLACK);
        returnToCustomerScene.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        GridPane customerMenuGrid = new GridPane();
        customerMenuGrid.setVgap(5);
        customerMenuGrid.setHgap(10);
        customerMenuGrid.add(welcomeToCustomer, 0, 0);
        customerMenuGrid.add(reserveTrip, 0, 1);
        customerMenuGrid.add(myTrips, 0, 3);
        customerMenuGrid.add(reserve, 1, 1);
        customerMenuGrid.add(showMyTrips, 1, 2);
        customerMenuGrid.add(cancelTrip, 0, 2);
        customerMenuGrid.add(returnToCustomerScene, 0, 4);
        Scene customerMenuScene = new Scene(customerMenuGrid, 400, 300);
        //End of CustomerMenu_Scene.............................................

        //CustomerShowMyTrips_Scene.............................................
        Label myTrips5 = new Label("");
        Button returnToCustomerMenuScene2 = new Button("Return");
        GridPane customerTripsGrid = new GridPane();
        customerTripsGrid.setVgap(8);
        customerTripsGrid.add(myTrips5, 0, 0);
        customerTripsGrid.add(returnToCustomerMenuScene2, 0, 1);
        Scene customerTripsScene = new Scene(customerTripsGrid, 800, 600);
        //End Of CustomerShowMyTrips_Scene......................................

        //ManagerMenu_Scene.....................................................
        Label welcomeToManager = new Label("");
        welcomeToManager.setTextFill(Color.BLACK);
        welcomeToManager.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        Button add = new Button("Add");
        add.setTextFill(Color.BLACK);
        add.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        Button remove = new Button("remove");
        remove.setTextFill(Color.BLACK);
        remove.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        Button returnToManagerScene = new Button("Return");
        returnToManagerScene.setTextFill(Color.BLACK);
        returnToManagerScene.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        Button review = new Button("Review");
        Button assign = new Button("Assign");
        GridPane managerMenuGrid = new GridPane();
        managerMenuGrid.setVgap(8);
        managerMenuGrid.setHgap(8);
        managerMenuGrid.add(welcomeToManager, 0, 0);
        managerMenuGrid.add(review, 0, 1);
        managerMenuGrid.add(add, 0, 2);
        managerMenuGrid.add(remove, 0, 3);
        managerMenuGrid.add(assign, 0, 4);
        managerMenuGrid.add(returnToManagerScene, 0, 5);
        Scene managerMenuScene = new Scene(managerMenuGrid, 600, 400);
        //End Of ManagerMenu_Scene..............................................

        //AssignTripScene.......................................................  
        Label trips = new Label("");
        Label answer2 = new Label("");
        Button returnToManagerMenuScene2 = new Button("Return");
        Button assignedTrip = new Button("Assign To");
        TextField assignTrip = new TextField();
        GridPane assignGrid = new GridPane();
        assignGrid.setVgap(10);
        assignGrid.add(trips, 0, 0);
        assignGrid.add(assignTrip, 0, 1);
        assignGrid.add(answer2, 0, 3);
        assignGrid.add(assignedTrip, 0, 2);
        assignGrid.add(returnToManagerMenuScene2, 0, 3);
        Scene assignScene = new Scene(assignGrid, 900, 700);
        //End Of AssignTripScene................................................

        //AssignDriverScene.....................................................
        Label driversList = new Label("");
        Label choosedTrip = new Label("");
        Label answer3 = new Label("");
        Button assign1 = new Button("Assign");
        Button returnToManagerMenuScene3 = new Button("Return");
        TextField assignDriverNum = new TextField();
        GridPane assignDriverGrid = new GridPane();
        assignDriverGrid.setVgap(10);
        assignDriverGrid.add(choosedTrip, 0, 0);
        assignDriverGrid.add(driversList, 0, 1);
        assignDriverGrid.add(assignDriverNum, 1, 2);
        assignDriverGrid.add(assign1, 1, 3);
        assignDriverGrid.add(answer3, 1, 4);
        assignDriverGrid.add(returnToManagerMenuScene3, 0, 2);
        Scene assignDriverScene = new Scene(assignDriverGrid, 900, 700);
        //End Of AssignDriverScene.............................................. 

        //ReviewScene...........................................................
        Label reviewAllTrips = new Label("");
        Button returnToManagerMenuScene1 = new Button("return");
        GridPane reviewGrid = new GridPane();
        reviewGrid.setVgap(10);
        reviewGrid.add(reviewAllTrips, 0, 0);
        reviewGrid.add(returnToManagerMenuScene1, 0, 1);
        Scene reviewScene = new Scene(reviewGrid, 700, 500);
        //End Of ReviewScene....................................................

        //DriverMenu_Scene......................................................
        Label driverProfile = new Label("");
        driverProfile.setTextFill(Color.BLACK);
        driverProfile.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        Label myAssignedTrips = new Label("");
        myAssignedTrips.setTextFill(Color.BLACK);
        myAssignedTrips.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        Button returnToDriverScene = new Button("return");
        returnToDriverScene.setTextFill(Color.BLACK);
        returnToDriverScene.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        GridPane driverMenuGrid = new GridPane();
        driverMenuGrid.setVgap(5);
        driverMenuGrid.setHgap(5);
        driverMenuGrid.add(driverProfile, 0, 0);
        driverMenuGrid.add(myAssignedTrips, 0, 2);
        driverMenuGrid.add(returnToDriverScene, 0, 3);
        Scene driverMenuScene = new Scene(driverMenuGrid, 600, 400);
        //End Of DriverMenu_Scene...............................................

        //DriverList_Scene......................................................
        Label list = new Label("Enter The data : ");
        list.setTextFill(Color.BLACK);
        list.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        Label numTrip1 = new Label("Trip Number :");
        Label tripType = new Label("Type Of Trip : ");
        Label source1 = new Label("Source :");
        Label destination1 = new Label("Destination : ");
        Label date1 = new Label("Date : ");
        Label vehicleType = new Label("Type Of Vehicle : ");
        Label stopType = new Label("Type Of Stops : ");
        Label seatsNum1 = new Label("Number Of Seats : ");
        Label priceForSeat = new Label("Price/Seat : ");
        Label save = new Label("");
        Button returnToMangerControlScene = new Button("Return");
        Button addConfirm = new Button("Save");
        returnToMangerControlScene.setTextFill(Color.BLACK);
        returnToMangerControlScene.setFont(Font.font("verdana", FontPosture.ITALIC, 20));
        TextField numTrip = new TextField();
        TextField tripType2 = new TextField();
        TextField source2 = new TextField();
        TextField destination2 = new TextField();
        TextField date2 = new TextField();
        TextField vehicleType2 = new TextField();
        TextField stopType2 = new TextField();
        TextField seatsNum2 = new TextField();
        TextField priceForSeat2 = new TextField();
        GridPane managerControlGrid = new GridPane();
        managerControlGrid.setVgap(30);
        managerControlGrid.add(list, 0, 0);
        managerControlGrid.add(numTrip1, 0, 1);
        managerControlGrid.add(tripType, 0, 2);
        managerControlGrid.add(source1, 0, 3);
        managerControlGrid.add(destination1, 0, 4);
        managerControlGrid.add(date1, 0, 5);
        managerControlGrid.add(vehicleType, 0, 6);
        managerControlGrid.add(stopType, 0, 7);
        managerControlGrid.add(seatsNum1, 0, 8);
        managerControlGrid.add(priceForSeat, 0, 9);
        managerControlGrid.add(numTrip, 1, 1);
        managerControlGrid.add(tripType2, 1, 2);
        managerControlGrid.add(source2, 1, 3);
        managerControlGrid.add(destination2, 1, 4);
        managerControlGrid.add(date2, 1, 5);
        managerControlGrid.add(vehicleType2, 1, 6);
        managerControlGrid.add(stopType2, 1, 7);
        managerControlGrid.add(seatsNum2, 1, 8);
        managerControlGrid.add(priceForSeat2, 1, 9);
        managerControlGrid.add(addConfirm, 0, 10);
        managerControlGrid.add(returnToMangerControlScene, 0, 11);
        managerControlGrid.add(save, 1, 10);
        Scene managerControlScene = new Scene(managerControlGrid, 1200, 1000);
        //End of DriverList_Scene...............................................

        //ManagerRemoving_Scene.................................................
        Label list1 = new Label("Enter The data You Want To Delete : ");
        Label source3 = new Label("Source :");
        Label destination3 = new Label("Destination : ");
        Label numTrip4 = new Label("Trip Number : ");
        Label delete = new Label("");
        TextField source4 = new TextField();
        TextField destination4 = new TextField();
        TextField numTrip3 = new TextField();
        Button returnToMangerControlScene1 = new Button("Return");
        Button deleteConfirm = new Button("Confirm");
        GridPane managerDeleteGrid = new GridPane();
        managerDeleteGrid.add(list1, 0, 0);
        managerDeleteGrid.add(numTrip4, 0, 1);
        managerDeleteGrid.add(source3, 0, 2);
        managerDeleteGrid.add(destination3, 0, 3);
        managerDeleteGrid.add(numTrip3, 1, 1);
        managerDeleteGrid.add(source4, 1, 2);
        managerDeleteGrid.add(destination4, 1, 3);
        managerDeleteGrid.add(returnToMangerControlScene1, 0, 4);
        managerDeleteGrid.add(deleteConfirm, 2, 4);
        managerDeleteGrid.add(delete, 1, 4);
        Scene managerDeleteScene = new Scene(managerDeleteGrid, 600, 400);
        //End Of ManagerRemoving_Scene..........................................

        //CustomerReserve_Scene.................................................
        Label place = new Label("Search for your place");
        Label cmap = new Label("Map");
        Label cdestination = new Label("Destination");
        Label listOfTrips = new Label("");
        Label num = new Label("Enter Your Trip Number: ");
        num.setVisible(false);
        Label answer1 = new Label("");
        answer1.setVisible(false);
        Label answer0 = new Label("");
        answer0.setVisible(false);
        TextField maps = new TextField();
        TextField destinations = new TextField();
        TextField yourBooking = new TextField();
        yourBooking.setVisible(false);
        Button search = new Button("Search");
        Button returnToCustomerMenuScene = new Button("Return");
        Button book = new Button("Book");
        book.setVisible(false);
        GridPane customerReserveGrid = new GridPane();
        customerReserveGrid.setVgap(10);
        customerReserveGrid.add(place, 0, 0);
        customerReserveGrid.add(cmap, 0, 1);
        customerReserveGrid.add(cdestination, 0, 2);
        customerReserveGrid.add(maps, 1, 1);
        customerReserveGrid.add(destinations, 1, 2);
        customerReserveGrid.add(search, 0, 3);
        customerReserveGrid.add(returnToCustomerMenuScene, 0, 4);
        customerReserveGrid.add(listOfTrips, 0, 6);
        customerReserveGrid.add(yourBooking, 2, 5);
        customerReserveGrid.add(num, 1, 4);
        customerReserveGrid.add(book, 2, 6);
        customerReserveGrid.add(answer1, 3, 6);
        customerReserveGrid.add(answer0, 3, 7);
        Scene customerReserveScene = new Scene(customerReserveGrid, 800, 600);
        //End of CustomerReserve_Scene..........................................

        //NumSeats_Scene........................................................
        Label checkSeats = new Label("Enter Number Of seats You Want :");
        Label yourTrip = new Label("");
        yourTrip.setVisible(false);
        Label answer = new Label("");
        Label price = new Label("");
        RadioButton oneWayTrip = new RadioButton("One-Way-Trip");
        RadioButton roundTrip = new RadioButton("Round-Trip");
        Label checkRadio = new Label("");
        roundTrip.setVisible(false);
        oneWayTrip.setVisible(false);
        Button checkNumber = new Button("confirm");
        Button returnToCustomerReserveScene = new Button("return");
        Button continuee = new Button("Continue");
        TextField numOfSeats = new TextField();
        GridPane numSeatsGrid = new GridPane();
        numSeatsGrid.setVgap(8);
        numSeatsGrid.add(yourTrip, 0, 0);
        numSeatsGrid.add(checkSeats, 0, 1);
        numSeatsGrid.add(numOfSeats, 0, 2);
        numSeatsGrid.add(checkNumber, 0, 3);
        numSeatsGrid.add(answer, 2, 3);
        numSeatsGrid.add(returnToCustomerReserveScene, 0, 4);
        numSeatsGrid.add(continuee, 2, 4);
        numSeatsGrid.add(price, 0, 5);
        numSeatsGrid.add(oneWayTrip, 1, 5);
        numSeatsGrid.add(roundTrip, 3, 5);
        numSeatsGrid.add(checkRadio, 2, 6);
        Scene numSeatsScene = new Scene(numSeatsGrid, 900, 700);
        //End Of NumSeats_Scene.................................................

        //cancelTripScene.......................................................
        Label mycancelTrip = new Label("");
        Label answer77 = new Label("");
        Button confirmCancel = new Button("OK");
        Button returnToCustomerScene3 = new Button("Return");
        TextField tripCancelNumber = new TextField();
        GridPane cancelGrid = new GridPane();
        cancelGrid.setVgap(10);
        cancelGrid.add(mycancelTrip, 0, 0);
        cancelGrid.add(tripCancelNumber, 0, 1);
        cancelGrid.add(confirmCancel, 0, 2);
        cancelGrid.add(returnToCustomerScene3, 0, 3);
        cancelGrid.add(answer77, 1, 2);
        Scene cancelScene = new Scene(cancelGrid, 600, 400);

        //End Of cancelTripScene................................................
        ok.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (employeeBox.isSelected() && customerBox.isSelected()) {
                    check.setText("Please check only one box");
                } else if (employeeBox.isSelected()) {
                    stage.setScene(loginformEmployeeScene);
                } else if (customerBox.isSelected()) {
                    stage.setScene(loginformCustomerScene);
                } else {
                    check.setText("Please check one box");
                }
            }
        });
        employeeConfirm.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                boolean valid = false;
                String trips8 = "";
                String username = employeeName.getText();
                String pass = employeePass.getText();
                if (managerBox.isSelected() && driverBox.isSelected()) {
                    validationLabel.setText("Please check only one box");
                } else if (managerBox.isSelected()) {
                    valid = logic.managerValidate(username, pass);
                    if (valid) {
                        stage.setScene(managerMenuScene);

                    } else {
                        validationLabel.setText("Wrong username OR Password");
                    }
                } else if (driverBox.isSelected()) {
                    valid = logic.driverValidate(username, pass);
                    if (valid) {
                        stage.setScene(driverMenuScene);
                        for (int i = 0; i < logic.listDriversWithAssignedTrips().size(); i++) {
                            if (username.equalsIgnoreCase(logic.listDriversWithAssignedTrips().get(i))) {
                                while (!logic.listDriversWithAssignedTrips().get(i).equalsIgnoreCase("Drive Safely")) {
                                    trips8 += logic.listDriversWithAssignedTrips().get(i + 1) + "\n";
                                    myAssignedTrips.setText("Driver Name : " + username + "\n\nYour Assigned Trips : \n\n" + trips8 + "\n");
                                    i++;
                                }

                            }
                        }
                    } else {
                        validationLabel.setText("Wrong username OR Password");
                    }
                } else {
                    validationLabel.setText("Please check one box");
                }

            }
        });
        customerConfirm.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String username = customerName.getText();
                String pass = customerPass.getText();
                name = username;
                boolean valid = logic.customerValidate(username, pass);
                if (valid) {

                    stage.setScene(customerMenuScene);
                    welcomeToCustomer.setText("Welcome " + username);

                } else {
                    validationLabel2.setText("Wrong username OR Password");
                }

            }
        });
        showMyTrips.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                stage.setScene(customerTripsScene);
                ArrayList<String> body = new ArrayList<String>();
                body = logic.customerTrip();
                System.out.println(body);
                String trips9 = "";
                int j;
                for (int i = 0; i < body.size(); i++) {
                    if (name.equalsIgnoreCase(body.get(i))) {
                        j = i + 1;
                        while (!body.get(j).equalsIgnoreCase("Enjoy Your Trip With US")) {
                            myTrips5.setVisible(true);
                            trips9 += body.get(j) + "\n";
                            myTrips5.setText("Customer Name : " + name + "\nYour Trips : \n" + trips9);
                            j++;
                        }

                    }
                }
            }
        });
        cancelTrip.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                stage.setScene(cancelScene);

            }
        });
        confirmCancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                answer.setVisible(false);
                String canceledTripNumber = tripCancelNumber.getText();
                int b;
                boolean check;
                check = canceledTripNumber.matches("-?\\d+(\\.\\d+)?");
                ArrayList<String> body = new ArrayList<String>();
                body = logic.customerTrip();
                if (check) {
                    b = Integer.parseInt(canceledTripNumber);
                    answer.setVisible(false);
                    for (int i = 0; i < body.size(); i++) {
                        if (name.equalsIgnoreCase(body.get(i))) {
                            if (canceledTripNumber.equalsIgnoreCase(body.get(1))) {

                                for (int j = 0; j < 9; j++) {
                                    body.remove(i + 1);
                                    logic.saveCustomer(body);
                                }
                            } else if (canceledTripNumber.equalsIgnoreCase(body.get(10))) {
                                for (int j = 0; j < 9; j++) {
                                    body.remove(i + 10);
                                    logic.saveCustomer(body);
                                }
                            }
                        }
                    }
                } else {
                    answer.setVisible(true);
                    answer77.setText("Please Enter Number Only");
                }
               
                myTrips5.setText("Customer Name : " + name);

            }
        });
        review.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String trips = "";
                for (int i = 0; i < logic.listTrips().size(); i += 9) {
                    trips += "TripNumber : " + logic.listTrips().get(i) + "\n";
                    trips += "Type Of Trip : " + logic.listTrips().get(i + 1) + "\n";
                    trips += "From : " + logic.listTrips().get(i + 2) + "\n";
                    trips += "To : " + logic.listTrips().get(i + 3) + "\n";
                    trips += "Date : " + logic.listTrips().get(i + 4) + "\n";
                    trips += "Type Of Vehicle: " + logic.listTrips().get(i + 5) + "\n";
                    trips += "Type Of Stop : " + logic.listTrips().get(i + 6) + "\n";
                    trips += "NumberOfAvaiilableSeats : " + logic.listTrips().get(i + 7) + "\n";
                    trips += "Price/Seat : " + logic.listTrips().get(i + 8) + "\n\n";

                }
                reviewAllTrips.setText("All Trips : \n\n" + trips);

                stage.setScene(reviewScene);
            }
        });
        add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                stage.setScene(managerControlScene);

            }
        });
        addConfirm.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                save.setVisible(false);
                boolean check;
                String tripNum = numTrip.getText();
                String tripType5 = tripType2.getText();
                String source = source2.getText();
                String destination = destination2.getText();
                String date = date2.getText();
                String vehicleType3 = vehicleType2.getText();
                String stopType3 = stopType2.getText();
                String seatsNum = seatsNum2.getText();
                String priceForSeats3 = priceForSeat2.getText();
                ArrayList<String> body = new ArrayList<String>();
                body = logic.listTrips();
                check = seatsNum.matches("-?\\d+(\\.\\d+)?");
                int p;
                if (numTrip.getText().isEmpty() || tripType2.getText().isEmpty()
                        || source2.getText().isEmpty() || destination2.getText().isEmpty()
                        || date2.getText().isEmpty() || vehicleType2.getText().isEmpty()
                        || stopType2.getText().isEmpty() | seatsNum2.getText().isEmpty()
                        || priceForSeat2.getText().isEmpty()) {
                    save.setVisible(true);
                    save.setText("please Enter Don't Miss Any Fields");
                } else {
                    if (check) {
                        p = Integer.parseInt(seatsNum);
                        body.add(tripNum);
                        body.add(tripType5);
                        body.add(source);
                        body.add(destination);
                        body.add(date);
                        body.add(vehicleType3);
                        body.add(stopType3);
                        body.add(seatsNum);
                        body.add(priceForSeats3);
                        logic.saveTrips(body);//********saved**********
                        save.setVisible(true);
                        save.setText("\n\tTrip is Saved");
                    } else {
                        save.setText("\tplease Enter Number Only");
                    }
                }
            }
        });
        remove.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                stage.setScene(managerDeleteScene);
            }
        });
        deleteConfirm.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String tripNumber = numTrip3.getText();
                String source = source4.getText();
                String destination = destination4.getText();
                ArrayList<String> body = new ArrayList<String>();
                body = logic.listTrips();
                delete.setVisible(false);

                if (numTrip3.getText().isEmpty() || source4.getText().isEmpty() || destination4.getText().isEmpty()) {
                    delete.setVisible(true);
                    delete.setText("\n\tPlease Don't Miss Any Data Fields");
                } else {
                    for (int i = 0; i < body.size(); i++) {
                        if (tripNumber.equalsIgnoreCase(body.get(i))) {
                            for (int j = 0; j < 9; j++) {
                                body.remove(i);
                                logic.saveTrips(body);
                            }
                        }
                    }
                    delete.setVisible(true);
                    delete.setText("\n\tTrip is deleted");
                }

            }
        });
        assign.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.setScene(assignScene);
                String trip = "";

                for (int i = 0; i < logic.listTrips().size(); i += 9) {

                    trip += "TripNumber : " + logic.listTrips().get(i) + "\n";
                    trip += "Type Of Trip : " + logic.listTrips().get(i + 1) + "\n";
                    trip += "From : " + logic.listTrips().get(i + 2) + "\n";
                    trip += "To : " + logic.listTrips().get(i + 3) + "\n";
                    trip += "Date : " + logic.listTrips().get(i + 4) + "\n";
                    trip += "Type Of Vehicle : " + logic.listTrips().get(i + 5) + "\n";
                    trip += "Type Of Stop : " + logic.listTrips().get(i + 6) + "\n";
                    trip += "Number Of Available Seats : " + logic.listTrips().get(i + 7) + "\n";
                    trip += "Price/Seat : " + logic.listTrips().get(i + 8) + "\n\n";
                }

                trips.setText("All Trips : \n\n" + trip + "\nEnter The Trip Number Of Trip : ");
            }
        });
        assignedTrip.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                answer2.setVisible(false);
                String num = assignTrip.getText();
                numberForMe = num;
                String selectedTrip = "";
                String allDrivers = "";
                String driversForMe = "";
                if (assignTrip.getText().isEmpty()) {
                    answer2.setVisible(true);
                    answer2.setText("\t\t\tPlease Don't Miss Any Data Fields");
                } else {
                    for (int i = 0; i < logic.listTrips().size(); i++) {
                        answer.setVisible(false);
                        if (num.equalsIgnoreCase(logic.listTrips().get(i))) {

                            selectedTrip += "TripNumber : " + logic.listTrips().get(i) + "\n";
                            selectedTrip += "Type Of Trip : " + logic.listTrips().get(i + 1) + "\n";
                            selectedTrip += "from : " + logic.listTrips().get(i + 2) + "\n";
                            selectedTrip += "To : " + logic.listTrips().get(i + 3) + "\n";
                            selectedTrip += "Date : " + logic.listTrips().get(i + 4) + "\n";
                            selectedTrip += "Type Of Vehicle : " + logic.listTrips().get(i + 5) + "\n";
                            selectedTrip += "Type Of Stop : " + logic.listTrips().get(i + 6) + "\n";
                            selectedTrip += "Num Of Available Seats : " + logic.listTrips().get(i + 7) + "\n";
                            selectedTrip += "Price/Seat : " + logic.listTrips().get(i + 8) + "\n\n";

                            choosedTrip.setText("Your Assigned Trip : \n" + selectedTrip);
                            selectedTrip = "";
                        }
                    }

                    for (int j = 0; j < logic.listDrivers().size(); j++) {
                        if (j % 7 == 0) {
                            allDrivers += "\n";
                        }
                        allDrivers += logic.listDrivers().get(j) + "\n";
                    }

                    driversList.setText("To Whom !!? \n\n" + allDrivers);

                    stage.setScene(assignDriverScene);

                }

            }
        });
        assign1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                answer3.setVisible(false);
                stage.setScene(assignDriverScene);
                String num6 = numberForMe;
                String number = assignDriverNum.getText();
                String trip6 = "";
                if (assignDriverNum.getText().isEmpty()) {
                    answer3.setVisible(true);
                    answer3.setText("\tPlease Don't Miss Any Data Fields");
                } else {
                    for (int j = 0; j < logic.listTrips().size(); j++) {
                        if (num6.equalsIgnoreCase(logic.listTrips().get(j))) {
                            answer3.setVisible(false);
                            trip6 += "TripNumber : " + logic.listTrips().get(j) + "\n";
                            trip6 += "Type Of Trip : " + logic.listTrips().get(j + 1) + "\n";
                            trip6 += "from : " + logic.listTrips().get(j + 2) + "\n";
                            trip6 += "To : " + logic.listTrips().get(j + 3) + "\n";
                            trip6 += "Date : " + logic.listTrips().get(j + 4) + "\n";
                            trip6 += "Type Of Vehicle : " + logic.listTrips().get(j + 5) + "\n";
                            trip6 += "Type Of Stop : " + logic.listTrips().get(j + 6) + "\n";
                            trip6 += "Num Of Available Seats : " + logic.listTrips().get(j + 7) + "\n";
                            trip6 += "Price/Seat : " + logic.listTrips().get(j + 8) + "\n\n";
                        }
                    }

                }
                ArrayList<String> body = new ArrayList<String>();
                body = logic.listDriversWithAssignedTrips();
                for (int i = 0; i < body.size(); i++) {
                    if (number.equalsIgnoreCase(body.get(i))) {
                        body.add(i + 2, trip6);
                        logic.saveDrivers(body);
                        trip6 = "";
                    }
                }

                answer.setText("Your Trip Is Assigned To Your Driver");

            }
        });
        reserve.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {

                stage.setScene(customerReserveScene);

            }
        });
        search.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {
                yourBooking.setVisible(true);
                num.setVisible(true);
                book.setVisible(true);
                listOfTrips.setVisible(true);
                String matchingResults = "";
                String source = maps.getText();
                String destination = destinations.getText();
                x = source;
                y = destination;

                if (maps.getText().trim().isEmpty() || destination1.getText().trim().isEmpty()) {
                    for (int j = 0; j < logic.listTrips().size(); j += 9) {

                        matchingResults += "TripNumber : " + logic.listTrips().get(j) + "\n";
                        matchingResults += "Type Of Trip : " + logic.listTrips().get(j + 1) + "\n";
                        matchingResults += "from : " + logic.listTrips().get(j + 2) + "\n";
                        matchingResults += "To : " + logic.listTrips().get(j + 3) + "\n";
                        matchingResults += "Date : " + logic.listTrips().get(j + 4) + "\n";
                        matchingResults += "Type Of Vehicle : " + logic.listTrips().get(j + 5) + "\n";
                        matchingResults += "Type Of Stop : " + logic.listTrips().get(j + 6) + "\n";
                        matchingResults += "Num Of Available Seats : " + logic.listTrips().get(j + 7) + "\n";
                        matchingResults += "Price/Seat : " + logic.listTrips().get(j + 8) + "\n\n";
                    }
                    listOfTrips.setText(matchingResults);
                } else {
                    if (logic.customerSearch(source, destination).size() == 1) {

                        matchingResults = logic.customerSearch(source, destination).get(0);
                        listOfTrips.setText(matchingResults);
                        yourBooking.setVisible(false);
                        num.setVisible(false);
                        book.setVisible(false);
                    } else {
                        for (int i = 0; i < logic.customerSearch(source, destination).size(); i += 9) {

                            matchingResults += "TripNumber : " + logic.customerSearch(source, destination).get(i) + "\n";
                            matchingResults += "Type Of Trip : " + logic.customerSearch(source, destination).get(i + 1) + "\n";
                            matchingResults += "from : " + logic.customerSearch(source, destination).get(i + 2) + "\n";
                            matchingResults += "To : " + logic.customerSearch(source, destination).get(i + 3) + "\n";
                            matchingResults += "Date : " + logic.customerSearch(source, destination).get(i + 4) + "\n";
                            matchingResults += "Type Of Vehicle : " + logic.customerSearch(source, destination).get(i + 5) + "\n";
                            matchingResults += "Type Of Stop : " + logic.customerSearch(source, destination).get(i + 6) + "\n";
                            matchingResults += "Num Of Available Seats : " + logic.customerSearch(source, destination).get(i + 7) + "\n";
                            matchingResults += "Price/Seat : " + logic.customerSearch(source, destination).get(i + 8) + "\n\n";
                        }
                        listOfTrips.setText("Your Matching Searching Results is :\n" + matchingResults);
                    }
                }

                stage.setScene(customerReserveScene);

            }

        });
        book.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {
                answer0.setVisible(false);
                continuee.setVisible(false);
                answer1.setVisible(true);
                yourTrip.setVisible(true);
                String yourTripNum = yourBooking.getText();;
                String tripForMe = "";
                if (yourBooking.getText().isEmpty()) {
                    answer0.setVisible(true);
                    answer0.setText("Please Enter Your Number Trip");

                } else {
                    for (int i = 0; i < logic.listTrips().size(); i++) {
                        if (yourTripNum.equalsIgnoreCase(logic.listTrips().get(i))) {

                            tripForMe += logic.listTrips().get(i) + "\n";
                            tripForMe += "Type Of Trip : " + logic.listTrips().get(i + 1) + "\n";
                            tripForMe += "from : " + logic.listTrips().get(i + 2) + "\n";
                            tripForMe += "To : " + logic.listTrips().get(i + 3) + "\n";
                            tripForMe += "Date : " + logic.listTrips().get(i + 4) + "\n";
                            tripForMe += "Type Of Vehicle : " + logic.listTrips().get(i + 5) + "\n";
                            tripForMe += "Type Of Stop : " + logic.listTrips().get(i + 6) + "\n";
                            tripForMe += "Num Of Available Seats : " + logic.listTrips().get(i + 7) + "\n";
                            tripForMe += "Price/Seat : " + logic.listTrips().get(i + 8) + "\n\n";
                            numberForMe1 = yourTripNum;
                            answer0.setVisible(false);

                        }
                    }

                    yourTrip.setText(tripForMe);
                    stage.setScene(numSeatsScene);

                }
            }
        });
        checkNumber.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {
                boolean check;
                String num = numOfSeats.getText();;
                int number;
                check = num.matches("-?\\d+(\\.\\d+)?");
                if (check) {
                    number = Integer.parseInt(num);
                    if (logic.checkAvailability(numberForMe1, number)) {
                        answer.setText("Good Luck\npress continue To reserve your Ticket(s) ");
                        continuee.setVisible(true);
                        oneWayTrip.setVisible(true);
                        roundTrip.setVisible(true);
                    } else {
                        answer.setText(" No Availble Seats ");
                    }

                } else {
                    answer.setText("Please Enter Number Only");
                }

            }
        });
        continuee.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {
                boolean check;
                String number = numOfSeats.getText();
                int num;
                check = number.matches("-?\\d+(\\.\\d+)?");

                if (oneWayTrip.isSelected() && roundTrip.isSelected()) {
                    checkRadio.setText("Mark Only One Button");
                } else if (oneWayTrip.isSelected()) {
                    if (check) {
                        num = Integer.parseInt(number);
                        price.setText(name + "\nYour Ticket Informations\n" + logic.reserveTickets(numberForMe1, name, num, false));
                    }
                } else {
                    if (check) {
                        num = Integer.parseInt(number);
                        price.setText(name + "\nYour Ticket Informations\n" + logic.reserveTickets(numberForMe1, name, num, true));

                    }
                }
            }
        });
        employeeReturn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {
                stage.setScene(checkScene);
            }
        });
        customerReturn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {
                stage.setScene(checkScene);
            }
        });
        returnToCustomerScene.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {
                stage.setScene(loginformCustomerScene);

            }
        });
        returnToManagerScene.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {
                stage.setScene(loginformEmployeeScene);

            }
        });
        returnToDriverScene.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {
                stage.setScene(loginformEmployeeScene);

            }
        });
        returnToCustomerMenuScene.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {
                stage.setScene(customerMenuScene);
                listOfTrips.setVisible(false);
                yourBooking.setVisible(false);
                num.setVisible(false);
                book.setVisible(false);

            }
        });
        returnToMangerControlScene.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {
                stage.setScene(managerMenuScene);

            }
        });
        returnToCustomerReserveScene.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {
                answer1.setVisible(false);
                answer0.setVisible(false);
                stage.setScene(customerReserveScene);

            }
        });
        returnToMangerControlScene1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {
                stage.setScene(managerMenuScene);
            }
        });
        returnToManagerMenuScene1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {

                stage.setScene(managerMenuScene);

            }
        });
        returnToManagerMenuScene2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {

                stage.setScene(managerMenuScene);

            }
        });
        returnToManagerMenuScene3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {

                stage.setScene(managerMenuScene);

            }
        });
        returnToCustomerMenuScene2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {

                stage.setScene(customerMenuScene);

            }
        });
        returnToCustomerScene3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {

                stage.setScene(customerMenuScene);

            }
        });

    }
}
