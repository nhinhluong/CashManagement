package CashAmountPortlet.InvoiceExport;

import java.util.Date;

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
		property = {
			"javax.portlet.name=" + CashAmountPortletKeys.CashAmount,
			"mvc.command.name=Refusal",
		},
		service = MVCActionCommand.class
	)
public class RefusalInvoice extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {

		long moneyCollectionId = ParamUtil.getLong(actionRequest, "moneyCollectionId");	
		String moneyCollectionUserName = ParamUtil.getString(actionRequest, "moneyCollectionUserName");	
		SitbMoneyCollection updateMoneyCollection = SitbMoneyCollectionLocalServiceUtil.getSitbMoneyCollection(moneyCollectionId);
		updateMoneyCollection.setApproval_date(new Date());
		updateMoneyCollection.setApproval_username(moneyCollectionUserName);
		updateMoneyCollection.setApproval_status("2");
		
		SitbMoneyCollectionLocalServiceUtil.updateSitbMoneyCollection(updateMoneyCollection);
		
	}

}
