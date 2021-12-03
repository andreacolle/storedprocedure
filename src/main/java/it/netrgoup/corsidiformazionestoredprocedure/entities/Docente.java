package it.netrgoup.corsidiformazionestoredprocedure.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Docente implements Serializable {

	private static final long serialVersionUID = 8003689489929846249L;


	@Id
	@Column (name = "IDDOCENTE")
	private String iddocente;

	@Column (name = "NOME")
	private String nome;

	@Column (name = "COGNOME")
	private String cognome;

	@Column (name = "PUNTEGGIO")
	private BigDecimal punteggio;

	



	public String getIddocente() {
		return iddocente;
	}





	public void setIddocente(String iddocente) {
		this.iddocente = iddocente;
	}





	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public String getCognome() {
		return cognome;
	}





	public void setCognome(String cognome) {
		this.cognome = cognome;
	}





	public BigDecimal getPunteggio() {
		return punteggio;
	}





	public void setPunteggio(BigDecimal punteggio) {
		this.punteggio = punteggio;
	}





	public Docente(String IdDocente, String Nomedocente, String Cognomedocente, BigDecimal Punteggio)
	{
		iddocente = IdDocente;
		nome = Nomedocente;
		cognome = Cognomedocente;
		punteggio = Punteggio;
	}




}
