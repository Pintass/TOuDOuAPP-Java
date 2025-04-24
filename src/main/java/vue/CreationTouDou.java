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

        Label titleText = new Label("Commençons par créer votre TOuDOuList");
        titleText.getStyleClass().add("startoudouText");
        titleText.setLayoutX(339);
        titleText.setLayoutY(56);


        v.getChildren().addAll(titleText);

    }

}
