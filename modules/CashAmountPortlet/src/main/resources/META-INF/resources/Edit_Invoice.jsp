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

<portlet:actionURL name="addAgent1" var="addagent1" >
	<portlet:param name="mvcActionCommand" value="addAgent1" />
</portlet:actionURL>

<aui:form name="myForm" action="<%addAgent1 %>" method="post">
		<div class="row">				
			<div class="col-xs-12 col-sm-3">
				<div class="form-group">
					<label data-required="true" for="" class="form-label">Tên đại lý:</label>
					<div>
						<aui:select name="moneyCollectionStoreId" label="">
							<c:forEach items="<%=CtbStoreLocalServiceUtil.getCtbStores(0, 50)%>"var="stores" > 
						    	<aui:option value="${stores.getStore_name()}">${stores.getStore_name()}</aui:option>
						    </c:forEach>
						</aui:select>
					</div>
				</div>
			</div>
			<div class="col-xs-12 col-sm-2">
				<div class="form-group">
					<label data-required="true" for="" class="form-label">Số tiền:</label>
					<div>
						<aui:input id="moneyCollectionAmount" class="form-control"
							name="moneyCollectionAmount" maxlength="100" value=""
							type="text" label="" >
							<aui:validator name="required" />
							<aui:validator name="alpha" errorMessage="Enter characters" />
						</aui:input>					
					</div>
				</div>
			</div>
			<div class="col-xs-12 col-sm-2">
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
		<aui:button type="submit" name="submit" value="submit" />
		</div>
</aui:form>