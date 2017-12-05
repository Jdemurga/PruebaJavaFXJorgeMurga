package control;

import java.io.IOException;

import com.sun.glass.events.MouseEvent;

import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControlFX {
	
	MainFX menu = new  MainFX();
	
	@FXML
	Button started;
	
	@FXML
	public void openStage() throws IOException {
		Stage thisStage = (Stage) started.getScene().getWindow();
		thisStage.close();
		menu.abrir(new Stage());
	}
	@FXML
	public void closeStage() {
		System.exit(0);
	}
	
}
