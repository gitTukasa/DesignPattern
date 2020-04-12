import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TestFrame extends JFrame implements KeyListener{
	private int width = 840;
	private int height = 600;
	int b = 1;
	int aaa;
	
	
	public TestFrame(String title) {
		super(title);
		setSize(width, height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		addKeyListener(this);
		setVisible(true);
		
		Container contentPane = getContentPane();
		contentPane.add(new JLabel("S"));
	}
	
	@Override
	public void update(Graphics g) {
		paint(g);
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(getBackground());
		g.fillRect(0, 0, width, height);
		g.setColor(Color.blue);
		if (aaa == width - 10) {
			b = -1;
		}else if(aaa == 10) {
			b = 1;
		}
		aaa = aaa + b;
		g.fillRect(10, height - 50, aaa, 20);

		g.setColor(Color.GREEN);
		g.fillRect(10, height - 50, 20, -aaa);
		g.setColor(Color.black);
		g.drawString("test", 50, 50);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
	}
}
