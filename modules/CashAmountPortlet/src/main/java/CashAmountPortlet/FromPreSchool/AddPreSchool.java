package CashAmountPortlet.FromPreSchool;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.bmq.vn.model.SitbMoneyCollection;
import com.bmq.vn.service.SitbMoneyCollectionLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import CashAmountPortlet.constants.CashAmountPortletKeys;

@Component(
		property = {
			"javax.portlet.name=" + CashAmountPortletKeys.CashAmount,
			"mvc.command.name=addPreSchool",
		},
		service = MVCActionCommand.class
	)
public class AddPreSchool extends BaseMVCActionCommand{

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		long moneyCollectionId = CounterLocalServiceUtil.increment("1");				
		String moneyCollectionUserName = ParamUtil.getString(actionRequest, "moneyCollectionUserName");			
		Date moneyCollectionDate = new Date();
		String moneyCollectionUser = ParamUtil.getString(actionRequest, "moneyCollectionUserName");	
		double moneyCollectionAmount = ParamUtil.getDouble(actionRequest, "moneyCollectionAmount");	
		String moneyCollectionNote = ParamUtil.getString(actionRequest, "moneyCollectionNote");	
		String moneyCollectionStoreCode = ParamUtil.getString(actionRequest, "moneyCollectionStoreCode");	
		String moneyCollectionStatus = "0";	
		long moneyCollectionStoreTypeId = ParamUtil.getLong(actionRequest, "moneyCollectionStoreTypeId");	
		long moneyCollectionReasonId = 4;	
		String moneyCollectionStoreName = ParamUtil.getString(actionRequest, "moneyCollectionStoreName");
				
		SitbMoneyCollection addMoneyCollection = SitbMoneyCollectionLocalServiceUtil.createSitbMoneyCollection(moneyCollectionId);
		addMoneyCollection.setMoney_collection_id(moneyCollectionId);
		addMoneyCollection.setUserName(moneyCollectionUserName);
		addMoneyCollection.setCollection_date(moneyCollectionDate);
		addMoneyCollection.setCollector_username(moneyCollectionUser);
		addMoneyCollection.setAmount(moneyCollectionAmount);
		addMoneyCollection.setNote(moneyCollectionNote);
		addMoneyCollection.setStore_code(moneyCollectionStoreCode);
		addMoneyCollection.setApproval_status(moneyCollectionStatus);
		addMoneyCollection.setStore_type_id(moneyCollectionStoreTypeId);
		addMoneyCollection.setReason_id(moneyCollectionReasonId);
		addMoneyCollection.setStore_name(moneyCollectionStoreName);
		
		SitbMoneyCollectionLocalServiceUtil.addSitbMoneyCollection(addMoneyCollection);
	}

}
