/**
* Assignment Lab Button
* Program: ImageButtonApp
* Programmer: Brooke Horrocks
* Date: Jun 14, 2018
*/
package imageButton;

import java.awt.EventQueue;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ImageButtonApp extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImageButton frame = new ImageButton();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

}
