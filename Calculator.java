import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


public class Calculator extends JFrame 
					implements ActionListener

{
	

	private JTextField results;
	

	public static final int WIDTH = 400;
	public static final int HEIGHT = 600;
	public static final int NUMBER_OF_DIGITS = 40;
	
	
	private JPanel buttonPanel;
	private JPanel resultPanel;
	
	private JButton clearButton;
	private JButton divideButton;
	private JButton multiplicationButton;
	private JButton minusButton;
	private JButton plusButton;
	private JButton equalButton;
	private JButton oneButton;
	private JButton twoButton;
	private JButton threeButton;
	private JButton fourButton;
	private JButton fiveButton;
	private JButton sixButton;
	private JButton sevenButton;
	private JButton eightButton;
	private JButton nineButton;
	private JButton decimalButton;
	private JButton nothingButton;
	private JButton nothingButton1;
	private JButton zeroButton;
	
	double number1, number2, result;	
	static int plusc=0, multiplicationc=0, dividec=0,minusc=0;
	

	public Calculator()
	
	{
		setTitle("Basic Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		setLayout(new BorderLayout());
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(5,4));
		
		resultPanel = new JPanel();
		resultPanel.setLayout(new FlowLayout());
		
		
		results = new JTextField(20);
		results.setEditable(false);
		zeroButton = new JButton("0");
		zeroButton.addActionListener(this);
		oneButton = new JButton("1");
		oneButton.addActionListener(this);
		twoButton = new JButton ("2");
		twoButton.addActionListener(this);
		threeButton = new JButton("3");
		threeButton.addActionListener(this);
		fourButton = new JButton("4");
		fourButton.addActionListener(this);
		fiveButton = new JButton ("5");
		fiveButton.addActionListener(this);
		sixButton = new JButton("6");
		sixButton.addActionListener(this);
		sevenButton = new JButton("7");
		sevenButton.addActionListener(this);
		eightButton = new JButton ("8");
		eightButton.addActionListener(this);
		nineButton = new JButton("9");
		nineButton.addActionListener(this);
		plusButton = new JButton("+");
		plusButton.addActionListener(this);
		minusButton = new JButton("-");
		minusButton.addActionListener(this);
		multiplicationButton = new JButton("x");
		multiplicationButton.addActionListener(this);
		divideButton = new JButton("/");
		divideButton.addActionListener(this);
		clearButton = new JButton ("C");
		clearButton.addActionListener(this);
		decimalButton = new JButton(".");
		decimalButton.addActionListener(this);
		nothingButton1 = new JButton("");
		nothingButton = new JButton(" ");
		equalButton = new JButton("=");
		equalButton.addActionListener(this);
		
		

		
		
	
		resultPanel.add(results);
		buttonPanel.add(nothingButton);
		buttonPanel.add(nothingButton1);
		buttonPanel.add(clearButton);
		buttonPanel.add(divideButton);
		buttonPanel.add(sevenButton);
		buttonPanel.add(eightButton);
		buttonPanel.add(nineButton);
		buttonPanel.add(multiplicationButton);
		buttonPanel.add(fourButton);
		buttonPanel.add(fiveButton);
		buttonPanel.add(sixButton);
		buttonPanel.add(minusButton);
		buttonPanel.add(oneButton);
		buttonPanel.add(twoButton);
		buttonPanel.add(threeButton);
		buttonPanel.add(plusButton);
		buttonPanel.add(zeroButton);
		buttonPanel.add(decimalButton);
		buttonPanel.add(equalButton);
		
		JButton button = new JButton();
		add(resultPanel, BorderLayout.NORTH);
		resultPanel.setBackground(Color.BLACK);
		add(buttonPanel, BorderLayout.CENTER);
		buttonPanel.setBackground(Color.BLACK);
		button.setBackground(Color.ORANGE);
		button.setOpaque(true);
		button.setBorderPainted(false);
	}
	
	public static void main(String[] args)
	
	{
		Calculator gui = new Calculator();
		gui.setVisible(true);
	}
		public void actionPerformed (ActionEvent e)
		{
			try
			{
				assumingCorrectNumberFormats (e);
			}
				
				catch (NumberFormatException e2)
				{
					results.setText( ("Error"));
				}
			
		}
		

	public void assumingCorrectNumberFormats (ActionEvent e)
	
		{	
			Object source = e.getSource();
		
			if(source== clearButton)
		
		{
			
			number1=0.0;
			number2=0.0;
			results.setText("");

		}
		
	if(source==oneButton)
	{
		results.setText("1");
	}

	if(source==twoButton)
	{
		results.setText("2");
	}
	if(source==threeButton)
	{
		results.setText("3");
	}
	if(source==fourButton)
	{
		results.setText("4");
	}
	if(source==fiveButton)
	{
		results.setText("5");
	}
	if(source==sixButton)
	{
		results.setText("6");
	}
	if(source==sevenButton)
	{
		results.setText("7");
	}
	if(source==eightButton)
	{
		results.setText("8");
	}
	if(source==nineButton)
	{
		results.setText("9");
	}
	if(source==zeroButton)
	{
		results.setText("0");
	}
	if(source==decimalButton)
	{
		results.setText(".");
	}

		if(source==plusButton)
		
		{
			number1=number_reader();
			results.setText("+");
			plusc=1;
			dividec=0;
			minusc=0;
			multiplicationc=0;
			
		}
		if(source==minusButton)
		{
			number1=number_reader();
			results.setText("-");
			plusc=0;
			dividec=0;
			minusc=1;
			multiplicationc=0;
			
		}
		if(source==divideButton)
		{
			number1=number_reader();
			results.setText("/");
			plusc=0;
			dividec=1;
			minusc=0;
			multiplicationc=0;
			
		}
		if (source==multiplicationButton)
		{
			number1=number_reader();
			results.setText("x");
			plusc=0;
			dividec=0;
			minusc=0;
			multiplicationc=1;
			
		}
		
		if(source==equalButton)
	{
			number2=number_reader();
		{
			if(plusc>0)
			{
			result=number1+number2;
			results.setText(Double.toString(result));
			}
			if(minusc>0)
			{
			result=number1-number2;
			results.setText(Double.toString(result));
			}
			if(dividec>0)
			{
			result=number1/number2;
			results.setText(Double.toString(result));
			}
			if(multiplicationc>0)
			{
			result=number1*number2;
			results.setText(Double.toString(result));
			}
		}
			
			
			
	}
		}

															
	
	public double number_reader()
	{
		double num1;
		String s;
		s=results.getText();
		num1= Double.valueOf(s);
		return num1;
	}
	
}


