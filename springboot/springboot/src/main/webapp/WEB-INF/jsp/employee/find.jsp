<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>

<section>
    <div class="bg-light2 pt-5 pb-5">
        <div class="row">
            <div class="col-12 text-center">
                <h1 class="m-0">Find Employee By Id</h1>
            </div>
        </div>
    </div>
</section>

<section class="bg-light1 pt-5 pb-5">
    <div class="container">
        <form action="/employee/find">
             <div class="row justify-content-center">
                    <div class="col-3 col-sm-3 col-md-2 col-lg-2 text-end">
                        <label for="id" class="form-label m-0 pt-1">Employee ID</label>
                     </div>
                     <div class="col-8 col-sm-9 col-md-6 col-lg-4">
                       <input type="Number" class="form-control" id="id" name="id" placeholder="Search By Employee ID" value="${id}"/>
                    </div>
             </div>
             <div class="row justify-content-center pt-4">
                   <div class="col-12 text-center">
                      <button type="submit" class="btn btn-primary">Submit</button>
                  </div>
             </div>

        </form>
    </div>
</section>

    <c:if test="${not empty employee}">
              <section class="bg-light1 pb-5">
                    <div class="container">
                          <div class="row justify-content-center">
                                <div class="col-12">
                                      <h1 class="text-center pb-3">Employee Found</h1>

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
                        </div>
                     </div>
                  </div>
              </section>
     </c:if>

<jsp:include page="../include/footer.jsp"/>