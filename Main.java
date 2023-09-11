package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage Stage) {
		try {
	           Parent parent = FXMLLoader.load(getClass().getResource("/gui/Views.fxml"));
	           Scene scene = new Scene(parent);
	           Stage.setScene(scene);
	           Stage.show();
	           
		}catch (IOException e) {
			e.printStackTrace();
	           
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
