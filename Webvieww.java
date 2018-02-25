import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.web.WebView;

public class Webvieww extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(final Stage primaryStage) {
        final WebView Av = new WebView();
        Av.getEngine().load("http://www.yahoo.com");
        primaryStage.setScene(new Scene(Av));
        primaryStage.show();
    }
}
