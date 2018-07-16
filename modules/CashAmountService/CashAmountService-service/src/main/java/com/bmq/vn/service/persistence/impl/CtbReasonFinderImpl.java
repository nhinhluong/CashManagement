package com.bmq.vn.service.persistence.impl;

import java.util.List;

import com.bmq.vn.model.CtbReason;
import com.bmq.vn.model.SitbMoneyCollection;
import com.bmq.vn.model.impl.CtbReasonImpl;
import com.bmq.vn.model.impl.SitbMoneyCollectionImpl;
import com.bmq.vn.service.persistence.CtbReasonFinder;
import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

public class CtbReasonFinderImpl extends CtbReasonFinderBaseImpl implements CtbReasonFinder {
	public static String queryId = "com.bmq.vn.service.persistence.CtbReasonFinder.getAllUserData";
	public List getAllUserData() throws SystemException {
        Session session = null;
        try {                
        session=openSession();
        String sql = CustomSQLUtil.get(CtbReason.class, queryId);
        SQLQuery query = session.createSQLQuery(sql);
        QueryPos qPos = QueryPos.getInstance(query);
        return (List)query.list();
        }catch (Exception e) {
                    e.printStackTrace();  
                         return null;
        }
       
    }
	public List<SitbMoneyCollection> getALlBetweenReasonCode(int start, int end) {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(SitbMoneyCollection.class, "com.bmq.vn.service.persistence.CtbReasonFinder.getAllMoneyCollectionData");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			queryObject.addEntity("SitbMoneyCollection", SitbMoneyCollectionImpl.class);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(start);
			qPos.add(end);
			return (List<SitbMoneyCollection>) queryObject.list();
			
			//return  (List<Student>) QueryUtil.list(queryObject,getDialect(),start, end);// for pagination feature
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	public List<SitbMoneyCollection> findByReason() {
		// TODO Auto-generated method stub
		return null;
	}
}
