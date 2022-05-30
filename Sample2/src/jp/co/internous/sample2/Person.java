package jp.co.internous.sample2;

public class Person {
	
	private String name;
	private String from;
	
	public  Person(String name, String from) {
		this.name = name;
		this.from = from;
	}
	
	public void personal() {
		System.out.println("私は" + name + "です。" + from + "出身です。");
	}

}
