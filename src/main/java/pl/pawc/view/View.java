package pl.pawc;

import java.io.IOException;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.pawc.controller.Controller;

public class View extends Application {
  
	@Override
	public void start(Stage primaryStage) throws IOException {
       
         FXMLLoader loader = new FXMLLoader(getClass().getResource("/Main.fxml"));
         AnchorPane anchorPane = (AnchorPane) loader.load();
		primaryStage.setTitle("Projekt");
		Scene scene = new Scene(anchorPane);
		primaryStage.setScene(scene);
         primaryStage.show();
		
		primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>(){
			@Override
			public void handle(WindowEvent event) {
				System.exit(0);
			}		
		});
	}

	public void main() {
		launch();
	}
}