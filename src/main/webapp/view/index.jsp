<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h3>Student Registration Form</h3>
  
  <font color='red'>${msg}</font>
<form:form action="save" modelAttribute="students" method="POST">

  <table>
  <tr>
    <td>Name</td>
    <td><form:input path="name"/></td>
  
  </tr>
  <tr>
    <td>Email</td>
    <td><form:input path="email"/></td>
  </tr>
  
  <tr>
    <td>Gender</td>
    <td><form:radiobutton path="gender" value="male"/>Male
     <form:radiobutton path="gender" value="female"/>Fe-Male  
  </tr>
  
   <tr>
    <td>Course</td>
    <td><form:select path="Course">
    <form:option value="">--Select--</form:option>
        <form:options items="${courses}"/>
    </form:select>
  </tr>
  
  <tr>
    <td>Timings</td>
    <td>
    <form:checkboxes items="${timings}" path="timings"/>
    </td>
  </tr>
  
  
  <tr>
   <td></td>
    <td>
    <input type="submit" value="Save"/>
    </td>
  </tr>
  
  </table>
  </form:form>

</body>
 <a href="viewStudents">viewStudents</a>
</html>