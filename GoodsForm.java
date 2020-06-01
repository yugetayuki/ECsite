package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class GoodsForm implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String goodsName;
	private long price;
	
	public long getId() {
		this.id = is;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setgoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}

}
