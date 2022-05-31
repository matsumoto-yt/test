package jp.co.internous.samplepoli;

public class Main {

	public static void main(String[] args) {
		
		Japanesee p1 = new Japanesee();
		String aisatsu1 = p1.greeting("田中");
		System.out.println(aisatsu1);
		
		American a1 = new American();
		String hello1 = a1.greeting("マイケル");
		System.out.println(hello1);
		
		Chinese c1 = new Chinese();
		String nihao1 = c1.greeting("ワン");
		System.out.println(nihao1);
		

	}

}
