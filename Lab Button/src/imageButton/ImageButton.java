/**
* Assignment Lab Button
* Program: ImageButton
* Programmer: Brooke Horrocks
* Date: Jun 14, 2018
*/
package imageButton;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class ImageButton extends JFrame {

	
	JButton imgButton;
	Icon clickImage;
	
	private JPanel contentPane;
	
	Icon image1 = new ImageIcon(getClass().getResource("Image1.png"));
	Icon image2 = new ImageIcon(getClass().getResource("Image2.png"));


	/**
	 * Create the frame.
	 */
	public ImageButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setTitle("Lab BUtton");
		
		
		clickImage = new ImageIcon(getClass().getResource("Image3.gif"));
		
		imgButton = new JButton(image1);
		
		imgButton.setRolloverIcon(image2);
		
		this.add(imgButton);
		
		ButtonClickEventHandler buttonEventHandler = new ButtonClickEventHandler();
		
		imgButton.addActionListener(buttonEventHandler);
	}
	
	private class ButtonClickEventHandler implements ActionListener {

		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (imgButton.isRolloverEnabled()) {
				imgButton.setRolloverEnabled(false);
				imgButton.setIcon(clickImage);
			}
			else {
				imgButton.setRolloverEnabled(true);
				imgButton.setIcon(image1);
			}
		}
		
		
	}

}
