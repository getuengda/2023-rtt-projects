<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>

<section>
<div class="container pt-5">
<h1 class="pb-3">Employee Search</h1>
<form action="/employee/search">
    <input type="text" name="search" placeholder="Search by name" value="${search}"/>
    <button type="submit" class=" btn btn-primary">Submit</button>
</form>
    <c:if test="${not empty employeeVar}">
                <h1 class="pt-5">Employees Found ${employeeVar.size()}</h1>

                <table class="table">
                    <tr>
                        <td>Id</td>
                        <td>First Name</td>
                        <td>Last Name</td>
                        <td>Department Name</td>
                    </tr>
                    <c:forEach items="${employeeVar}" var="employee">
                        <tr>
                            <td>${employee.id}</td>
                            <td>${employee.firstName}</td>
                            <td>${employee.lastName}</td>
                            <td>${employee.departmentName}</td>
                        </tr>
                    </c:forEach>
                </table>

    </c:if>
</div>
</section>

<jsp:include page="../include/footer.jsp"/>