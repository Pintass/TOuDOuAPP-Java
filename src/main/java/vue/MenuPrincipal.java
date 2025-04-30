package vue;

import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;

public class MenuPrincipal {
    private final static int stageX = 1200;
    private final static int stageY = 675;

    public MenuPrincipal(Stage stage) {
        Pane p = new Pane();
        Scene scene = new Scene(p, stageX, stageY);
        stage.setScene(scene);
        File css = new File("css" + File.separator+"style.css");
        scene.getStylesheets().add(css.toURI().toString());
        stage.setResizable(false);
        stage.setTitle("TOuDOu-APP !");

        ScrollPane scrolltoudou = new ScrollPane();
        scrolltoudou.getStyleClass().add("scroll");
        scrolltoudou.setLayoutX(40);
        scrolltoudou.setLayoutY(40);
        scrolltoudou.setPrefSize(240, 590);

        p.getChildren().addAll(scrolltoudou);

    }
}
