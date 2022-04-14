<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <meta charset="UTF-8">

    <link rel="stylesheet" href="../StylePage/registerStyle.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="main.java.model.User"
             scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="user" />
<div class="container">
    <div class="title">Registration</div>
    <div class="content">
        <form action="#">
            <div class="user-details">
                <div class="input-box">
                    <span class="details">First-name</span>
                    <input type="text" name="firstName" value="<jsp:getProperty property="firstName" name="user"/>" placeholder="Enter your First-name"
                           required>
                </div>
                <div class="input-box">
                    <span class="details">Last-name</span>
                    <input type="text" name="lastName" value="<jsp:getProperty property="lastName" name="user"/>" placeholder="Enter your Last-name"
                           required>
                </div>
                <div class="input-box">
                    <span class="details">Email</span>
                    <input type="text" name="address" value="<jsp:getProperty property="address" name="user"/>" placeholder="Enter your Email" required>
                </div>
                <div class="input-box">
                    <span class="details">Username</span>
                    <input type="text" name="login" value="<jsp:getProperty property="login" name="user"/>"placeholder="Enter your Username"
                           required>
                </div>
                <div class="input-box">
                    <span class="details">Password</span>
                    <input type="password" name="password" value="<jsp:getProperty property="password" name="user"/>"placeholder="Enter your Password"
                           required>
                </div>

            </div>

            <div class="button">
                <input type="submit" value="Register">
            </div>
        </form>
    </div>
</div>

</body>
</html>