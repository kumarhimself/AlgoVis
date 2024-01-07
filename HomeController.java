import java.io.IOException; 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.event.ActionEvent;
import javafx.scene.Node;

public class HomeController {
	private Stage stage;
	private Scene scene;
	private Parent root;

	public void switchToAppScene(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/application.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
