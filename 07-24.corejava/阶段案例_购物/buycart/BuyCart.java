package buycart;

import java.util.ArrayList;
import java.util.List;

public class BuyCart {

	private List<Item> items = new ArrayList<Item>();

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
	public void addItem(Item item) {
		
		if(items.contains(item)) {  // contains  默认调用被比较类型的 equals 方法 , 如果不重写就毫无意义 . 
			for (Item i : items) {
				if(i.equals(item)) {
					i.setAmount(i.getAmount() + item.getAmount() );
				}
			}
		} else {
			items.add(item);
		}
		
	}
	

//	public void handler() {
//		for (int i = 0; i < items.length - 1; i++) {
//			if (items[i].equals(items[i + 1])) {
//				items[i].setAmount(items[i].getAmount() + items[i + 1].getAmount()); // 6+1
//				items[i + 1] = null;
//				// 裁剪数组
//				items = ArrayUtils.subarray(items, 0, items.length - 1);
//			}
//		}
//	}

	// 显示购物车
	public void showBuyCart() {

		for (Item item : items) {
			System.out.println(item);
		}

	}

}
