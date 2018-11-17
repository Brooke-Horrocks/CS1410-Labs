/**
* Assignment Lab GUI
* Program: MyFirstWB
* Programmer: Brooke Horrocks
* Date: Jun 12, 2018
*/
package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFirstWB extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstWB frame = new MyFirstWB();
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
	public MyFirstWB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblMyfirstwb = new JLabel("MyFirstWB");
		lblMyfirstwb.setOpaque(true);
		lblMyfirstwb.setBackground(Color.BLUE);
		lblMyfirstwb.setForeground(Color.GREEN);
		lblMyfirstwb.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblMyfirstwb.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblMyfirstwb, BorderLayout.NORTH);
		
		JButton btnWest = new JButton("West");
		btnWest.setSelected(true);
		btnWest.setBackground(new Color(0, 0, 128));
		contentPane.add(btnWest, BorderLayout.WEST);
		
		JButton btnEast = new JButton("East");
		btnEast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnEast.setBackground(new Color(0, 139, 139));
		contentPane.add(btnEast, BorderLayout.EAST);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 139), null, null, null));
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel.add(lblName);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(16);
		
		JLabel lblHi = new JLabel("Hi");
		lblHi.setHorizontalAlignment(SwingConstants.CENTER);
		lblHi.setFont(new Font("Papyrus", Font.BOLD | Font.ITALIC, 77));
		lblHi.setBackground(Color.RED);
		lblHi.setOpaque(true);
		lblHi.setForeground(Color.ORANGE);
		contentPane.add(lblHi, BorderLayout.CENTER);
	}

	@SuppressWarnings("unused")
	private class SwingAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
