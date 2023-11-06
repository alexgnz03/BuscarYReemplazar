package dad.byr;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private Controller controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controller = new Controller();
		
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(new Scene(controller.getView()));
		primaryStage.show();

	}

}
