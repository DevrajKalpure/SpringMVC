<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<title>View Students pages</title>
</head>
<body>

	<a href="/">Add New Students</a>

	<h3>View Students</h3>

	<table border="1">
		<thead>
			<tr>
				<th>S.no</th>
				<th>Name</th>
				<th>email</th>
				<th>Gender</th>
				<th>course</th>
				<th>timings</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${students}" var="student" varStatus="index">
				<tr>
					<td>${index.count}</td>
					<td>${student.name}</td>
					<td>${student.email}</td>
					<td>${student.gender}</td>
					<td>${student.course}</td>
					<td>${student.timings}</td>

				</tr>
			</c:forEach>




		</tbody>




	</table>


</body>
</html>