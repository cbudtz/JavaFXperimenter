import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class HelloFX extends Application {

    @Override
    public void start(Stage stage) {
        Label l = new Label("Hello, JavaFX!");
        Button button = new Button("Push me!");
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
              l.setText("Du trykkede på knappen!");
            }
        });
        FlowPane flowPane = new FlowPane(Orientation.VERTICAL);
        flowPane.getChildren().add(l);
        flowPane.getChildren().add(button);
        Scene scene = new Scene(flowPane,640,480);
        stage.setScene(scene);
        stage.show();
    }

    public static void run(String[] args) {
        System.out.println("Running this on its own will fail with JDK 11+ due to JavaFX not being bundled anymore - " +
                "and required as a module - Run Runner.main(); as a workaround");
        launch();
    }

}