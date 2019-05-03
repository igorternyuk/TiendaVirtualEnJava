<div class="container">

	<div class="row">

		<!-- Would be to display sidebar -->
		<div class="col-md-3">

			<%@include file="./shared/sidebar.jsp"%>

		</div>
		
		<!-- to display the actual products -->
		<div class="col-md-9">
			<!-- Breadcrumb component starts here-->
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userClickedAllProducts == true}">
						<script>
							window.categoryId = '';
						</script>
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All Products</li>
						</ol>
					</c:if>
					<c:if test="${userClickedCategoryProducts == true}">
						<script>
							window.categoryId = '${category.id}';
						</script>

						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.name}</li>
						</ol>
					</c:if>
				</div>

			<!-- Breadcrumb component ends here-->
			</div>
		</div>
	</div>

	<div class="row">

		<div class="col-xs-12">
			<!-- Aqui hay que insertar la tabla de productos -->
		</div>
	</div>
</div>