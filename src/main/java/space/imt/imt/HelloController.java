package space.imt.imt;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {

    private double height;
    private double weight;
    private double imt;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button check_b;

    @FXML
    private TextField height_f;

    @FXML
    private Text imt_t;

    @FXML
    private TextField weight_f;

    @FXML
    void initialize() {
        check_b.setOnAction(event ->{
            height = Double.valueOf(height_f.getText());
            weight = Double.valueOf(weight_f.getText());
            System.out.println(height + " " + weight);
        });

    }

}
