import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class HelloFXML extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        FlowPane anchorPane = loader.load(getClass().getResource("/GUIFXML.fxml"));
        loader.getController();
        stage.setScene(new Scene(anchorPane,640,480));
        stage.show();
    }
    public static void run(String[] args) {
        System.out.println("Running this on its own will fail with JDK 11+ due to JavaFX not being bundled anymore - " +
                "and required as a module - Run Runner.main(); as a workaround");
        launch();
    }

}
