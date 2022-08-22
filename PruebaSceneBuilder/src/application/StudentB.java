package application;

/**
 * La clase StudentB es una subclase de Student y permite, ademas de clasificar los parametros en atributos del estudiante, realiza las operaciones de sacar el promedio de proyectos.
 * @author henry
 * version 21/08/2022
 */
public class StudentB extends Student{

	public StudentB(String carne, String nya, String correo, String numero, String nickname, String tipo,
			String notapromedioexamenes, String notapromedioquices, String notapromediotareas, String notaproyecto1,
			String notaproyecto2, String notaproyecto3, String promedioproyectos, String promediotodo,
			String notafinal) {
		super(carne, nya, correo, numero, nickname, tipo, notapromedioexamenes, notapromedioquices, notapromediotareas,
				notaproyecto1, notaproyecto2, notaproyecto3, promedioproyectos, promediotodo, notafinal);//En este lugar se expone el concepto de herencia, ya que, como se observa la subclase de StudentB (asi como StudentA) heredan los atributos de Student, y pueden ser llamados y se les puede asignar un valor como si fuera un student normal.
		// 
	}
	public StudentB(String carne, String nya, String correo, String numero, String nickname,
			String notapromedioexamenes, String notapromedioquices, String notapromediotareas, String notaproyecto1,
			String notaproyecto2, String notaproyecto3) { //Creo constructor adecuado a la clase
		                                                                                                                             
		super(carne, nya, correo, numero, nickname, "B", notapromedioexamenes, notapromedioquices, notapromediotareas,
				notaproyecto1, notaproyecto2, notaproyecto3, "", "", ""); //Devuelvo parametros para la implementacion en la tabla
		this.calcularpromedio();
	}
	
	/**
	 * Este metodo permite convertir los valores recibidos a int para calcular el promedio de los proyectos ademas de la nota final
	 */
	public void calcularpromedio() {

		
		double examenes = Double.valueOf(this.getNotapromedioexamenes());
		double quices = Double.valueOf(this.getNotapromedioquices());
		double tareas = Double.valueOf(this.getNotapromediotareas());
		double proyecto1 = Double.valueOf(this.getNotaproyecto1());
		double proyecto2 = Double.valueOf(this.getNotaproyecto2());
		double proyecto3 = Double.valueOf(this.getNotaproyecto3());
		
		double promedionotafinal = (examenes + quices + tareas + proyecto1 + proyecto2 + proyecto3)/6;
		double totalproyectos = (proyecto1 + proyecto2 + proyecto3)/3;
		String promedioproyectos = String.valueOf(totalproyectos);
		String notafinalb = String.valueOf(promedionotafinal);
		this.setNotafinal(notafinalb);
		this.setPromedioproyectos(promedioproyectos);
	}

}
