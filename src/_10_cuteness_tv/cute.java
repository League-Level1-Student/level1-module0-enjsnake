package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cute {
	
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton ducks=new JButton();
	JButton frog=new JButton();
	JButton unicorn=new JButton();
	
	void run(){
		frame.add(panel);
		frame.setVisible(true);
		ducks.setText("Watch a video about ducks!");
		frog.setText("Watch a video about a frog!");
		unicorn.setText("Watch this video about a unicorn");
		ducks.addActionListener(null);
		frog.addActionListener(null);
		unicorn.addActionListener(null);
		panel.add(frog);
		panel.add(ducks);
		panel.add(unicorn);
		frame.pack();
	}
	public void actionPerformed(ActionEvent arg0) {
		JButton ButtonPressed = (JButton) arg0.getSource();
		if(ButtonPressed== ducks) {
			showDucks();
		}
		else if(ButtonPressed == frog) {
			showFrog();
		}
		else {
			showFluffyUnicorns();
		}
	
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}
	

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}
	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] { 
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

}
