package 建造模式.抽象工厂模式;

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
