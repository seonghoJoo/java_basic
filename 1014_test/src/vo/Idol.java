package vo;

import java.sql.Date;

public class Idol {
	private int idolId,groupId;
	private String name;
	private double height, weight;
	private Date birthDate;
	private char gender;
	public Idol() {
		
	}
	
	public Idol(int idolId, int groupId, String name, double height, double weight, Date birthDate, char gender) {
		this.idolId = idolId;
		this.groupId = groupId;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.birthDate = birthDate;
		this.gender = gender;
	}

	public Idol(String name) {
		this.name = name;
	}
	public int getIdolId() {
		return idolId;
	}
	public void setIdolId(int idolId) {
		this.idolId = idolId;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

	
}
