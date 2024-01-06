import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
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

	public void start(Stage stage) throws Exception {
		Group root = new Group();

		// Adding shapes to root node
		Text text = new Text();
		text.setText("HELLO THERE!");
		text.setX(50);
		text.setY(50);
		text.setFont(Font.font("Verdana", 50));

		Line line = new Line();
		line.setStartX(200);
		line.setStartY(200);
		line.setEndX(500);
		line.setEndY(500);
		line.setStrokeWidth(5);
		line.setStroke(Color.RED);

		Rectangle rectangle = new Rectangle();
		rectangle.setX(100);
		rectangle.setY(100);
		rectangle.setWidth(100);
		rectangle.setHeight(100);

		// Setting children of root node
		root.getChildren().add(text);
		root.getChildren().add(line);
		root.getChildren().add(rectangle);
		
		Scene scene = new Scene(root, 600, 600, Color.GRAY);

		stage.setTitle("My First JavaFX");
		stage.setResizable(false);

		stage.setScene(scene);
		stage.show();
	}
}
