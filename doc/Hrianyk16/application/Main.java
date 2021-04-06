package application;
	

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
 

 
public class Main extends Application {

 
	
	public void start(Stage primaryStage) {
		try {
 
		      AnchorPane root =  FXMLLoader.load(getClass().getClassLoader().getResource("Form/Sigin.fxml")) ; 
			 Scene scene = new Scene(root);
			 
			 scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			 primaryStage.setScene(scene);
			 primaryStage.setResizable(false);
			 primaryStage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
