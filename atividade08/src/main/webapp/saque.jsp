<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Realizar Saque</title>
</head>
<body>
    <h1>Realizar Saque</h1>
    <form action="saque" method="post">
        Tipo de Conta:
        <select name="tipoConta">
            <option value="poupanca">Poupança</option>
            <option value="especial">Especial</option>
        </select><br><br>
        Valor: <input type="text" name="valor"><br><br>
        <input type="submit" value="Saque">
    </form>
    <p>${mensagem}</p>
</body>
</html>