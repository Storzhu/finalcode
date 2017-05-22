package rocket.app.view;

import org.apache.poi.ss.formula.functions.FinanceLib;

import eNums.eAction;
import exceptions.RateException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import rocket.app.MainApp;
import rocketBase.RateBLL;
import rocketCode.Action;
import rocketData.LoanRequest;

public class MortgageController {
	@FXML 
	private TextField txtDownPayment;
	@FXML
	private TextField txtIncome;
	@FXML
	private TextField txtCreditScore;
	@FXML 
	private TextField txtHouseCost;
	@FXML 
	private TextField txtExpenses;
	@FXML
	private Label lblMortgagePaymentall;
	@FXML 
	private ComboBox cmbTerm;
	
	private MainApp mainApp;
	private TextField txtNew;
	

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}
	
	
	@FXML
	public void btnCalculatePayment(ActionEvent event) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Message Here...");
		alert.setHeaderText("Look, an Information Dialog");
		alert.setContentText(txtNew.getText());
		alert.showAndWait().ifPresent(rs -> {
			if (rs == ButtonType.OK) {
				System.out.println("Pressed OK.");
			}
		});

		
	}
	public void HandleLoanRequestDetails(LoanRequest lRequest)
	{
			double payment1  = (lRequest.getdIncome() * (0.28));
			double payment2 = ((lRequest.getdIncome())*0.36)-lRequest.getdExpenses();
			double housepiece = 0;
			if (payment1 < payment2) {
				housepiece = payment1;
			} else {
				housepiece = payment2;
			}
			
			if (lRequest.getdPayment()> housepiece) {
				lblMortgagePaymentall.setText("House Cost too high.");
			} else {
				lblMortgagePaymentall.setText(
						"monthly Payment is: " + String.format("%1$,.2f", lRequest.getdPayment()));
			}
	
}}