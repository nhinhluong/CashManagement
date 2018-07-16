package CashAmountPortlet.InvoiceExport;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;

import CashAmountPortlet.constants.CashAmountPortletKeys;

@Component(
		property = {
			"javax.portlet.name=" + CashAmountPortletKeys.CashAmount,
			"mvc.command.name=Edit",
		},
		service = MVCActionCommand.class
	)
public class EditInvoice extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
