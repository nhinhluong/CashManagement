package com.bmq.cashamount.invoice_export.render;

import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.bmq.vn.model.SitbMoneyCollection;
import com.bmq.vn.service.SitbMoneyCollectionLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import CashAmountPortlet.constants.CashAmountPortletKeys;

@Component(
	    immediate = true,
	    property = {
	       "javax.portlet.name=" + CashAmountPortletKeys.CashAmount,
	       "mvc.command.name=update_Invoice"
	    },
	    service = MVCRenderCommand.class
	)
public class UpdateInvoice implements MVCRenderCommand{

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		
		long money_collection_id = ParamUtil.getLong(renderRequest, "invoiceID");
		System.out.println(money_collection_id);
		try {
			SitbMoneyCollection getmoneyCollectionbyid = SitbMoneyCollectionLocalServiceUtil.getSitbMoneyCollection(money_collection_id);
			long id 		 = getmoneyCollectionbyid.getMoney_collection_id();
			String storeName = getmoneyCollectionbyid.getStore_name();
			Date date 		 = getmoneyCollectionbyid.getCollection_date();
			String collector = getmoneyCollectionbyid.getCollector_username();
			double amount	 = getmoneyCollectionbyid.getAmount();
			double cost      = getmoneyCollectionbyid.getCost();
			double discountAmount = getmoneyCollectionbyid.getDiscountAmount();
			double transferAmount = getmoneyCollectionbyid.getTransferAmount();
			long reason		 = getmoneyCollectionbyid.getReason_id();
			
			renderRequest.setAttribute("id", id);
			renderRequest.setAttribute("storeName", storeName);
			renderRequest.setAttribute("date", date);
			renderRequest.setAttribute("collector", collector);
			renderRequest.setAttribute("amount", amount);
			renderRequest.setAttribute("cost", cost);
			renderRequest.setAttribute("discountAmount", discountAmount);
			renderRequest.setAttribute("transferAmount", transferAmount);
			renderRequest.setAttribute("reason", reason);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "/Update_Invoice.jsp";
	}

}
