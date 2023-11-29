<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../include/header.jsp"/>

<section>
<div class="container pt-5">
<h1 class="pb-3">Customer Search</h1>
<form action="/customer/search">
    <label for="firstName">First Name</label>
   <input type="text" name="search" placeholder="Search by first name" value="${search}"/>
   <label for="lastName">Last Name</label>
   <input type="text" name="lastName" placeholder="Search by last name" value="${lastName}"/>
    <button type="submit" class=" btn btn-primary">Submit</button>
</form>
    <c:if test="${not empty customerVar}">
        <h1 class="pt-5">Customer Found ${customerVar.size()}</h1>
        <table class="table">
            <tr>
                <td>Id</td>
                <td>First Name</td>
                <td>Last Name</td>
                <td>Phone</td>
                <td>City</td>
            </tr>
            <c:forEach var="customer" items="${customerVar}">
                <tr>
                    <td>${customer.id}</td>
                    <td>${customer.firstName}</td>
                    <td>${customer.lastName}</td>
                    <td>${customer.phone}</td>
                    <td>${customer.city}</td>
                </tr>
            </c:forEach>
        </table>
    </c:if>

</div>
</section>

<jsp:include page="../include/footer.jsp"/>