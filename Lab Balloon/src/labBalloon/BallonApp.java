/**
* Assignment Lab Balloon
* Program: BallonApp
* Programmer: Brooke Horrocks
* Date: Jun 26, 2018
*/
package labBalloon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class BallonApp extends JFrame {

	private JPanel contentPane;
	Random rand = new Random();
	
	Size[] size = Size.values();
	Icon[] balloons = {new ImageIcon(getClass().getResource("balloon20.jpg")),
					   new ImageIcon(getClass().getResource("balloon40.jpg")),
					   new ImageIcon(getClass().getResource("balloon60.jpg")),
					   new ImageIcon(getClass().getResource("balloon80.jpg")),
					   new ImageIcon(getClass().getResource("balloon100.jpg"))};
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BallonApp frame = new BallonApp();
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
	public BallonApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		JPanel panel1_1 = new JPanel();
		
		JLabel lbl1 = new JLabel("");
		lbl1.setOpaque(true);
		panel1_1.add(lbl1);
		
		JLabel lbl2 = new JLabel("");
		lbl2.setOpaque(true);
		panel1_1.add(lbl2);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblLabBalloon = new JLabel("Lab Balloon");
		lblLabBalloon.setFont(new Font("Century Gothic", Font.BOLD, 40));
		panel_1.add(lblLabBalloon);
		
		JButton btnButton = new JButton("Get Random Balloons");
		panel.add(btnButton);
		
		JLabel label_1 = new JLabel("New label");
		panel.add(label_1);
		label_1.setOpaque(true);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(0, 2, 10, 20));
		
		JButton btnBalloon1 = new JButton("First Balloon");
		btnBalloon1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnBalloon1.setBackground(Color.WHITE);
		panel_2.add(btnBalloon1);
		
		JButton btnBalloon2 = new JButton("Second Balloon");
		btnBalloon2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnBalloon2.setBackground(Color.WHITE);
		panel_2.add(btnBalloon2);
		
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int int1 = rand.nextInt(Size.values().length);
				int int2 = rand.nextInt(Size.values().length);
				boolean bool1 = rand.nextBoolean();
				boolean bool2 = rand.nextBoolean();
				Balloon b1 = new Balloon(size[int1], bool1, balloons[int1]);
				Balloon b2 = new Balloon(size[int2], bool2, balloons[int2]);
				
				btnBalloon1.setIcon(balloons[int1]);
				btnBalloon1.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnBalloon1.setHorizontalTextPosition(SwingConstants.CENTER);
				btnBalloon1.setText((bool1 ? "Helium" : "Air") + " " + size[int1]); 
				
				btnBalloon2.setIcon(balloons[int2]);
				btnBalloon2.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnBalloon2.setHorizontalTextPosition(SwingConstants.CENTER);
				btnBalloon2.setText((bool2 ? "Helium" : "Air") + " " + size[int2]);
				
				label_1.setText(b1.equals(b2) ? "Balloons equal" : "Balloons NOT equal");
				if(b1.equals(b2)) {
					label_1.setBackground(Color.GREEN);
				}
				else {
					label_1.setBackground(Color.RED);
				}
			}
		});
		
	}

}
