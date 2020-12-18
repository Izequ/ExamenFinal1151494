package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the boleta database table.
 * 
 */
@Entity
@NamedQuery(name="Boleta.findAll", query="SELECT b FROM Boleta b")
public class Boleta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int boleta;

	private Timestamp fecha;

	private int ganadora;

	private int persona;

	private int sorteo;

	public Boleta() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBoleta() {
		return this.boleta;
	}

	public void setBoleta(int boleta) {
		this.boleta = boleta;
	}

	public Timestamp getFecha() {
		return this.fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public int getGanadora() {
		return this.ganadora;
	}

	public void setGanadora(int ganadora) {
		this.ganadora = ganadora;
	}

	public int getPersona() {
		return this.persona;
	}

	public void setPersona(int persona) {
		this.persona = persona;
	}

	public int getSorteo() {
		return this.sorteo;
	}

	public void setSorteo(int sorteo) {
		this.sorteo = sorteo;
	}

}