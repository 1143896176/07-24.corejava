package buycart;

import java.util.Date;

public class Orders {
	
	private String oid;
	private Date date;
	
	private RecInfo recInfo;
	private BuyCart buyCart;
	
	//订单总价
	private double total = 0.0;
	
	public Orders(String oid, Date date, RecInfo recInfo, BuyCart buyCart) {
		this.oid = oid;
		this.date = date;
		this.recInfo = recInfo;
		this.buyCart = buyCart;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public RecInfo getRecInfo() {
		return recInfo;
	}

	public void setRecInfo(RecInfo recInfo) {
		this.recInfo = recInfo;
	}

	public BuyCart getBuyCart() {
		return buyCart;
	}

	public void setBuyCart(BuyCart buyCart) {
		this.buyCart = buyCart;
	}

	@Override
	public String toString() {
		
		
		
		String msg = "----------订单信息 : ----------\n";
		
		msg+= "订单编号 : " + oid+"\n";
		msg+= "订单日期 : " + date + "\n";
		
		msg+= "收货地址 : " + recInfo + "\n";
		
		msg+= "购物清单 : \n" ;
		
		for (Item item : buyCart.getItems()) {
			double currPriceTotle = item.getAmount()*item.getProduct().getPrice();
			total +=  currPriceTotle;
			msg+=item+"\t单项价格 : "+currPriceTotle+ "\n";
			
		}
		
		msg+="----------\n总价为 : " + total;

		return msg;
	}
	
	
	

}
