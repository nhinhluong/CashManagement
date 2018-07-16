package CashAmountPortlet.FromNewAgent;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.bmq.vn.model.CtbReason;
import com.bmq.vn.model.CtbStore;
import com.bmq.vn.service.CtbReasonLocalServiceUtil;
import com.bmq.vn.service.CtbStoreLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import CashAmountPortlet.constants.CashAmountPortletKeys;

@Component(
		property = {
			"javax.portlet.name=" + CashAmountPortletKeys.CashAmount,
			"mvc.command.name=addStore",
		},
		service = MVCActionCommand.class
	)
public class AddStore  extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		long storeid = ParamUtil.getLong(actionRequest, "storeid");				
		String storecode = ParamUtil.getString(actionRequest, "storecode");			
		String storename = ParamUtil.getString(actionRequest, "storename");				
		String storestatus = ParamUtil.getString(actionRequest, "storestatus");
		String storeaddress = ParamUtil.getString(actionRequest, "storeaddress");
		String storephone = ParamUtil.getString(actionRequest, "storephone");
		long storetypeid = ParamUtil.getLong(actionRequest, "storetypeid");
		String storeuserName = ParamUtil.getString(actionRequest, "storeuserName");
				
		CtbStore addStr = CtbStoreLocalServiceUtil.createCtbStore(storeid);
		addStr.setStore_id(storeid);
		addStr.setStore_code(storecode);
		addStr.setStore_name(storename);
		addStr.setStatus(storestatus);
		addStr.setAddress(storeaddress);
		addStr.setPhone(storephone);
		addStr.setStore_type_id(storetypeid);
		addStr.setUserName(storeuserName);
		
		CtbStoreLocalServiceUtil.addCtbStore(addStr);
		
	}

}
