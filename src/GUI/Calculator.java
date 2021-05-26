package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField textFirstNumber;
	private JTextField textSecondNumber;
	private JTextField textAnswer;
	private JButton NewButtonMluti;
	private JButton btnDivide;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFirstNumber = new JTextField();
		textFirstNumber.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textFirstNumber.setBounds(22, 29, 148, 33);
		frame.getContentPane().add(textFirstNumber);
		textFirstNumber.setColumns(10);
		
		textSecondNumber = new JTextField();
		textSecondNumber.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textSecondNumber.setColumns(10);
		textSecondNumber.setBounds(248, 29, 148, 33);
		frame.getContentPane().add(textSecondNumber);
		
		JButton NewButtonPlus = new JButton("+");
		NewButtonPlus.setForeground(Color.DARK_GRAY);
		NewButtonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double num1,num2;
					num1 = Double.parseDouble(textFirstNumber.getText());
					num2 = Double.parseDouble(textSecondNumber.getText());
					
					double ans = num1+num2;
					textAnswer.setText(Double.toString(ans));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		NewButtonPlus.setFont(new Font("Times New Roman", Font.BOLD, 20));
		NewButtonPlus.setBounds(22, 96, 109, 33);
		frame.getContentPane().add(NewButtonPlus);
		
		JButton NewButtonMinus = new JButton("-");
		NewButtonMinus.setForeground(Color.DARK_GRAY);
		NewButtonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double num1,num2;
					num1 = Double.parseDouble(textFirstNumber.getText());
					num2 = Double.parseDouble(textSecondNumber.getText());
					
					double ans = num1-num2;
					textAnswer.setText(Double.toString(ans));
				}
				catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "Enter Valid Number");
				}
			}
		});
		NewButtonMinus.setFont(new Font("Times New Roman", Font.BOLD, 20));
		NewButtonMinus.setBounds(176, 96, 109, 33);
		frame.getContentPane().add(NewButtonMinus);
		
		JLabel lblNewLabel = new JLabel("Answer : ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel.setBounds(22, 213, 94, 24);
		frame.getContentPane().add(lblNewLabel);
		
		textAnswer = new JTextField();
		textAnswer.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textAnswer.setBounds(126, 213, 300, 24);
		frame.getContentPane().add(textAnswer);
		textAnswer.setColumns(10);
		
		NewButtonMluti = new JButton("*");
		NewButtonMluti.setForeground(Color.DARK_GRAY);
		NewButtonMluti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double num1,num2;
					num1 = Double.parseDouble(textFirstNumber.getText());
					num2 = Double.parseDouble(textSecondNumber.getText());
					
					double ans = num1*num2;
					textAnswer.setText(Double.toString(ans));
				}
				catch(Exception e3) {
					JOptionPane.showMessageDialog(null, "Enter Valid Number");
				}
			}
		});
		NewButtonMluti.setFont(new Font("Times New Roman", Font.BOLD, 20));
		NewButtonMluti.setBounds(22, 139, 109, 33);
		frame.getContentPane().add(NewButtonMluti);
		
		btnDivide = new JButton("/");
		btnDivide.setForeground(Color.DARK_GRAY);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double num1,num2;
					num1 = Double.parseDouble(textFirstNumber.getText());
					num2 = Double.parseDouble(textSecondNumber.getText());
					
					double ans = num1/num2;
					textAnswer.setText(Double.toString(ans));
				}
				catch(Exception e4) {
					JOptionPane.showMessageDialog(null, "Enter Valid Number");
				}
			}
		});
		btnDivide.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnDivide.setBounds(176, 139, 109, 33);
		frame.getContentPane().add(btnDivide);
		
	}

}
