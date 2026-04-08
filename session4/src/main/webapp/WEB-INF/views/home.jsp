<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh sách sinh viên</title>
</head>
<body>
<h2>Danh sách sinh viên</h2>
<ul>
    <c:forEach var="student" items="${students}">
        <li>${student.id} - ${student.fullName} - ${student.age} tuổi -
            <c:choose>
                <c:when test="${student.gender}">Nam</c:when>
                <c:otherwise>Nữ</c:otherwise>
            </c:choose>
        </li>
    </c:forEach>
</ul>
</body>
</html>