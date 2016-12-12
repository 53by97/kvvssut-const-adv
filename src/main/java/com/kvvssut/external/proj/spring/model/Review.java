/**
 * 
 */
package com.kvvssut.external.proj.spring.model;

import java.util.Date;

/**
 * @author Srimanta Sahu
 *
 */
public class Review {
	private long reviewId;
	private String reviewContent;
	private long reviwerId;
	private long revieweeId;
	private int overallSentimentScore;
	private Date updatedDate;
	private Date createdDate;

	public long getReviewId() {
		return reviewId;
	}

	public void setReviewId(long reviewId) {
		this.reviewId = reviewId;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public long getReviwerId() {
		return reviwerId;
	}

	public void setReviwerId(long reviwerId) {
		this.reviwerId = reviwerId;
	}

	public long getRevieweeId() {
		return revieweeId;
	}

	public void setRevieweeId(long revieweeId) {
		this.revieweeId = revieweeId;
	}

	public int getOverallSentimentScore() {
		return overallSentimentScore;
	}

	public void setOverallSentimentScore(int overallSentimentScore) {
		this.overallSentimentScore = overallSentimentScore;
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
		return "Reviews [reviewId=" + reviewId + ", reviewContent=" + reviewContent + ", reviwerId=" + reviwerId
				+ ", revieweeId=" + revieweeId + ", overallSentimentScore=" + overallSentimentScore + ", updatedDate="
				+ updatedDate + ", createdDate=" + createdDate + "]";
	}

}
