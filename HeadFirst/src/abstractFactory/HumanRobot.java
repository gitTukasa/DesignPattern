package abstractFactory;

public class HumanRobot implements Product{

	@Override
	public void say() {
		System.out.println("Hello");
		
	}

	@Override
	public void onCreate() {
		System.out.println("人型ロボットを作成しました");
	}
}
