package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewsController {
	
	@FXML
	private TextField txtFirstNumber;
	
	@FXML
	private TextField txtSecondNumber;
	
	@FXML
	private Button btSum;
	
	@FXML
	private Label lblResult;

	@FXML
	public void onbtSumClick() {
		try {
			Locale.setDefault(Locale.US);
			double height = Double.parseDouble(txtFirstNumber.getText());
			double width = Double.parseDouble(txtSecondNumber.getText());
			
			double Sum = height + width;
			
			lblResult.setText(String.format("%.2f", Sum));
			
		}catch(NumberFormatException e) {
			Alerts.showAlert("Error", "Parse error", e.getMessage(), AlertType.ERROR);
		}
	}

}
