package application;

import javafx.beans.property.SimpleStringProperty;

public class StudentA extends Student{

	public StudentA(String carne, String nya, String correo, String numero, String nickname, String tipo,
			String notapromedioexamenes, String notapromedioquices, String notapromediotareas, String notaproyecto1,
			String notaproyecto2, String notaproyecto3, String promedioproyectos, String promediotodo,
			String notafinal) {
		super(carne, nya, correo, numero, nickname, tipo, notapromedioexamenes, notapromedioquices, notapromediotareas,
				notaproyecto1, notaproyecto2, notaproyecto3, promedioproyectos, promediotodo, notafinal);
		// TODO Auto-generated constructor stub
	}
	public StudentA(String carne, String nya, String correo, String numero, String nickname,
			String notapromedioexamenes, String notapromedioquices, String notapromediotareas, String notaproyecto1,
			String notaproyecto2, String notaproyecto3) {
		
		
		                                                                                                                             
		super(carne, nya, correo, numero, nickname, "A", notapromedioexamenes, notapromedioquices, notapromediotareas,
				notaproyecto1, notaproyecto2, notaproyecto3, "", "", "");
		
		double examenes = Double.valueOf(notapromedioexamenes);
		double quices = Double.valueOf(notapromedioquices);
		double tareas = Double.valueOf(notapromediotareas);
		double proyecto1 = Double.valueOf(notaproyecto1);
		double proyecto2 = Double.valueOf(notaproyecto2);
		double proyecto3 = Double.valueOf(notaproyecto3);
		
		double promedionotafinal = (examenes + quices + tareas + proyecto1 + proyecto2 + proyecto3)/6;
		double total = (examenes + quices + tareas)/3;
		String promedioexamenesquicestareas = String.valueOf(total);
		String notafinala = String.valueOf(promedionotafinal);
		this.setNotafinal(notafinala);
		this.setPromediotodo(promedioexamenesquicestareas);
	}
}
