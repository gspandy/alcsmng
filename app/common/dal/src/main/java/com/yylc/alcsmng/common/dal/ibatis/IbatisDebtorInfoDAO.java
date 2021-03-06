/**
 * yingyinglicai.com Inc.
 * Copyright (c) 2013-2014 All Rights Reserved.
 */
 package com.yylc.alcsmng.common.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.yylc.alcsmng.common.dal.daointerface.DebtorInfoDAO;

import com.yylc.alcsmng.common.dal.dataobject.DebtorInfoDO;
import org.springframework.dao.DataAccessException;
import java.util.Map;
import java.util.HashMap;

/**
 * An ibatis based implementation of dao interface <tt>com.yylc.alcsmng.common.dal.daointerface.DebtorInfoDAO</tt>.
 *
 * This file is generated by <tt>yylc-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>yylc</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/alcs_debtor_info.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>yylc-gen-dal</tt> 
 * to generate this file.
 *
 * @author qiang.wq
 * @version $Id: IbatisDebtorInfoDAO.java,v 1.0 2013/10/29 07:34:20 qiang.wq Exp $
 */
public class IbatisDebtorInfoDAO extends SqlMapClientDaoSupport implements DebtorInfoDAO {
	/**
	 *  Query DB table <tt>alcs_debtor_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from alcs_debtor_info where (debtor_id = ?)</tt>
	 *
	 *	@param debtorId
	 *	@return DebtorInfoDO
	 *	@throws DataAccessException
	 */	 
    public DebtorInfoDO queryByDebtorId(int debtorId) throws DataAccessException {

        Integer param = new Integer(debtorId);

        return (DebtorInfoDO) getSqlMapClientTemplate().queryForObject("MS-DEBTOR-INFO-QUERY-BY-DEBTOR-ID", param);

    }

}