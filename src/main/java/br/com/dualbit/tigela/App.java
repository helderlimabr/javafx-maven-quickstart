package br.com.dualbit.tigela;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
    	
    	try {
        	FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/login.fxml"));
        	BorderPane root = loader.load();
        	Scene scene = new Scene(root, 700, 400);
        	primaryStage.setScene(scene);
        	primaryStage.show();
        	
		} catch (Exception e) {
			e.printStackTrace();
		}

    }

    public static void main(String[] args) {
        launch(args);
    }
}