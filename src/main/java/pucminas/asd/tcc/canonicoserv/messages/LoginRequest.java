package pucminas.asd.tcc.canonicoserv.messages;

import javax.xml.bind.annotation.XmlRootElement;

import pucminas.asd.tcc.canonicoserv.Login;

//@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement
public class LoginRequest {
	
	
	private Login login;

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public static class Builder {
		private LoginRequest loginRequest = new LoginRequest();
		
		private Builder() {
		}
		
		public static Builder newInstance() {
			return new Builder();
		}
		
		public Builder login(Login login) {
			this.loginRequest.setLogin(login);
			return this;
		}
		
		public LoginRequest build() {
			return loginRequest;
		}
		
	}

}
