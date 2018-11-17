/**
* Assignment Lab Enum
* Program: CoinApp
* Programmer: Brooke Horrocks
* Date: Jun 28, 2018
*/
package labEnum;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class CoinApp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		for(Coin c : Coin.values()) {
			System.out.println(c);
			
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoinApp frame = new CoinApp();
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
	public CoinApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		JLabel label = new JLabel("");
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_1.add(label);
		label.setBackground(Color.LIGHT_GRAY);
		label.setFont(new Font("Malgun Gothic", Font.PLAIN, 30));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton cent = new JButton("");
		cent.setBackground(new Color(112, 128, 144));
		cent.setIcon(new ImageIcon(CoinApp.class.getResource("/labEnum/UsCent.png")));
		cent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				label.setText(Coin.CENT.toString());
			}
		});
		panel.add(cent);
		
		JButton nickel = new JButton("");
		nickel.setBackground(new Color(112, 128, 144));
		nickel.setIcon(new ImageIcon(CoinApp.class.getResource("/labEnum/UsNickel.png")));
		nickel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				label.setText(Coin.NICKEL.toString());
			}
		});
		panel.add(nickel);
		
		JButton dime = new JButton("");
		dime.setBackground(new Color(112, 128, 144));
		dime.setIcon(new ImageIcon(CoinApp.class.getResource("/labEnum/UsDime.png")));
		dime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				label.setText(Coin.DIME.toString());
			}
		});
		panel.add(dime);
		
		JButton quarter = new JButton("");
		quarter.setBackground(new Color(112, 128, 144));
		quarter.setIcon(new ImageIcon(CoinApp.class.getResource("/labEnum/UsQuarter.png")));
		quarter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				label.setText(Coin.QUARTER.toString());
			}
		});
		panel.add(quarter);
		
		
		
		
		
		
	}

}
