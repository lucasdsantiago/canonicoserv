package pucminas.asd.tcc.canonicoserv;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Login {

	private String cpf;
	private String senha;
	private String orgao;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getOrgao() {
		return orgao;
	}
	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}
	
	
	
}
