modules = javafx.controls

run: Main.javac
	java --module-path javafx/lib --add-modules $(modules) Main

Main.javac: Main.java
	javac --module-path javafx/lib --add-modules $(modules) Main.java  
