import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class GuiController {
    @FXML
    public Label label;

    @FXML
    public void buttonClicked(MouseEvent mouseEvent) {
        label.setText("You clicked me!");
    }
}
