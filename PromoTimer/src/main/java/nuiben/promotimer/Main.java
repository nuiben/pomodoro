package nuiben.promotimer;

/*
  @author Benjamin Porter
 */

import java.io.IOException;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends Application{
    public static void main(String[] args) {

    }
    /** Loads in MainView.fxml file and displays on the screen
     * */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/promo-scene.fxml"));
        Scene currentScene = new Scene(fxmlLoader.load());
        stage.setTitle("Part Party");
        stage.setScene(currentScene);
        stage.show();
    }

}