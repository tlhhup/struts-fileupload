package com.fileupload.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.fileupload.entity.User;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	// 用户列表首页
	public String index() {
		this.users = getUserInfos();
		return "index";
	}

	private List<User> getUserInfos() {
		String[] addresss={"成都","贵阳","北京","上海"};
		Random random=new Random();
		List<User> result=new ArrayList<User>();
		User user=null;
		for(int i=0;i<5;i++){
			user=new User();
			user.setName("这个是第"+i+"个数据");
			user.setAddress(addresss[random.nextInt(addresss.length)]);
			user.setTel(""+random.nextInt(1000000000));
			user.setId(i);
			user.setAge(random.nextInt(60));
			
			result.add(user);
			user=null;
		}
		return result;
	}

}
