package vue;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;

public class CreationTouDou extends Pane {
    private final static int stageX = 1200;
    private final static int stageY = 675;

    public CreationTouDou(Stage stage){
        VBox v = new VBox();
        v.setAlignment(Pos.CENTER);
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
        creditsText.setLayoutY(633);
        textPane.getChildren().addAll(creditsText);

        // PARTIE formulaire
        VBox gridBox = new VBox();
        gridBox.setAlignment(Pos.CENTER);
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(40);
        grid.setVgap(30);


        Label nameListTitle = new Label("NOM DE LA TOUDOULIST");
        nameListTitle.getStyleClass().add("titlefield");
        TextField nameListField = new TextField();

        Label descListTitle = new Label("DESCRIPTION DE LA TOUDOULIST");
        descListTitle.getStyleClass().add("titlefield");
        TextField descListField = new TextField();
        descListField.setPrefWidth(400);
        descListField.setPrefHeight(50);

        Button confirmButton = new Button("CONFIRMER");
        confirmButton.getStyleClass().add("nextButton");

        GridPane.setColumnSpan(confirmButton, 2);
        GridPane.setHalignment(confirmButton, HPos.CENTER);

        grid.add(nameListTitle, 0, 0);
        grid.add(nameListField, 1, 0);

        grid.add(descListTitle, 0, 1);
        grid.add(descListField, 1, 1);

        grid.add(confirmButton, 0, 2);

        grid.setLayoutX(235);
        grid.setLayoutY(223);
        textPane.getChildren().addAll(grid);

        v.getChildren().addAll(textPane);
        v.getChildren().addAll(gridBox);
    }

}
