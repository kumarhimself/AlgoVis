modules = javafx.controls,javafx.fxml

run: Main.javac
	java --module-path javafx/lib --add-modules $(modules) Main

Main.javac: *.java 
	javac --module-path javafx/lib --add-modules $(modules) *.java

clean:
	rm -f *.class
