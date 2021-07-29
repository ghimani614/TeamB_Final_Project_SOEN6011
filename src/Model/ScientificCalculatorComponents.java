package Model;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Model.ScientificCalculatorComponents;
//import View.ScientificCalculator.FunctionHandler;
import Controller.CalculationForFunction4;



public class ScientificCalculatorComponents {
	
	public FunctionHandler functionHandler;
	public interface FunctionHandler { 
		void updateData(JFrame frame);
		Double findResult(JFrame frame);
	}
	
	public JFrame frame;
	private JTextField textFieldResult;
	
	/**
	 * Create the application.
	 */
	public ScientificCalculatorComponents() { //constructor to initialize the structure of calculator
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 501, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 467, 32);
		frame.getContentPane().add(lblNewLabel);
		
		//********TextField Result*****
		textFieldResult = new JTextField();
		textFieldResult.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldResult.setFont(new Font("Tahoma", Font.BOLD, 21));
		textFieldResult.setBounds(10, 43, 467, 82);
		frame.getContentPane().add(textFieldResult);
		textFieldResult.setColumns(10);
		textFieldResult.setEditable(false);
		
		//********Button 1**********
		JButton btnOne = new JButton("1");
		btnOne.setEnabled(false);
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textFieldResult.getText();
				if(input.contains("ERROR")) {
					input = "";
				}
				
				input += btnOne.getText();
				textFieldResult.setText(input);
			}
		});
		btnOne.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnOne.setBounds(20, 219, 80, 62);
		frame.getContentPane().add(btnOne);
		
		//********Button 2******************
		JButton btnTwo = new JButton("2");
		btnTwo.setEnabled(false);
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textFieldResult.getText();
				if(input.contains("ERROR")) {
					input = "";
				}
					
				input += btnTwo.getText();
				textFieldResult.setText(input);
			}
		});
		btnTwo.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnTwo.setBounds(110, 219, 80, 62);
		frame.getContentPane().add(btnTwo);
		
		
		//********Button 3******************
		JButton btnThree = new JButton("3");
		btnThree.setEnabled(false);
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textFieldResult.getText();
				if(input.contains("ERROR")) {
					input = "";
				}
					
				input += btnThree.getText();
				textFieldResult.setText(input);
			}
		});
		btnThree.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnThree.setBounds(200, 219, 80, 62);
		frame.getContentPane().add(btnThree);
		
		
		//********Button 4******************
		JButton btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textFieldResult.getText();
				if(input.contains("ERROR")) {
					input = "";
				}
					
				input += btnFour.getText();
				textFieldResult.setText(input);
			}
		});
		btnFour.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnFour.setBounds(20, 292, 80, 62);
		frame.getContentPane().add(btnFour);
		btnFour.setEnabled(false);
		
		
		//********Button 5******************
		JButton btnFive = new JButton("5");
		btnFive.setEnabled(false);
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textFieldResult.getText();
				if(input.contains("ERROR")) {
					input = "";
				}
					
				input += btnFive.getText();
				textFieldResult.setText(input);
			}
		});
		btnFive.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnFive.setBounds(110, 292, 80, 62);
		frame.getContentPane().add(btnFive);
		
		
		//********Button 6******************
		JButton btnSix = new JButton("6");
		btnSix.setEnabled(false);
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textFieldResult.getText();
				if(input.contains("ERROR")) {
					input = "";
				}
					
				input += btnSix.getText();
				textFieldResult.setText(input);
			}
		});
		btnSix.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnSix.setBounds(200, 292, 80, 62);
		frame.getContentPane().add(btnSix);
		
		
		//********Button 7******************
		JButton btnSeven = new JButton("7");
		btnSeven.setEnabled(false);
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textFieldResult.getText();
				if(input.contains("ERROR")) {
					input = "";
				}
					
				input += btnSeven.getText();
				textFieldResult.setText(input);
			}
		});
		btnSeven.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnSeven.setBounds(20, 365, 80, 62);
		frame.getContentPane().add(btnSeven);
		
		//********Button 8******************
		JButton btnEight = new JButton("8");
		btnEight.setEnabled(false);
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textFieldResult.getText();
				if(input.contains("ERROR")) {
					input = "";
				}
				
				input += btnEight.getText();
				textFieldResult.setText(input);
			}
		});
		btnEight.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnEight.setBounds(110, 365, 80, 62);
		frame.getContentPane().add(btnEight);
		
		
		//********Button 9******************
		JButton btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textFieldResult.getText();
				if(input.contains("ERROR")) {
					input = "";
				}
					
				input += btnNine.getText();
				textFieldResult.setText(input);
			}
		});
		btnNine.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNine.setBounds(200, 365, 80, 62);
		frame.getContentPane().add(btnNine);
		btnNine.setEnabled(false);
		
		
		//********Button 0******************
		JButton btnZero = new JButton("0");
		btnZero.setEnabled(false);
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textFieldResult.getText();
				
				if(input.contains("ERROR")) {
					input = "";
				}
				
				input += btnZero.getText();
				textFieldResult.setText(input);
			}
		});
		btnZero.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnZero.setBounds(110, 438, 80, 62);
		frame.getContentPane().add(btnZero);
		
		
		//********Button Clear**************
		JButton btnClear = new JButton("C");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldResult.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnClear.setBounds(110, 146, 80, 62);
		frame.getContentPane().add(btnClear);
		
		
		//********Button BackSpace**********
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.setEnabled(false);
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String input = textFieldResult.getText();
				
				if(input.length() > 0) {
					
					if(input.contains("ERROR")) {
						input = "";
						textFieldResult.setText(input);
						
					}else {
						
					String resultToDisplay = input.substring(0, input.length()-1);
					textFieldResult.setText(resultToDisplay);
					}
				}
			}
		});
		btnBackSpace.setFont(new Font("wingdings", Font.BOLD, 21));
		btnBackSpace.setBounds(200, 146, 80, 62);
		frame.getContentPane().add(btnBackSpace);
		
		
		//********Button Dot****************
		JButton btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textFieldResult.getText();
				if(input.contains("ERROR")) {
					input = "";
				}
				
				input += btnDot.getText();
				textFieldResult.setText(input);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnDot.setBounds(200, 438, 80, 62);
		frame.getContentPane().add(btnDot);
		
		
		//********Button Negative***********
		JButton btnNegative = new JButton("-");
		btnNegative.setEnabled(false);
		btnNegative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textFieldResult.getText();
				if(input.isEmpty()) {
					textFieldResult.setText(btnNegative.getText());
				}else {
					
					textFieldResult.setText("ERROR"); //Cannot put MINUS in between digits!
				}
			}
		});
		btnNegative.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNegative.setBounds(20, 438, 80, 62);
		frame.getContentPane().add(btnNegative);
		
		
		//********Button Equal**************
		JButton btnEqual = new JButton("=");
		btnEqual.setEnabled(false);
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnEqual.setBounds(359, 438, 100, 62);
		frame.getContentPane().add(btnEqual);
		
		btnEqual.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(functionHandler instanceof CalculationForFunction4) {
					textFieldResult.setText(functionHandler.findResult(frame).toString());
				}else {
					
				}
				
			}
		});
		
		
		
		//********Button Function1**********
		JButton btnFunction1 = new JButton("F1");
		btnFunction1.setEnabled(false);
		btnFunction1.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnFunction1.setBounds(359, 146, 100, 62);
		frame.getContentPane().add(btnFunction1);
		
		//********Button Function2**********
		JButton btnFunction2 = new JButton("F2");
		btnFunction2.setEnabled(false);
		btnFunction2.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnFunction2.setBounds(359, 219, 100, 62);
		frame.getContentPane().add(btnFunction2);
		
		//********Button Function3**********
		JButton btnFunction3 = new JButton("F3");
		btnFunction3.setEnabled(false);
		btnFunction3.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnFunction3.setBounds(359, 289, 100, 62);
		frame.getContentPane().add(btnFunction3);
		
		//********Button Function4**********
		JButton btnFunction4 = new JButton("x^y");
		btnFunction4.setEnabled(false);
		btnFunction4.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnFunction4.setBounds(359, 362, 100, 62);
		frame.getContentPane().add(btnFunction4);
		
		
		btnFunction4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				functionHandler =  new CalculationForFunction4();
				functionHandler.updateData(frame);
				
			}
		});
		
		//********Button ON/OFF************
		JButton btnOn = new JButton("ON");
		btnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(btnOn.getText().equals("ON")) { //when we switch Calculator ON
					
					btnOn.setText("OFF");
					
					textFieldResult.setEditable(true);
					
					btnOne.setEnabled(true);
					btnTwo.setEnabled(true);
					btnThree.setEnabled(true);
					btnFour.setEnabled(true);
					btnFive.setEnabled(true);
					btnSix.setEnabled(true);
					btnSeven.setEnabled(true);
					btnEight.setEnabled(true);
					btnNine.setEnabled(true);
					btnZero.setEnabled(true);
					
					btnFunction1.setEnabled(true);
					btnFunction2.setEnabled(true);
					btnFunction3.setEnabled(true);
					btnFunction4.setEnabled(true);
					
					btnDot.setEnabled(true);
					btnClear.setEnabled(true);
					btnNegative.setEnabled(true);
					btnBackSpace.setEnabled(true);
					
					btnEqual.setEnabled(true);
					
				}else { //case when we switch the Calculator OFF
					
					btnOn.setText("ON");
					
					textFieldResult.setText("");
					textFieldResult.setEditable(false);
					
					btnOne.setEnabled(false);
					btnTwo.setEnabled(false);
					btnThree.setEnabled(false);
					btnFour.setEnabled(false);
					btnFive.setEnabled(false);
					btnSix.setEnabled(false);
					btnSeven.setEnabled(false);
					btnEight.setEnabled(false);
					btnNine.setEnabled(false);
					btnZero.setEnabled(false);
					
					btnFunction1.setEnabled(false);
					btnFunction2.setEnabled(false);
					btnFunction3.setEnabled(false);
					btnFunction4.setEnabled(false);
					
					btnDot.setEnabled(false);
					btnClear.setEnabled(false);
					btnNegative.setEnabled(false);
					btnBackSpace.setEnabled(false);
					
					btnEqual.setEnabled(false);
					
				}
				
			}
		});
		btnOn.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnOn.setBounds(20, 146, 80, 62);
		frame.getContentPane().add(btnOn);
	}
}

