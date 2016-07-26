<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="FileDownLoadAction_download.do">下载</a>
	<div align="center">
		<form action="FileUploadAction_upload.do" enctype="multipart/form-data" method="post">
			<table>
				<caption>文件上传</caption>
				<tr>
					<td>选择文件：</td>
					<td>
						<input type="file" name="uploadFile">					
					</td>
				</tr>
				<tr>
					<td>选择文件：</td>
					<td>
						<input type="file" name="uploadFile">					
					</td>
				</tr>
				<tr>
					<td>选择文件：</td>
					<td>
						<input type="file" name="uploadFile">					
					</td>
				</tr>
				<tr>
					<td>选择文件：</td>
					<td>
						<input type="file" name="uploadFile">					
					</td>
				</tr>
				<tr>
					<td align="center" colspan="2">
						<input type="submit" value="提交">
						<input type="reset" value="重置">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>