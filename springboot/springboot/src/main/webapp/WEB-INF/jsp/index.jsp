<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
    />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<jsp:include page="include/header.jsp"/>

<section>
    <div class="bg-light2 pt-5 pb-5">
        <div class="row">
            <div class="col-12 text-center">
                <h1 class="m-0">Home Page</h1>
            </div>
        </div>
    </div>
</section>

<section class="pt-5 pb-5">
    <div class="container style="width: auto; height: 1000px;">
        <div class="row justify-content-center">

             <div id="myCarousel" class="carousel slide getu" data-ride="carousel">
                            <ol class="carousel-indicators">
                              <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                              <li data-target="#myCarousel" data-slide-to="1"></li>
                              <li data-target="#myCarousel" data-slide-to="2"></li>
                            </ol>
                            <div class="carousel-inner">
                              <div class="item active">
                                <img src="https://th.bing.com/th?id=OIP.Qg30f_L8A9KC2VLt7uyAqAHaE8&w=306&h=204&c=8&rs=1&qlt=90&o=6&dpr=1.8&pid=3.1&rm=2" alt="Engineering" style="width:100%; height: 800px;">
                                <div class="carousel-caption">
                                  <h3>Engineering</h3>
                                  <p>Engineering is always so much Innovative!</p>
                                </div>
                              </div>

                              <div class="item">
                                <img src="https://th.bing.com/th?id=OIP._FJFJqCgfY1GSl100ui2SQHaE5&w=307&h=203&c=8&rs=1&qlt=90&o=6&dpr=1.8&pid=3.1&rm=2" alt="AI" style="width:100%; height: 800px;">
                                <div class="carousel-caption">
                                  <h3>AI</h3>
                                  <p>AI is Creating New World!</p>
                                </div>
                              </div>

                              <div class="item">
                                <img src="https://th.bing.com/th?id=OIP.rjExmgmKTbfTBdhiO6pcZAHaE8&w=306&h=204&c=8&rs=1&qlt=90&o=6&dpr=1.8&pid=3.1&rm=2" alt="Research" style="width:100%; height: 800px;">
                                <div class="carousel-caption">
                                                                          <h3>Research</h3>
                                                                          <p>We Research Out of the Box & Boundary of Hemisphere!</p>
                                                                        </div>
                                                                      </div>
                                                                      <div class="item">
                                                                        <img src="https://th.bing.com/th?id=OIP.2MbDnCqZ22kb1Y4n0Ti51wHaE6&w=306&h=203&c=8&rs=1&qlt=90&o=6&dpr=1.8&pid=3.1&rm=2" alt="Training" style="width:100%; height: 800px;">
                                                                        <div class="carousel-caption">
                                                                          <h3>Training</h3>
                                                                          <p>Every Day Learning and Exploring new Idea!</p>
                                                                        </div>
                                                                      </div>
                                                                    </div>
                                                                    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                                                                      <span class="glyphicon glyphicon-chevron-left"></span>
                                                                      <span class="sr-only">Previous</span>
                                                                    </a>
                                                                    <a class="right carousel-control" href="#myCarousel" data-slide="next">
                                                                      <span class="glyphicon glyphicon-chevron-right"></span>
                                                                      <span class="sr-only">Next</span>
                                                                    </a>
                                                                  </div>
                                                </div>
                                            </div>
                                        </section>

                                        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
                                        <jsp:include page="include/footer.jsp"/>