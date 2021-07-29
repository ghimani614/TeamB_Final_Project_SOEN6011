package View;
import java.awt.EventQueue;

import Model.ScientificCalculatorComponents;
import Model.ScientificCalculatorComponents.FunctionHandler;

public class ScientificCalculator {

	//private JFrame frame;
	//private JTextField textFieldResult;

	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCalculatorComponents window = new ScientificCalculatorComponents();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * @wbp.parser.entryPoint
	 */
	public ScientificCalculator() {
		
	}
		
}