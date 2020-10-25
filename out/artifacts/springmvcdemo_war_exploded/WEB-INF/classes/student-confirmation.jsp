<jsp:useBean id="student" scope="request" type="org.example.Student"/>
<%--
  Created by IntelliJ IDEA.
  User: Giorgi
  Date: 10/22/2020
  Time: 12:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
THE student is confirmed :${student.firstName} ${student.lastName}

<br><br>

Country: ${student.country}
</body>
</html>
