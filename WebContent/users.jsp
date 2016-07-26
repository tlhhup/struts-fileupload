<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<table>
			<caption>用户列表</caption>
			<thead>
				<tr>
					<td>标号</td>
					<th>用户编号</th>
					<th>用户姓名</th>
					<th>用户地址</th>
					<th>用户电话</th>
					<th>用户年龄</th>
				</tr>
			</thead>
			<!-- 
				value:迭代的数据集合
				值栈：该数据不再栈顶 之前加#
			 -->
			<s:iterator value="users" status="status">
				<tr>
					<td><s:property value="#status.index"/></td>
					<td><s:property value="id"/></td>
					<td><s:property value="name"/></td>
					<td><s:property value="address"/></td>
					<td><s:property value="tel"/></td>
					<td><s:property value="age"/></td>
				</tr>
			</s:iterator>
		</table>
		
		<s:form action="" namespace="" method="">
			
			<s:a action="" namespace=""></s:a>
			<s:submit value=""/>
		</s:form>
		
		<!-- 
			list:数据集合
			listKey:显示
			listValue:提交的数据
		 -->
		<s:select list="users" listKey="id" listValue="name" headerKey="" headerValue="请选择用户"></s:select>
	</div>
</body>
</html>