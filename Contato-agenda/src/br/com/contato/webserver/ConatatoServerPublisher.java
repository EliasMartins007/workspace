package br.com.contato.webserver;

import javax.xml.ws.Endpoint;

public class ConatatoServerPublisher {

	
	public static void main(String[]args){
		
		Endpoint.publish("http://127.0.0.1:8080/br.com.contato.webserver", new ContatoServerImpl());
	}
}
