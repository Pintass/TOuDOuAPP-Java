package vue;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;
import java.io.File;

public class ApplicationUI extends Application {
    private final static int stageX = 1200;
    private final static int stageY = 675;

    @Override
    public void start(Stage stage) {

        // base
        File css = new File("css" + File.separator+"style.css");
        VBox root = new VBox();
        Scene scene = new Scene(root, stageX, stageY);
        scene.getStylesheets().add(css.toURI().toString());
        stage.setScene(scene);
        stage.setTitle("TOuDoU-APP");
        stage.setResizable(false);

        // Page d'accueil

        Pane thanksTextPane = new Pane();
        Label thanksText = new Label("Merci d’avoir téléchargé");
        thanksText.getStyleClass().add("thanksText");
        thanksText.setLayoutX(415);
        thanksText.setLayoutY(108);
        thanksTextPane.getChildren().addAll(thanksText);

        Pane logoPicPane = new Pane();
        Image logoPic = new Image("file:css/img/logo.png");
        ImageView view = new ImageView(logoPic);
        view.setX(515);
        view.setY(5);
        logoPicPane.getChildren().add(view);

        Pane startBox = new Pane();
        Label startoudouText = new Label("Commençons par créer votre TOuDOuList");
        startoudouText.getStyleClass().add("startoudouText");
        startoudouText.setLayoutX(404);
        startoudouText.setLayoutY(120);
        startBox.getChildren().addAll(startoudouText);

        Label creditsText = new Label("Application imaginée et créée par : Pintass. / Daniel");
        creditsText.getStyleClass().add("creditsText");
        creditsText.setLayoutX(442);
        creditsText.setLayoutY(438);
        startBox.getChildren().addAll(creditsText);

        Button nextButton = new Button("Créer une TOuDOuList");
        nextButton.getStyleClass().add("nextButton");
        nextButton.setLayoutX(482);
        nextButton.setLayoutY(170);
        startBox.getChildren().addAll(nextButton);
        // ouverture scène de création d'une TouDou<
        nextButton.setOnAction(e -> {
            CreationTouDou s = new CreationTouDou(stage);
        });

        root.getChildren().addAll(thanksTextPane);
        root.getChildren().addAll(logoPicPane);
        root.getChildren().addAll(startBox);

        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}