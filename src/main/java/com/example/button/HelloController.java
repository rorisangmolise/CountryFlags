package com.example.button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.Pane;
public class HelloController {
    @FXML
    private Rectangle Rec1;
    @FXML
    private Rectangle Rec2;
    @FXML
    private Rectangle Rec3;

    @FXML
    void BelgiumButtonOnAction(ActionEvent event) {
        Rec1.setFill(Color.BLACK);
        Rec2.setFill(Color.YELLOW);
        Rec3.setFill(Color.RED);
    }
    @FXML
    void ChadButtonOnAction(ActionEvent event) {
        Rec1.setFill(Color.NAVY);
        Rec2.setFill(Color.YELLOW);
        Rec3.setFill(Color.RED);
    }
    @FXML
    void ClearButtonOnAction(ActionEvent event) {
        Rec1.setFill(null);
        Rec2.setFill(null);
        Rec3.setFill(null);
    }
    @FXML
    void LesothoButtonOnAction(ActionEvent event) {
        Rec1.setFill(Color.GREEN);
        Rec2.setFill(Color.GREEN);
        Rec3.setFill(Color.GREEN);
    }
    @FXML
    void MaliButtonOnAction(ActionEvent event) {
        Rec1.setFill(Color.LIME);
        Rec2.setFill(Color.YELLOW);
        Rec3.setFill(Color.RED);
    }
    @FXML
    void MongoliaButtonOnAction(ActionEvent event) {
        Rec1.setFill(Color.RED);
        Rec2.setFill(Color.BLUE);
        Rec3.setFill(Color.RED);
    }
    @FXML
    void RomaniaButtonOnAction(ActionEvent event) {
        Rec1.setFill(Color.NAVY);
        Rec2.setFill(Color.YELLOW);
        Rec3.setFill(Color.RED);
    }
}