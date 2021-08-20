package main;

import app.BasketApp;
import javafx.application.Application;
import javafx.stage.Stage;
import javax.swing.filechooser.FileSystemView;
import prebuilt.Message;

public class Main extends Application {

    public static class TestApp extends BasketApp {

        @Override
        public void start() {
            new Message("Hello world!", false);
        }

        public static void invokeStart() {
            TestApp.launch();
        }
    }

    @Override
    public void start(Stage primaryStage) {
        TestApp.invokeStart();
    }

    public static void main(String[] args) {
        Application.launch();
    }
}
