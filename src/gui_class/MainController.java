package gui_class;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	
	@FXML
	private TextField x;
	@FXML
	private TextField y;
	@FXML
	private Button gerar;
	@FXML
	private Label resu;
	
	@FXML
	public void onbtnGerar() {
		
		int x = Integer.parseInt(this.x.getText());
		int y = Integer.parseInt(this.y.getText());
		
		int soma = 0;
		
		if(x < y) {

			for(int cont = x+1; cont < y; cont++) {
				
				if(cont%5 == 2 || cont%5 == 3) {
					
					soma += cont;
					
				}
				
			}
		
		} else if(x > y){
			
			for(int cont = y+1; cont < x; cont++) {
				
				if(cont%5 == 2 || cont%5 == 3) {
					
					soma += cont;
					
				}
				
			}
			
		}

		this.resu.setText(String.format("%d", soma));
		
	}

}
