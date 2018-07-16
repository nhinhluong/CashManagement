<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ include file="/init.jsp" %>


<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="http://localhost:8080/web/guest"><img style="width: 64px;" src="http://bmarket.vn/image/layout_set_logo?img_id=57844&t=1530693433063" alt="bmq_logo">
      	
      </a>
    </div>
    <ul class="nav navbar-nav navbar-right">
     	
      <li class="active">
      	<portlet:renderURL var="pointsale_url">
			<portlet:param name="mvcPath" value="/Amount_Collection_Point_Sale.jsp" />
			<portlet:param name="add-process-action-success-action" value="false" />
		</portlet:renderURL>
		<a href="<%= pointsale_url %>">Điểm bán</a>
      </li>
      <li>
			<portlet:renderURL var="agent_url">
				<portlet:param name="mvcPath" value="/Amount_Collection_From_Agent.jsp" />
				<portlet:param name="add-process-action-success-action" value="false" />
			</portlet:renderURL>
			<a href="<%= agent_url %>">Thu từ đại lý</a>

      </li>
      <li>
		  	<portlet:renderURL var="newagent_url">
				<portlet:param name="mvcPath" value="/Amount_Collection_From_NewAgent.jsp" />
				<portlet:param name="add-process-action-success-action" value="false" />
			</portlet:renderURL>
			<a href="<%= newagent_url %>">Thu từ đại lý mới</a>
	  </li>
	  <li>
		  	<portlet:renderURL var="preschool_url">
				<portlet:param name="mvcPath" value="/Amount_Collection_From_PreSchool.jsp" />
				<portlet:param name="add-process-action-success-action" value="false" />
			</portlet:renderURL>
			<a href="<%= preschool_url %>">Thu từ trường mầm non</a>
	  </li>
	  <li>
		  	<portlet:renderURL var="viewInvoceExport">
				<portlet:param name="userNameMail" value="${user.getEmailAddress()}" />
				<portlet:param name="mvcRenderCommandName" value="viewleave_info"/>
			</portlet:renderURL>
			<a href="<%= viewInvoceExport %>">Truy xuất hóa đơn</a>
	  </li>
	  <li>
	  	<portlet:renderURL var="history_url">
			<portlet:param name="mvcRenderCommandName" value="viewhistory_url"/>
			<portlet:param name="userNameMail" value="${user.getEmailAddress()}" />	
		</portlet:renderURL>
		<a href="<%= history_url %>">Lịch sử thu tiền</a>
	  </li>
    </ul>
  </div>
</nav>
<portlet:renderURL var="preschool_url">
	<portlet:param name="mvcPath" value="/Edit_Invoice.jsp" />
	<portlet:param name="add-process-action-success-action" value="false" />
</portlet:renderURL>
