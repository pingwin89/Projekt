package pl.pawc;

import java.io.IOException;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import pl.pawc.model.User;

public class View extends Application {
  
  private User user;
  
	@Override
	public void start(Stage primaryStage) throws IOException {
		AnchorPane anchorPane = (AnchorPane) FXMLLoader.load(ClassLoader.getSystemResource("Main.fxml"));
		primaryStage.setTitle("Chat");
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

	public void main(String[] args) {
		launch(args);
	}
}
