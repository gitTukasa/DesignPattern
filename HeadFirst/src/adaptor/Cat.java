package adaptor;

/** Cat クラス  */
class Cat implements AllLivingCreatures {

	@Override
	public void cry() {
		System.out.println(getClass().getSimpleName()
			+ " : にゃー");
	}
}
