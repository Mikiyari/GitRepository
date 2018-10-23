package dxh.notes.bean;

import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String nickname;

    private String realname;

    private String gender;

    private Integer age;

    private String school;

    private Date createtime;
    

    public User() {
	}
    
    
	public User(String username, String password, String nickname, String realname, String gender, Integer age,
			String school, Date createtime) {
		super();
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.realname = realname;
		this.gender = gender;
		this.age = age;
		this.school = school;
		this.createtime = createtime;
	}


	public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", nickname=" + nickname
				+ ", realname=" + realname + ", gender=" + gender + ", age=" + age + ", school=" + school
				+ ", createtime=" + createtime + "]";
	}
    
    
}