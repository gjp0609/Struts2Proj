<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: gjp06
  Date: 17.5.14
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
    <script src="js/jquery-3.2.1.js"></script>
    <link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<header style="height: 50px"></header>
<table id="tb">
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>MOBILE</th>
        <th style="padding: 3px">DETAILS</th>
        <th style="padding: 3px">DELETE</th>
    </tr>
</table>

<button id="add">add</button>

<form id="frm">
    <table id="frmt">
        <tr>
            <td class="tt">ID</td>
            <td><input readonly title="id" name="person.id" type="text"/></td>
        </tr>
        <tr>
            <td class="tt">姓名</td>
            <td><input title="name" name="person.name" type="text"/></td>
        </tr>
        <tr>
            <td class="tt">手机</td>
            <td><input title="mobile" name="person.mobile" type="text"/></td>
        </tr>
        <tr>
            <td class="tt">电话</td>
            <td><input title="telPhone" name="person.telPhone" type="text"/></td>
        </tr>
        <tr>
            <td class="tt">Email</td>
            <td><input title="email" name="person.email" type="text"/></td>
        </tr>
        <tr>
            <td class="tt">城市</td>
            <td><input title="city" name="person.city" type="text"/></td>
        </tr>
    </table>
    <input type="button" id="sub_add" value="添加"/>
    <input type="button" id="sub_upd" value="更新"/>
</form>

<script>
    var sub_upd = $("#sub_upd");
    var sub_add = $("#sub_add");

    var tb = $("#tb");
    $.get("<s:url action="findPerson"/>", null, function (result) {
        for (var i = 0; i < result.length; i++) {
            tb.append(
                "<tr>" + "<td>" + result[i].id + "</td>"
                + "<td>" + result[i].name + "</td>"
                + "<td>" + result[i].mobile + "</td>"
                + "<td><button class='details' title='" + result[i].id + "'>详情</button></td>"
                + "<td><button class='delete' title='" + result[i].id + "'>删除</button></td>"
                + "</tr>"
            );
            // 获得循环当前行的详情按钮
            var dt = $(".details").last();
            dt.click(function () {
                $.get("<s:url action="findPerson"/>", "person.id=" + this.title, function (result) {
                    showDetails(result[0]);
                }, "json");
            });

            // 获得循环当前行的修改按钮
            var up = $(".update").last();
            up.click(function () {
                $.get("<s:url action="modifyPerson"/>", "person.id=" + this.title, function (result) {
                    showDetails(result[0]);
                }, "json");
            });

            // 获得循环当前行的修改按钮
            var de = $(".delete").last();
            de.click(function () {
                $.get("<s:url action="removePerson"/>", "person.id=" + this.title, function (result) {
                    showDetails(result[0]);
                }, "json");
            });
        }
    }, "json");
    var frm = $("#frm");
    $(function () {
        frm.hide();
        sub_add.hide();
        sub_upd.hide();
    });

    var frmt = $("#frmt");
    function showDetails(info) {
        frm.show();
        sub_add.hide();
        sub_upd.show();
        frmt.find("input[title='id']").val(info.id);
        frmt.find("input[title='name']").val(info.name);
        frmt.find("input[title='mobile']").val(info.mobile);
        frmt.find("input[title='telPhone']").val(info.telPhone);
        frmt.find("input[title='email']").val(info.email);
        frmt.find("input[title='city']").val(info.city);
    }

    var add = $("#add");
    add.click(function () {
        frm.show();
        sub_add.show();
        sub_upd.hide();
        frmt.find("input[title]").val("");

    });

    // 更新
    sub_upd.click(function () {
        $.post("<s:url action="modifyPerson"/>", frm.serialize(), function (result) {
            if (result === "1") {
                // 更新一行
                var idd = sub_upd.siblings("table").find("input[title='id']");
                tb.find("tr").each(function () {
                    // 找到要更新的行
                    if ($(this).children().first().html() === idd.val()) {
                         
                    }
                                                                                                                                                                                                                                                                                                                                                   });

            }
        }, "text");
    });

</script>
</body>
</html>
