package 建造模式.抽象工厂模式;

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
