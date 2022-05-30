package jp.co.internouse.sample;

public class Person {
	
	private String firstName;
	private String familyName;
	private String birthday;
	private int age;
	
	public Person(String firstName, String familyName, String birthday, int age) {
		this.firstName = firstName;
		this.familyName = familyName;
		this.birthday = birthday;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	
	public String getFamilyName() {
		return familyName;
	}
	
	
	public String getBirthday() {
		return birthday;
	}
	
	
	public int getAge() {
		return age;
	}
	
	public void jikosyoukai() {
		System.out.println("私の名前は" + familyName+firstName + "です。" + birthday + "生まれの" + age + "歳です。");
	}

}
