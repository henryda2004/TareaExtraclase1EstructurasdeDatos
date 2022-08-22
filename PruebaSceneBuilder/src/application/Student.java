package application;

import javafx.beans.property.SimpleStringProperty;
/**
 * Clase Student permite convertir cada fila del CSV en un estudiante, dandole los atributos respectivos necesarios asi como realizar los metodos necesarios para calcular promedios.
 * @author henry
 * version 21/08/22
 */
public class Student {//En esta lines se logra ver el concepto de clase. En este caso se crea una clase estudiante para lograr dar una clasificacion a los datos obtenidos del archivo. Hacer esta clase permite concentrar los atributos y darselos a un objeto definido. Existen superclases como student y subclases como studentA y studentB que permiten la herencia.
	private final SimpleStringProperty carne; //El concepto de encapsulacion se pone en evidencia, en este contexto, en las variables pertenecientes a la clase student. La forma de organizar los atributos o variables de cada clase asi como las variables de cada metodo, que permiten diferenciar unos de otras son un ejemplo de este concepto. Cada atributo y metodo propio de cada clase se consideran encapsulamientos.
	private final SimpleStringProperty nya;
	private final SimpleStringProperty correo;
	private final SimpleStringProperty numero;
	private final SimpleStringProperty nickname;
	private final SimpleStringProperty tipo;
	private final SimpleStringProperty notapromedioexamenes; //En esta parte defino los atributos de la clase Student, los atributos se consideran dentro de este contexto como las caracteristicas pertenecientes al estudiante y a las que se les puede asignar un valor, en este caso, la idea es asignar los valores obtenidos del CSV a cada atributo respectivo.
	private final SimpleStringProperty notapromedioquices;
	private final SimpleStringProperty notapromediotareas;
	private final SimpleStringProperty notaproyecto1;
	private final SimpleStringProperty notaproyecto2;
	private final SimpleStringProperty notaproyecto3;
	private SimpleStringProperty promedioproyectos;
	private SimpleStringProperty promediotodo;
	private SimpleStringProperty notafinal;
	
	//Dentro de esta definicion del programa de estudiante se logra poner en practica el concepto de Abstraccion, ya que son las caracteristicas especificas de este objeto y como lo distinguen de demas objetos. Se definen limites de que necesita un estudiante para ser estudiante y se logra una representacion de un estudiante seguun la logica del problema.
	/**
	 * Constructor de la clase estudiante
	 * @param carne 
	 * @param nya
	 * @param correo
	 * @param numero
	 * @param nickname
	 * @param tipo
	 * @param notapromedioexamenes
	 * @param notapromedioquices
	 * @param notapromediotareas
	 * @param notaproyecto1
	 * @param notaproyecto2
	 * @param notaproyecto3
	 * @param promedioproyectos
	 * @param promediotodo
	 * @param notafinal
	 */
	public Student(String carne, String nya, String correo, String numero, String nickname, String tipo,
			String notapromedioexamenes, String notapromedioquices, String notapromediotareas, String notaproyecto1,
			String notaproyecto2, String notaproyecto3, String promedioproyectos, String promediotodo,
			String notafinal) {
		super();
		this.carne = new SimpleStringProperty(carne);
		this.nya = new SimpleStringProperty(nya);
		this.correo = new SimpleStringProperty(correo);
		this.numero = new SimpleStringProperty(numero);
		this.nickname = new SimpleStringProperty(nickname);
		this.tipo = new SimpleStringProperty(tipo);
		this.notapromedioexamenes = new SimpleStringProperty(notapromedioexamenes);
		this.notapromedioquices = new SimpleStringProperty(notapromedioquices);
		this.notapromediotareas = new SimpleStringProperty(notapromediotareas);
		this.notaproyecto1 = new SimpleStringProperty(notaproyecto1);
		this.notaproyecto2 = new SimpleStringProperty(notaproyecto2);
		this.notaproyecto3 = new SimpleStringProperty(notaproyecto3);
		this.promedioproyectos = new SimpleStringProperty(promedioproyectos);
		this.promediotodo = new SimpleStringProperty(promediotodo);
		this.notafinal = new SimpleStringProperty(notafinal);
	}
	/**
	 * Este metodo no tiene ordenes asignadas
	 */
	public void calcularPromedio() {
		// Se implementa en los hijos
	}
	/**
	 * obtiene valor del carne
	 * @return
	 */
	public String getCarne() {
		return carne.get();
	}
	/**
	 * obtiene valor del nombre y apellido
	 * @return
	 */
	public String getNya() {
		return nya.get();
	}
	/**
	 * obtiene valor del correo
	 * @return
	 */
	public String getCorreo() {
		return correo.get();
	}
	/**
	 * obtiene valor del numero de telefono
	 * @return
	 */
	public String getNumero() {
		return numero.get();
	}
	/**
	 * obtiene valor del nickname
	 * @return
	 */
	public String getNickname() {
		return nickname.get();
	}
	/**
	 * obtiene valor del tipo de estudiante
	 * @return
	 */
	public String getTipo() {
		return tipo.get();
	}
	/**
	 * obtiene valor de promedio de examenes
	 * @return
	 */
	public String getNotapromedioexamenes() {
		return notapromedioexamenes.get();
	}
	/**
	 * obtiene valor de promedio de quices
	 * @return
	 */
	public String getNotapromedioquices() {
		return notapromedioquices.get();
	}
	/**
	 * obtiene valor de promedio de tareas
	 * @return
	 */
	public String getNotapromediotareas() {
		return notapromediotareas.get();
	}
	/**
	 * obtiene valor de nota del proyecto1
	 * @return
	 */
	public String getNotaproyecto1() {
		return notaproyecto1.get();
	}
	/**
	 * obtiene valor de nota del proyecto2
	 * @return
	 */
	public String getNotaproyecto2() {
		return notaproyecto2.get();
	}
	/**
	 * obtiene valor de nota del proyecto3
	 * @return
	 */
	public String getNotaproyecto3() {
		return notaproyecto3.get();
	}
	/**
	 * obtiene valor de nota del promedio de proyectos
	 * @return
	 */
	public String getPromedioproyectos() {
		return promedioproyectos.get();
	}
	/**
	 * obtiene acceso de nota del promedio de proyectos
	 * @param value
	 */
	public void setPromedioproyectos(String value) {
		promedioproyectos = new SimpleStringProperty(value);
	}
	/**
	 * obtiene valor de promedio de examenes, quices y tareas
	 * @return
	 */
	public String getPromediotodo() {
		return promediotodo.get();
	}
	/**
	 * obtiene acceso a valor de promedio de examenes, quices y tareas
	 * @param value
	 */
	public void setPromediotodo(String value) {
		promediotodo = new SimpleStringProperty(value);
	}
	/**
	 * obtiene valor de nota de la nota final
	 * @return
	 */
	public String getNotafinal() {
		return notafinal.get();
	}
	/**
	 * obtiene acceso de la nota final
	 * @param value
	 */
	public void setNotafinal(String value) {
		notafinal = new SimpleStringProperty(value);
	}
	
}
