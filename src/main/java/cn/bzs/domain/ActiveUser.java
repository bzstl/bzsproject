package cn.bzs.domain;

public class ActiveUser implements java.io.Serializable{
	private String userid;//�û�id��������
	private String usercode;// �û��˺�
	private String username;// �û�����
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsercode() {
		return usercode;
	}
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
