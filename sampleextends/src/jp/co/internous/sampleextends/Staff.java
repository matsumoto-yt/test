package jp.co.internous.sampleextends;

public class Staff extends Person {

	public Staff(String name) {
		super(name);
	}

	private int staffNo;
	private int gender;

	public void setStaffNo(int staffNo) {
		this.staffNo = staffNo;
	}

	public int getStaffNo() {
		return staffNo;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getGender() {
		return gender;
	}

	public Staff(String name, int gender, int staffNo) {
		super(name);
		this.staffNo = staffNo;
		this.gender = gender;
	}

	public void work(String job) {
		System.out.println("私は、" + job + "の仕事をしています。");
	}



}
