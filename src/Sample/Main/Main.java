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
        	  ResourceBundle bundle = null;
        	InputStream stream = Main.class.getResourceAsStream("/en_EN.properties");
        	bundle = new PropertyResourceBundle(new InputStreamReader(stream, "UTF-8"));

        	// view
        	FXMLLoader loader = new FXMLLoader();

        	if(Util.Language == "my")
        	{
        		stream = Main.class.getResourceAsStream("/my_MY.properties");
        		if(stream != null)
        		{
        			bundle = new PropertyResourceBundle(new InputStreamReader(stream, "UTF-8"));
        			loader.setResources(bundle);
        		}
        	}

        	loader.setResources(bundle);
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
