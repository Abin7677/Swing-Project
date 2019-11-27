package swing;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Hotel {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel window = new Hotel();
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
	public Hotel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 562, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 10, 357);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(103, 51, 351, 258);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 100, 0));
		panel_2.setBounds(10, 11, 331, 75);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblJoinIndianArmy = new JLabel("JOIN INDIAN ARMY");
		lblJoinIndianArmy.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblJoinIndianArmy.setForeground(new Color(253, 245, 230));
		lblJoinIndianArmy.setBounds(118, 11, 192, 25);
		panel_2.add(lblJoinIndianArmy);
		
		JLabel lblNewLabel = new JLabel("GOVERNMENT OF INDIA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setForeground(new Color(253, 245, 230));
		lblNewLabel.setBounds(118, 37, 151, 14);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon("C://Users/User/Downloads/images.jpg"));
		lblNewLabel_1.setBounds(24, 11, 46, 41);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("  Welcome to Join Indian Army website. Please write text ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 97, 331, 29);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("   as shown in following image to enter into the website.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(10, 118, 331, 22);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Captcha");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(20, 151, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("*");
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_5.setBounds(65, 151, 46, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(134, 151, 85, 29);
		panel_1.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Refresh");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random ran=new Random();
                int n=ran.nextInt(1000000)+1;
                String val=String.valueOf(n);
                lblNewLabel_6.setText(val);
				
			}
		});
		btnNewButton.setBackground(new Color(250, 250, 210));
		btnNewButton.setBounds(227, 154, 80, 23);
		panel_1.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(118, 191, 210, 29);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("ENTER WEBSITE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*DefaultTableModel model=(DefaultTableModel) .getModel();
				
				{
		            if(table_1.getSelectedRow() != -1) {
		               model.removeRow(table_1.getSelectedRow());
		               JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
		        	
				}
		            else {		               
		            	JOptionPane.showMessageDialog(null, "Please select a row");
		            }
				}*/
			}
		});
		btnNewButton_1.setBounds(118, 224, 123, 23);
		panel_1.add(btnNewButton_1);
	}
}
