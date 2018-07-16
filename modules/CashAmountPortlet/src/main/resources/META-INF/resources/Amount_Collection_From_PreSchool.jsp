<%@page import="com.bmq.vn.service.CtbStoreLocalServiceUtil"%>
<%@page import="com.bmq.vn.service.CtbStoreLocalService"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.text.DateFormat"%>
<%@ page import="java.util.List"%>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@ include file="/init.jsp" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<% %>

<portlet:actionURL name="addPreSchool" var="addPreSchool_url" >
	<portlet:param name="mvcActionCommand" value="addPreSchool" />
</portlet:actionURL>

<div data-reactroot="" class="container BMQCollectMoney">
	<div class="text-center">
		<h1 class="page-title">THU TIỀN TRƯỜNG MẦM MON</h1>
	</div>
	
		<aui:input type="hidden" name="redirect" value="" />
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
		<h4 class="form-section">Thông tin chi tiết</h4>
		
		<c:forEach items="<%=CtbStoreLocalServiceUtil.getCtbStores(0, 50)%>"var="stores" > 
			<form action="<%=addPreSchool_url%>" method="post" id="preschoolForm">									
			<section>					
				<div class="row">				
					<div class="col-xs-12 col-sm-3">
						<div class="form-group">
							<label data-required="true" for="" class="form-label">Tên Trường:</label>
							<div>
								<aui:input 
									name="moneyCollectionStoreName" maxlength="100" value="${stores.getStore_name()}"
									 type="text" label=""/>
								
							</div>
						</div>
					</div>
					<div class="col-xs-12 col-sm-3">
						<div class="form-group">
							<label data-required="true" for="moneyCollectionAmount" class="form-label">Số tiền:</label>
							<div>
								<aui:input id="moneyCollectionAmount" class="form-control"
									name="moneyCollectionAmount" maxlength="100" value=""
									type="text" label=""/>
							</div>
						</div>
					</div>
					<div class="col-xs-12 col-sm-3">
						<div class="form-group">
							<label data-required="true" for="" class="form-label">Ghi chú:</label>
							<div>
								<aui:input id="_BmqCollectMoney_ghi_chu" class="form-control"
									name="moneyCollectionNote" maxlength="100" value=""
									type="text" label=""/>
									
								<aui:input 
									name="moneyCollectionUserName" maxlength="100" value="${user.getEmailAddress()}"
									 type="hidden"/>
								<aui:input 
									name="moneyCollectionStoreCode" maxlength="100" value="${stores.getStore_code()}"
									 type="hidden"/>
								<aui:input 
									name="moneyCollectionStoreTypeId" maxlength="100" value="${stores.getStore_type_id()}"
									 type="hidden"/>
								
												
							</div>
						</div>
					</div>
					<div class="col-xs-12 col-sm-3" style="padding-top: 15px;">
							<div class="form-group">
								<input class="btn " style="margin-left: 10px;background-color:#f7941d;color:#fff;" type="submit" value="Lưu">
  								<input class="btn btn-primary" type="reset" value="Nhập lại">
							</div>
					</div>
				</div>		
			</section>
			</form>
		</c:forEach>		
	
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
	// validation form
	YUI().use(
	  'aui-form-validator',
	  function(Y) {
	    new Y.FormValidator(
	      {
	        boundingBox: '#preschoolForm'
	      }
	    );
	  }
	);
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
.form-section {
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