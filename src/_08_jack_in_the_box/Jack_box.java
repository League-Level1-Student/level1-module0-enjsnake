package _08_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jack_box implements ActionListener {
	int timesClicked = 0;;

	public static void main(String[] args) {
		new Jack_box().setup();
	}

	public void actionPerformed(ActionEvent e) {
		timesClicked++;
		if (timesClicked %5 == 0) {
			showPicture("jackInTheBox.png");
		}
	}

	public void setup() {
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		JButton button = new JButton();
		label.add(button);
		frame.add(label);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		button.setSize(450, 450);
		button.setText("Click me");
		button.addActionListener(this);
	}

	private void showPicture(String fileName) {
		try {
			JLabel imageLabel = createLabelImage(fileName);
			playSound("homer-woohoo.wav");
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel createLabelImage(String fileName) {
	     try {
		          URL imageURL = getClass().getResource(fileName);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	           } else {
	                Icon icon = new ImageIcon(imageURL);
	                JLabel imageLabel = new JLabel(icon);
	                return imageLabel;
	          }
	      } catch (Exception e) {
	           System.err.println("Could not find image " + fileName);
	           return new JLabel();
	     }
	 }
	private void playSound(String soundFile) { 
	      try {
	           AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	           sound.play();
	      } catch (Exception e) {
	           e.printStackTrace();
	      }
	 }



}
