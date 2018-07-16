<%@page import="com.bmq.vn.service.CtbProductLocalServiceUtil"%>
<%@page import="com.bmq.vn.service.CtbStoreLocalServiceUtil"%>
<%@page import="com.bmq.vn.service.CtbStoreTypeLocalServiceUtil"%>
<%@page import="com.bmq.vn.model.CtbStore"%>
<%@page import="java.util.List"%>
<%@page import="com.bmq.vn.service.CtbReasonLocalServiceUtil"%>
<%@page import="com.bmq.vn.model.CtbReason"%>
<%@ include file="/init.jsp" %>

<%@ page contentType="text/html" pageEncoding="UTF-8" %>


<portlet:actionURL name="addPointSale" var="addpointsale" >
	<portlet:param name="mvcActionCommand" value="addPointSale" />
</portlet:actionURL>


<div data-reactroot="" class="container BMQCollectMoney">
	<div class="text-center">
		<h1 class="page-title">THU TIỀN ĐIỂM BÁN</h1>
	</div>
	<form action="<%=addpointsale %>" method="post">
		<section>
			<div class="row">
				<div class="col-xs-12 col-sm-3">
					<div class="form-group">
						<label data-required="true" for="" class="form-label">Nhân viên thu tiền:</label>
						<div>
							<p id="_BmqCollectMoney_nhan_vien_thu_tien" 
								name="_BmqCollectMoney_nhan_vien_thu_tien" class="form-control">${user.getFullName()}</p>
						</div>
					</div>
				</div>
				<div class="col-xs-12 col-sm-3">
					<div class="form-group">
						<label data-required="true" for="" class="form-label">Thời gian:</label>
						<div>
							<input id="_BmqCollectMoney_date_collect"
								class="form-control" name="_BmqCollectMoney_date_collect"
								value="${dateTool.format("yyyyMMdd", $dateTool.getDate(), $locale)}">
						</div>
					</div>
				</div>
			</div>
		</section>
		<section>	
			<h4 class="form-section">Thông tin chi tiết</h4>		
			<div class="row">
				<div class="col-xs-12 col-sm-7">
					<div class="form-group">
						<div class="col-xs-12 col-sm-3" style="padding:10px 0 10px 0; text-align:right">
							<label data-required="true" for="" class="form-label">Đại lý:</label>
						</div>
						<div class="col-xs-12 col-sm-8">
							<aui:select name="moneyCollectionStoreId" label="">
								<c:forEach items="<%=CtbStoreLocalServiceUtil.getCtbStores(0, 50)%>"var="stores" > 
							    	<aui:option value="${stores.getStore_id()}">${stores.getStore_name()}</aui:option>
							    </c:forEach>
							</aui:select>
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-12 col-sm-3" style="padding:10px 0 10px 0; text-align:right">
							<label data-required="true" for="" class="form-label">Sản phẩm:</label>
						</div>
						<div class="col-xs-12 col-sm-8">
							<aui:select name="StoreInfoProductId" label="">
								<c:forEach items="<%=CtbProductLocalServiceUtil.getCtbProducts(0, 50)%>"var="products" > 
							    	<aui:option value="${products.getProduct_id()}">${products.getProduct_name()}</aui:option>
							    </c:forEach>
							</aui:select>
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-12 col-sm-3" style="padding:10px 0 10px 0; text-align:right">
							<label data-required="true" for="" class="form-label">Tiền mặt:</label>
						</div>
						<div class="col-xs-12 col-sm-8">
							<aui:input id="_BmqCollectMoney_ma_dai_ly" class="form-control field-required field-digits"
								name="moneyCollectionAmount" maxlength="100" value=""
								type="text" label="">
							</aui:input>
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-12 col-sm-3" style="padding:10px 0 10px 0; text-align:right">
							<label class="form-label">Tiền tài khoản:</label>
						</div>
						<div class="col-xs-12 col-sm-8">
							<aui:input id="_BmqCollectMoney_ma_dai_ly" class="form-control"
								name="moneyCollectionTransferAmount" maxlength="100" value=""
								type="text" label=""/>
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-12 col-sm-3" style="padding:10px 0 10px 0; text-align:right">
							<label data-required="true" for="" class="form-label">Giảm giá:</label>
						</div>
						<div class="col-xs-12 col-sm-8">
							<aui:input id="_BmqCollectMoney_ma_dai_ly" class="form-control"
								name="moneyCollectionDiscountAmount" maxlength="100" value=""
								type="text" label=""/>
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-12 col-sm-3" style="padding:10px 0 10px 0; text-align:right">
							<label class="form-label">Chi phí:</label>
						</div>
						<div class="col-xs-12 col-sm-8">
							<aui:input id="_BmqCollectMoney_ma_dai_ly" class="form-control"
								name="moneyCollectionCost" maxlength="100" value=""
								type="text" label=""/>
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-12 col-sm-3" style="padding:10px 0 10px 0; text-align:right">
							<label data-required="true" for="" class="form-label">Tồn đầu:</label>
						</div>
						<div class="col-xs-12 col-sm-8">
							<aui:input id="_BmqCollectMoney_ma_dai_ly" class="form-control"
								name="StoreInfoFistQuantity" maxlength="100" value=""
								type="text" label=""/>
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-12 col-sm-3" style="padding:10px 0 10px 0; text-align:right">
							<label data-required="true" for="" class="form-label">Nhập:</label>
						</div>
						<div class="col-xs-12 col-sm-8">
							<aui:input id="_BmqCollectMoney_ma_dai_ly" class="form-control"
								name="StoreInfoImportQuantity" maxlength="100" value=""
								type="text" label=""/>
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-12 col-sm-3" style="padding:10px 0 10px 0; text-align:right">
							<label class="form-label">Nhập phát sinh (nếu có):</label>
						</div>
						<div class="col-xs-12 col-sm-8">
							<aui:input id="_BmqCollectMoney_ma_dai_ly" class="form-control"
								name="StoreInfoArisingQuantity" maxlength="100" value=""
								type="text" label=""/>
						</div>
					</div>
					<div class="form-group">
						<div class="col-xs-12 col-sm-3" style="padding:10px 0 10px 0; text-align:right">
							<label data-required="true" for="" class="form-label">Số bán:</label>
						</div>
						<div class="col-xs-12 col-sm-8">
							<aui:input id="_BmqCollectMoney_ma_dai_ly" class="form-control"
								name="StoreInfoPayQuantity" maxlength="100" value=""
								type="text" label=""/>
						</div>
					</div>	
					<div class="form-group">
						<div class="col-xs-12 col-sm-3" style="padding:10px 0 10px 0; text-align:right">
							<label data-required="true" for="" class="form-label">Tồn cuối:</label>
						</div>
						<div class="col-xs-12 col-sm-8">
							<aui:input id="_BmqCollectMoney_ma_dai_ly" class="form-control"
								name="StoreInfoLastQuantity" maxlength="100" value=""
								type="text" label=""/>
						</div>
					</div>				
				</div>				
			</div>
			
				
		<section>
			<div class="row">
				<div class="col-xs-12 col-sm-6">
					<div class="form-group">
						<label for="" class="form-label">Ghi chú:</label>
						<div>
							<aui:input id="_BmqCollectMoney_ghi_chu" class="form-control"
								name="moneyCollectionNote" maxlength="100" value=""
								type="text" label=""/>
							<aui:input 
								name="moneyCollectionUserName" maxlength="100" value="${user.getEmailAddress()}"
								type="hidden"/>
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
</style></p>