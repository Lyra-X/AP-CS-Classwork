import javax.swing.JFrame;
import java.awt.GridLayout;

public class Main extends JFrame {
	
	private static final long serialVersionUID = 1L;
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("贪吃蛇");
		setResizable(false);
		
		init();
	}
	public void init() {
		setLayout(new GridLayout(1, 1, 0, 0));
	
		Screen s = new Screen();
		add(s);
		
		pack();
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Main();
	}
}
