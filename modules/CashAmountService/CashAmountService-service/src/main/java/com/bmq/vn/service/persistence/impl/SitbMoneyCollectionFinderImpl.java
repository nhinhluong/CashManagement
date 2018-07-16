package com.bmq.vn.service.persistence.impl;

import java.util.List;

import com.bmq.vn.model.CtbReason;
import com.bmq.vn.model.SitbMoneyCollection;
import com.bmq.vn.model.impl.CtbReasonImpl;
import com.bmq.vn.model.impl.SitbMoneyCollectionImpl;
import com.bmq.vn.service.persistence.SitbMoneyCollectionFinder;
import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

public class SitbMoneyCollectionFinderImpl extends SitbMoneyCollectionFinderBaseImpl 
	implements SitbMoneyCollectionFinder{
	public static final String GET_ALL_MONEY_COLLECTION_WITH_REASON =
		    SitbMoneyCollectionFinder.class.getName() +
		        ".getAllMoneyCollectionData";
	public List<SitbMoneyCollection> getMoneyCollectionBetweenReasonCode(int start, int end) {
		Session session = null;
		try {
			
			session = openSession();
			String sql = CustomSQLUtil.get(getClass(),"com.bmq.vn.service.persistence.SitbMoneyCollectionFinder.getAllMoneyCollectionData");
			SQLQuery queryObject = session.createSQLQuery(sql);
			//queryObject.addEntity("SitbMoneyCollection", SitbMoneyCollectionImpl.class);
			queryObject.addEntity("CtbReason", CtbReasonImpl.class);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			return (List<SitbMoneyCollection>) queryObject.list();
			
			//return  (List<SitbMoneyCollection>) QueryUtil.list(queryObject,getDialect(),start, end);// for pagination feature
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	public List getMoneyCollectionAndReason(int start, int end) {
		Session session = null;
		try {
			
			session = openSession();
			String sql = CustomSQLUtil.get(getClass(),"com.bmq.vn.service.persistence.SitbMoneyCollectionFinder.getAllMoneyCollectionData");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.addEntity("SitbMoneyCollection", SitbMoneyCollectionImpl.class);
			queryObject.addEntity("CtbReason", CtbReasonImpl.class);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			return (List) queryObject.list();
			
			//return  (List<SitbMoneyCollection>) QueryUtil.list(queryObject,getDialect(),start, end);// for pagination feature
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	public List getMoneyCollectionNotApproval(int start, int end) {
		Session session = null;
		try {
			
			session = openSession();
			String sql = CustomSQLUtil.get(getClass(),"com.bmq.vn.service.persistence.SitbMoneyCollectionFinder.getMoneyCollectionNotApproval");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.addEntity("SitbMoneyCollection", SitbMoneyCollectionImpl.class);
			queryObject.addEntity("CtbReason", CtbReasonImpl.class);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			return (List) queryObject.list();
			
			//return  (List<SitbMoneyCollection>) QueryUtil.list(queryObject,getDialect(),start, end);// for pagination feature
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}

}
