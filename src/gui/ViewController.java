package gui;

import javafx.fxml.FXML;
import java.net.URL;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ViewController {
	@FXML
	private Button btTest1;
	@FXML
	private Button btTest2;
	@FXML
	private String txtNome;
	@FXML
	private TextField txtSobrenome;
	
	
	@FXML
	public void onBtTesteAction() {
		funcionario conta = new funcionario();
		String nome = txtNome;
		System.out.println(nome);
	
	}
	
	
}
