<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>Calculadora de impostos</h2>
    <form action="calculate" method="post">
        <label for="city">Cidade:</label>
        <select name="city">
            <option value="SaoPaulo">S�o Paulo</option>
            <option value="BeloHorizonte">Belo Horizonte</option>
            <option value="PortoAlegre">Porto Alegre</option>
            <option value="Curitiba">Curitiba</option>
        </select><br><br>
        <label for="areaTotal">�rea total:</label>
        <input type="text" name="areaTotal"><br>
        <label for="numComodos">N�mero de c�modos:</label>
        <input type="text" name="numComodos"><br>
        <label for="numQuartos">N�mero de quartos:</label>
        <input type="text" name="numQuartos"><br>
        <label for="areaGaragem">�rea da garagem:</label>
        <input type="text" name="areaGaragem"><br>
        <label for="idadeImovel">Idade do im�vel:</label>
        <input type="text" name="idadeImovel"><br>
        <input type="submit" value="Calcular Impostos">
    </form>
</body>
</html>

