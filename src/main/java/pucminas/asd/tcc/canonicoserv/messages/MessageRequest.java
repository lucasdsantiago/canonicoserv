package pucminas.asd.tcc.canonicoserv.messages;

import javax.xml.bind.annotation.XmlRootElement;


import pucminas.asd.tcc.canonicoserv.Declaracao;

//@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement
public class MessageRequest {
	
	
	private Declaracao declaracao;

	
	public Declaracao getDeclaracao() {
		return declaracao;
	}


	public void setDeclaracao(Declaracao declaracao) {
		this.declaracao = declaracao;
	}


	public static class Builder {
		private MessageRequest messageRequest = new MessageRequest();
		
		private Builder() {
		}
		
		public static Builder newInstance() {
			return new Builder();
		}
		
		public Builder declaracao(Declaracao declaracao) {
			this.messageRequest.setDeclaracao(declaracao);
			return this;
		}
		
		public MessageRequest build() {
			return messageRequest;
		}
		
	}

}
