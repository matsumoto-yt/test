package jp.co.internous.sampleextends;

public class Main {

	public static void main(String[] args) {

		Staff s = new Staff("taro");

		s.setName("スタイリッシュヌーブ");
		s.setStaffNo(3);
		s.setGender(1);

		System.out.println("社員番号" + s.getStaffNo() + "の、" + s.getName() + "です。" + "性別は、" + s.getGender() + "です");
		s.work("システムエンジニア");

	}

}
