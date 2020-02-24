import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	public MyFrame() {
		this("Sample");
	}
	
	public MyFrame(String title) {
		super(title);
		setSize(800, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
