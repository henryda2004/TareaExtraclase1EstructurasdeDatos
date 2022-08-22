package application;

import javafx.beans.property.SimpleStringProperty;
/**
 * La clase StudentA es una subclase de Student y permite, ademas de clasificar los parametros en atributos del estudiante, realiza las operaciones de sacar el promedio de examenes, quices y tareas.
 * @author henry
 * version 21/08/2022
 */
public class StudentA extends Student{

	public StudentA(String carne, String nya, String correo, String numero, String nickname, String tipo,
			String notapromedioexamenes, String notapromedioquices, String notapromediotareas, String notaproyecto1,
			String notaproyecto2, String notaproyecto3, String promedioproyectos, String promediotodo,
			String notafinal) {
		super(carne, nya, correo, numero, nickname, tipo, notapromedioexamenes, notapromedioquices, notapromediotareas,
				notaproyecto1, notaproyecto2, notaproyecto3, promedioproyectos, promediotodo, notafinal);
		// Dentro de estos constructoras se pone evidencia el concepto de sobrecarga donde como se observa, la clase Student forma sus atributos a partir de recibir 15 parametros; sin embargo, tanto la clase A como B trabajan con diferente cantidad de atributos. Se llama al mismo constructor de la clase student aun utilizando diferentes parametros logtramos obtener el objetivo de hacer los calculos necesarios.
	}
	public StudentA(String carne, String nya, String correo, String numero, String nickname,
			String notapromedioexamenes, String notapromedioquices, String notapromediotareas, String notaproyecto1,
			String notaproyecto2, String notaproyecto3) {
		
		
		                                                                                                                             
		super(carne, nya, correo, numero, nickname, "A", notapromedioexamenes, notapromedioquices, notapromediotareas,
				notaproyecto1, notaproyecto2, notaproyecto3, "", "", "");
		this.calcularpromedio();
	}	
	/**
	 * Este metodo permite convertir los valores recibidos a int para calcular el promedio de los examenes,quices y tareas ademas de la nota final
	 */
	public void calcularpromedio() {//Dentro de esta funcion de calcular promedio se ve la aplicacion del polimorfismo ya que se aplica un mismo metodo (cacularpromedio) proviniente de la clase padre a una clase A y una clase B sin importar sus atributos. Trato a dos objetos distintos como uno mismo.
		//Ademas, en esta funcion y en la de StudentB se pone en practica el concepto de sobreescritura ya que estoy modificando un metodo ya heredado de la clase padre para ser aplicado en una especifica clase hija.
		double examenes = Double.valueOf(this.getNotapromedioexamenes());
		double quices = Double.valueOf(this.getNotapromedioquices());
		double tareas = Double.valueOf(this.getNotapromediotareas());
		double proyecto1 = Double.valueOf(this.getNotaproyecto1());
		double proyecto2 = Double.valueOf(this.getNotaproyecto2());
		double proyecto3 = Double.valueOf(this.getNotaproyecto3());
		
		double promedionotafinal = (examenes + quices + tareas + proyecto1 + proyecto2 + proyecto3)/6;
		double total = (examenes + quices + tareas)/3;
		String promedioexamenesquicestareas = String.valueOf(total);
		String notafinala = String.valueOf(promedionotafinal);
		this.setNotafinal(notafinala);
		this.setPromediotodo(promedioexamenesquicestareas);
	}
}
