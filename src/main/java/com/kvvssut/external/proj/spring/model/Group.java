/**
 * 
 */
package com.kvvssut.external.proj.spring.model;

import java.util.Date;

/**
 * @author Srimanta Sahu
 *
 */
public class Group {
	private int groupId;
	private String groupName;
	private String groupDesc;
	private boolean activeInd;
	private Date updatedDate;
	private Date createdDate;
	private Date deletedDate;

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupDesc() {
		return groupDesc;
	}

	public void setGroupDesc(String groupDesc) {
		this.groupDesc = groupDesc;
	}

	public boolean isActiveInd() {
		return activeInd;
	}

	public void setActiveInd(boolean activeInd) {
		this.activeInd = activeInd;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getDeletedDate() {
		return deletedDate;
	}

	public void setDeletedDate(Date deletedDate) {
		this.deletedDate = deletedDate;
	}

	@Override
	public String toString() {
		return "Groups [groupId=" + groupId + ", groupName=" + groupName + ", groupDesc=" + groupDesc + ", activeInd="
				+ activeInd + ", updatedDate=" + updatedDate + ", createdDate=" + createdDate + ", deletedDate="
				+ deletedDate + "]";
	}

}
