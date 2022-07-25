import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;


public class main extends JFrame {
	
	private JPanel contentPane;
	JLabel lbluserN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 * @return 
	 */
	public main() {
		setTitle("MAIN");
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\FILES\\ECLIPSE\\COPL\\img\\login1.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 462);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME MAH BOI");
		lblNewLabel.setFont(new Font("Titillium Web", Font.BOLD, 33));
		lblNewLabel.setBounds(205, 90, 295, 66);
		contentPane.add(lblNewLabel);
		
		JLabel lblYouJustLogged = new JLabel("You just logged in!");
		lblYouJustLogged.setFont(new Font("Titillium Web", Font.ITALIC, 33));
		lblYouJustLogged.setBounds(230, 168, 245, 66);
		contentPane.add(lblYouJustLogged);
		
		JButton btnExit1 = new JButton("Exit");
		btnExit1.setForeground(Color.WHITE);
		btnExit1.setBackground(Color.RED);
		btnExit1.setBounds(308, 312, 89, 23);
		contentPane.add(btnExit1);
		btnExit1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		lbluserN = new JLabel();
		lbluserN.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbluserN.setBounds(314, 243, 78, 42);
		contentPane.add(lbluserN);
	}
}
