/**
 * yingyinglicai.com Inc.
 * Copyright (c) 2013-2014 All Rights Reserved.
 */
 package com.yylc.alcsmng.common.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.yylc.alcsmng.common.dal.daointerface.ContactInfoDAO;

import com.yylc.alcsmng.common.dal.dataobject.ContactInfoDO;
import java.util.List;
import org.springframework.dao.DataAccessException;
import java.util.Map;
import java.util.HashMap;

/**
 * An ibatis based implementation of dao interface <tt>com.yylc.alcsmng.common.dal.daointerface.ContactInfoDAO</tt>.
 *
 * This file is generated by <tt>yylc-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>yylc</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/alcs_contact_info.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>yylc-gen-dal</tt> 
 * to generate this file.
 *
 * @author qiang.wq
 * @version $Id: IbatisContactInfoDAO.java,v 1.0 2013/10/29 07:34:20 qiang.wq Exp $
 */
public class IbatisContactInfoDAO extends SqlMapClientDaoSupport implements ContactInfoDAO {
	/**
	 *  Query DB table <tt>alcs_contact_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from alcs_contact_info</tt>
	 *
	 *	@param debtorId
	 *	@param offset
	 *	@param limit
	 *	@return List<ContactInfoDO>
	 *	@throws DataAccessException
	 */	 
    public List<ContactInfoDO> listByDebtorId(int debtorId, int offset, int limit) throws DataAccessException {

	Map<String,Object> param = new HashMap<String,Object>();

        param.put("debtorId", new Integer(debtorId));
        param.put("offset", new Integer(offset));
        param.put("limit", new Integer(limit));

        return getSqlMapClientTemplate().queryForList("MS-CONTACT-INFO-LIST-BY-DEBTOR-ID", param);

    }

	/**
	 *  Update DB table <tt>alcs_contact_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update alcs_contact_info set call_result=?, call_times=(call_times + 1) where (contact_id = ?)</tt>
	 *
	 *	@param contactInfo
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateForCallResult(ContactInfoDO contactInfo) throws DataAccessException {
    	if (contactInfo == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-CONTACT-INFO-UPDATE-FOR-CALL-RESULT", contactInfo);
    }

	/**
	 *  Query DB table <tt>alcs_contact_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(1) from alcs_contact_info where (debtor_id = ?)</tt>
	 *
	 *	@param debtorId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int selectForPageCount(int debtorId) throws DataAccessException {

        Integer param = new Integer(debtorId);

	    Integer retObj = (Integer) getSqlMapClientTemplate().queryForObject("MS-CONTACT-INFO-SELECT-FOR-PAGE-COUNT", param);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.intValue();
		}

    }

}