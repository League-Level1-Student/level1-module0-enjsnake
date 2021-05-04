package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class I_like_fortune_cookie implements ActionListener {
	public void showButton() {
		JFrame frame=new JFrame();
		frame.setVisible(true);
	    JButton button = new JButton();
	    frame.add(button);
	    frame.pack();
	    button.addActionListener(this);
		System.out.println("Button Pressed!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
	}

}
