<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>

<section>
    <div class="bg-light2 pt-5 pb-5">
        <div class="row">
            <div class="col-12 text-center">
                <h1 class="m-0">Employee Detail</h1>
            </div>
        </div>
    </div>
</section>

<section class="bg-light1 pt-5 pb-5">
    <div class="container">
        <c:if test="${employee != null}">
            <section class="bg-light1 pb-5">
                <div class="container">
                    <div class="row justify-content-center">
                        <div class="col-12">
                            <h3 class="text-center pb-3">Employee about employee with id: ${employee.id}</h3>

                            <table class="table table-hover">
                                <tr>
                                    <td>Id</td>
                                    <td>First Name</td>
                                    <td>Last Name</td>
                                    <td>Department Name</td>
                                </tr>
                                <tr>
                                   <td>${employee.id}</td>
                                   <td>${employee.firstName}</td>
                                   <td>${employee.lastName}</td>
                                   <td>${employee.departmentName}</td>
                                </tr>
                            </table>

                            <form action="/employee/edit/${employee.id}">
                            <button type="submit" class="btn col-12 btn-primary">Edit</button>
                            </form>
                        </div>
                    </div>
                </div>
            </section>
        </c:if>
    </div>
</section>

<jsp:include page="../include/footer.jsp"/>