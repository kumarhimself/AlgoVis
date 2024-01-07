import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.shape.Line; 
import javafx.scene.shape.Rectangle;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args); // Send string array to launch method that calls start
					  // method below.
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("start-screen.fxml"));

		Scene scene = new Scene(root);

		stage.setTitle("My First JavaFX");
		stage.setResizable(false);

		stage.setScene(scene);
		stage.show();
	}
}
