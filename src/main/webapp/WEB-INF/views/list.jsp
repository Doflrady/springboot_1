<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/main" method="post">
    <h3>航班查询</h3>
    日期：<input type="text" name="flightDate" />
    城市：从<input type="text" name="startport" />
    到：<input type="text" name="endport" />
    <input type="submit" id="sousuo" value="搜索"  />
    <table border="1px solid black" cellpadding="0" cellspacing="0">
        <tr>
            <td>航空公司/航班<br/>机型</td>
            <td>起降时间</td>
            <td>机场</td>
            <td>飞行时长</td>
            <td>经停</td>
            <td>参考报价</td>
        </tr>
    </table>

</form>
</body>
</html>