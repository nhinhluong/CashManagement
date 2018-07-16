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
<%@page import="com.bmq.vn.service.SitbMoneyCollectionLocalServiceUtil"%>


<portlet:actionURL name="action_update_Invoice" var="action_update_Invoice" >
	<portlet:param name="mvcActionCommand" value="action_update_Invoice" />
</portlet:actionURL>

<form name="fm" action="<%=action_update_Invoice %>" method="post" >
	<section>
			<div class="row">
				<div class="col-xs-12 col-sm-7">
					<div class="form-group">
						<div class="col-xs-12 col-sm-3" style="padding:10px 0 10px 0; text-align:right">
							<label data-required="true" for="" class="form-label">Nhân viên thu tiền:</label>
						</div>
						<div class="col-xs-12 col-sm-8">
							<p id="_BmqCollectMoney_nhan_vien_thu_tien" 
								name="_BmqCollectMoney_nhan_vien_thu_tien" class="form-control"><%=request.getAttribute("collector")%></p>
						</div>
					</div>
				</div>
			</div>
		</section>
    <section>					
		<div class="row">				
			<div class="col-xs-12 col-sm-7">
				<div class="form-group">
						<div class="col-xs-12 col-sm-3" style="padding:10px 0 10px 0; text-align:right">
							<label data-required="true" for="" class="form-label">Ngày thu:</label>
						</div>
						<div class="col-xs-12 col-sm-8">
						<aui:input id="money_Collection_id" 
							name="money_Collection_id" class="form-control"
							value="<%=request.getAttribute("id")%>" label="" type="hidden"/>
						<aui:input id="money_Collection_date" 
							name="money_Collection_date" class="form-control"
							value="<%=request.getAttribute("date")%>" label=""/>
						 
					</div>
				</div>
			</div>
			<div class="col-xs-12 col-sm-7">
				<div class="form-group">
						<div class="col-xs-12 col-sm-3" style="padding:10px 0 10px 0; text-align:right">
							<label data-required="true" for="" class="form-label">Tên đại lý:</label>
						</div>
						<div class="col-xs-12 col-sm-8">
						<aui:input id="money_Collection_store_name" 
							name="money_Collection_store_name" class="form-control"
							value="<%=request.getAttribute("storeName")%>" label=""/>
						 
					</div>
				</div>
			</div>
			<div class="col-xs-12 col-sm-7">
				<div class="form-group">
						<div class="col-xs-12 col-sm-3" style="padding:10px 0 10px 0; text-align:right">
							<label data-required="true" for="" class="form-label">Tiền mặt:</label>
						</div>
						<div class="col-xs-12 col-sm-8">
						<aui:input id="money_Collection_amount" 
							name="money_Collection_amount" class="form-control"
							value="<%=request.getAttribute("amount")%>" label=""/>						 
					</div>
				</div>
			</div>
			<div class="col-xs-12 col-sm-7">
				<div class="form-group">
						<div class="col-xs-12 col-sm-3" style="padding:10px 0 10px 0; text-align:right">
							<label for="" class="form-label">Tiền chuyển khoản:</label>
						</div>
						<div class="col-xs-12 col-sm-8">
						<aui:input id="money_Collection_transfer" 
							name="money_Collection_transfer" class="form-control"
							value="<%=request.getAttribute("transferAmount")%>" label=""/>
						 
					</div>
				</div>
			</div>
			<div class="col-xs-12 col-sm-7">
				<div class="form-group">
						<div class="col-xs-12 col-sm-3" style="padding:10px 0 10px 0; text-align:right">
							<label for="" class="form-label">Giảm giá:</label>
						</div>
						<div class="col-xs-12 col-sm-8">
						<aui:input id="money_Collection_discount" 
							name="money_Collection_discount" class="form-control"
							value="<%=request.getAttribute("discountAmount")%>" label=""/>
						 
					</div>
				</div>
			</div>
			<div class="col-xs-12 col-sm-7">
				<div class="form-group">
						<div class="col-xs-12 col-sm-3" style="padding:10px 0 10px 0; text-align:right">
							<label for="" class="form-label">Chi phí:</label>
						</div>
						<div class="col-xs-12 col-sm-8">
						<aui:input id="money_Collection_cost" 
							name="money_Collection_cost" class="form-control"
							value="<%=request.getAttribute("cost")%>" label=""/>
						 
					</div>
				</div>
			</div>
			<div class="col-xs-12 col-sm-7">
				<div class="form-group">
					<div class="col-xs-12 col-sm-3" style="padding:10px 0 10px 0; text-align:right">
						<label for="" class="form-label">Lý do thu tiền:</label>
					</div>
					<div class="col-xs-12 col-sm-8">
						 <c:set var = "reason" scope = "session" value = "<%=request.getAttribute("reason")%>"/>
							<c:if test="${reason == 1}">
						      	<c:out value="Phí gia nhập" />
						    </c:if>
						    <c:if test="${reason == 2}">
						      	<c:out value="Tiền cọc" />
						    </c:if>
						    <c:if test="${reason == 3}">
						      	<c:out value="Ứng tiền bánh" />
						    </c:if>
						    <c:if test="${reason == 4}">
						      	<c:out value="Thu tiền đại lý" />
						    </c:if>
						    <c:if test="${reason == 5}">
						      	<c:out value="Thu tiền điểm bán" />
						    </c:if>
					</div>
				</div>
			</div>
			<div class="col-xs-12 col-sm-7" style="padding-top: 15px;">
					<div class="form-group">
						<button class="btn" style="margin-left: 10px;background-color:#f7941d;color:#fff;" type="submit">Lưu lại</button>
						<button class="btn btn-primary"  type="reset">Nhập lại</button>
					</div>
			</div>
		</div>		
	</section>
   
</form>


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