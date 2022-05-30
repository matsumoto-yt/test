package jp.co.internouse.sample;

public class Goods {
	//商品の内容についての設定
	private String goodsName;
	private int price;
	
	//商品名についての設定
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsName() {
		return goodsName;
	}
	//商品価格についての設定
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
}

