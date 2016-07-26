package com.fileupload.action;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	/*
	//单个文件上传
	private String uploadFileContentType;//接受文件的类型(去掉)
	private String uploadFileFileName;//接受上传文件的名称
	private File uploadFile;//接受上传的文件

	public String getUploadFileContentType() {
		return uploadFileContentType;
	}

	public void setUploadFileContentType(String uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}

	public String getUploadFileFileName() {
		return uploadFileFileName;
	}

	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}

	public File getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}

	@SuppressWarnings("deprecation")
	public String upload() {
		//文件上传保存项目根目录下的upload文件夹
		String path = ServletActionContext.getRequest().getRealPath("/upload");
		File dir=new File(path);
		if(!dir.exists()){
			dir.mkdirs();
		}
		//上传文件了
		//1、文件的后缀
		String sub=this.uploadFileFileName.substring(uploadFileFileName.lastIndexOf(".")+1);
		//2、构建新的文件名称
		String fileName=System.currentTimeMillis()+"."+sub;
		//3、保存的文件
		File dest=new File(dir, fileName);
		
		this.uploadFile.renameTo(dest);
		return "main";
	}
	*/
	
//	private String[] uploadFileContentType;//接受文件的类型(去掉)
//	private String[] uploadFileFileName;//接受上传文件的名称
	private File[] uploadFile;//接受上传的文件
	public File[] getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(File[] uploadFile) {
		this.uploadFile = uploadFile;
	}
	/*
	public String[] getUploadFileFileName() {
		return uploadFileFileName;
	}

	public void setUploadFileFileName(String[] uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}

	public String[] getUploadFileContentType() {
		return uploadFileContentType;
	}

	public void setUploadFileContentType(String[] uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}*/

	public String upload() {
		return "main";
	}
	
}
