/**
 * yingyinglicai.com Inc.
 * Copyright (c) 2013-2014 All Rights Reserved.
 */
 package com.yylc.alcsmng.common.dal.daointerface;

import com.yylc.alcsmng.common.dal.dataobject.RuleInfoDO;
import java.util.List;
import org.springframework.dao.DataAccessException;
import java.util.Date;
import java.util.Map;

/**
 * A dao interface provides methods to access database table <tt>alcs_rule_info</tt>.
 *
 * This file is generated by <tt>yylc-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>yylc</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/alcs_rule_info.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>yylc-gen-dal</tt> 
 * to generate this file.
 *
 * @author qiang.wq
 * @version $Id: RuleInfoDAO.java,v 1.0 2013/10/29 07:34:20 qiang.wq Exp $
 */
public interface RuleInfoDAO {
	/**
	 *  Query DB table <tt>alcs_rule_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from alcs_rule_info</tt>
	 *
	 *	@param locationCode
	 *	@return List<RuleInfoDO>
	 *	@throws DataAccessException
	 */	 
    public List<RuleInfoDO> selectM0ByLocationCode(int locationCode) throws DataAccessException;

	/**
	 *  Insert one <tt>RuleInfoDO</tt> object to DB table <tt>alcs_rule_info</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into alcs_rule_info(rule_id,user_id,user_name,location_code,rule_type_code,rule_name,create_time,update_time) values (?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP)</tt>
	 *
	 *	@param ruleInfo
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int saveRuleInfo(RuleInfoDO ruleInfo) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>alcs_rule_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from alcs_rule_info where (rule_id = ?)</tt>
	 *
	 *	@param ruleId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByRuleId(int ruleId) throws DataAccessException;

	/**
	 *  Query DB table <tt>alcs_rule_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from alcs_rule_info where (rule_id = ?)</tt>
	 *
	 *	@param ruleId
	 *	@return RuleInfoDO
	 *	@throws DataAccessException
	 */	 
    public RuleInfoDO queryRuleByRuleId(int ruleId) throws DataAccessException;

	/**
	 *  Query DB table <tt>alcs_rule_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from alcs_rule_info</tt>
	 *
	 *	@param offset
	 *	@param limit
	 *	@return List<RuleInfoDO>
	 *	@throws DataAccessException
	 */	 
    public List<RuleInfoDO> pageRuleForAdmin(int offset, int limit) throws DataAccessException;

	/**
	 *  Query DB table <tt>alcs_rule_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from alcs_rule_info</tt>
	 *
	 *	@param teamLeaderId
	 *	@return List<RuleInfoDO>
	 *	@throws DataAccessException
	 */	 
    public List<RuleInfoDO> selectByTeamLeaderId(String teamLeaderId) throws DataAccessException;

	/**
	 *  Query DB table <tt>alcs_rule_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(1) from alcs_rule_info</tt>
	 *
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int pageCountForAdmin() throws DataAccessException;

	/**
	 *  Query DB table <tt>alcs_rule_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(1) from alcs_rule_info</tt>
	 *
	 *	@param locationCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int selectForPageCount(int locationCode) throws DataAccessException;

	/**
	 *  Query DB table <tt>alcs_rule_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from alcs_rule_info</tt>
	 *
	 *	@param locationCode
	 *	@param deptCode
	 *	@param offset
	 *	@param limit
	 *	@return List<RuleInfoDO>
	 *	@throws DataAccessException
	 */	 
    public List<RuleInfoDO> selectForPage(int locationCode, int deptCode, int offset, int limit) throws DataAccessException;

}