/**
* Assignment Lab GUI
* Program: MyFirstGUI
* Programmer: Brooke Horrocks
* Date: Jun 12, 2018
*/
/**
 * 
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Brooke
 *
 */
public class MyFirstGUI extends JFrame {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * Constructor MyFirstGUI
	 */
	public MyFirstGUI() {
		setBounds(20, 20, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * Method: main
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyFirstGUI frame = new MyFirstGUI();
		Random rand = new Random();
		
		Font font1 = new Font("Helvetica", Font.BOLD, 33);
		Font font2 = new Font("Helvetica", Font.BOLD, 16);
		Font font3 = new Font("Papyrus", 3, 77); //3 is to make bold and italic. 77 is font size
		
		JLabel title = new JLabel("MyFirstGui", JLabel.CENTER);
		title.setFont(font1);
		title.setBackground(Color.BLUE);
		title.setForeground(Color.GREEN);
		title.setOpaque(true);	
		
		JLabel name = new JLabel("Name:", JLabel.CENTER);
		
		JLabel center = new JLabel("Hi", JLabel.CENTER);
		center.setFont(font3);
		center.setBackground(Color.RED);
		center.setForeground(Color.ORANGE);
		center.setOpaque(true);
		
		JButton buttonWest = new JButton("West");
		buttonWest.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				buttonWest.setBackground(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));	
			}
		});		
		
		JButton buttonEast = new JButton("East");		
		buttonEast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonEast.setBackground(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
			}
		});
		
		JTextField textField = new JTextField(16);
		
		textField.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				textField.setBackground(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
				center.setText(textField.getText());
			}
		});	
		
		JPanel panel1 = new JPanel();	
		
		frame.add(title, BorderLayout.NORTH);
		frame.add(name, BorderLayout.SOUTH);
		frame.add(center);	
		frame.add(buttonWest, BorderLayout.WEST);
		frame.add(buttonEast, BorderLayout.EAST);
		frame.add(panel1, BorderLayout.SOUTH);	
		
		textField.setFont(font2);
		textField.setOpaque(true);
		textField.setVisible(true);
				
		panel1.add(name);
		panel1.add(textField);
		panel1.setBackground(Color.GRAY);
		panel1.setOpaque(true);
		panel1.setVisible(true);
		
		frame.setVisible(true);	
		
	}

}
