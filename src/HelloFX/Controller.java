package HelloFX;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label helloLabel;

    @FXML
    public void initialize() {
        helloLabel.setText("Hola Mundo");
    }
}
