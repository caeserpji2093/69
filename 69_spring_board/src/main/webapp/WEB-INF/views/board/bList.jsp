<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bList</title>
</head>
<body>
	<div align="center" >
		<h1>List</h1>
		<table style="width:700px" border="1">
			<tr>
				<th width="40px">Number</th>
				<th>Title</th>
				<th>Poster</th>
				<th>Date Posted</th>
				<th>Views</th>
			</tr>
			<c:forEach var="boardDto" items="${boardList}">
				<tr>
					<td>${boardDto.num }</td>
					<td><a href="${contextPath }/board/bInfo?num=${boardDto.num}">${boardDto.subject }</a></td>
					<td>${boardDto.writer }</td>
					<td><fmt:formatDate value="${boardDto.regDate }" pattern="yyyy-MM-dd"/></td>
					<td>${boardDto.readCount }</td>
				</tr>
			</c:forEach>
			<tr>	
				<td colspan="5" align="right">
					<input type="button" value="글쓰기" onclick="location.href='${contextPath}/board/boardWrite'">
				</td>
			</tr>
		</table>
	</div>
</body>
</html>	





