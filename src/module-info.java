module testeee {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml, javafx.controls;
	opens gui_class to javafx.graphics, javafx.fxml, javafx.controls;

}
