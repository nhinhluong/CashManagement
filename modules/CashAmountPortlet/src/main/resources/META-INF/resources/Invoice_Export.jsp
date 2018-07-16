<%@page import="com.bmq.vn.service.SitbMoneyCollectionLocalServiceUtil"%>
<%@ include file="/init.jsp" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<% %>

<portlet:actionURL name="Export" var="export">
	<portlet:param name="mvcActionCommand" value="Export" />
</portlet:actionURL>
<portlet:actionURL name="Refusal" var="refusal">
	<portlet:param name="mvcActionCommand" value="Refusal" />
</portlet:actionURL>
<portlet:actionURL name="editInvoice" var="editInvoice">
	<portlet:param name="mvcActionCommand" value="editInvoice" />
</portlet:actionURL>


<div data-reactroot="" class="container BMQCollectMoney">
	<div class="text-center">
		<h1 class="page-title">Truy xuất hóa đơn </h1>
	</div>

		<aui:input type="hidden" name="redirect" value="" />
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
					      <th scope="col" class="col-xs-12 col-sm-1" style="text-align:center;font-weight: bold;">Lý do thu</th>
					      <th scope="col" class="col-xs-12 col-sm-1" style="text-align:center;font-weight: bold;">Số tiền</th>
					      <th scope="col" class="col-xs-12 col-sm-2" style="text-align:center;font-weight: bold;">Chi Tiết</th>
					      <th scope="col" class="col-xs-12 col-sm-1" style="text-align:center;font-weight: bold;">Ghi chú</th>
					      <th scope="col" class="col-xs-12 col-sm-3" style="text-align:center;font-weight: bold;">Xử Lý</th>
					    </tr>
				    </thead>
				    <tbody>
				    <c:forEach items="<%=request.getAttribute("getAllNotApproval")%>"var="moneycollections" >
					    <tr>
					      <td class="col-xs-12 col-sm-2">${moneycollections.getCollection_date()}</td>
					      <td class="col-xs-12 col-sm-2">${moneycollections.getStore_name()}</td>
					      <td class="col-xs-12 col-sm-1">
					      		<c:set var = "reason" scope = "session" value="${moneycollections.getReason_id()}"/>
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
					      </td>
					      <td class="col-xs-12 col-sm-1">${moneycollections.getAmount()}</td>
					      <td class="col-xs-12 col-sm-2">
					      	Người thu: ${moneycollections.getCollector_username()} </br>
					      	Sản phẩm: ${moneycollections.getCollector_username()} </br>
					      </td>
					      <td class="col-xs-12 col-sm-1">${moneycollections.getNote()}</td>
					      <td class="col-xs-12 col-sm-3" style="">
							<div class="col-xs-12 col-sm-4" style="padding:0">							
						      	<aui:form action="<%=export%>" method="post">
						      		<button class="btn btn-success btn-block" type="submit">Xuất HĐ</button>
									<aui:input type="hidden" name="moneyCollectionId" label="" value="${moneycollections.getMoney_collection_id()}"/>
									<aui:input type="hidden" name="moneyCollectionUserName" label="" value="${user.getEmailAddress()}"/>
									
								</aui:form>
							</div>
							
							<div class="col-xs-12 col-sm-4" style="padding:0">
								<portlet:renderURL var="update_Invoice_url">
									<portlet:param name="mvcRenderCommandName" value="update_Invoice"/>								
									<portlet:param name="invoiceID" value="${moneycollections.getMoney_collection_id()}" />
								</portlet:renderURL>	
								<a class="btn btn-primary btn-block" href="<%= update_Invoice_url %>">Chỉnh sửa</a>	
						      	
			      			</div>	
			      			<div class="col-xs-12 col-sm-4" style="padding:0">	
			      					
						      	<aui:form action="<%=refusal%>" method="post">
						      		<button class="btn btn-danger btn-block" type="submit">Từ chối</button>
									<aui:input type="hidden" name="moneyCollectionId" label="" value="${moneycollections.getMoney_collection_id()}"/>
									<aui:input type="hidden" name="moneyCollectionUserName" label="" value="${user.getEmailAddress()}"/>
									
								</aui:form>
							</div>
					      </td>
					    </tr>
					 </c:forEach>  
					  </tbody>
				</table>
			</div>
		</section>
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