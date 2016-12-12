/**
 * 
 */
package com.kvvssut.external.proj.spring.model;

import java.util.Date;

/**
 * @author Srimanta Sahu
 *
 */
public class Person {
	private long personId;
	private String personName;
	private Date personDOB;
	private String personEmail;
	private int overallReviewCount;
	private int overallReviewScore;
	private Date updatedDate;
	private Date createdDate;

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Date getPersonDOB() {
		return personDOB;
	}

	public void setPersonDOB(Date personDOB) {
		this.personDOB = personDOB;
	}

	public String getPersonEmail() {
		return personEmail;
	}

	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
	}

	public int getOverallReviewCount() {
		return overallReviewCount;
	}

	public void setOverallReviewCount(int overallReviewCount) {
		this.overallReviewCount = overallReviewCount;
	}

	public int getOverallReviewScore() {
		return overallReviewScore;
	}

	public void setOverallReviewScore(int overallReviewScore) {
		this.overallReviewScore = overallReviewScore;
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

	@Override
	public String toString() {
		return "Persons [personId=" + personId + ", personName=" + personName + ", personDOB=" + personDOB
				+ ", personEmail=" + personEmail + ", overallReviewCount=" + overallReviewCount
				+ ", overallReviewScore=" + overallReviewScore + ", updatedDate=" + updatedDate + ", createdDate="
				+ createdDate + "]";
	}

}
