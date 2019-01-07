package Calculator1;

import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;

public class Calc extends JFrame implements ActionListener {
	
	Container contentpane;
	JPanel DisplayPanel,ControlPanel;
	JTextField txt;
	JButton one,two,three,four,five,six,seven,eight,nine,zero;
	JButton plus,min,mul,div,log,CLR,exp;
	JButton eq,addSub,dot,memread,memcancel,memplus;
	JButton sqrt,sin,cos,tan,onebyx;
	double tempnum,tempnextnum,result,ans;
	static double ValueInMem;
	int num1=0,num2=0;
	int MemPlusFlag=1,RepeatFlag=0;
	char ch;
	Calc()
	{
		JButton btnNewButton = new JButton("New button");
		getContentPane().add(btnNewButton, BorderLayout.NORTH);
		contentpane=getContentPane();
		contentpane.setLayout(new BorderLayout());
		JPanel DisplayPanel =new JPanel();
		txt=new JTextField(30);
		txt.setHorizontalAlignment(SwingConstants.RIGHT);
		txt.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent keyevent) {
				char ch=keyevent.getKeyChar();
				if(ch>='0' && ch<='9') {
				}
				else {
					keyevent.consume();
				}
			}
		});
		DisplayPanel.add(txt);
		ControlPanel=new JPanel();
		contentpane.add("Center",ControlPanel);
		contentpane.add("North",DisplayPanel);
		ControlPanel.setLayout(new GridLayout(7,4,5,5));
		memcancel=new JButton("MC");
		ControlPanel.add(memcancel);memcancel.addActionListener(this);
		one=new JButton("1");
		ControlPanel.add(one);
		one.addActionListener(this);
		two=new JButton("2");
		ControlPanel.add(two);
		two.addActionListener(this);
		three=new JButton("3");
		ControlPanel.add(three);
		three.addActionListener(this);
		memread=new JButton("MR");
		ControlPanel.add(memread);
		memread.addActionListener(this);
		four=new JButton("4");
		ControlPanel.add(four);
		four.addActionListener(this);
		five=new JButton("5");
		ControlPanel.add(five);
		five.addActionListener(this);
		six=new JButton("6");
		ControlPanel.add(six);
		six.addActionListener(this);
		memplus=new JButton("M+");
		ControlPanel.add(memplus);
		memplus.addActionListener(this);
		seven=new JButton("7");
		ControlPanel.add(seven);
		seven.addActionListener(this);
		eight=new JButton("8");
		ControlPanel.add(eight);
		eight.addActionListener(this);
		nine=new JButton("9");
		ControlPanel.add(nine);
		nine.addActionListener(this);
		zero=new JButton("0");
		ControlPanel.add(zero);
		zero.addActionListener(this);
		addSub=new JButton("+/-");
		ControlPanel.add(addSub);
		addSub.addActionListener(this);
		dot=new JButton(".");
		ControlPanel.add(dot);
		dot.addActionListener(this);
		eq=new JButton("=");
		ControlPanel.add(eq);
		eq.addActionListener(this);
		plus=new JButton("+");
		ControlPanel.add(plus);
		plus.addActionListener(this);
		min=new JButton("-");
		ControlPanel.add(min);
		min.addActionListener(this);mul=new JButton("*");
		ControlPanel.add(mul);
		mul.addActionListener(this);
		div=new JButton("/");
		ControlPanel.add(div);
		div.addActionListener(this);
		sqrt=new JButton("Sqrt");
		ControlPanel.add(sqrt);
		sqrt.addActionListener(this);
		log=new JButton("LOG");
		ControlPanel.add(log);
		log.addActionListener(this);
		sin=new JButton("SIN");
		ControlPanel.add(sin);
		sin.addActionListener(this);
		cos=new JButton("COS");
		ControlPanel.add(cos);
		cos.addActionListener(this);
		tan=new JButton("TAN");
		ControlPanel.add(tan);
		tan.addActionListener(this);
		exp=new JButton("Exp");
		ControlPanel.add(exp);
		exp.addActionListener(this);
		CLR=new JButton("AC");
		ControlPanel.add(CLR);
		CLR.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s=e.getActionCommand();
		if(s.equals("1")) {
			if(RepeatFlag==0) {
				txt.setText(txt.getText()+"1");
			}
			else {
				txt.setText("");
				txt.setText(txt.getText()+"1");
				RepeatFlag=0;
			}
		}
		if(s.equals("2")) {
			if(RepeatFlag==0) {
				txt.setText(txt.getText()+"2");
			}
			else {
				txt.setText("");
				txt.setText(txt.getText()+"2");
				RepeatFlag=0;
			}
		}
		if(s.equals("3")) {
			if(RepeatFlag==0) {
				txt.setText(txt.getText()+"3");
			}
			else {
				txt.setText("");
				txt.setText(txt.getText()+"3");
				RepeatFlag=0;
			}
		}
		if(s.equals("4")) {
			if(RepeatFlag==0) {
				txt.setText(txt.getText()+"4");
			}
			else {
				txt.setText("");
				txt.setText(txt.getText()+"4");
				RepeatFlag=0;
			}
		}
		if(s.equals("5")) {
			if(RepeatFlag==0) {
				txt.setText(txt.getText()+"5");
			}
			else {
				txt.setText("");
				txt.setText(txt.getText()+"5");
				RepeatFlag=0;
			}
		}
		if(s.equals("6")) {
			if(RepeatFlag==0) {
				txt.setText(txt.getText()+"6");
			}
			else {
				txt.setText("");
				txt.setText(txt.getText()+"6");
				RepeatFlag=0;
			}
		}
		if(s.equals("7")) {
			if(RepeatFlag==0) {
				txt.setText(txt.getText()+"7");
			}
			else {
				txt.setText("");
				txt.setText(txt.getText()+"7");
				RepeatFlag=0;
			}
		}
		if(s.equals("8")) {
			if(RepeatFlag==0) {txt.setText(txt.getText()+"8");
			}
			else {
				txt.setText("");
				txt.setText(txt.getText()+"8");
				RepeatFlag=0;
			}
		}
		if(s.equals("9")) {
			if(RepeatFlag==0) {
				txt.setText(txt.getText()+"9");
			}
			else {
				txt.setText("");
				txt.setText(txt.getText()+"9");
				RepeatFlag=0;
			}
		}
		if(s.equals("0")) {
			if(RepeatFlag==0) {
				txt.setText(txt.getText()+"0");
			}
			else {
				txt.setText("");
				txt.setText(txt.getText()+"0");
				RepeatFlag=0;
			}
		}
		if(s.equals("AC")) {
			txt.setText("");
			num1=0;
			num2=0;
			RepeatFlag=0;
		}
		if(s.equals("+/-")) {
			if(num1==0) {
				txt.setText("-"+txt.getText());
				num1=1;
			}
			else {
				txt.setText(txt.getText());
			}
		}
		if(s.equals(".")) {
			if(num2==0) {
				txt.setText("."+txt.getText());
				num2=1;
			}
			else {
				txt.setText(txt.getText());
			}
		}
		if(s.equals("+")) {
			if(txt.getText().equals("")) {
				txt.setText("");
				tempnum=0;
				ch='+';
			}
			else{
				tempnum=Double.parseDouble(txt.getText());
				txt.setText("");
				ch='+';
				num2=0;
				num1=0;
			}
			txt.requestFocus();
		}
		if(s.equals("-")) {
			if(txt.getText().equals("")) {
				txt.setText("");
				tempnum=0;
				ch='-';
			}
			else{
				tempnum=Double.parseDouble(txt.getText());
				txt.setText("");
				ch='-';
				num2=0;
				num1=0;
			}
			txt.requestFocus();
		}
		if(s.equals("/")) {
			if(txt.getText().equals("")) {
				txt.setText("");
				tempnum=0;
				ch='/';
			}
			else{
				tempnum=Double.parseDouble(txt.getText());
				txt.setText("");
				ch='/';
				num2=0;
				num1=0;
			}
			txt.requestFocus();
		}
		if(s.equals("*")) {
			if(txt.getText().equals("")) {
				txt.setText("");
				tempnum=0;ch='*';
			}
			else{
				tempnum=Double.parseDouble(txt.getText());
				txt.setText("");
				ch='*';
				num2=0;
				num1=0;
			}
			txt.requestFocus();
		}
		if(s.equals("MC")) {
			ValueInMem=0;
			txt.setText("");
		}
		if(s.equals("MR")) {
			txt.setText("");
			txt.setText(txt.getText()+ValueInMem);
		}
		if(s.equals("M+")) {
			if(MemPlusFlag==1) {
				ValueInMem=Double.parseDouble(txt.getText());
				MemPlusFlag++;
			}
			else {
				ValueInMem+=Double.parseDouble(txt.getText());
				txt.setText(""+ValueInMem);
			}
		}
		if(s.equals("LOG")) {
			if(txt.getText().equals("")) {
				txt.setText("");
			}
			else {
				ans=Math.log(Double.parseDouble(txt.getText()));
				txt.setText("");
				txt.setText(txt.getText()+ans);
			}
		}
		if(s.equals("Exp")) {
			if(txt.getText().equals("")) {
				txt.setText("");
			}
			else {
				ans=Math.exp(Double.parseDouble(txt.getText()));txt.setText("");
				txt.setText(txt.getText()+ans);
			}
		}
		if(s.equals("Sqrt")) {
			if(txt.getText().equals("")) {
				txt.setText("");
			}
			else {
				ans=Math.sqrt(Double.parseDouble(txt.getText()));
				txt.setText("");
				txt.setText(txt.getText()+ans);
			}
		}
		if(s.equals("SIN")) {
			if(txt.getText().equals("")) {
				txt.setText("");
			}
			else {
				ans=Math.sin(Double.parseDouble(txt.getText()));
				txt.setText("");
				txt.setText(txt.getText()+ans);
			}
		}
		if(s.equals("COS")) {
			if(txt.getText().equals("")) {
				txt.setText("");
			}
			else {
				ans=Math.cos(Double.parseDouble(txt.getText()));
				txt.setText("");
				txt.setText(txt.getText()+ans);
			}
		}
		if(s.equals("TAN")) {
			if(txt.getText().equals("")) {
				txt.setText("");
			}
			else {
				ans=Math.tan(Double.parseDouble(txt.getText()));
				txt.setText("");
				txt.setText(txt.getText()+ans);
			}
		}
		if(s.equals("=")) {
			if(txt.getText().equals("")) {
				txt.setText("");
			}
			else {
				tempnextnum=Double.parseDouble(txt.getText());
				switch(ch) {
				case '+':
					result=tempnum+tempnextnum;
					break;
				case '-':
					result=tempnum-tempnextnum;
					break;
				case '/':
					result=tempnum/tempnextnum;
					break;
				case '*':
					result=tempnum*tempnextnum;
					break;
				}
				txt.setText("");
				txt.setText(txt.getText()+result);
				RepeatFlag=1;
			}
		}
		txt.requestFocus();

	}
	
	public static void main(String [] args) {
		Calc c=new Calc();
		c.setTitle("MY Calculator");
		c.pack();
		c.setVisible(true);
	}

}
