<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Contatos</title>
</head>
<body>
	<h2>Por favor confirme seus dados...</h2>
	<hr color="green" size="3">

	<form action="adicionaContato" name="form" method="post">
		<div align="center">
			<table>
				<tr>
					<td>Nome:</td>
					<td><input type="text" name="nome"></td>
				</tr>
				<tr>
					<td>E-mail</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>Endereço</td>
					<td><input type="text" name="endereco"></td>
				</tr>
				<tr>
					<td>Data de Nascimento</td>
					<td><input type="text" name="dataNascimento"></td>
				</tr>
				<tr>
					<td><input type="submit" name="Gravar" value="Gravar"></td>
				</tr>
			</table>
		</div>
	</form>

</body>
</html>