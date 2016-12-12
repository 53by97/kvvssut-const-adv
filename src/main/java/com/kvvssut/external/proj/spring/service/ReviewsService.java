/**
 * 
 */
package com.kvvssut.external.proj.spring.service;

import java.util.List;

import com.kvvssut.external.proj.spring.model.Review;

/**
 * @author Srimanta Sahu
 *
 */
public interface ReviewsService {

	public void saveOrUpdate(Review Review);

	public void delete(int reviewId);

	public Review get(int reviewId);

	public List<Review> list();

}
