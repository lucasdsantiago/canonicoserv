package pucminas.asd.tcc.canonicoserv.messages;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MessageResponse implements Serializable {
	
	private static final long serialVersionUID = 6117226504429270151L;

	private ResponseSaveOrder responseSaveOrder;

	public ResponseSaveOrder getResponseSaveOrder() {
		return responseSaveOrder;
	}

	public void setResponseSaveOrder(ResponseSaveOrder responseSaveOrder) {
		this.responseSaveOrder = responseSaveOrder;
	}
	
	public MessageResponse(ResponseSaveOrder responseSaveOrder) {
		this.responseSaveOrder = responseSaveOrder;
	}
	

}
