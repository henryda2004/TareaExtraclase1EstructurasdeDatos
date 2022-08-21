package application;

import javafx.beans.property.SimpleStringProperty;

public class Student {
	private final SimpleStringProperty carne;
	private final SimpleStringProperty nya;
	private final SimpleStringProperty correo;
	private final SimpleStringProperty numero;
	private final SimpleStringProperty nickname;
	private final SimpleStringProperty tipo;
	private final SimpleStringProperty notapromedioexamenes;
	private final SimpleStringProperty notapromedioquices;
	private final SimpleStringProperty notapromediotareas;
	private final SimpleStringProperty notaproyecto1;
	private final SimpleStringProperty notaproyecto2;
	private final SimpleStringProperty notaproyecto3;
	private final SimpleStringProperty promedioproyectos;
	private final SimpleStringProperty promediotodo;
	private final SimpleStringProperty notafinal;
	
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
	
	public String getCarne() {
		return carne.get();
	}
	public String getNya() {
		return nya.get();
	}
	public String getCorreo() {
		return correo.get();
	}
	public String getNumero() {
		return numero.get();
	}
	public String getNickname() {
		return nickname.get();
	}
	public String getTipo() {
		return tipo.get();
	}
	public String getNotapromedioexamenes() {
		return notapromedioexamenes.get();
	}
	public String getNotapromedioquices() {
		return notapromedioquices.get();
	}
	public String getNotapromediotareas() {
		return notapromediotareas.get();
	}
	public String getNotaproyecto1() {
		return notaproyecto1.get();
	}
	public String getNotaproyecto2() {
		return notaproyecto2.get();
	}
	public String getNotaproyecto3() {
		return notaproyecto3.get();
	}
	public String getPromedioproyectos() {
		return promedioproyectos.get();
	}
	public String getPromediotodo() {
		return promediotodo.get();
	}
	public String getNotafinal() {
		return notafinal.get();
	}
	
}
