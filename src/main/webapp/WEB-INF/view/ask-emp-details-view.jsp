<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Dear Employee, please enter your details</h2>
<br>
<br>
<br>
<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <br><br>
    LastName <form:input path="lastName"/>
    <br><br>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
<%--    <form:option value="Information Technology" label="IT"/>--%>
<%--    <form:option value="Sales" label="SalesDep"/>--%>
<%--    <form:option value="Logistic" label="LogisticDep"/>--%>
    </form:select>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    <input type="submit" value="OK"/>
</form:form>

</body>
</html>
