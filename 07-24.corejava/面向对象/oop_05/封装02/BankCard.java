package oop_05.��װ02;



// JavaBean 
public class BankCard {

	private int id;
	private String name;
	private double balance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		if(this.balance <= 10  ) {
			System.out.println(" ���Ǯ��  ����������ѵ���...... ");
		}
		return balance;
	}

	public void setBalance(double balance) {
		
		if(balance < 0  ) {
			System.out.println("������ ??? ");
		} else {
			this.balance = balance;
		}
		
	}

}
