/*
 * Program Name: Lab 2
 * Student Name: Eli Rangel
 * semester: fall 2017
 * Class-section: CoSc10403-045
 * instructor: Dr. Comer
 * 
 * 
 * Program Overview: This program creates a Java applet displaying 2 images with JLabels underneath describing the Images.
 * 
 * Input: none.
 * 
 * Output: A GUI with two images shown accompanied by 2 descriptions, one description for each image.
 * 
 * Program limitations: No interactivity.
 * 
 * significant Program Variables: getImage(getCodeBase(), "url-to-image");
 * 									ImageIcon
 * 
 */




import java.awt.*;
import javax.swing.*;

	public class Lab2 extends JApplet
	
	{
	private Image pic;
	private ImageIcon ic;
	private Component picL;
	public JLabel lh = new JLabel("Horned Frogs");
	public JLabel bassLabel = new JLabel("Bass Hall");
	
		public void init()
		{
		setLayout(new FlowLayout() );
		this.setSize(300,600);
			
		//for sports team
		Font frogFont = new Font("Serif", Font.ITALIC, 30);
		lh.setForeground(Color.RED);
		lh.setFont(frogFont);
		pic = getImage(getCodeBase(),"image/frog.jpg");
		ic = new ImageIcon(pic);
		picL = new JLabel(ic);
		add(picL);
		add(lh);
		
		//for building
		Font bassHall = new Font("SansSerif", Font.PLAIN,25);
		bassLabel.setForeground(Color.BLUE);
		bassLabel.setFont(bassHall);
		
		pic = getImage(getCodeBase(), "image/Bass.jpg");
		//"ImageIcon" was done so that Java would accept "icon" as an appropriate variable. Otherwise program would have error.
		ImageIcon icon = new ImageIcon(pic);
		JLabel bass = new JLabel(icon);
		add(bass);
		add(bassLabel);	
		
		}
	}