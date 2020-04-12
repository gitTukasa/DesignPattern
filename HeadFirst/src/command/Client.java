package command;

import java.util.function.Function;

class Client {
	
	public static void main(String... args) {
		Function<String, Command> func = s ->
		new ConcreteCommand1(new ConcreteReceiver());

		Function<String, Command> func2 = s ->
		new Command(new ConcreteReceiver()) {
			@Override
			public void execute() {
			System.out.println(s);
			}
		;};

		Invoker invoker = new Invoker();
		invoker.list.add(new ConcreteCommand1(
				new ConcreteReceiver()));
		
		invoker.list.add(func.apply("a"));
		invoker.list.add(func2.apply("a"));
		invoker.actionAll();
	}
	
}
