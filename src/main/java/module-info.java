module test.app {
    requires basket.api;
    requires java.desktop;

    exports main;

    opens properties to basket.api;
    opens images to basket.api;
}