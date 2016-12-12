/**
 * 
 */
package com.kvvssut.external.proj.spring.dao;

import java.util.List;

import com.kvvssut.external.proj.spring.model.Group;

/**
 * @author Srimanta Sahu
 *
 */
public interface GroupsDAO {

	public void saveOrUpdate(Group group);

	public void delete(int groupId);

	public Group get(int groupId);

	public List<Group> list();

}
