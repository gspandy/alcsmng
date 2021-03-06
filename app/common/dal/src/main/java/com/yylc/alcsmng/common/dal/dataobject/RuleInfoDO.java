/**
 * yingyinglicai.com Inc.
 * Copyright (c) 2013-2014 All Rights Reserved.
 */
 package com.yylc.alcsmng.common.dal.dataobject;

import com.yylc.alcsmng.common.dal.dataobject.BaseDO;

import java.util.Date;

/**
 * A data object class directly models database table <tt>alcs_rule_info</tt>.
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
 * @version $Id: RuleInfoDO.java,v 1.0 2013/10/29 07:34:20 qiang.wq Exp $
 */
public class RuleInfoDO extends BaseDO {
    private static final long serialVersionUID = 741231858441822688L;

    //========== properties ==========

	/**
	 * This property corresponds to db column <tt>rule_id</tt>.
	 */
	private int ruleId;

	/**
	 * This property corresponds to db column <tt>team_leader_ids</tt>.
	 */
	private String teamLeaderIds;

	/**
	 * This property corresponds to db column <tt>user_ids</tt>.
	 */
	private String userIds;

	/**
	 * This property corresponds to db column <tt>location_code</tt>.
	 */
	private int locationCode;

	/**
	 * This property corresponds to db column <tt>dept_code</tt>.
	 */
	private int deptCode;

	/**
	 * This property corresponds to db column <tt>rule_name</tt>.
	 */
	private String ruleName;

	/**
	 * This property corresponds to db column <tt>create_time</tt>.
	 */
	private Date createTime;

	/**
	 * This property corresponds to db column <tt>update_time</tt>.
	 */
	private Date updateTime;

    //========== getters and setters ==========

    /**
     * Getter method for property <tt>ruleId</tt>.
     *
     * @return property value of ruleId
     */
	public int getRuleId() {
		return ruleId;
	}
	
	/**
	 * Setter method for property <tt>ruleId</tt>.
	 * 
	 * @param ruleId value to be assigned to property ruleId
     */
	public void setRuleId(int ruleId) {
		this.ruleId = ruleId;
	}

    /**
     * Getter method for property <tt>teamLeaderIds</tt>.
     *
     * @return property value of teamLeaderIds
     */
	public String getTeamLeaderIds() {
		return teamLeaderIds;
	}
	
	/**
	 * Setter method for property <tt>teamLeaderIds</tt>.
	 * 
	 * @param teamLeaderIds value to be assigned to property teamLeaderIds
     */
	public void setTeamLeaderIds(String teamLeaderIds) {
		this.teamLeaderIds = teamLeaderIds;
	}

    /**
     * Getter method for property <tt>userIds</tt>.
     *
     * @return property value of userIds
     */
	public String getUserIds() {
		return userIds;
	}
	
	/**
	 * Setter method for property <tt>userIds</tt>.
	 * 
	 * @param userIds value to be assigned to property userIds
     */
	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}

    /**
     * Getter method for property <tt>locationCode</tt>.
     *
     * @return property value of locationCode
     */
	public int getLocationCode() {
		return locationCode;
	}
	
	/**
	 * Setter method for property <tt>locationCode</tt>.
	 * 
	 * @param locationCode value to be assigned to property locationCode
     */
	public void setLocationCode(int locationCode) {
		this.locationCode = locationCode;
	}

    /**
     * Getter method for property <tt>deptCode</tt>.
     *
     * @return property value of deptCode
     */
	public int getDeptCode() {
		return deptCode;
	}
	
	/**
	 * Setter method for property <tt>deptCode</tt>.
	 * 
	 * @param deptCode value to be assigned to property deptCode
     */
	public void setDeptCode(int deptCode) {
		this.deptCode = deptCode;
	}

    /**
     * Getter method for property <tt>ruleName</tt>.
     *
     * @return property value of ruleName
     */
	public String getRuleName() {
		return ruleName;
	}
	
	/**
	 * Setter method for property <tt>ruleName</tt>.
	 * 
	 * @param ruleName value to be assigned to property ruleName
     */
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

    /**
     * Getter method for property <tt>createTime</tt>.
     *
     * @return property value of createTime
     */
	public Date getCreateTime() {
		return createTime;
	}
	
	/**
	 * Setter method for property <tt>createTime</tt>.
	 * 
	 * @param createTime value to be assigned to property createTime
     */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

    /**
     * Getter method for property <tt>updateTime</tt>.
     *
     * @return property value of updateTime
     */
	public Date getUpdateTime() {
		return updateTime;
	}
	
	/**
	 * Setter method for property <tt>updateTime</tt>.
	 * 
	 * @param updateTime value to be assigned to property updateTime
     */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
