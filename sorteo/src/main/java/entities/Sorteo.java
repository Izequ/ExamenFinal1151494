package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sorteo database table.
 * 
 */
@Entity
@NamedQuery(name="Sorteo.findAll", query="SELECT s FROM Sorteo s")
public class Sorteo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int boletas;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private int maximo;

	private String nombre;

	private int numeros;

	public Sorteo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBoletas() {
		return this.boletas;
	}

	public void setBoletas(int boletas) {
		this.boletas = boletas;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getMaximo() {
		return this.maximo;
	}

	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeros() {
		return this.numeros;
	}

	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}

}