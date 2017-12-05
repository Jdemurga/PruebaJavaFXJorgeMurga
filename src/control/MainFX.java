package control;
	
import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class MainFX extends Application {
	private BorderPane mypane;
	@Override
	public void start(Stage primaryStage) {
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../vista/Login.fxml"));
			mypane = (BorderPane) loader.load();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			primaryStage.setTitle("PracticaFX");
			primaryStage.setScene(new Scene(mypane));
			primaryStage.setX(screenSize.getWidth() / 3);
			primaryStage.setY(screenSize.getHeight() / 3);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void abrir(Stage primaryStage){
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../vista/FreeSolo.fxml"));
			mypane = (BorderPane) loader.load();
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			
			primaryStage.setTitle("PracticaFX");
			primaryStage.setScene(new Scene(mypane));
			primaryStage.setX(screenSize.getWidth() / 3);
			primaryStage.setY(screenSize.getHeight() / 3);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
