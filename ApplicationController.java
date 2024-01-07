import java.util.Random;
import java.io.IOException; 
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.shape.Rectangle;
import java.util.ResourceBundle;
import java.net.URL;

public class ApplicationController implements Initializable {
	private Stage stage;
	private Scene scene;
	private Parent root;

	@FXML
	ChoiceBox<String> dsChoiceBox = new ChoiceBox<String>();

	@FXML
	TextField numElementsField = new TextField();

	@FXML
	ChoiceBox<String> algoChoiceBox = new ChoiceBox<String>();

	@FXML
	TextField customArgs = new TextField();

	@FXML
	Button applyBtn = new Button();

	@FXML
	Pane visualizer = new Pane();

	String algoUserInput = "";


	public void switchToStartScene(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/start-screen.fxml"));

		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// Populating dsChoiceBox
		dsChoiceBox.getItems().addAll("Unordered Array", "Weighted Graph", "Red-Black Tree");
	}

	public void generate(ActionEvent event) {	
		String dataStructure = dsChoiceBox.getValue();
		int numElements = Integer.parseInt(numElementsField.getText()); 

		System.out.println("Number of Elements: " + numElements);

		// Check if choice box has a user input
		if (dataStructure == null) {
			System.out.println("ERROR: Please enter a valid data structure!");
			return;
		}

		// Enabling input fields for choosing algorithm
		algoChoiceBox.setDisable(false);
		customArgs.setDisable(false);
		applyBtn.setDisable(false);

		switch (dataStructure) {
			case "Unordered Array":
				// TODO: Create class for generating array of unordered rectangles
				// Adding relevant algorithms for data structure
				algoChoiceBox.getItems().addAll("Bubble Sort", "Selection Sort", "Insertion Sort", "Merge Sort", " Quick Sort", "Radix Sort", "Heap Sort");
				generateRectangles(numElements);
				break;
			case "Weighted Graph":
				// TODO: Create class for generating array of nodes with weighted edges 
				// Adding relevant algorithms for data structure
				algoChoiceBox.getItems().addAll("Depth-First Search", "Breadth-First Search", "Prim\'s Algorithm", "Kruskal's Algorithm", "Dijkstra's Algorithm");
				break;
			case "Red-Black Tree":
				// TODO
				break;
		}
	}

	public void applyAlgorithm(ActionEvent event) {
		algoUserInput = algoChoiceBox.getValue();

		// Check if choice box has a user input
		if (algoUserInput == null) {
			System.out.println("ERROR: Please enter a valid algorithm!");
			return;
		}
	}

	public void generateRectangles(int numElements) {
		visualizer.getChildren().clear();

		Rectangle[] rects = new Rectangle[numElements];
		Random rand = new Random();

		int currentXPos = 10;
		int endXPos = 550;
		int rectSpacing = 10;

		int rectWidth = 15;
		int startYPos = 0; // To be determined in for loop below

		for (int i  = 0; i < rects.length; i++) {
			if (currentXPos < 550) {
				startYPos = 100 + rand.nextInt(381);
				rects[i] = new Rectangle(currentXPos, startYPos, rectWidth, 400 - startYPos);
				currentXPos += rectSpacing + rectWidth;
				visualizer.getChildren().add(rects[i]);	
			}
		}
		System.out.println(visualizer.getWidth());
		System.out.println(visualizer.getHeight());
	}
}
