package ����ģʽ.���󹤳�ģʽ;

public class MercedesFactoryCN implements MercedesFactory {

	@Override
	public AClass createAClass() {
		
		return new AClassCN();
	}

	@Override
	public BClass createBClass() {
		
		return new BClassCN();
	}

}
