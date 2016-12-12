<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Constructive-Advice Groups Info</title>
</head>
<body>
	<div align="center">
		<h1>Groups List</h1>
		<h3>
			<a href="/kvvssut-const-adv/newgroup">New Group</a>
		</h3>
		<table border="1">
			<th>Id</th>
			<th>Name</th>
			<th>Description</th>
			<th>Active Indicator</th>
			<th>Updated Date</th>
			<th>Created Date</th>
			<th>Deleted Date</th>

			<c:forEach var="group" items="${groupsList}">
				<tr>
					<td>${group.groupId}</td>
					<td>${group.groupName}</td>
					<td>${group.groupDesc}</td>
					<td>${group.activeInd}</td>
					<td>${group.updatedDate}</td>
					<td>${group.createdDate}</td>
					<td>${group.deletedDate}</td>
					<td><a href="/kvvssut-const-adv/editGroup?id=${group.groupId}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="/kvvssut-const-adv/deleteGroup?id=${group.groupId}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>