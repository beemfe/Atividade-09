<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Realizar Depósito</title>
</head>
<body>
    <h1>Realizar Depósito</h1>
    <form action="deposito" method="post">
        Tipo de Conta:
        <select name="tipoConta">
            <option value="poupanca">Poupança</option>
            <option value="especial">Especial</option>
        </select><br><br>
        Valor: <input type="text" name="valor"><br><br>
        <input type="submit" value="Depósito">
    </form>
    <p>${mensagem}</p>
</body>
</html>