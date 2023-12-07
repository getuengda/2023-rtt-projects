<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>

<section>
    <div class="bg-light2 pt-5 pb-5">
        <div class="row">
            <div class="col-12 text-center">
                <h1 class="m-0">Create Employee</h1>
            </div>
        </div>
    </div>
</section>

<section>
    <div class="container">
        <form method="get" action="/employee/createSubmit">
        <input type="hidden" name="id" value="${form.id}">
            <div class="mb-3">
                <label for="firstName" class="form-label">First Name</label>
                <input type="text" class="form-control" id="firstName" name="firstName" value="${form.firstName}">
                <div id="firstNameHelp" class="form-text">Please let us know your first name</div>
            </div>
            <c:if test="${errors.hasFieldErrors('firstName')}">
                    <div style="color:red">
                        <c:forEach items="${errors.getFieldErrors('firstName')}" var="error">
                            ${error.defaultMessage}<br>
                        </c:forEach>
                    </div>
             </c:if>
            <div class="mb-3">
                 <label for="lastName" class="form-label">Last Name</label>
                  <input type="text" class="form-control" id="lastName" name="lastName" value="${form.lastName}">
             </div>
             <c:if test="${errors.hasFieldErrors('lastName')}">
                  <div style="color:red">
                      <c:forEach items="${errors.getFieldErrors('lastName')}" var="error">
                          ${error.defaultMessage}<br>
                      </c:forEach>
                  </div>
             </c:if>
             <div class="mb-3">
                <label for="departmentName" class="form-label">Department Name</label>
                <input type="text" class="form-control" id="departmentName" name="departmentName" value="${form.departmentName}">
              </div>

            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</section>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<jsp:include page="../include/footer.jsp"/>