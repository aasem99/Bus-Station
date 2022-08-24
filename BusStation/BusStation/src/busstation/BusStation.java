package busstation;

import javafx.application.Application;
import javafx.stage.Stage;

public class BusStation extends Application{

    public static void main(String[] args) {
        
        launch(args);
    }

    @Override
    
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Bus Station");
        GuiForBusStation bus = new GuiForBusStation(primaryStage);
        bus.prepareScene();
        primaryStage.setScene(bus.getScene());
        primaryStage.show();
    }
}