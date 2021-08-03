package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sound_Effects implements ActionListener {
	JButton firstSound=new JButton();
	JButton secondSound=new JButton();
	JButton thirdSound=new JButton();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sound_Effects().setup();
	}

	public void setup() {
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		
		firstSound.addActionListener(this);
		secondSound.addActionListener(this);
		thirdSound.addActionListener(this);
		frame.add(panel);
		frame.setSize(500,500);
		thirdSound.setText("This is a sound");
		secondSound.setText("This is also a sound");
		firstSound.setText("Here is a sound for you");
		panel.add(firstSound);
		panel.add(secondSound);
		panel.add(thirdSound);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack(); 
	}
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed== firstSound) {
			//playSound("sawing-wood-daniel-simon.wav");
			System.out.println("the first button was pressed");
			
		}
		else if(buttonPressed==secondSound) {
			System.out.println("the second button was pressed");
		}
		else {
			System.out.println("The third button was pressed");
		}
	}
	/*private void playSound(String soundFile) {
		String path = "src/_03_gui_from_scratch/_3_sound_effects_machine/";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		
	}*/


	
}
