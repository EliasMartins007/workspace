package br.com.contato.webserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.jws.WebService;

import br.com.contato.jdbc.ConnectionFactory;
import br.com.contato.jdbc.modelo.Contato;

@WebService(endpointInterface = "br.com.contato.webserver.ContatoServer")

public class ContatoServerImpl implements ContatoServer{
protected Connection connection;
	
	public void ContatoDao(){
		
		this.connection = new ConnectionFactory().getConnection();
		System.out.println("Conectado !");
	}

	@Override
	public List<Contato> getContatos() {
		
		

		try {
	

	
	 
			
			List<Contato> contatos = new ArrayList<Contato>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from contatos");
			java.sql.ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				Contato contato = new Contato();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));
				
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);
				
				contatos.add(contato);	
			}
			
			rs.close();
			stmt.close();
			return contatos;
			
		} catch (SQLException e) {

			throw new RuntimeException(e);
		}
	}

	
}
