<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->

<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->

<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->

<!-- BEGIN HEAD -->

<head>

	<meta charset="utf-8" />

	<title>修改商品信息页面</title>

	<meta content="width=device-width, initial-scale=1.0" name="viewport" />

	<meta content="" name="description" />

	<meta content="" name="author" />

	<!-- BEGIN GLOBAL MANDATORY STYLES -->

	<jsp:include page="pageResources/css.jsp"></jsp:include>

	<!-- END GLOBAL MANDATORY STYLES -->

	<!-- BEGIN PAGE LEVEL STYLES -->

	<link rel="stylesheet" type="text/css" href="media/css/select2_metro.css" />

	<link rel="stylesheet" href="media/css/DT_bootstrap.css" />

	<!-- END PAGE LEVEL STYLES -->

	<link rel="shortcut icon" href="media/image/favicon.ico" />

</head>

<!-- END HEAD -->

<!-- BEGIN BODY -->

<body class="page-header-fixed">

	

	<jsp:include page="pageResources/head.jsp"></jsp:include>

	<!-- BEGIN CONTAINER -->

	<div class="page-container row-fluid">

		<!-- BEGIN SIDEBAR -->

		<div class="page-sidebar nav-collapse collapse">

			<jsp:include page="pageResources/nav.jsp"></jsp:include>   

		</div>

		<!-- END SIDEBAR -->

		<!-- BEGIN PAGE -->

		<div class="page-content">

			<!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->

			<div id="portlet-config" class="modal hide">

				<div class="modal-header">

					<button data-dismiss="modal" class="close" type="button"></button>

					<h3>portlet Settings</h3>

				</div>

				<div class="modal-body">

					<p>Here will be a configuration form</p>

				</div>

			</div>

			<!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->

			<!-- BEGIN PAGE CONTAINER-->        

			<div class="container-fluid">

				<!-- BEGIN PAGE HEADER-->

				<jsp:include page="pageResources/pagehead.jsp"></jsp:include>

				<!-- END PAGE HEADER-->

			
				<div class="portlet-body form">

					<form action="updateGoods.do" method="post" class="horizontal-form">
                        <input type="hidden" name="do" value="edit">

						<div class="row-fluid">

							<div class="span12 ">

								<div class="control-group">

									<label class="control-label">商品名称</label>

									<div class="controls">

										<input type="text" name="name" value="${goods.name }"  class="m-wrap span12">

									</div>

								</div>

							</div>
					

						</div>
						
						<div class="row-fluid">

							<div class="span12 ">

								<div class="control-group">

									<label class="control-label">类型</label>

									<div class="controls">

										<input type="text" name="type" value="${goods.type }" class="m-wrap span12">
									</div>
								</div>
							</div>
						</div>
						<div class="row-fluid">

							<div class="span12 ">

								<div class="control-group">

									<label class="control-label">单价</label>

									<div class="controls">

										<input type="text"  name="price" value="${goods.price }" class="m-wrap span12">
                                        <input type="hidden"  name="id" value="${goods.id }">
									</div>

								</div>

							</div>
					

						</div>
						
					<div class="row-fluid">

							<div class="span12 ">

								<div class="control-group">

									<label class="control-label">库存数量</label>

									<div class="controls">

										<input type="text" name="number" value="${goods.number }" class="m-wrap span12">
									</div>
								</div>
							</div>
					</div>



						<div class="form-actions">

							<button type="submit" class="btn blue">
								<i class="icon-ok"></i> 提交
							</button>

							<button type="button" class="btn" >取消</button>

						</div>

					</form>
				</div>


			</div>

			<!-- END PAGE CONTAINER-->

		</div>

		<!-- END PAGE -->

	</div>

	<!-- END CONTAINER -->

	<jsp:include page="pageResources/foot.jsp"></jsp:include>

	<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->

	<!-- BEGIN CORE PLUGINS -->
	
   <jsp:include page="pageResources/js.jsp"></jsp:include>
 
	<script>

		jQuery(document).ready(function() {       

		   App.init();

		   TableEditable.init();

		});

	</script>

</body>

<!-- END BODY -->

</html>