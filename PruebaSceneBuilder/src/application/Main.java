package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

/**
 * La clase Main permite ejecutar la ventana principal que contiene la interfaz y los respectivos procesos del programa
 * @author henry
 * version 21/08/2022
 */
public class Main extends Application {
	@Override
	/**
	 * Este metodo permite la ejecucion del programa de interfaz, iniciando la ventana y sus funciones
	 */
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Se ejecuta el programa
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
