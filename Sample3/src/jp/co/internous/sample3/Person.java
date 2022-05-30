package jp.co.internous.sample3;

public class Person {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	public String introduce() {
		String message = "私の名前は" + name + "です。";
		return message;
	}

}
