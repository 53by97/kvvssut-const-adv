/**
 * 
 */
package com.kvvssut.external.proj.spring.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.kvvssut.external.proj.spring.dao.GroupsDAO;
import com.kvvssut.external.proj.spring.model.Group;

/**
 * @author Srimanta Sahu
 *
 */
public class GroupsDAOImpl implements GroupsDAO {

	private JdbcTemplate jdbcTemplate;

	public GroupsDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void saveOrUpdate(Group group) {
		if (group.getGroupId() > 0) {
			String sql = "UPDATE groups SET grp_name=?, grp_desc=?, active_ind=?, updated_date=?, deleted_date=?";
			jdbcTemplate.update(sql, group.getGroupName(), group.getGroupDesc(), group.isActiveInd(),
					group.getUpdatedDate(), group.getDeletedDate());
		} else {
			String sql = "INSERT INTO groups (grp_id, grp_name, grp_desc, created_Date) values(?, ?, ?, ?)";
			jdbcTemplate.update(sql, group.getGroupId(), group.getGroupName(), group.getGroupDesc(),
					LocalDateTime.now());
		}
	}

	public void delete(int groupId) {
		String sql = "DELETE FROM groups WHERE grp_id=?";
		jdbcTemplate.update(sql, groupId);
	}

	public Group get(int groupId) {
		String sql = "SELECT * FROM groups WHERE grp_id=" + groupId;
		return jdbcTemplate.query(sql, new ResultSetExtractor<Group>() {
			public Group extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					Group group = new Group();
					group.setGroupId(rs.getInt("grp_id"));
					group.setGroupName(rs.getString("grp_name"));
					group.setGroupDesc(rs.getString("grp_desc"));
					group.setActiveInd(rs.getBoolean("active_ind"));
					group.setUpdatedDate(rs.getDate("updated_date"));
					group.setCreatedDate(rs.getDate("created_date"));
					group.setDeletedDate(rs.getDate("deleted_date"));
					return group;
				}
				return null;
			}
		});
	}

	public List<Group> list() {
		String sql = "SELECT * FROM groups";

		List<Group> groupsList = jdbcTemplate.query(sql, new RowMapper<Group>() {
			public Group mapRow(ResultSet rs, int rowNum) throws SQLException {
				Group group = new Group();
				group.setGroupId(rs.getInt("grp_id"));
				group.setGroupName(rs.getString("grp_name"));
				group.setGroupDesc(rs.getString("grp_desc"));
				group.setActiveInd(rs.getBoolean("active_ind"));
				group.setUpdatedDate(rs.getDate("updated_date"));
				group.setCreatedDate(rs.getDate("created_date"));
				group.setDeletedDate(rs.getDate("deleted_date"));
				return group;
			}
		});

		return groupsList;
	}

}
