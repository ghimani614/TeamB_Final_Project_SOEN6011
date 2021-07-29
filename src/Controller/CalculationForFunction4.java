package Controller;

import javax.swing.JFrame;
import javax.swing.JTextField;

import Model.ScientificCalculatorComponents;

public class CalculationForFunction4 implements ScientificCalculatorComponents.FunctionHandler{

	ScientificCalculatorComponents.FunctionHandler functionalHandler = this;
	JFrame frame;
	Double baseValue;
	Double powerValue;
	Double result = 1.0;
	
	@Override
	public void updateData(JFrame frame) {
		
		this.frame = frame;
		//JTextField displayedResult = (JTextField) frame.getContentPane().findComponentAt(10, 43);
		JTextField displayedValue = (JTextField) frame.getContentPane().getComponent(1);
		
		if(displayedValue.getText().isEmpty()) {
			displayedValue.setText("Select Base Value first");
			
		}else if(!(displayedValue.getText().equals("ERROR")) && !(displayedValue.getText().equals("-"))) {
			
			baseValue = Double.parseDouble(displayedValue.getText());
			displayedValue.setText("");
		}else {
			baseValue = 0.0;
			displayedValue.setText("");
		}
	}

	@Override
	public Double findResult(JFrame frame) {
		
		JTextField displayedValue = (JTextField) frame.getContentPane().getComponent(1);
		
		if(!displayedValue.getText().isEmpty()) {
			if(!displayedValue.getText().equals("ERROR") && !displayedValue.getText().equals("-")) {
				powerValue = Double.parseDouble(displayedValue.getText());
			}
		}else {
			displayedValue.setText("ERROR");
		}
		
		if(powerValue % 1 == 0 && powerValue > 0) { //for positive integer powers
			for(int i = 1; i <= powerValue; i++) {
				result *= baseValue;
			}
		}else if(powerValue < 0 && powerValue % 1 == 0) { //for negative integer powers
			
			baseValue = 1 / baseValue;
			powerValue = -1 * powerValue;
			
			for(int i = 1; i <= powerValue; i++) {
				result *= baseValue;
			}
		}else if(powerValue % 1 != 0) { //for non-integer powers e.g. square root, cube root etc.
			result = findRoot(baseValue, powerValue);
		}
		
		
//		System.out.println(baseValue.toString());
//		System.out.println(powerValue.toString());
//		
//		System.out.println(result.toString());
		
		return result;
	}
	
	double findRoot(Double base, Double power) {
		
		double temporary;
		double root = base/2;
		
		do {
			
			temporary = root;
			root = (temporary + (base/temporary))/2 ;
			
		} while((temporary-root)!= 0);
		
		return root;
	}


	
}
