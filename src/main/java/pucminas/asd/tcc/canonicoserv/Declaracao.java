package pucminas.asd.tcc.canonicoserv;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Declaracao implements Serializable {

	private static final long serialVersionUID = 1660408448465783410L;
	
	private Agente agente;
	private String bemDeclarado;
	
	public Agente getAgente() {
		return agente;
	}
	public void setAgente(Agente agente) {
		this.agente = agente;
	}
	public String getBemDeclarado() {
		return bemDeclarado;
	}
	public void setBemDeclarado(String bemDeclarado) {
		this.bemDeclarado = bemDeclarado;
	}
	
}
