package Sample.Main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainWindowController {

	 @SuppressWarnings("unused")
	private Main main;
	 @FXML private Label label;
	    @FXML private TextField field;

	public void setMain(Main main) {
		// TODO Auto-generated method stub
		this.main = main; 
	}
	
	// assign text field text to label on button click
    public void handleButton() {
        String text = field.getText();
        label.setText(text);
        field.clear();
    }

}
