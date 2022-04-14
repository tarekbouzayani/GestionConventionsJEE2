<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html lang="en" dir="ltr">
<head>
    <meta charset="UTF-8">
    <!---<title> Responsive Registration Form | CodingLab </title>--->
    <link rel="stylesheet" href="../StylePage/registerStyle.css.">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<jsp:useBean id="convention" class="main.java.model.Convention"
             scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="convention"/>
<div class="container">
    <div class="title">Ajouter Convention</div>
    <div class="content">
        <form action="#">
            <div class="user-details">
                <div class="input-box">
                    <span class="details">Type</span>
                    <input type="text" value='<jsp:getProperty property="objet" name="convention"/>'
                           placeholder="Enter the convention type" required>
                </div>
                <div class="input-box">
                    <span class="details">Objet</span>
                    <input type="text" value='<jsp:getProperty property="objet" name="convention"/>'
                           placeholder="Ajouter l objet de convention" required>
                </div>
                <div class="input-box">
                    <span class="details">Edition Date</span>
                    <input type="date" value='<jsp:getProperty property="dateEdition" name="convention"/>'
                           placeholder="Ajouter la date d edition" required>
                </div>
                <div class="input-box">
                    <span class="details">Date Vigueur</span>
                    <input type="date" value='<jsp:getProperty property="dateVigueur" name="convention"/>'
                           placeholder="Ajouter la date vigueur" required>
                </div>
                <div class="input-box">
                    <span class="details">Date Expiration</span>
                    <input type="date" value='<jsp:getProperty property="dateExpiration" name="convention"/>'
                           placeholder="Ajouter la date d expiration" required>
                </div>

            </div>

            <div class="button">
                <input type="submit" value="Ajouter">
            </div>
        </form>
    </div>
</div>

</body>
</html>
