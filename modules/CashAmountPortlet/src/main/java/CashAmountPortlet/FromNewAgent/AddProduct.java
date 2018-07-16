package CashAmountPortlet.FromNewAgent;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.bmq.vn.model.CtbProduct;
import com.bmq.vn.model.CtbReason;
import com.bmq.vn.service.CtbProductLocalServiceUtil;
import com.bmq.vn.service.CtbReasonLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import CashAmountPortlet.constants.CashAmountPortletKeys;

@Component(
		property = {
			"javax.portlet.name=" + CashAmountPortletKeys.CashAmount,
			"mvc.command.name=addProduct",
		},
		service = MVCActionCommand.class
	)
public class AddProduct extends BaseMVCActionCommand{

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		long proid = ParamUtil.getLong(actionRequest, "proid");				
		String procode = ParamUtil.getString(actionRequest, "procode");			
		String proname = ParamUtil.getString(actionRequest, "proname");				
		String proidstatus = ParamUtil.getString(actionRequest, "proidstatus");	
				
		CtbProduct addPro = CtbProductLocalServiceUtil.createCtbProduct(proid);
		addPro.setProduct_id(proid);
		addPro.setProduct_code(procode);
		addPro.setProduct_name(proname);
		addPro.setStatus(proidstatus);
		
		CtbProductLocalServiceUtil.addCtbProduct(addPro);
		
	}

}
