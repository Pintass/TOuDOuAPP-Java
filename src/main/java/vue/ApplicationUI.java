package vue;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
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

        Pane thanksTextPane = new Pane();
        Label thanksText = new Label("Merci d’avoir téléchargé");
        thanksText.getStyleClass().add("thanksText");
        thanksText.setLayoutX(416);
        thanksText.setLayoutY(78);
        thanksTextPane.getChildren().addAll(thanksText);

        Pane logoPicPane = new Pane();
        Image logoPic = new Image("file:css/img/logo.png");
        ImageView view = new ImageView(logoPic);
        view.setX(526);
        view.setY(10);
        logoPicPane.getChildren().add(view);

        VBox startBox = new VBox();
        Label startoudouText = new Label("Commençons par créer votre TOuDOuList");
        startoudouText.getStyleClass().add("startoudouText");
        startBox.getChildren().addAll(startoudouText);
        startBox.setAlignment(Pos.TOP_CENTER);
        root.getChildren().addAll(thanksTextPane);
        root.getChildren().addAll(logoPicPane);
        root.getChildren().addAll(startBox);

        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}