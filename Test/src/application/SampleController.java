package application;

import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SampleController {

	Scanner scan = new Scanner(System.in);

	@FXML private TextField code1;
	@FXML private TextField code2;

	@FXML
	protected void onButtonClick(ActionEvent evt) {
		Integer a = Integer.parseInt(this.code1.getText());
		Integer b = Integer.parseInt(this.code2.getText());

		System.out.println(a + b);
	}

}
