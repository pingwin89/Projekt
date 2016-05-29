package pl.pawc.view;

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
import pl.pawc.model.User;

public class View extends Application {

    protected AbstractApplicationContext context;
    
	@Override
	public void start(Stage primaryStage) throws IOException {
      context = new ClassPathXmlApplicationContext("SpringXMLConfig.xml");
      User user = (User) context.getBean("user");
      FXMLLoader loader = new FXMLLoader(getClass().getResource("/Main.fxml"));
      AnchorPane anchorPane = (AnchorPane) loader.load();
      primaryStage.setTitle("Projekt");
      Controller controller = (Controller) loader.getController();
      controller.setView(this);
      controller.setUser(user);
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
  
    public AbstractApplicationContext getContext(){
      return context;
    }
}