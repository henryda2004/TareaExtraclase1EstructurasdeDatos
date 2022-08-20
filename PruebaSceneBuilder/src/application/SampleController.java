package application;

import java.awt.Button;
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
import javafx.stage.FileChooser;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class SampleController implements Initializable{
	
	private Button button;
	
	private TableView<Student> table;
	private TableColumn<Student, String> carne;
	private TableColumn<Student, String> nya;
	private TableColumn<Student, String> correo;
	private TableColumn<Student, String> numero;
	private TableColumn<Student, String> nickname;
	private TableColumn<Student, String> tipo;
	private TableColumn<Student, String> notapromedioexamenes;
	private TableColumn<Student, String> notapromedioquices;
	private TableColumn<Student, String> notapromediotareas;
	private TableColumn<Student, String> notaproyecto1;
	private TableColumn<Student, String> notaproyecto2;
	private TableColumn<Student, String> notaproyecto3;

	private TableColumn<Student, String> promedioproyectos;
	private TableColumn<Student, String> promediotodo;
	private TableColumn<Student, String> notafinal;
	
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
		// TODO Auto-generated method stub
		
	}


}
