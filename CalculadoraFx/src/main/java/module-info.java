module calculadora.calculadorafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens calculadora.calculadorafx to javafx.fxml;
    exports calculadora.calculadorafx;
}