package CashAmountPortlet.FromNewAgent;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.bmq.vn.model.CtbReason;
import com.bmq.vn.service.CtbReasonLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import CashAmountPortlet.constants.CashAmountPortletKeys;

@Component(
		property = {
			"javax.portlet.name=" + CashAmountPortletKeys.CashAmount,
			"mvc.command.name=addReason",
		},
		service = MVCActionCommand.class
	)
public class AddReason extends BaseMVCActionCommand{

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		long reasonid = ParamUtil.getLong(actionRequest, "reasonid");				
		String reasoncode = ParamUtil.getString(actionRequest, "reasoncode");			
		String reasonname = ParamUtil.getString(actionRequest, "reasonname");				
		String reasonstatus = ParamUtil.getString(actionRequest, "reasonstatus");	
				
		CtbReason addRea = CtbReasonLocalServiceUtil.createCtbReason(reasonid);
		addRea.setReason_id(reasonid);
		addRea.setReason_code(reasoncode);
		addRea.setReason_name(reasonname);
		addRea.setStatus(reasonstatus);
		
		CtbReasonLocalServiceUtil.addCtbReason(addRea);

				
	}
		
}
