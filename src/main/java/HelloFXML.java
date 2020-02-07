import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HelloFXML extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        AnchorPane anchorPane = FXMLLoader.<AnchorPane>load(getClass().getResource("/GUIFXML.fxml"));
        stage.setScene(new Scene(anchorPane));
        stage.show();
        GUIFXML controller = loader.getController();
        System.out.println(controller);
        controller.versionLabel.setText("Hello FXML!");
    }

}
