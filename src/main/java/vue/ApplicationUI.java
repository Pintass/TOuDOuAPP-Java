package vue;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;
import java.io.File;

public class ApplicationUI extends Application {
    @Override
    public void start(Stage stage) {

        // base
        File css = new File("css" + File.separator+"style.css");
        VBox root = new VBox();
        Scene scene = new Scene(root, 1200, 675);
        scene.getStylesheets().add(css.toURI().toString());
        stage.setScene(scene);
        stage.setTitle("TOuDoU-APP");

        // Page d'accueil


        Label thanksText = new Label("Merci d’avoir téléchargé");
        thanksText.getStyleClass().add("thanksText");
        root.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        root.getChildren().addAll(thanksText);

        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}