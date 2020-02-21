import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class HelloFXML extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FlowPane anchorPane = FXMLLoader.load(getClass().getResource("/GUIFXML.fxml"));
        stage.setScene(new Scene(anchorPane,640,480));
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }

}
