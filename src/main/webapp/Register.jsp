<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Horoscope</title>
</head>
<body>
<form action="RegisterController" method="post">
	Name : <input type="text" name="Fname">
	Surname : <input type="text" name="Lname"><br><br>
	Mobile no : <input type="text" name="Phone">
	Email : <input type="email" name="Email"><br><br>
	Time of Birth <input type="time" name="TOB">
	Place of Birth <input type="text" name="POB"><br><br>
	Date Of Birth <input type="date" name="DOB">
	New Password <input type="text" name="password"><br><br>
	<input type="submit">
</form>
</body>
</html>