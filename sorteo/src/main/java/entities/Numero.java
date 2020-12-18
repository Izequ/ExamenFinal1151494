package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the numero database table.
 * 
 */
@Entity
@NamedQuery(name="Numero.findAll", query="SELECT n FROM Numero n")
public class Numero implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int boleta;

	private String numero;

	public Numero() {
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

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}