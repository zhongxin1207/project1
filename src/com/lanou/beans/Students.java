package com.lanou.beans;

//@XmlRootElement
public class Students {

	private String name;
	private String sex;
	private Integer age;
	/**
	 * @return  name get����
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param   name  set����
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return  sex get����
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param   sex  set����
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return  age get����
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param   age  set����
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
