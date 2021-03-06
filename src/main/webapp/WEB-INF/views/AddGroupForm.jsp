<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Constructive-Advice Add Group Page</title>
</head>
<body>
    <div align="center">
        <h1>Add/Edit Group</h1>
        <form:form action="saveGroup" method="post" modelAttribute="group">
        <table>
            <form:hidden path="groupId"/>
            <tr>
                <td>Name:</td>
                <td><form:input path="groupName" /></td>
            </tr>
            <tr>
                <td>Description:</td>
                <td><form:input path="groupDesc" /></td>
            </tr>
            <tr>
                <td>Active Indicator:</td>
                <td><form:input path="activeInd" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>