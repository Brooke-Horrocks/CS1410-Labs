/**
* Assignment Lab GUI Layout Manager
* Program: LayoutManager
* Programmer: Brooke Horrocks
* Date: Jul 15, 2018
*/
package labGuiLayoutManager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LayoutManager extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutManager frame = new LayoutManager();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LayoutManager() {
		
		Color[] colors = new Color[] {Color.GREEN, Color.BLUE};
		
		setBackground(Color.LIGHT_GRAY);
		setTitle("GUI Walkthrough");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 1, 0, 0));
		
		JLabel label1 = new JLabel("Label1");
		label1.setOpaque(true);
		label1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBackground(Color.RED);
		contentPane.add(label1);
		
		JButton button1 = new JButton("Click Me");
		JLabel label2 = new JLabel("Hi");
		JButton button2 = new JButton("Button");
		button1.setForeground(Color.WHITE);
		button1.addActionListener(new ActionListener() {
			int index = 0;
			public void actionPerformed(ActionEvent arg0) {
				if(index == 1) {
					label2.setBackground(Color.YELLOW);
				}
				button1.setBackground(colors[index++ % colors.length]);
				
			}
		});
		button1.setBackground(Color.BLUE);
		button1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		contentPane.add(button1);
		
		
		label2.setOpaque(true);
		label2.setBackground(Color.RED);
		label2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label2);
		
		
		button2.setForeground(Color.WHITE);
		button2.setBackground(Color.BLUE);
		button2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		contentPane.add(button2);
	}

}
