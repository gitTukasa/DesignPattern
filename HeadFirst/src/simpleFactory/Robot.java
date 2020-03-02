package simpleFactory;

public class Robot implements Product{
	private String name = "Robot";
	private int num;


	@Override
	public Product setName(String name) {
		this.name = name;
		return this;
	}

	@Override
	public Product setNum(int num) {
		this.num = num; 
		return this;
	}

	@Override
	public String toString() {
		return /*getClass().getName() + */
				name + ", " + num;
	}
	
	

}
