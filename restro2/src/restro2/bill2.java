package restro2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bill2 {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill2 window = new bill2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bill2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 717, 509);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 30));
		lblNewLabel.setBounds(279, 11, 213, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("QNTY:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(90, 252, 92, 27);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("ITEMS:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(90, 142, 92, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "TEA-rs20", "COLD COFFEE-rs20", "ICE CREAM-rs40"}));
		c1.setBounds(210, 152, 433, 22);
		frame.getContentPane().add(c1);
		
		t1 = new JTextField();
		t1.setBounds(215, 252, 428, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("ORDER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
				String qnty=t1.getText();
				int q=Integer.parseInt(qnty); //type casting for str to int
				int bill=0;
				if(item.equals("TEA-rs20")) {
					bill=q*20;
					JOptionPane.showMessageDialog(btnNewButton, "HELLO\n select item:"+item+"\n quntity:"+q+"\n your bill:"+bill);
					
					
				}
				else if(item.equals("COLD COFFEE-rs20")) {
					bill=q*20;
					JOptionPane.showMessageDialog(btnNewButton, "HELLO\n select item:"+item+"\n quntity:"+q+"\n your bill:"+bill);
				}
				else if(item.equals("ICE CREAM -rs40")) {
					bill=q*40;
					JOptionPane.showMessageDialog(btnNewButton, "HELLO\n select item:"+item+"\n quntity:"+q+"\n your bill:"+bill);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(239, 378, 177, 34);
		frame.getContentPane().add(btnNewButton);
	}
}
