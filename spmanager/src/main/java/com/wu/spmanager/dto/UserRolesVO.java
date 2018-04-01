package com.wu.spmanager.dto;


import com.wu.spmanager.model.UserRoleKey;

import java.util.List;

public class UserRolesVO {
	private Integer id;

	private String username;

	private String mobile;

	private String email;

	private String password;

	private Integer insertUid;

	private String insertTime;

	private String updateTime;

	private boolean isDel;

	private boolean isJob;

	private List<UserRoleKey> userRoles;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile == null ? null : mobile.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public Integer getInsertUid() {
		return insertUid;
	}

	public void setInsertUid(Integer insertUid) {
		this.insertUid = insertUid;
	}

	public String getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(String insertTime) {
		this.insertTime = insertTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public boolean getDel() {
		return isDel;
	}

	public void setDel(boolean del) {
		isDel = del;
	}

	public boolean getJob() {
		return isJob;
	}

	public void setJob(boolean job) {
		isJob = job;
	}

	public List<UserRoleKey> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRoleKey> userRoles) {
		this.userRoles = userRoles;
	}

	@Override public String toString() {
		return "UserRolesVO{" + "id=" + id + ", username='" + username + '\''
				+ ", mobile='" + mobile + '\'' + ", email='" + email + '\''
				+ ", password='" + password + '\'' + ", insertUid=" + insertUid
				+ ", insertTime=" + insertTime + ", updateTime=" + updateTime
				+ ", isDel=" + isDel + ", isJob=" + isJob + ", userRoles="
				+ userRoles + '}';
	}
}