package control;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControlFX {
	
	MainFX menu = new  MainFX();
	
	@FXML
	Button started;
	
	@FXML
	public void apertura() throws IOException {
		Stage thisStage = (Stage) started.getScene().getWindow();
		thisStage.close();
		menu.abrir(new Stage());
	}

}
