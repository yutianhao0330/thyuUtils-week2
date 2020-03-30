package com.yutianhao.testBean;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 
    * @ClassName: Person
    * @Description: 用于测试的person实体类，
    * 		里面有姓名(name)、年龄(age)、介绍(about)、注册日期(created)，共4个属性
    * @author thyu
    * @date 2020年3月30日
    *
 */
public class Person {
	private String name;
	private Integer age;
	private String about;
	private Date create;
	public Person() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Date getCreate() {
		return create;
	}
	public void setCreate(Date create) {
		this.create = create;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return "Person [name=" + name + ", age=" + age + ", create=" + sdf.format(create) + ", about=" + about + "]";
	}
	
	
}
