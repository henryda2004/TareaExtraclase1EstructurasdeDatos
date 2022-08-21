package application;
import javafx.scene.control.Button;

//import java.awt.Button;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class SampleController implements Initializable{
	
	@FXML private Button button;
	
	@FXML private TableView<Student> table;
	@FXML private TableColumn<Student, String> carne;
	@FXML private TableColumn<Student, String> nya;
	@FXML private TableColumn<Student, String> correo;
	@FXML private TableColumn<Student, String> numero;
	@FXML private TableColumn<Student, String> nickname;
	@FXML private TableColumn<Student, String> tipo;
	@FXML private TableColumn<Student, String> notapromedioexamenes;
	@FXML private TableColumn<Student, String> notapromedioquices;
	@FXML private TableColumn<Student, String> notapromediotareas;
	@FXML private TableColumn<Student, String> notaproyecto1;
	@FXML private TableColumn<Student, String> notaproyecto2;
	@FXML private TableColumn<Student, String> notaproyecto3;
	@FXML private TableColumn<Student, String> promedioproyectos;
	@FXML private TableColumn<Student, String> promediotodo;
	@FXML private TableColumn<Student, String> notafinal;
	
	public ObservableList<Student> list = FXCollections.observableArrayList(
			new Student ("2022756483", "Andr�s Chirinos P�rez", "felichi1503@gmail.com", "60597345", "AndresCh", "B", "39.2", "23.4", "0", "34.5", "100", "100", "0", "0", "0")
			);
	///
	public void LoadFile() throws IOException {
		FileChooser fc = new FileChooser();
		File seletedFile = fc.showOpenDialog(null);
		
		if (seletedFile != null) {
			String name =  (seletedFile.getCanonicalFile()+ "");
			System.out.println(name); 
			
			File csvFile = new File(name);
			BufferedReader br = new BufferedReader(new FileReader(csvFile));
			String line = "";
			try {
				while ((line = br.readLine()) != null) {
					String[] count = line.split(",");
					System.out.println( count[0]+" ");
					System.out.println( count[0]+" "+count[1]+" "+count[2]+" "+count[3]+" "+count[4]+" "+count[5]+" "+count[6]+" "+count[7]+" "+count[8]+" "+count[9]+" "+count[10]+" "+count[11]);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("File is not valid"); 
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		carne.setCellValueFactory(new PropertyValueFactory<Student, String>("carne"));
		nya.setCellValueFactory(new PropertyValueFactory<Student, String>("nya"));
		correo.setCellValueFactory(new PropertyValueFactory<Student, String>("correo"));
		numero.setCellValueFactory(new PropertyValueFactory<Student, String>("numero"));
		nickname.setCellValueFactory(new PropertyValueFactory<Student, String>("nickname"));
		tipo.setCellValueFactory(new PropertyValueFactory<Student, String>("tipo"));
		notapromedioexamenes.setCellValueFactory(new PropertyValueFactory<Student, String>("notapromedioexamenes"));
		notapromedioquices.setCellValueFactory(new PropertyValueFactory<Student, String>("notapromedioquices"));
		notapromediotareas.setCellValueFactory(new PropertyValueFactory<Student, String>("notapromediotareas"));
		notaproyecto1.setCellValueFactory(new PropertyValueFactory<Student, String>("notaproyecto1"));
		notaproyecto2.setCellValueFactory(new PropertyValueFactory<Student, String>("notaproyecto2"));
		notaproyecto3.setCellValueFactory(new PropertyValueFactory<Student, String>("notaproyecto3"));
		promedioproyectos.setCellValueFactory(new PropertyValueFactory<Student, String>("promedioproyectos"));
		promediotodo.setCellValueFactory(new PropertyValueFactory<Student, String>("promediotodo"));
		notafinal.setCellValueFactory(new PropertyValueFactory<Student, String>("notafinal"));
		
		table.setItems(list);
		
		
	}


}
