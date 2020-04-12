package adaptor;

/** Dog クラス */
class Dog implements AllLivingCreatures {

	@Override
	public void cry() {
		System.out.println(getClass().getSimpleName() 
			+ " : わん");
	}
}
