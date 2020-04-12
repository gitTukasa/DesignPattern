import javax.swing.JFrame;

public class Test {

	public static void main(String[] args) {
		
		JFrame testFrame = new TestFrame("Test Frame");
		
		Runnable run = () ->{
			final long FPS = 60;
			long nowTime = System.currentTimeMillis();
			long oldTime;
			long sleepTime = 0;

			while(true) {
				oldTime = nowTime; 

				testFrame.repaint();

				nowTime = System.currentTimeMillis();
				sleepTime = 1000/FPS - nowTime - oldTime;
				if (sleepTime < 10) sleepTime = 10;
				System.out.println(sleepTime);
				
				try{
					Thread.sleep(sleepTime);
						
				}catch(InterruptedException e) {

				}
			}
		};
		run.run();
	}
}