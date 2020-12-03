<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript" src="../static/jquery-1.8.2.js"></script>
</head>
<body>
    <center>
        <table border="1" rules="all">
            <tr align="center" bgcolor="#00ffff">
                <th>用户编号</th>
                <th>用户名称</th>
                <th>用户密码</th>
                <th colspan="100">操作</th>
            </tr>
            <#list list as u>
                <tr align="center" bgcolor="gray">
                    <td>${u.id}</td>
                    <td>${u.uname}</td>
                    <td>${u.pwd}</td>
                    <td>
                        <a href="deleteUserById?id=${u.id}">删除</a>
                    </td>
                    <td>
                        <a href="">修改</a>
                    </td>
                </tr>
            </#list>
        </table>
    </center>
</body>
<script>
    function deleteUser(id) {
        alert(id);
        $.post(
            "deleteUserById",
            {id:id},
            function (data) {
                alert(data);
            }
        );
    }
</script>
</html>