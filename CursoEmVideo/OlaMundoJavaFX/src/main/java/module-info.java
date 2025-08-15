module cursoemvideo.olamundojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens cursoemvideo.olamundojavafx to javafx.fxml;
    exports cursoemvideo.olamundojavafx;
}
