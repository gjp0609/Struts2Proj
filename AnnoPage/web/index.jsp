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
            margin: auto;
        }

        th, td {
            background-color: aliceblue;
            line-height: 23px;
            text-align: center;
            padding: 10px;
        }
    </style>
</head>
<body>
<table cellspacing="0">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>mobile</th>
        <th>birthday</th>
        <th>option</th>
    </tr>

    <s:iterator var="p" value="users">
        <tr>
            <td><s:property value="#p.id"/></td>
            <td><s:property value="#p.name"/></td>
            <td><s:property value="#p.mobile"/></td>
            <td><s:property value="#p.birthday"/></td>
            <td>
                <a href="<s:url namespace="/" action="toUpdate"/>?user.id=<s:property value="#p.id"/>">update</a>
                <a href="<s:url namespace="/" action="removeUser"/>?user.id=<s:property value="#p.id"/>">delete</a>
            </td>
        </tr>
    </s:iterator>
    <tr>
        <s:if test="page.hasPrePage">
        <td><a href="<s:url namespace='/' action='queryAll'>
                            <s:param name="page.pageIndex" value="page.pageIndex-1"/>
                        </s:url>">上一页</a></s:if>
        </td>
        <s:else>
            <td class="disabled"><a href="javascript:void(0)">上一页</a></td>
        </s:else>
        <%--------------------------------------------%>
        <s:iterator value="new int[page.totalPages]" status="st">
            <s:if test="#st.index+1 == page.pageIndex">
                <td class="disabled"><a class="disabled" href="javascript:void(0)">
                    <s:property value="#st.index+1"/></a></td>
            </s:if>
            <s:else>
                <td><a href="<s:url namespace='/' action='queryAll'>
                            <s:param name="page.pageIndex" value="#st.index+1"/>
                        </s:url>">
                    <s:property value="#st.index+1"/></a></td>
            </s:else>
        </s:iterator>
        <%-------------------------------------------%>
        <s:if test="page.hasNextPage">
            <td><a href="<s:url namespace='/' action='queryAll'>
                            <s:param name="page.pageIndex" value="page.pageIndex+1"/>
                            </s:url>">下一页</a></td>
        </s:if>
        <s:else>
            <td class="disabled"><a href="javascript:void(0)">下一页</a></td>
        </s:else>
    </tr>
</table>

<a href="<s:url value="adduser.jsp"/>">add</a>

</body>
</html>
