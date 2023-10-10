module com.example.bidongithub {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bidongithub to javafx.fxml;
    exports com.example.bidongithub;
}