<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>LOGIN</h1>
	${SPRING_SECURITY_LAST_EXCEPTION.message}
	<form action="AdminRegister" method="post">
		<table>
		<tr>
			<td>FIRSTNAME:</td>
			<td><input type='text' name='firstname'></td>
		</tr>
		<tr>
			<td>LASTNAME</td>
			<td><input type='text' name='lastname'></td>
		</tr>
		<tr>
			<td>USER:</td>
			<td><input type='text' name='id' value=''></td>
		</tr>
		<tr>
			<td>CONTACT:</td>
			<td><input type='text' name='contact' value=''></td>
		</tr>
		<tr>
			<td>COUNTRY:</td>
			<td><input type='text' name='country' value=''></td>
		</tr>
		
		<tr>
			<td>PASSWORD:</td>
			<td><input type='password' name='password'></td>
		</tr>
		
		<tr>
			<td><input type='submit' name='submit' value='submit'></td>
		</tr>
		</table>
	
	
	</form> 


</body>
</html>