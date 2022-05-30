package jp.co.internous.sample3;

public class Main {

	public static void main(String[] args) {
		
		Person p = new Person("太郎");
		
		String message = p.introduce();
		System.out.println(message);
		
	}
}