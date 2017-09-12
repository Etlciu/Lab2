import java.awt.*;
import javax.swing.*;

	public class Lab2 extends JApplet
	
	{
	private Image pic;
	private ImageIcon ic;
	private Component picL;
	public JLabel lh = new JLabel("hello world");
		public void init()
		{
		setLayout(new FlowLayout() );
		pic = getImage(getCodeBase(),"hornedfrogs.jpeg");
		ic = new ImageIcon(pic);
		picL = new JLabel(ic);
		add(picL);
		add(lh);
		}
	}