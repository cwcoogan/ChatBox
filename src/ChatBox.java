package src;

import java.io.IOException;
import java.util.Objects;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChatBox extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws IOException {
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("view.fxml")));
    Stage stage = new Stage();

    stage.setTitle("ChatBox");

    Scene scene = new Scene(root, 1000, 600);
    scene.getStylesheets().add("src/main.css");

    stage.setScene(scene);
    stage.showAndWait();
  }
}
