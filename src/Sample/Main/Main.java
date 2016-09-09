package Sample.Main;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

public class Main extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage; // connect primary stage
        mainWindow();
    }

    // main window
    public void mainWindow() {
        try {
            // view
        	FXMLLoader loader = new FXMLLoader(Main.class.getResource("MainWindowView.fxml"));  
        	  Locale	local=new Locale("my", "MY");        	 
              //loader.setResources(ResourceBundle.getBundle("Bundle_MY_my", local));
              loader.setResources(ResourceBundle.getBundle("Bundle_EN_en", local));
         
            AnchorPane pane = loader.load();
            

            // controller
            MainWindowController mainWindowController = loader.getController();
            mainWindowController.setMain(this);
           
          
			
			
            // scene on stage
            Scene scene = new Scene(pane);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
