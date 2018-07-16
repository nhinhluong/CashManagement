<%@ include file="/init.jsp" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>

<portlet:actionURL name="/collect_from_branch" var="collect_from_branch">
	<portlet:param name="mvcActionCommand" value="/collect_from_branch" />
</portlet:actionURL>
<portlet:renderURL var="redirectURL">
	<portlet:param name="mvcPath" value="/" />
	<portlet:param name="add-process-action-success-action" value="false" />
</portlet:renderURL>
<div data-reactroot="" class="container BMQCollectMoney">
	<div class="text-center">
		<h1 class="page-title">THU TIỀN ĐIỂM BÁN</h1>
	</div>
	<form action="" method="post" enctype="multipart/form-data">
		<aui:input type="hidden" name="redirect" value="" />
		<section>
			<div class="row">
				<div class="col-xs-12 col-sm-3">
					<div class="form-group">
						<label data-required="true" for="" class="form-label">Nhân viên thu tiền:</label>
						<div>
							<p id="_BmqCollectMoney_nhan_vien_thu_tien" 
								name="_BmqCollectMoney_nhan_vien_thu_tien" class="form-control">Trần Văn A</p>
						</div>
					</div>
				</div>
				<div class="col-xs-12 col-sm-2">
					<div class="form-group">
						<label data-required="true" for="" class="form-label">Thời gian:</label>
						<div>
							<input id="_BmqCollectMoney_date_collect"
								class="form-control" name="_BmqCollectMoney_date_collect"
								value="">
						</div>
					</div>
				</div>
			</div>
		</section>
		<section>	
			<h4 class="form-section">Thông tin chi tiết</h4>		
			<div class="row">				
				<div class="col-xs-12 col-sm-2">
					<div class="form-group">
						<label data-required="true" for="" class="form-label">Chi nhánh:</label>
						<div>
							<p id="_BmqCollectMoney_chi_nhanh" 
								name="_BmqCollectMoney_chi_nhanh" class="form-control">Đại Lý 1</p>
						</div>
					</div>
				</div>
				<div class="col-xs-12 col-sm-2">
					<div class="form-group">
						<label data-required="true" for="" class="form-label">Số tiền:</label>
						<div>
							<input id="_BmqCollectMoney_so_tien_ban" class="form-control"
								name="_BmqCollectMoney_so_tien_ban" maxlength="100" value=""
								type="text">
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-12 col-sm-2">
					<div class="form-group">
						<label data-required="true" for="" class="form-label">Tồn đầu:</label>
						<div>
							<input id="_BmqCollectMoney_ton_dau" class="form-control"
								name="_BmqCollectMoney_ton_dau" maxlength="100" value=""
								type="text">
						</div>
					</div>
				</div>
				<div class="col-xs-12 col-sm-2">
					<div class="form-group">
						<label data-required="true" for="" class="form-label">Số lượng nhập:</label>
						<div>
							<input id="_BmqCollectMoney_so_luong_nhap" class="form-control"
								name="_BmqCollectMoney_so_luong_nhap" maxlength="100" value=""
								type="text">
						</div>
					</div>
				</div>
				<div class="col-xs-12 col-sm-2">
					<div class="form-group">
						<label for="" class="form-label">Nhập phát sinh (nếu có):</label>
						<div>
							<input id="_BmqCollectMoney_nhap_phat_sinh" class="form-control"
								name="_BmqCollectMoney_nhap_phat_sinh" maxlength="100" value=""
								type="text">
						</div>
					</div>
				</div>
				<div class="col-xs-12 col-sm-2">
					<div class="form-group">
						<label data-required="true" for="" class="form-label">Số lượng bán được:</label>
						<div>
							<input id="_BmqCollectMoney_so_luong_ban" class="form-control"
								name="_BmqCollectMoney_so_luong_ban" maxlength="100" value=""
								type="text">
						</div>
					</div>
				</div>
				<div class="col-xs-12 col-sm-2">
					<div class="form-group">
						<label data-required="true" for="" class="form-label">Tồn cuối:</label>
						<div>
							<input id="_BmqCollectMoney_ton_cuoi" class="form-control"
								name="_BmqCollectMoney_ton_cuoi" maxlength="100" value=""
								type="text">
						</div>
					</div>
				</div>
				<div class="col-xs-12 col-sm-2">
					<div class="form-group">
						<label data-required="true" for="" class="form-label">Ghi chú:</label>
						<div>
							<input id="_BmqCollectMoney_ghi_chu" class="form-control"
								name="_BmqCollectMoney_ghi_chu" maxlength="100" value=""
								type="text">
						</div>
					</div>
				</div>
			</div>						
		</section>
		
		<section>			
			<div class="row">				
				<div class="col-xs-12 col-sm-2">
					<div class="form-group">
						<label data-required="true" for="" class="form-label">Chi nhánh:</label>
						<div>
							<p id="_BmqCollectMoney_chi_nhanh" 
								name="_BmqCollectMoney_chi_nhanh" class="form-control">Đại Lý 2</p>
						</div>
					</div>
				</div>
				<div class="col-xs-12 col-sm-2">
					<div class="form-group">
						<label data-required="true" for="" class="form-label">Số tiền:</label>
						<div>
							<input id="_BmqCollectMoney_so_tien_ban" class="form-control"
								name="_BmqCollectMoney_so_tien_ban" maxlength="100" value=""
								type="text">
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-12 col-sm-2">
					<div class="form-group">
						<label data-required="true" for="" class="form-label">Tồn đầu:</label>
						<div>
							<input id="_BmqCollectMoney_ton_dau" class="form-control"
								name="_BmqCollectMoney_ton_dau" maxlength="100" value=""
								type="text">
						</div>
					</div>
				</div>
				<div class="col-xs-12 col-sm-2">
					<div class="form-group">
						<label data-required="true" for="" class="form-label">Số lượng nhập:</label>
						<div>
							<input id="_BmqCollectMoney_so_luong_nhap" class="form-control"
								name="_BmqCollectMoney_so_luong_nhap" maxlength="100" value=""
								type="text">
						</div>
					</div>
				</div>
				<div class="col-xs-12 col-sm-2">
					<div class="form-group">
						<label for="" class="form-label">Nhập phát sinh (nếu có):</label>
						<div>
							<input id="_BmqCollectMoney_nhap_phat_sinh" class="form-control"
								name="_BmqCollectMoney_nhap_phat_sinh" maxlength="100" value=""
								type="text">
						</div>
					</div>
				</div>
				<div class="col-xs-12 col-sm-2">
					<div class="form-group">
						<label data-required="true" for="" class="form-label">Số lượng bán được:</label>
						<div>
							<input id="_BmqCollectMoney_so_luong_ban" class="form-control"
								name="_BmqCollectMoney_so_luong_ban" maxlength="100" value=""
								type="text">
						</div>
					</div>
				</div>
				<div class="col-xs-12 col-sm-2">
					<div class="form-group">
						<label data-required="true" for="" class="form-label">Tồn cuối:</label>
						<div>
							<input id="_BmqCollectMoney_ton_cuoi" class="form-control"
								name="_BmqCollectMoney_ton_cuoi" maxlength="100" value=""
								type="text">
						</div>
					</div>
				</div>
				<div class="col-xs-12 col-sm-2">
					<div class="form-group">
						<label data-required="true" for="" class="form-label">Ghi chú:</label>
						<div>
							<input id="_BmqCollectMoney_ghi_chu" class="form-control"
								name="_BmqCollectMoney_ghi_chu" maxlength="100" value=""
								type="text">
						</div>
					</div>
				</div>
			</div>			
		</section>
		
		<section>
			<div class="row">
				<div class="col-xs-12 col-sm-2">
					<div class="form-group">
						<label for="" class="form-label summary">Tổng cộng:</label>
						<div>
							<p id="_BmqCollectMoney_sum_money" class="form-control"
								name="_BmqCollectMoney_sum_money" >1980000</p>
						</div>
					</div>
				</div>
			</div>
		</section>
		<div class="text-left buttons">
			<button type="submit" class="btn btn-warning"
				style="margin-left: 10px;">Lưu</button>
		</div>
	</form>
</div>
<script>
	YUI({
		lang : 'vi'
	}).use('aui-datepicker', 'aui-toggler', function(Y) {
		var datepicker1 = new Y.DatePicker({
			trigger : '#_BmqCollectMoney_date_collect',
			mask : '%d/%m/%Y',
			popover : {
				zIndex : 1
			}
		});
	});

</script>
<style>
.form-control {
	  width: 100%;
	  height: 34px;
	  padding: 6px 12px;
	  background-color: transparent;
	  border: 1px solid #ccc;
	  border-radius: 4px;
	  -webkit-transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s;
	  -webkit-transition: border-color ease-in-out .15s,-webkit-box-shadow ease-in-out .15s;
	  transition: border-color ease-in-out .15s,-webkit-box-shadow ease-in-out .15s;
	  transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s;
	  transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s,-webkit-box-shadow ease-in-out .15s;
  }
.page-title {
	color: #f7941d;
	text-transform: uppercase;
	font-weight: 300;
	margin-bottom: 40px;
	margin-top: 25px;
	text-align: center;
	font-size: 48px;
}
form {
	margin-top: 40px;
}
form .form-section {
	background-color: #f7941d;
	color: #fff;
	border-radius: 5px;
	display: inline-block;
	padding: 10px 20px;
	margin: 0 0 20px;
	text-transform: uppercase;
}
form section {
	margin-top: 20px;
}
form section+section {
	margin-top: 20px;
	padding-top: 30px;
	border-top: 2px solid #f1f1f1;
}
form .buttons {
	margin-top: 30px;
	margin-bottom: 30px;
}
form label[data-required]::after {
	content: '*';
	color: red;
	margin-left: 5px;
	margin-right: 5px;
}
form label.form-label {
	font-weight: 500;
}
form label.form-label.summary {
	color: #ff424e;
}
form .default-disabled label {
	opacity: .7;
}
.form-group {
	position: relative;
	margin-bottom: 20px
}

.form-group .error-text {
	color: #ff424e;
	font-size: 12px;
	position: absolute;
	top: 100%;
	margin-top: 2px;
}

#form-group .has-error .form-control {
	border:2px;
	border-color: #ff424e;
}

.form-group .hint {
	margin-bottom: 10px
}
.form-control:focus {
	box-shadow: none;
	color: #f7941d;
	border-color: #f7941d;
}
.BMQCollectMoney {
	font-family: Roboto;
	color: #444;
	background-color: #fff;
	line-height: 1.4;
	font-size: 14px;
}
</style>