package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.function.IntBinaryOperator;

import javax.swing.JTextField;

public class CalculatorActionListener implements ActionListener{
	String value1, value2;
	String operator;

	private JTextField textField;

	public CalculatorActionListener(JTextField textField) {
		this.textField = textField; 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent: " + e.getActionCommand()); // Prints action event to the console for the sake of the programmer
		switch (e.getActionCommand()) { //For user input in each possible case 
			case "0": 
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				textField.setText(""); //Clears the text field before the next operation
				textField.setText(textField.getText() + e.getActionCommand()); //displays what the user clicked in the text field
				break;
			case "C":
				textField.setText(""); //Places an empty string in the text field which is equivalent to clearing it
				break;
			case "+":	
			case "-":
			case "x":
			case "/":
			case "%":
				value1 = textField.getText(); //sets value1 to what is in the text field
				textField.setText(""); //clears the text field
				operator = e.getActionCommand(); //sets operator to the button the user pushed
				break;
			case "U":
				operator = e.getActionCommand(); 
			case "=":
				value2 = textField.getText(); //sets value2 to the value entered right before equals
				compute();	//calls the compute method
				break;
		}	
		
	}
	private void compute() {
		switch(operator) {
		case "+": 
			value1 = Integer.toString(Integer.parseInt(value1) + Integer.parseInt(value2)); //value 1 and value to are parsed for an int then added																			
			textField.setText(value1);									//then set to a string which is then set to value1 and displayed in the text field
			break;
		case "-":
			value1 = Integer.toString(Integer.parseInt(value1) - Integer.parseInt(value2)); //same but subtracted
			textField.setText(value1);
			break;
		case "x":
			value1 = Integer.toString(Integer.parseInt(value1) * Integer.parseInt(value2)); //Multiplied
			textField.setText(value1);
			break;
		case "/":
			try {
			value1 = Integer.toString(Integer.parseInt(value1) / Integer.parseInt(value2));// etc
			textField.setText(value1);
			}catch(ArithmeticException f) {
				textField.setText("ERR:Undefined");
				f.getMessage();
			}
			break;
		case "%":
			value1 = Integer.toString(Integer.parseInt(value1) % Integer.parseInt(value2)); //remainder
			textField.setText(value1);
			break;
		case "U":
			value1 = Integer.toString(Integer.parseInt(textField.getText()) * -1); //Takes string in the text field.
			textField.setText(value1);											// Parses it into and int and multiplies by -1. 
			break;																//then the new value1 is displayed in the text field
		}
		
	}
}