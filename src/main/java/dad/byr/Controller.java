package dad.byr;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.VBox;

public class Controller implements Initializable {
	
	//view
	
	@FXML
	private VBox view;
	
	
	public Controller() {
		
		try {
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/view.fxml"));
			loader.setController(this);
			loader.load();
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {


}
	
	public VBox getView() {
		return view;
	}
	
}
