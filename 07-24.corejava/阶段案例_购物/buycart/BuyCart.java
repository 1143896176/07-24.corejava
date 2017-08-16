package buycart;

import org.apache.commons.lang3.ArrayUtils;

public class BuyCart {

	private Item[] items; 

	public Item[] getItems() {
		return items;
	}
	
	public void setItems(Item[] items) {
		this.items = items;
	}
	
	public void handler() {
		for (int i = 0; i < items.length-1; i++) {
			if(items[i].equals(items[i+1])) {
				items[i].setAmount(items[i].getAmount()+items[i+1].getAmount()); // 6+1
				items[i+1] = null;
				//裁剪数组
				items = ArrayUtils.subarray(items, 0, items.length-1);
			}
		}
	}

	//显示购物车
	public void showBuyCart() {

		for (Item item : items) {
			System.out.println(item);
		}

	}

}
