package com.jnmd.bluesky.domain;


public class User {
	
	private int u_id;
	private String mphone;
	private String password;
	private String hPic;
	private String pNum;
	private String nickName;
	private int sex;
	private int age;
	private String city;
	private int isAdmin;
	
	public User() {
		
	}

	public User(String mphone) {
		super();
		this.mphone = mphone;
	}
	public User(int u_id, String hPic,String pNum) {
		super();
		this.u_id = u_id;
		this.hPic = hPic;
		this.pNum = pNum;
	}

	public User(String pNum, String hPic, String nickName, int sex, int age, String city) {
		super();
		this.pNum = pNum;
		this.hPic = hPic;
		this.nickName = nickName;
		this.sex = sex;
		this.age = age;
		this.city = city;
	}
	public User(int u_id, String pNum, String hPic, String nickName, int sex, int age, String city) {
		super();
		this.u_id = u_id;
		this.pNum = pNum;
		this.hPic = hPic;
		this.nickName = nickName;
		this.sex = sex;
		this.age = age;
		this.city = city;
	}
	public User(String mphone, String password, String hPic, String nickName, int sex, int age, String city,
			int isAdmin) {
		super();
		this.mphone = mphone;
		this.password = password;
		this.hPic = hPic;
		this.nickName = nickName;
		this.sex = sex;
		this.age = age;
		this.city = city;
		this.isAdmin = isAdmin;
	}

	public User(int u_id, String mphone, String password, String hPic, String nickName, int sex, int age, String city,
			int isAdmin) {
		super();
		this.u_id = u_id;
		this.mphone = mphone;
		this.password = password;
		this.hPic = hPic;
		this.nickName = nickName;
		this.sex = sex;
		this.age = age;
		this.city = city;
		this.isAdmin = isAdmin;
	}

	public int getU_id() {
		return u_id;
	}
	
	public void setUid(int u_id) {
		this.u_id = u_id;
	}

	public String getMphone() {
		return mphone;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHeadImg() {
		return hPic;
	}

	public void setHeadImg(String hPic) {
		this.hPic = hPic;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	public String gethPic() {
		return hPic;
	}

	public void sethPic(String hPic) {
		this.hPic = hPic;
	}

	public String getpNum() {
		return pNum;
	}

	public void setpNum(String pNum) {
		this.pNum = pNum;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", mphone=" + mphone + ", password=" + password + ", hPic=" + hPic + ", pNum="
				+ pNum + ", nickName=" + nickName + ", sex=" + sex + ", age=" + age + ", city=" + city + ", isAdmin="
				+ isAdmin + "]";
	}
	
	
	
}

