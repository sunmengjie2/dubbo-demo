<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/resource/css/index_work.css">
<script type="text/javascript" src="/resource/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="/resource/My97DatePicker/WdatePicker.js"></script>
</head>
<script type="text/javascript">
function order(){
	$("form").submit();
}
</script>
<body>
<form action="list" method="post">
发表时间：<input type="date" name="c1" value="${sun.c1}">--
		<input type="date" name="c2" value="${sun.c2}">
		
		<select  name="sortName" >
			<option value="">--请选择--</option>
			<option <c:if test="${sun.sortName=='created'}">selected</c:if> value="created">发表时间</option>
			<option <c:if test="${sun.sortName=='user_id'}">selected</c:if> value="user_id">作者Id</option>
			<option <c:if test="${sun.sortName=='commentCnt'}">selected</c:if> value="commentCnt">评论数量</option>
        <select>
        <input type="submit" value="查询">
<table>
  <tr>
    <td>编号</td>
	<td>标题</td>
	<td>内容</td>
	<td>作者</td>
	<td>作者ID</td>
	<td>评论数量</td>
	<td>发表时间</td>
	<td>修改时间</td>
  </tr>
  <c:forEach items="${list }" var="l">
  <tr>
    <td>${l.id}</td>
	<td>${l.title}</td>
	<td>${l.content}</td>
	<td>${l.username}</td>
	<td>${l.user_id}</td>
	<td>${l.commentCnt}</td>
	<td> <fmt:formatDate value="${l.created}" pattern="yyyy-MM-dd"/> </td>
	<td><fmt:formatDate value="${l.updated}" pattern="yyyy-MM-dd"/></td>
  </tr>
  </c:forEach>
  <tr>
  	<tr>
		<td colspan="10">
			<button name="pageNum" value="1">首页</button>
			<button name="pageNum" value="${page.prePage==0?1:page.prePage}">上一页</button>
			<button name="pageNum" value="${page.nextPage==0?page.pages:page.nextPage}">下一页</button>
			<button name="pageNum" value="${page.pages}">尾页</button>
			当前页/总页数：${page.pageNum}/${page.pages}
		</td>
	</tr>
  </tr>
</table>
</form>
</body>
</html>