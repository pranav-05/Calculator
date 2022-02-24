import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import java.awt.Color;
import java.io.*;
									/*CodeByPranav*/
public class MyFrame extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	private JTextField inputField;
	JButton buttonOne,buttonTwo,buttonThree,buttonFour,buttonFive,buttonSix,buttonSeven,buttonEight,buttonNine,buttonZero;
	JButton plusButton,subButton,divButton,dotButton,modButton,mulButton,clearButton,equalButton;
	JPanel contentPane;
	double num1,num2,res=0;
	String str[]= new String[2];
	String str1;
	char operand;
	public MyFrame() 
	{
	
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		setTitle("calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 478);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new CompoundBorder());
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		inputField = new JTextField();
		inputField.setBounds(27, 33, 436, 50);
		contentPane.add(inputField);
		inputField.setColumns(10);
		inputField.addActionListener(this);
		
		buttonOne = new JButton("1");
		buttonOne.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		buttonOne.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent ae){ 
		str1=inputField.getText();
		inputField.setText(str1+"1"); }});
		buttonOne.setBounds(27, 186, 66, 37);
		contentPane.add(buttonOne);
		
		buttonTwo = new JButton("2");
		buttonTwo.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent ae){ 
		str1=inputField.getText();
		inputField.setText(str1+"2"); }});
		buttonTwo.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		buttonTwo.setBounds(119, 186, 66, 37);
		contentPane.add(buttonTwo);
		
		buttonThree = new JButton("3");
		buttonThree.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		buttonThree.setBounds(217, 186, 66, 37);
		contentPane.add(buttonThree);
		buttonThree.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent ae){  
		str1=inputField.getText();
		inputField.setText(str1+"3"); }});
		
		buttonFour = new JButton("4");
		buttonFour.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent ae){  
		str1=inputField.getText();
		inputField.setText(str1+"4"); }});
		buttonFour.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		buttonFour.setBounds(27, 245, 66, 37);
		contentPane.add(buttonFour);
		
		buttonFive = new JButton("5");
		buttonFive.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent ae){  
		str1=inputField.getText();
		inputField.setText(str1+"5"); }});
		buttonFive.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		buttonFive.setBounds(119, 245, 66, 37);
		contentPane.add(buttonFive);
		
		buttonSix = new JButton("6");
		buttonSix.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		buttonSix.setBounds(217, 245, 66, 37);
		buttonSix.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent ae){  
		str1=inputField.getText();
		inputField.setText(str1+"6"); }});
		contentPane.add(buttonSix);
		
		buttonSeven = new JButton("7");
		buttonSeven.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		buttonSeven.setBounds(27, 306, 66, 37);
		buttonSeven.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent ae){  
		str1=inputField.getText();
		inputField.setText(str1+"7"); }});
		contentPane.add(buttonSeven);
		
		buttonEight = new JButton("8");
		buttonEight.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		buttonEight.setBounds(119, 306, 66, 37);
		buttonEight.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent ae){  
		str1=inputField.getText();
		inputField.setText(str1+"8"); }});
		contentPane.add(buttonEight);
		
		buttonNine = new JButton("9");
		buttonNine.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		buttonNine.setBounds(217, 306, 66, 37);
		buttonNine.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent ae){  
		str1=inputField.getText();
		inputField.setText(str1+"9"); }});
		contentPane.add(buttonNine);
		
		buttonZero = new JButton("0");
		buttonZero.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		buttonZero.setBounds(119, 366, 66, 37);
		buttonZero.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent ae){  
		str1=inputField.getText();
		inputField.setText(str1+"0"); }});
		contentPane.add(buttonZero);
		
		subButton = new JButton("-");
		subButton.setFont(new Font("Times New Roman", Font.BOLD, 23));
		subButton.setBounds(314, 181, 66, 42);
		subButton.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent ae){  
		str1=inputField.getText();
		inputField.setText(str1+"-"); }});
		contentPane.add(subButton);
		
		mulButton = new JButton("*");
		mulButton.setFont(new Font("Times New Roman", Font.BOLD, 22));
		mulButton.setBounds(390, 182, 64, 42);
		mulButton.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent ae){  
		str1=inputField.getText();
		inputField.setText(str1+"*"); }});
		contentPane.add(mulButton);
		
		plusButton = new JButton("+");
		plusButton.setFont(new Font("Times New Roman", Font.BOLD, 22));
		plusButton.setBounds(390, 242, 64, 101);
		plusButton.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent ae){  
		str1=inputField.getText();
		inputField.setText(str1+"+"); }});
		contentPane.add(plusButton);
		
		divButton = new JButton("/");
		divButton.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent ae){  
		str1=inputField.getText();
		inputField.setText(str1+"/"); }});
		divButton.setFont(new Font("Times New Roman", Font.BOLD, 22));
		divButton.setBounds(314, 244, 66, 37);
		contentPane.add(divButton);
		
		equalButton = new JButton("=");
		equalButton.setFont(new Font("Times New Roman", Font.BOLD, 24));
		equalButton.setBounds(314, 366, 140, 37);
		contentPane.add(equalButton);
		equalButton.addActionListener(this);
		
		modButton = new JButton("%");
		modButton.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		modButton.setBounds(314, 304, 66, 39);
		modButton.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent ae){  
		str1=inputField.getText();
		inputField.setText(str1+"%"); }});
		contentPane.add(modButton);
		
		dotButton = new JButton(".");
		dotButton.setFont(new Font("Times New Roman", Font.BOLD, 22));
		dotButton.setBounds(27, 366, 64, 37);
		dotButton.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent ae){  
		str1=inputField.getText();
		inputField.setText((str1+".")); }});
		contentPane.add(dotButton);
		
		clearButton = new JButton("C");
		clearButton.setFont(new Font("Times New Roman", Font.BOLD, 22));
		clearButton.setBounds(219, 366, 64, 37);
		clearButton.addActionListener(new ActionListener()
		{ public void actionPerformed(ActionEvent ae){  
		inputField.setText(""); }});
		contentPane.add(clearButton);
	}
		public void actionPerformed(ActionEvent e) throws NumberFormatException
		{
		
			if(e.getSource()==clearButton||e.getActionCommand()=="")
			{
					num1=num2=res=0.0;
					inputField.setText(String.valueOf(res));
			}
			if(e.getSource()==equalButton||e.getActionCommand()=="="
			)
			 {
					str1=inputField.getText();
					String text=inputField.getText();	
					if(text.contains("+"))
					{
						str=text.split("\\+"); /*if we don't use // before + gives an error as 
						"Tokenizing Error: java.util.regex.PatternSyntaxException, dangling metacharacter '*'" */
						num1=Double.parseDouble(str[0]);
						num2=Double.parseDouble(str[1]);
						res=num1+num2;
						inputField.setText(String.valueOf(res));
					}
					else if(text.contains("-"))
					{
						str=text.split("-");
						num1=Double.parseDouble(str[0]);
						num2=Double.parseDouble(str[1]);
						res=num1-num2;
						inputField.setText(String.valueOf(res));
					}
					else if(text.contains("/"))
					{
						str=text.split("/");
						num1=Double.parseDouble(str[0]);
						num2=Double.parseDouble(str[1]);
						res=num1/num2;
						inputField.setText(String.valueOf(res));
					}
					else if(text.contains("*"))
					{ 
					   str=text.split("\\*");
						num1=Double.parseDouble(str[0]);
						num2=Double.parseDouble(str[1]);
						res=num1*num2;
						inputField.setText(String.valueOf(res));
					}
					else if(text.contains("%"))
					{
						str=text.split("%");
						num1=Double.parseDouble(str[0]);
						num2=Double.parseDouble(str[1]);
						res=num1%num2;
						inputField.setText(String.valueOf(res));
					}
				}
			if(res==0)
			{
				inputField.setText("0");
			}
		}
}
class Calculator
{
	public static void main(String[] args) throws Exception
	{
	
			{
				MyFrame frame = new MyFrame();
				frame.setVisible(true);
			}	
		}
}
                      /*CodeByPranav*/

