/**
 * 
 */
package com.kvvssut.external.proj.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kvvssut.external.proj.spring.dao.GroupsDAO;
import com.kvvssut.external.proj.spring.model.Group;
import com.kvvssut.external.proj.spring.service.GroupsService;

/**
 * @author Srimanta Sahu
 *
 */
public class GroupsServiceImpl implements GroupsService {

	@Autowired
	private GroupsDAO groupsDAO;

	public void saveOrUpdate(Group group) {
		if (group == null) {
			return;
		}
		groupsDAO.saveOrUpdate(group);
	}

	public void delete(int groupId) {
		if (groupId <= 0) {
			return;
		}
		groupsDAO.delete(groupId);
	}

	public Group get(int groupId) {
		if (groupId <= 0) {
			return null;
		}
		return groupsDAO.get(groupId);
	}

	public List<Group> list() {
		return groupsDAO.list();
	}

}
