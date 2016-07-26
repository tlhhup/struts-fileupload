package com.fileupload.action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

public class FileDownLoadAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	public String download() {
		return "download";
	}

	public InputStream getTextStream() {
		try {
			return new ByteArrayInputStream("hello world".getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
