<%@page import="java.util.List"%>
<%@page import="com.booktown.model.Book"%>
<%@page import="com.booktown.dao.BookDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%if(session.getAttribute("admin")==null) 
    {
    	response.sendRedirect("adminlogin.jsp");
    }
    
    %>
    
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Admin Dashboard</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="assets/img/favicon.png" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.gstatic.com" rel="preconnect">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/quill/quill.snow.css" rel="stylesheet">
  <link href="assets/vendor/quill/quill.bubble.css" rel="stylesheet">
  <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
  <link href="assets/vendor/simple-datatables/style.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="assets/css/style.css" rel="stylesheet">

  <!-- =======================================================
  * Template Name: NiceAdmin
  * Updated: Mar 09 2023 with Bootstrap v5.2.3
  * Template URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
  
  <style>
  	.mystatus{
  		padding:50px;
  		margin-top:35px;
  	}
  
  </style>
  	
  
</head>


<body>

   <!-- ======= Header ======= -->
  <header id="header" class="header fixed-top d-flex align-items-center">

    <div class="d-flex align-items-center justify-content-between">
      <a href="index.html" class="logo d-flex align-items-center">
        <img src="images/icons/logo-02.png" alt="">
        <span class="d-none d-lg-block">Admin</span>
      </a>
      <i class="bi bi-list toggle-sidebar-btn"></i>
    </div><!-- End Logo -->

       <nav class="header-nav ms-auto">
      <ul class="d-flex align-items-center ">

       <!-- End Search Icon-->

 
        <li class="nav-item dropdown pe-5">

          <a class="nav-link nav-profile d-flex align-items-center pe-0" href="#" data-bs-toggle="dropdown">
            <img src="assets/img/profile-img.jpg" alt="Profile" class="rounded-circle">
            <span class="d-none d-md-block dropdown-toggle ps-2">Admin</span>
          </a><!-- End Profile Iamge Icon -->

          <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow profile">
            <li class="dropdown-header">
              <h6>Kevin Anderson</h6>
              <span>Web Designer</span>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>

            <li>
              <a class="dropdown-item d-flex align-items-center" href="users-profile.html">
                <i class="bi bi-person"></i>
                <span>My Profile</span>
              </a>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>

            <li>
              <hr class="dropdown-divider">
            </li>

            <li>
              <a class="dropdown-item d-flex align-items-center" href="Logout">
                <i class="bi bi-box-arrow-right"></i>
                <span>Sign Out</span>
              </a>
            </li>

          </ul><!-- End Profile Dropdown Items -->
        </li><!-- End Profile Nav -->

      </ul>
    </nav><!-- End Icons Navigation -->

  </header><!-- End Header -->

  <!-- ======= Sidebar ======= -->
  <aside id="sidebar" class="sidebar">

    <ul class="sidebar-nav" id="sidebar-nav">

      <li class="nav-item">
        <a class="nav-link " href="index.html">
          <i class="bi bi-grid"></i>
          <span>Dashboard</span>
        </a>
      </li><!-- End Dashboard Nav -->

    </ul>

  </aside><!-- End Sidebar-->

  <main id="main" class="main">

    <div class="pagetitle">
      <h1>Dashboard</h1>
      <nav>
        <ol class="breadcrumb">
          <li class="breadcrumb-item"><a href="index.html">Home</a></li>
          <li class="breadcrumb-item active">Dashboard</li>
        </ol>
      </nav>
    </div><!-- End Page Title -->

    <section class="section dashboard">
      

        <!-- Left side columns -->
        <div class="col-lg-10">
          <div class="row">

            <!-- Products Card -->
            <div class="col-xxl-4 col-md-6">
              <div class="card info-card sales-card">

                <div class="filter">
                  <a class="icon" href="#" data-bs-toggle="dropdown"><i class="bi bi-three-dots"></i></a>
                  <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow">
                    <li class="dropdown-header text-start">
                      <h6>Modify</h6>
                    </li>
                    
                    <li><a class="dropdown-item" href="#">Show All</a></li>
                    <li> <a  class="dropdown-item" data-bs-toggle="modal" data-bs-target="#addProducts">Add New</a></li>
                    <li><a class="dropdown-item" data-bs-toggle="modal" data-bs-target="#updateProducts">Update Status</a></li>
                    
                  </ul>
                </div>

                <div class="card-body">
                  <h5 class="card-title">Products </h5>

                  <div class="d-flex align-items-center">
                    <div class="card-icon rounded-circle d-flex align-items-center justify-content-center">
                      <i class="bi bi-cart"></i>
                    </div>
                    <div class="ps-3">
                      <h6>145 </h6>
                      <span class="text-muted small pt-2 ps-1">Products in total</span>
                    </div>
                  </div>
                </div>

              </div>
            </div><!-- End Sales Card -->
            <!--  -->
            
            <!-- Products Modals -->

            <div class="modal fade" id="addProducts" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <h1 class="modal-title fs-5" id="staticBackdropLabel">Modal title</h1>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                  </div>
                  <div class="modal-body">
                    <form action="addProducts" method="post">
                      <div class="row mb-3">
                        <label for="ProductName" class="col-md-4 col-lg-3 col-form-label">Product Name</label>
                        <div class="col-md-8 col-lg-9">
                          <input name="ProductName" type="text" class="form-control" id="ProductName"  placeholder="Enter Product Name">
                        </div>
                      </div>
                      <div class="row mb-3">
                        <label for="ProductPrice" class="col-md-4 col-lg-3 col-form-label">Product Price</label>
                        <div class="col-md-8 col-lg-9">
                          <input name="ProductPrice" type="text" class="form-control" id="ProductPrice"  placeholder="Enter Product Price">
                        </div>
                      </div>
                      <div class="row mb-3">
                        <label for="ProductQuantity" class="col-md-4 col-lg-3 col-form-label">Product Quantity</label>
                        <div class="col-md-8 col-lg-9">
                          <input name="ProductQuantity" type="number" class="form-control" id="ProductQuantity"  placeholder="Enter Product Quantity">
                        </div>
                      </div>
                      <div class="row mb-3">
                        <label for="Product Status" class="col-md-4 col-lg-3 col-form-label">Product Status</label>
                        <div class="col-md-8 col-lg-9">
                          <select class="form-select" aria-label="Default select example" name="ProductStatus">
                            <option selected>Select Product Status</option>
                            <option value="Available">Available</option>
                            <option value="Not Available">Not Available</option>
                            
                          </select>
                        </div>
                      </div>
                      <div class="row mb-3">
                        <label for="ProductCategory" class="col-md-4 col-lg-3 col-form-label">Product Category</label>
                        <div class="col-md-8 col-lg-9">
                          <select class="form-select" aria-label="Default select example" name="ProductCategory">
                            <option selected>Select Product Category</option>
                            <option value="Men">Men</option>
                            <option value="Women">Women</option>
                            <option value="Kids">Kids</option>
                          </select>
                        </div>
                      </div>

                      <div class="row mb-3">
                        <label for="ProductName" class="col-md-4 col-lg-3 col-form-label">Product Description</label>
                        <div class="col-md-8 col-lg-9">
                          <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="ProductDescription"></textarea>
                        </div>
                      </div>

                      <div class="row mb-3">
                        <label for="ProductName" class="col-md-4 col-lg-3 col-form-label">Product Image</label>
                        <div class="col-md-8 col-lg-9">
                          <input class="form-control" type="file" id="formFile" name="ProductImage">
                        </div>
                      </div>
                      <button type="submit" class="btn btn-primary mt-3 mb-3">Add Product</button>
                    </form>
                  </div>
                  
                </div>
              </div>
            </div>

            <div class="modal fade" id="updateProducts" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <h1 class="modal-title fs-5" id="staticBackdropLabel">Modal title</h1>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                  </div>
                  <div class="modal-body">
                    <form action="updateProducts" method="post">
                      <div class="row mb-3">
                        <label for="ProductName" class="col-md-4 col-lg-3 col-form-label">Product Name</label>
                        <div class="col-md-8 col-lg-9">
                          <input name="ProductName" type="text" class="form-control" id="ProductName"  placeholder="Enter Product Name">
                        </div>
                      </div>
                      <div class="row mb-3">
                        <label for="ProductQuantity" class="col-md-4 col-lg-3 col-form-label">Product Quantity</label>
                        <div class="col-md-8 col-lg-9">
                          <input name="ProductQuantity" type="number" class="form-control" id="ProductQuantity"  placeholder="Enter Product Quantity">
                        </div>
                      </div>
                      <div class="row mb-3">
                        <label for="Product Status" class="col-md-4 col-lg-3 col-form-label">Product Status</label>
                        <div class="col-md-8 col-lg-9">
                          <select class="form-select" aria-label="Default select example">
                            <option selected>Select Product Status</option>
                            <option value="Available">Available</option>
                            <option value="Not Available">Not Available</option>
                            
                          </select>
                        </div>
                      </div>
                      <button type="submit" class="btn btn-primary mt-3 mb-3">Add Product</button>
                    </form>
                  </div>
                  
                </div>
              </div>
            </div>
           
            <!-- Products Modal   -->
            <!-- Revenue Card -->
            <div class="col-xxl-4 col-md-6">
              <div class="card info-card revenue-card">

                <div class="filter">
                  <a class="icon" href="#" data-bs-toggle="dropdown"><i class="bi bi-three-dots"></i></a>
                  <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow">
                    <li class="dropdown-header text-start">
                      <h6>Modify</h6>
                    </li>

                    <li><a class="dropdown-item" href="#">Add New</a></li>
                    <li><a class="dropdown-item" href="#">Update</a></li>
                    
                  </ul>
                </div>

                <div class="card-body">
                  <h5 class="card-title">Orders</h5>

                  <div class="d-flex align-items-center">
                    <div class="card-icon rounded-circle d-flex align-items-center justify-content-center">
                      <i class="bi bi-bag"></i>
                    </div>
                    <div class="ps-3">
                      <h6>264</h6>
                      <span class="text-muted small pt-2 ps-1">Orders in total</span>

                    </div>
                  </div>
                </div>

              </div>
            </div><!-- End Revenue Card -->

            <!-- Customers Card -->
            <div class="col-xxl-4 col-xl-12">

              <div class="card info-card customers-card">

                <div class="filter">
                  <a class="icon" href="#" data-bs-toggle="dropdown"><i class="bi bi-three-dots"></i></a>
                  <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow">
                    <li class="dropdown-header text-start">
                      <h6>Modify</h6>
                    </li>

                    <li><a class="dropdown-item" href="#">Add New</a></li>
                    <li><a class="dropdown-item" href="#">Update</a></li>
                    
                  </ul>
                </div>

                <div class="card-body">
                  <h5 class="card-title">Customers</h5>

                  <div class="d-flex align-items-center">
                    <div class="card-icon rounded-circle d-flex align-items-center justify-content-center">
                      <i class="bi bi-people"></i>
                    </div>
                    <div class="ps-3">
                      <h6>160</h6>
                      <span class="text-muted small pt-2 ps-1">Customers in total</span>

                    </div>
                  </div>

                </div>
              </div>

            </div><!-- End Customers Card -->

            <!-- Recent Sales -->
            <div class="col-12">
              <div class="card recent-sales overflow-auto">

                <div class="filter">
                  <a class="icon" href="#" data-bs-toggle="dropdown"><i class="bi bi-three-dots"></i></a>
                  <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow">
                    <li class="dropdown-header text-start">
                      <h6>Filter</h6>
                    </li>

                    <li><a class="dropdown-item" href="#">Today</a></li>
                    <li><a class="dropdown-item" href="#">This Month</a></li>
                    <li><a class="dropdown-item" href="#">This Year</a></li>
                  </ul>
                </div>
				<!--  Orders -->
				<div class="col-12">
              <div class="card top-selling overflow-auto">

                <div class="card-body pb-0">
                  <h5 class="card-title">Orders</span></h5>

                  <table class="table table-borderless">
                    <thead>
                      <tr>
                        <th scope="col">Order ID</th>
                        <th scope="col">Customer</th>
                        <th scope="col">Product</th>
                        <th scope="col">Price</th>
                        <th scope="col">Status</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <th scope="row"><a href="#">#2457</a></th>
                        <td>Brandon Jacob</td>
                        <td><a href="#" class="text-primary">At praesentium minu</a></td>
                        <td>$64</td>
                        <td><span class="badge bg-success">Approved</span></td>
                      </tr>
                      <tr>
                        <th scope="row"><a href="#">#2147</a></th>
                        <td>Bridie Kessler</td>
                        <td><a href="#" class="text-primary">Blanditiis dolor omnis similique</a></td>
                        <td>$47</td>
                        <td><span class="badge bg-warning">Pending</span></td>
                      </tr>
                      <tr>
                        <th scope="row"><a href="#">#2049</a></th>
                        <td>Ashleigh Langosh</td>
                        <td><a href="#" class="text-primary">At recusandae consectetur</a></td>
                        <td>$147</td>
                        <td><span class="badge bg-success">Approved</span></td>
                      </tr>
                      <tr>
                        <th scope="row"><a href="#">#2644</a></th>
                        <td>Angus Grady</td>
                        <td><a href="#" class="text-primar">Ut voluptatem id earum et</a></td>
                        <td>$67</td>
                        <td><span class="badge bg-danger">Rejected</span></td>
                      </tr>
                      <tr>
                        <th scope="row"><a href="#">#2644</a></th>
                        <td>Raheem Lehner</td>
                        <td><a href="#" class="text-primary">Sunt similique distinctio</a></td>
                        <td>$165</td>
                        <td><span class="badge bg-success">Approved</span></td>
                      </tr>
                    </tbody>
                  </table>

                </div>

              </div>
            </div>
                <!-- End Recent Sales -->

            <!-- Top Selling -->
            <div class="col-12">
              <div class="card top-selling overflow-auto">

                <div class="card-body pb-0">
                  <h5 class="card-title">Products</span></h5>

                  <table class="table table-borderless">
                    <thead>
                      <tr>
                        <th scope="col">Preview</th>
                        <th scope="col">Product</th>
                        <th scope="col">Price</th>
                        <th scope="col">Quantity</th>
                        <th scope="col">Status</th>
                      </tr>
                    </thead>
                    
                    <tbody>
                   
                   <%
                   		BookDao bookdao = new BookDao();
                        Book book = new Book();
                   		List<Book> list = bookdao.findAll();
                   		for(Book b : list){
                   			if(b.getStatus().equals ("Available")){
                   		%>
                   			
                   			<tr class="">
                        		<th scope="row "><a href="#"><img src="images/<%=b.getImage() %>" alt=""></a></th>
                        			<td><a href="#" class="text-primary fw-bold"><%=b.getBookname() %></a></td>
                        			<td><%=b.getPrice() %></td>
                        			<td class="fw-bold"><%=b.getQuantity() %></td>
                        			<td class="badge bg-success mystatus">Available</td>
                      			</tr>
                		 <%} else{ %>
                		 
                		 	<tr>
                        		<th scope="row"><a href="#"><img src="images/<%=b.getImage() %>" alt=""></a></th>
                        			<td><a href="#" class="text-primary fw-bold"><%=b.getBookname() %></a></td>
                        			<td><%=b.getPrice() %></td>
                        			<td class="fw-bold"><%=b.getQuantity() %></td>
                        			<td class="badge bg-danger ">Not Available</td>
                      			</tr>
                   			
                   		<% }
                   		}
                   %>
				
				
                      
                  		
                     
                    </tbody>
                  </table>

                </div>

              </div>
            </div><!-- End Top Selling -->

          </div>
        </div>
       
    
    </section>

  </main><!-- End #main -->

  <!-- ======= Footer ======= -->
  <footer id="footer" class="footer">
    <div class="copyright">
      &copy; Copyright <strong><span>Book Town</span></strong>. All Rights Reserved
    </div>
  </footer><!-- End Footer -->

  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

  <!-- Vendor JS Files -->
  <script src="assets/vendor/apexcharts/apexcharts.min.js"></script>
  <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="assets/vendor/chart.js/chart.umd.js"></script>
  <script src="assets/vendor/echarts/echarts.min.js"></script>
  <script src="assets/vendor/quill/quill.min.js"></script>
  <script src="assets/vendor/simple-datatables/simple-datatables.js"></script>
  <script src="assets/vendor/tinymce/tinymce.min.js"></script>
  <script src="assets/vendor/php-email-form/validate.js"></script>

  <!-- Template Main JS File -->
  <script src="assets/js/main.js"></script>

</body>

</html>