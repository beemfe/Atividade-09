<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Calcular Novo Saldo</title>
</head>
<body>
    <h1>Calcular Novo Saldo (Poupança)</h1>
    <form action="novosaldo" method="get">
        Taxa de Rendimento: <input type="text" name="taxaRendimento"><br><br>
        <input type="submit" value="Calcular">
    </form>
    <p>${mensagem}</p>
</body>
</html>