package br.com.contato.webserver;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.com.contato.jdbc.modelo.Contato;


@WebService
@SOAPBinding(style =  Style.RPC)
public interface ContatoServer {
	
	@WebMethod List<Contato> getContatos();

}
