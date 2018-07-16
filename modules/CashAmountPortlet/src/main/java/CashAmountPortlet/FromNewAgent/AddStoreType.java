package CashAmountPortlet.FromNewAgent;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.bmq.vn.model.CtbReason;
import com.bmq.vn.model.CtbStoreType;
import com.bmq.vn.service.CtbReasonLocalServiceUtil;
import com.bmq.vn.service.CtbStoreTypeLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import CashAmountPortlet.constants.CashAmountPortletKeys;

@Component(
		property = {
			"javax.portlet.name=" + CashAmountPortletKeys.CashAmount,
			"mvc.command.name=addStoreType",
		},
		service = MVCActionCommand.class
	)
public class AddStoreType extends BaseMVCActionCommand{

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		long storetypeid = ParamUtil.getLong(actionRequest, "storetypeid");				
		String storetypecode = ParamUtil.getString(actionRequest, "storetypecode");			
		String storetypename = ParamUtil.getString(actionRequest, "storetypename");				
		String storetypestatus = ParamUtil.getString(actionRequest, "storetypestatus");	
				
		CtbStoreType addStoType = CtbStoreTypeLocalServiceUtil.createCtbStoreType(storetypeid);
		addStoType.setStore_type_id(storetypeid);
		addStoType.setStore_type_code(storetypecode);
		addStoType.setStore_type_name(storetypename);
		addStoType.setStatus(storetypestatus);
		
		CtbStoreTypeLocalServiceUtil.addCtbStoreType(addStoType);
		
	}

}
