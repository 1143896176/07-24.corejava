package ����ģʽ.���󹤳�ģʽ;

public class MercedesFactoryGermany implements MercedesFactory {

	@Override
	public AClass createAClass() {

		return new AClassGermany();
	}

	@Override
	public BClass createBClass() {
		return new BClassGermany();
	}

}
