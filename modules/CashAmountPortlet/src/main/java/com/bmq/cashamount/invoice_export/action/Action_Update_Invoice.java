package com.bmq.cashamount.invoice_export.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.bmq.vn.model.SitbMoneyCollection;
import com.bmq.vn.service.SitbMoneyCollectionLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import CashAmountPortlet.constants.CashAmountPortletKeys;

@Component(
	    immediate = true,
	    property = {
	       "javax.portlet.name=" + CashAmountPortletKeys.CashAmount,
	       "mvc.command.name=action_update_Invoice"
	    },
	    service = MVCActionCommand.class
	)
public class Action_Update_Invoice extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		long  moneyCollectionid = ParamUtil.getLong(actionRequest, "money_Collection_id");
		double getamount = ParamUtil.getDouble(actionRequest, "money_Collection_amount");
		double getCost = ParamUtil.getDouble(actionRequest, "money_Collection_cost");
		double getTransfer = ParamUtil.getDouble(actionRequest, "money_Collection_transfer");
		double getDiscount = ParamUtil.getDouble(actionRequest, "money_Collection_discount");
		SitbMoneyCollection si_MC = SitbMoneyCollectionLocalServiceUtil.fetchSitbMoneyCollection(moneyCollectionid);
		si_MC.setMoney_collection_id(moneyCollectionid);
		si_MC.setAmount(getamount);
		si_MC.setCost(getCost);
		si_MC.setTransferAmount(getTransfer);
		si_MC.setDiscountAmount(getDiscount);
		SitbMoneyCollection updateMC = SitbMoneyCollectionLocalServiceUtil.updateSitbMoneyCollection(si_MC);
	}


}
