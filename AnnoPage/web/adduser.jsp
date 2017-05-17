<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: gjp06
  Date: 17.5.17
  Time: 22:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="<s:url action="addUser"/>">
    <table>
        <tr>
            <th>name</th>
            <td><input type="text" name="user.name" value="<s:property value="user.name"/>"/>
            </td>
        </tr>
        <tr>
            <th>mobile</th>
            <td><input type="text" name="user.mobile" value="<s:property value="user.mobile"/>"/>
            </td>
        </tr>
        <tr>
            <th>birthday</th>
            <td><input type="text" name="user.birthday" value="<s:property value="user.birthday"/>"/>
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form>
</body>
</html>
