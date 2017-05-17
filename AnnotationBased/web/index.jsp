<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: gjp06
  Date: 17.5.17
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <style>
        table {
            border-spacing: 5px;
            margin: auto;
        }

        th, td {
            background-color: aliceblue;
            line-height: 23px;
            text-align: center;
            border: 1px solid coral;
            border-radius: 15px;
            padding: 10px;
        }
    </style>
</head>
<body>
<a href="<s:url namespace="/p" action="queryAll"/>">click</a>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>mobile</th>
        <th>telphone</th>
        <th>email</th>
        <th>city</th>
    </tr>

    <s:iterator var="p" value="people">
        <tr>
            <td><s:property value="#p.id"/></td>
            <td><s:property value="#p.name"/></td>
            <td><s:property value="#p.mobile"/></td>
            <td><s:property value="#p.telphone"/></td>
            <td><s:property value="#p.email"/></td>
            <td><s:property value="#p.city"/></td>
        </tr>
    </s:iterator>

</table>

</body>
</html>
