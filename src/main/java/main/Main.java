package main;


import basket.api.app.BasketApp;
import basket.api.prebuilt.Message;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static class TestApp extends BasketApp {

        @Override
        public void start() {
            new Message("This an app to test Basket\n v1.0.3", false);
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
