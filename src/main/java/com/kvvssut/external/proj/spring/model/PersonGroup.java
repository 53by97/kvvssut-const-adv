/**
 * 
 */
package com.kvvssut.external.proj.spring.model;

import java.util.Date;

/**
 * @author Srimanta Sahu
 *
 */
public class PersonGroup {
	private long personId;
	private int groupId;
	private boolean activeInd;
	private Date removedDate;
	private Date joinedDate;

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public boolean isActiveInd() {
		return activeInd;
	}

	public void setActiveInd(boolean activeInd) {
		this.activeInd = activeInd;
	}

	public Date getRemovedDate() {
		return removedDate;
	}

	public void setRemovedDate(Date removedDate) {
		this.removedDate = removedDate;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	@Override
	public String toString() {
		return "PersonGroups [personId=" + personId + ", groupId=" + groupId + ", activeInd=" + activeInd
				+ ", removedDate=" + removedDate + ", joinedDate=" + joinedDate + "]";
	}

}
