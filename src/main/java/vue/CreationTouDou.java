package vue;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;

public class CreationTouDou extends Pane {
    private final static int stageX = 1200;
    private final static int stageY = 675;

    public CreationTouDou(Stage stage){
        VBox v = new VBox();
        Scene scene = new Scene(v, stageX, stageY);
        File css = new File("css" + File.separator+"style.css");
        scene.getStylesheets().add(css.toURI().toString());
        stage.setScene(scene);
        stage.setTitle("TOuDoU-APP");
        stage.setResizable(false);

        Pane textPane = new Pane();
        Label titleText = new Label("Création d’une TOuDOuList");
        titleText.getStyleClass().add("title");
        titleText.setLayoutX(393);
        titleText.setLayoutY(35);
        textPane.getChildren().addAll(titleText);

        Label creditsText = new Label("Application imaginée et créée par : Pintass. / Daniel");
        creditsText.getStyleClass().add("creditsText");
        creditsText.setLayoutX(442);
        creditsText.setLayoutY(643);
        textPane.getChildren().addAll(creditsText);

        // PARTIE formulaire maybe gridpane ? ou une grille afin de les placer au mieux









        v.getChildren().addAll(textPane);

    }

}
