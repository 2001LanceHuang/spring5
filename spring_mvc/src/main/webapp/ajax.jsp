<%--
  Created by IntelliJ IDEA.
  User: rabbit
  Date: 2023/5/7
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script>
        var userList = new Array();
        userList.push({"username":"zhangsan","age":18});
        userList.push({"username":"lisi","age":28});

        $.ajax({
            type:"POST",
            contentType:"application/json;charset=UTF-8",
            url:"${pageContext.request.contextPath}/user/quick15",
            data:JSON.stringify(userList),
            dataType:"json"
        });

    </script>
</head>
<body>

</body>
</html>
