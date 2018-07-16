package CashAmountPortlet.PointSale;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.bmq.vn.model.SitbMoneyCollection;
import com.bmq.vn.model.SitbStoreInfo;
import com.bmq.vn.service.CtbStoreLocalServiceUtil;
import com.bmq.vn.service.CtbStoreTypeLocalServiceUtil;
import com.bmq.vn.service.SitbMoneyCollectionLocalServiceUtil;
import com.bmq.vn.service.SitbStoreInfoLocalService;
import com.bmq.vn.service.SitbStoreInfoLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.Converter;
import com.liferay.portal.kernel.util.ParamUtil;

import CashAmountPortlet.constants.CashAmountPortletKeys;

@Component(
		property = {
			"javax.portlet.name=" + CashAmountPortletKeys.CashAmount,
			"mvc.command.name=addPointSale",
		},
		service = MVCActionCommand.class
	)
public class AddPointSale extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		//insert table sitb_money_collection	
		long moneyCollectionId = CounterLocalServiceUtil.increment("1");				
		String moneyCollectionUserName = ParamUtil.getString(actionRequest, "moneyCollectionUserName");			
		Date moneyCollectionDate = new Date();				
		String moneyCollectionUser = ParamUtil.getString(actionRequest, "moneyCollectionUserName");	
		double moneyCollectionAmount = ParamUtil.getDouble(actionRequest, "moneyCollectionAmount");	
		String moneyCollectionNote = ParamUtil.getString(actionRequest, "moneyCollectionNote");	
		long moneyCollectionStoreId = ParamUtil.getLong(actionRequest, "moneyCollectionStoreId");
		String moneyCollectionStoreCode = CtbStoreLocalServiceUtil.getCtbStore(moneyCollectionStoreId).getStore_code();
		String moneyCollectionStatus = "0";	
		long moneyCollectionReasonId = 5;
		long moneyCollectionStoreTypeId = 0;
		String moneyCollectionStoreName = CtbStoreLocalServiceUtil.getCtbStore(moneyCollectionStoreId).getStore_name();
		String moneyCollectionRef = Long.toString(CounterLocalServiceUtil.increment("2"));
		double moneyCollectionCost = ParamUtil.getLong(actionRequest, "moneyCollectionCost");
		double moneyCollectionDiscountAmount = ParamUtil.getLong(actionRequest, "moneyCollectionDiscountAmount");
		double moneyCollectionTransferAmount = ParamUtil.getLong(actionRequest, "moneyCollectionTransferAmount");
		
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
		addMoneyCollection.setCollection_ref(moneyCollectionRef);
		addMoneyCollection.setCost(moneyCollectionCost);
		addMoneyCollection.setDiscountAmount(moneyCollectionDiscountAmount);
		addMoneyCollection.setTransferAmount(moneyCollectionTransferAmount);
		
		SitbMoneyCollectionLocalServiceUtil.addSitbMoneyCollection(addMoneyCollection);
		
		//insert table sitb_store_info	
		long StoreInfoId = CounterLocalServiceUtil.increment("1");
		String StoreInfoUserName = moneyCollectionUserName;
		long StoreInfoStoreId = moneyCollectionStoreId;
		String StoreInfoStoreCode = moneyCollectionStoreCode;
		long StoreInfoFistQuantity = ParamUtil.getLong(actionRequest, "StoreInfoFistQuantity");
		long StoreInfoLastQuantity = ParamUtil.getLong(actionRequest, "StoreInfoLastQuantity");
		long StoreInfoImportQuantity = ParamUtil.getLong(actionRequest, "StoreInfoImportQuantity");
		String StoreInfoNote = moneyCollectionNote;
		long StoreInfoArisingQuantity = ParamUtil.getLong(actionRequest, "StoreInfoArisingQuantity");
		long StoreInfoPayQuantity = ParamUtil.getLong(actionRequest, "StoreInfoPayQuantity");
		Date StoreInfoCollecDate = new Date();
		long StoreInfoCollectId = moneyCollectionId;
		String StoreInfoCollectUserName = moneyCollectionUserName;
		String StoreInfoCollectRef = moneyCollectionRef;
		long StoreInfoProductId = ParamUtil.getLong(actionRequest, "StoreInfoProductId");
		
		SitbStoreInfo AddStoreInfo = SitbStoreInfoLocalServiceUtil.createSitbStoreInfo(StoreInfoId);
		
		AddStoreInfo.setStore_info_id(StoreInfoId);
		AddStoreInfo.setUserName(StoreInfoUserName);
		AddStoreInfo.setStore_id(StoreInfoStoreId);
		AddStoreInfo.setStore_code(StoreInfoStoreCode);
		AddStoreInfo.setFirst_quantity(StoreInfoFistQuantity);
		AddStoreInfo.setLast_quantity(StoreInfoLastQuantity);
		AddStoreInfo.setImport_quantity(StoreInfoImportQuantity);
		AddStoreInfo.setNote(StoreInfoNote);
		AddStoreInfo.setArising_quantity(StoreInfoArisingQuantity);
		AddStoreInfo.setPay_quantity(StoreInfoPayQuantity);
		AddStoreInfo.setCollection_date(StoreInfoCollecDate);
		AddStoreInfo.setCollector_id(StoreInfoCollectId);
		AddStoreInfo.setCollector_name(StoreInfoCollectUserName);
		AddStoreInfo.setCollection_ref(StoreInfoCollectRef);
		AddStoreInfo.setProduct_id(StoreInfoProductId);
		
		SitbStoreInfoLocalServiceUtil.addSitbStoreInfo(AddStoreInfo);
	}

}
