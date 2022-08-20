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
	public Student(SimpleStringProperty carne, SimpleStringProperty nya, SimpleStringProperty correo,
			SimpleStringProperty numero, SimpleStringProperty nickname, SimpleStringProperty tipo,
			SimpleStringProperty notapromedioexamenes, SimpleStringProperty notapromedioquices,
			SimpleStringProperty notapromediotareas, SimpleStringProperty notaproyecto1,
			SimpleStringProperty notaproyecto2, SimpleStringProperty notaproyecto3) {
		super();
		this.carne = carne;
		this.nya = nya;
		this.correo = correo;
		this.numero = numero;
		this.nickname = nickname;
		this.tipo = tipo;
		this.notapromedioexamenes = notapromedioexamenes;
		this.notapromedioquices = notapromedioquices;
		this.notapromediotareas = notapromediotareas;
		this.notaproyecto1 = notaproyecto1;
		this.notaproyecto2 = notaproyecto2;
		this.notaproyecto3 = notaproyecto3;
	}
	public SimpleStringProperty getCarne() {
		return carne;
	}
	public SimpleStringProperty getNya() {
		return nya;
	}
	public SimpleStringProperty getCorreo() {
		return correo;
	}
	public SimpleStringProperty getNumero() {
		return numero;
	}
	public SimpleStringProperty getNickname() {
		return nickname;
	}
	public SimpleStringProperty getTipo() {
		return tipo;
	}
	public SimpleStringProperty getNotapromedioexamenes() {
		return notapromedioexamenes;
	}
	public SimpleStringProperty getNotapromedioquices() {
		return notapromedioquices;
	}
	public SimpleStringProperty getNotapromediotareas() {
		return notapromediotareas;
	}
	public SimpleStringProperty getNotaproyecto1() {
		return notaproyecto1;
	}
	public SimpleStringProperty getNotaproyecto2() {
		return notaproyecto2;
	}
	public SimpleStringProperty getNotaproyecto3() {
		return notaproyecto3;
	}

}
