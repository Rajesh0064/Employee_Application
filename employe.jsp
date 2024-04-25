<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<center>
<h1>Employee details</h1>
<form:form action="/req1" method="POST" modelAttribute="employee">
employee no:<form:input path="eno"/><p></p>
employee name:<form:input path="ename"/><p></p>
employee salary:<form:input path="salary"/><p></p>
<input type="submit" value="printInvoice">
</form:form>
</center> 