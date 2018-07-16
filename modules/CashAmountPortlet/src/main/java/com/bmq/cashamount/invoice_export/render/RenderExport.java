package com.bmq.cashamount.invoice_export.render;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.bmq.vn.model.CtbReason;
import com.bmq.vn.model.SitbMoneyCollection;
import com.bmq.vn.service.CtbReasonLocalServiceUtil;
import com.bmq.vn.service.SitbMoneyCollectionLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import CashAmountPortlet.constants.CashAmountPortletKeys;

@Component(
	    property = {
	    	"javax.portlet.name=" + CashAmountPortletKeys.CashAmount,
    		 "mvc.command.name=viewleave_info"
	    },
	    service = MVCRenderCommand.class
	)
	public class RenderExport implements MVCRenderCommand{

	@Override
	 public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
	  //System.out.println("Hey you are in render Method of IndividualwebmvcAddRenderCommand...!!");
	  String userNameMail = ParamUtil.getString(renderRequest, "userNameMail");	
	  //System.out.println(userNameMail);
	  List<SitbMoneyCollection> userList = SitbMoneyCollectionLocalServiceUtil.GetAllNotApproval();
	  //List<CtbReason> userReason = CtbReasonLocalServiceUtil.getCtbReasons(-1, -1);
	  renderRequest.setAttribute("getAllNotApproval", userList);
	  return "/Invoice_Export.jsp";
	 }
	 
}
