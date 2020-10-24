package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.views.MainWindow;
import sample.views.ModelListView;

public class Main extends Application {
    public static final int WIDTH = 720;
    public static final int HEIGHT = 480;

    @Override
    public void start(Stage primaryStage) throws Exception{
        new MainWindow().init(primaryStage).setContent(new ModelListView().init());
    }


    public static void main(String[] args) {
        launch(args);
    }
}
