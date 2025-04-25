package vue;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
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

        Button toudouPoint = new Button("TOUDOUPOINT");
        toudouPoint.getStyleClass().add("nextButton");
        Label descToudouPoint = new Label("AJOUTEZ DES TOUDOUPOINTS DANS VOTRE TOUDOULIST");
        descToudouPoint.getStyleClass().add("titlefield");

        Label namePointTitle = new Label("NOM DU TOUDOUPOINT");
        namePointTitle.getStyleClass().add("titlefield");
        TextField namePointField = new TextField();
        Label descPointTitle = new Label("DESCRIPTION DU TOUDOUPOINT");
        descPointTitle.getStyleClass().add("titlefield");
        TextField descPointField = new TextField();
        Label priorityTitle = new Label("NIVEAU DE PRIORITÉ");
        priorityTitle.getStyleClass().add("titlefield");
        ComboBox<String> priorityList = new ComboBox<>();
        priorityList.getItems().addAll("Urgent", "Haut", "Moyen", "Bas");
        priorityList.setValue("Moyen");



        grid.add(nameListTitle, 0, 0);
        grid.add(nameListField, 1, 0);

        grid.add(descListTitle, 0, 1);
        grid.add(descListField, 1, 1);

        grid.add(toudouPoint, 0, 2);
        grid.add(descToudouPoint, 1, 2);

        grid.add(namePointTitle, 0, 3);
        grid.add(namePointField, 1, 3);

        grid.add(descPointTitle, 0, 4);
        grid.add(descPointField, 1, 4);

        grid.add(priorityTitle, 0, 5);
        grid.add(priorityList, 1, 5);


        grid.setLayoutX(235);
        grid.setLayoutY(170);
        textPane.getChildren().addAll(grid);

        v.getChildren().addAll(textPane);
        v.getChildren().addAll(gridBox);
    }

}
