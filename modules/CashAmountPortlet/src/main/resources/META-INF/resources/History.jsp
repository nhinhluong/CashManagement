<%@page import="com.bmq.vn.service.SitbMoneyCollectionLocalServiceUtil"%>
<%@page import="com.bmq.vn.service.CtbReasonLocalServiceUtil"%>
<%@page import="com.bmq.vn.model.SitbMoneyCollection"%>
<%@page import="com.bmq.vn.model.CtbReason"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>

<portlet:renderURL var="editEntryURL">
    <portlet:param name="mvcRenderCommandName" value="/hello/edit_entry" />
    <portlet:param name="userNameMail" value="${user.getEmailAddress()}" />
    <portlet:param name="reasonid" value="4" />
</portlet:renderURL>

${user.getEmailAddress()}
<%
SitbMoneyCollection moneycollection=null;
CtbReason reason=null;
List list=SitbMoneyCollectionLocalServiceUtil.getMoneyCollectionAndReason(-1,-1);
%>
<portlet:actionURL name="/collect_from_branch" var="collect_from_branch">
	<portlet:param name="mvcActionCommand" value="/collect_from_branch" />
</portlet:actionURL>



<div data-reactroot="" class="container BMQCollectMoney">
	<div class="text-center">
		<h1 class="page-title">Lịch sử thu tiền</h1>
	</div>
	<form action="<%=collect_from_branch%>" method="get" enctype="multipart/form-data">
		<aui:input type="hidden" name="redirect" value="/" />
		<section>
			<div class="row">
				<div class="col-xs-12 col-sm-3">
					<div class="form-group">
						<label for="" class="form-label">Nhân viên thu tiền:</label>
						<div>
							<p id="_BmqCollectMoney_nhan_vien_thu_tien" 
								name="_BmqCollectMoney_nhan_vien_thu_tien" class="form-control">${user.getFullName()}</p>
						</div>
					</div>
				</div>
				<div class="col-xs-12 col-sm-3">
					<div class="form-group">
						<label for="" class="form-label">Thời gian:</label>
						<div>
							<p id="time"
								class="form-control" ></p>
						</div>
					</div>
				</div>
			</div>
		</section>
		<section>
			<h4 class="form-section">Thông tin chi tiết</h4>	
			<div class="row">
				<table class="table table-bordered col-xs-12 col-sm-12" style="text-align:center;width:100%;">
					<thead >
					    <tr>
					      <th scope="col" class="col-xs-12 col-sm-2" style="text-align:center;font-weight: bold;">Ngày thu</th>
					      <th scope="col" class="col-xs-12 col-sm-2" style="text-align:center;font-weight: bold;">Điểm thu</th>
					      <th scope="col" class="col-xs-12 col-sm-2" style="text-align:center;font-weight: bold;">Loại thu</th>
					      <th scope="col" class="col-xs-12 col-sm-2" style="text-align:center;font-weight: bold;">Số tiền</th>
					      <th scope="col" class="col-xs-12 col-sm-2" style="text-align:center;font-weight: bold;">Ghi chú</th>
					      <th scope="col" class="col-xs-12 col-sm-2" style="text-align:center;font-weight: bold;">Tình trạng</th>
					    </tr>
				    </thead>
				    <tbody>
			    	 <%for(Object object:list){
					       Object[] arrayobject=(Object[])object;
					       moneycollection=(SitbMoneyCollection)arrayobject[0];
					       reason=(CtbReason)arrayobject[1];%>					      				
					    <tr>
					      <td class="col-xs-12 col-sm-2"><%=moneycollection.getCollection_date()%> </td>
					      <td class="col-xs-12 col-sm-2"><%=moneycollection.getStore_name()%></td>
					      <td class="col-xs-12 col-sm-2">				  
					      <%=reason.getReason_name()%>
					      </td>
					      <td class="col-xs-12 col-sm-2"><%=moneycollection.getAmount()%></td>
					      <td class="col-xs-12 col-sm-2"><%=moneycollection.getNote()%></td>					    
					      <td class="col-xs-12 col-sm-2">
							<c:set var = "approval_status" scope = "session" value = "<%=moneycollection.getApproval_status() %>"/>
							<c:if test="${approval_status == 0}">
						      	<c:out value="Chưa duyệt" />
						    </c:if>
						    <c:if test="${approval_status == 1}">
						      	<c:out value="Đã duyệt" />
						    </c:if>
						    <c:if test="${approval_status == 2}">
						      	<c:out value="Từ chối" />
						    </c:if>
						    <c:if test="${approval_status == 3}">
						      	<c:out value="Chỉnh sửa" />
						    </c:if>

						    
					      </td>
					    </tr>	
					    <%} %>				    
					  </tbody>
				</table>
			</div>
		</section>
			<div class="row"> 
			</div>
	</form>
</div>
<script>
function checkTime(i) {
    if (i < 10) {
        i = "0" + i;
    }
    return i;
}

function startTime() {
    var today = new Date();
    var h = today.getHours();
    var m = today.getMinutes();
    var s = today.getSeconds();
    var day = today.getDate();
    var month = today.getMonth()+1;
    var year = today.getFullYear();
    // add a zero in front of numbers<10
    m = checkTime(m);
    s = checkTime(s);
    document.getElementById('time').innerHTML = h + ":" + m + ":" + s+ " "+ day+"/"+month+"/"+year;
    t = setTimeout(function () {
        startTime()
    }, 500);
}
startTime();
</script>
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