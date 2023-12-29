package calculadora.calculadorafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label lblResultado;
    @FXML
    private TextField txtN1;
    @FXML
    private TextField txtN2;

    @FXML
    protected void btnSoma() {
        int n1 = Integer.parseInt(txtN1.getText());
        int n2 = Integer.parseInt(txtN2.getText());
        int s = n1 + n2;
        lblResultado.setText(Integer.toString(s));
    }
}