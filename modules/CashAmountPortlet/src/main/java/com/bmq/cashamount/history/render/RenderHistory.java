package com.bmq.cashamount.history.render;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.bmq.vn.service.CtbReasonLocalServiceUtil;
import com.bmq.vn.service.SitbMoneyCollectionLocalServiceUtil;
import com.bmq.vn.service.persistence.CtbReasonUtil;
import com.bmq.vn.service.persistence.SitbMoneyCollectionUtil;
import com.bmq.vn.model.CtbReason;
import com.bmq.vn.model.SitbMoneyCollection;
import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import CashAmountPortlet.constants.CashAmountPortletKeys;

@Component(
	    immediate = true,
	    property = {
	       "javax.portlet.name=" + CashAmountPortletKeys.CashAmount,
	       "mvc.command.name=viewhistory_url"
	    },
	    service = MVCRenderCommand.class
	)

public class RenderHistory implements MVCRenderCommand{

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		System.out.println("Hellosss");
		String userNameMail = ParamUtil.getString(renderRequest, "userNameMail");
		//List<CtbReason> reasonList = SitbMoneyCollectionLocalServiceUtil.GetAllReasonFromDB();		
		List<SitbMoneyCollection> userList = SitbMoneyCollectionLocalServiceUtil.GetAllHistoryByUserName(userNameMail);
		List list=SitbMoneyCollectionLocalServiceUtil.getMoneyCollectionAndReason(-1,-1);
		renderRequest.setAttribute("listAllByReason", list);
		renderRequest.setAttribute("userHistory", userList);

		try {
			List<SitbMoneyCollection> listall = SitbMoneyCollectionLocalServiceUtil.getMoneyCollectionBetweenReasonCode(-1, -1);
			System.out.println(listall);
			//renderRequest.setAttribute("getAllByReason", listall);
		    } 
		 catch (SystemException e) {
			e.printStackTrace();
		}
		return "/History.jsp";
	}		
}
