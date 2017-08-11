package com.lanou.beans;

//@XmlRootElement
public class Students {

	private String name;
	private String sex;
	private Integer age;
	/**
	 * @return  name get方法
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param   name  set方法
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return  sex get方法
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param   sex  set方法
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return  age get方法
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param   age  set方法
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Students [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
}
