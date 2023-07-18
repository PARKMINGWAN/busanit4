<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp"%>
<body>
	<div class="hero page-inner overlay" style="background-image: url('/resources/images/hero_bg_1.jpg');">

		<div class="container">
			<div class="row justify-content-center align-items-center">
				<div class="col-lg-9 text-center mt-5">
					<h1 class="heading" data-aos="fade-up">숙소 추가</h1>

					<nav aria-label="breadcrumb" data-aos="fade-up" data-aos-delay="200">
						<ol class="breadcrumb text-center justify-content-center">
							<li class="breadcrumb-item "><a href="/">Home</a></li>
							<li class="breadcrumb-item active text-white-50" aria-current="page">숙소 추가</li>
						</ol>
					</nav>
				</div>
			</div>
		</div>
	</div>

<div class="section">
<div class="container">
	<form action="accommodationInsert" method="post" enctype="multipart/form-data">
		<div class="form-group mb-3 mt-3">
			<label for="title">숙소 :</label> 
				<input type="text" class="form-control" id="title" 
					placeholder="Enter title" name="title">
		</div>
		
		<div class="form-group mb-3 mt-3">
			<label for="buisnessman">사업자:</label> 
			<input type="text" class="form-control" id="buisnessman" 
			placeholder="Enter buisnessman" name="buisnessman" />
		</div>
		
		<div class="form-group mb-3 mt-3">
			<label for="location">위치:</label> 
			<input type="text" class="form-control" id="location" 
			placeholder="Enter location" name="location" />
		</div>
		
		<div class="form-group mb-3 mt-3">
			<label for="upload">파일:</label> 
			<input type="file" class="form-control" id="upload"  
				placeholder="Enter File" name="upload" >
		</div>
		
		<div class="form-group mb-3 mt-3">
			<label for="upload">파일:</label> 
			<input type="file" class="form-control" id="upload"  
				placeholder="Enter File" name="upload" >
		</div>
		
		<div class="form-group mb-3 mt-3">
			<label for="upload">파일:</label> 
			<input type="file" class="form-control" id="upload"  
				placeholder="Enter File" name="upload" >
		</div>
		
		<div class="form-group mb-3 mt-3">
			<label class="form-check-label" for="radio1"></label>
  				<input type="radio" class="form-check-input" id="dosmetic" name="optradio" checked> 국내 숙소 
	  			<input type="radio" class="form-check-input" id="oversea" name="optradio" > 해외 숙소 
  		</div>


		<button type="submit" class="btn btn-primary btn-sm">글쓰기</button>
	</form>
</div>
</div>
</body>
<%@ include file="include/footer.jsp"%>