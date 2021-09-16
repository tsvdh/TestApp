module test.app {
    requires basket.api;
    requires java.desktop;
    requires javafx.fxml;
    requires javafx.graphics;
    exports main;

    opens properties to basket.api;
    opens images to basket.api;
}