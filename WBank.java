import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.io.FileWriter;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.List;
import java.util.ArrayList;
public class WBank
{
public void login()
{
JFrame J1 = new JFrame("Bank");
J1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
J1.setSize(1366,768);
JPanel P1 = new JPanel();
P1.setLayout(null);
JLabel L1 = new JLabel("BANKING SYSTEM");
L1.setBounds(500,50,550,70);            //600 coloumn 60 line 400 breadth 70 length
L1.setFont(new Font("Dungeon",Font.PLAIN,50));
L1.setForeground(Color.BLACK);
P1.add(L1);
JLabel L2 = new JLabel("User Name ");
L2.setBounds(380,200,400,30);            //600 coloumn 60 line 400 breadth 70 length
L2.setFont(new Font("Dungeon",Font.PLAIN,30));
L2.setForeground(Color.DARK_GRAY);
P1.add(L2);

JTextField T1 = new JTextField();
T1.setBounds(640,200,350,30);            //600 coloumn 60 line 400 breadth 70 length
T1.setFont(new Font("Dungeon",Font.PLAIN,20));
T1.setForeground(Color.GRAY);
P1.add(T1);

JLabel L3 = new JLabel("Password  ");
L3.setBounds(380,270,400,30);            //600 coloumn 60 line 400 breadth 70 length
L3.setFont(new Font("Dungeon",Font.PLAIN,30));
L3.setForeground(Color.DARK_GRAY);
P1.add(L3);

JPasswordField PF = new JPasswordField();
PF.setBounds(640,270,350,30);            //600 coloumn 60 line 400 breadth 70 length
PF.setFont(new Font("Dungeon",Font.PLAIN,20));
PF.setForeground(Color.GRAY);
P1.add(PF);

JButton B1 = new JButton("Enter");
B1.setBounds(760,350,118,30);            //600 coloumn 60 line 400 breadth 70 length
B1.setFont(new Font("Dungeon",Font.PLAIN,30));
B1.setForeground(Color.DARK_GRAY);
P1.add(B1);

B1.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e)
	{
	
	    String Un = T1.getText();
		String  P = PF.getText();
		
		if(Un.equals ("") && P.equals(""))
     {
	    JOptionPane.showMessageDialog(null,"YOU ARE WELCOME");
        menu(J1);
	 }
	 

else
{
	JOptionPane.showMessageDialog(null,"Invalid user");
}
	//menu(J1);                   //Accopen(Framename); /// /
		
	}
});
J1.setContentPane(P1);
J1.setVisible(true);


}

public void menu(JFrame J1)
{
JFrame J2 = new JFrame("Banking System");
J2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
J2.setSize(1366,768);
J2.setLocationRelativeTo(J1);
JPanel Pf = new JPanel();
Pf.setLayout(null);

JLabel Lf = new JLabel("Menu");
Lf.setBounds(590,20,600,100);
Lf.setFont(new Font("Roman",Font.PLAIN,70));
Lf.setForeground(Color.BLACK);
Pf.add(Lf);
J2.setContentPane(Pf);
J2.setVisible(true);  

JButton B2 = new JButton("New Account");
B2.setBounds(600,200,150,50);
B2.setFont(new Font("ARIAL",Font.PLAIN,20));
B2.setForeground(Color.BLACK);
Pf.add(B2);

JButton B3 = new JButton("Deposit");
B3.setBounds(600,275,150,50);
B3.setFont(new Font("ARIAL",Font.PLAIN,20));
B3.setForeground(Color.BLACK);
Pf.add(B3); 

B3.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e)
	{
		
     Deposit(J2);                  
		
	}
});
J2 .setContentPane(Pf);
J2.setVisible(true);

JButton B4 = new JButton("Withdraw");
B4.setBounds(600,350,150,50);
B4.setFont(new Font("ARIAL",Font.PLAIN,20));
B4.setForeground(Color.BLACK);
Pf.add(B4); 

B4.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e)
	{
		
     Withdraw(J2);                  
		
	}
});


JButton B5 = new JButton("Showall");
B5.setBounds(600,425,150,50);
B5.setFont(new Font("ARIAL",Font.PLAIN,20));
B5.setForeground(Color.BLACK);
Pf.add(B5); 

JButton B6 = new JButton("Close");
B6.setFont(new Font("Arial",Font.PLAIN,20));
B6.setBounds(600,500,150,50);
B6.setForeground(Color.BLACK);
Pf.add(B6);

B2.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e)
	{
		
     Accopen(J1);                  
		
	}
});





J2.setContentPane(Pf);
J2.setVisible(true);

B5.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e)
	{
		
     Showall(J1);                  
		
	}
});
J2.setContentPane(Pf);
J2.setVisible(true);






}//end of menu 

public void Showall(JFrame J1)
{
    JFrame J12 = new JFrame("Show all");
	JPanel P12 = new JPanel();
	J12.setSize(1366,768);
    J12.setLocationRelativeTo(J1);
    P12.setLayout(null);
    J12.setContentPane(P12);
    J12.setVisible(true);

    String Heading[] = {"Account number","Name","Amount","Type"};
	DefaultTableModel Tm = new DefaultTableModel (Heading,0);
	Tm.setRowCount (0);
	JTable tb = new JTable(Tm);
	tb.setFont(new Font("Ariel",Font.PLAIN,15));
	tb.setForeground(Color.BLACK);
	tb.setRowHeight(30);
	//tb.setRowWidth(10);
	JTableHeader th = tb.getTableHeader();
	th.setPreferredSize(new Dimension (th.getWidth(),20));
	JScrollPane SP = new JScrollPane(tb);
	SP.setBounds(50,10,500,250);   
	P12.add(SP);
	
	JButton B9 = new JButton("Save Changes");
		B9.setFont(new Font("Arial",Font.PLAIN,20));
		B9.setBounds(550,310,100,30);
		B9.setForeground(Color.BLACK);
		P12.add(B9);	
	
	List<String[]>RecordList = new ArrayList<>();    //array print list
	try
	{
	String D;
	FileReader R = new FileReader("Bingo.txt");
	BufferedReader Br = new BufferedReader(R);
	while((D = Br.readLine()) != null)
	{	
	String []Parts = D.split(" ");
	RecordList.add(Parts);
	}
	
	for(String[]R1:RecordList)
	{
		Tm.addRow(R1);
		
	}
	}	
catch(IOException e)
{
  System.out.println("Error in file reading");	
}

B9.addActionListener(new ActionListener()
		{
	    public void actionPerformed(ActionEvent e)
	    {
				
try
{ 
FileWriter W = new FileWriter("Bingo.txt",false);
//W.write(AccNo+" "+Accname+" "+Amt+" "+Type+" "+Date);
//W.write(System.lineSep);

for (int row=0;row<Tm.getRowCount();row++)
{
	String AccNo = Tm.getValueAt(row,0).toString();
	String Accname = Tm.getValueAt(row,1).toString();
	String Amt = Tm.getValueAt(row,2).toString();
	String Type = Tm.getValueAt(row,3).toString();

	
	
	
	W.write(AccNo+" "+Accname+" "+Type+" "+Amt );
	W.write(System.lineSeparator());
}
	W.close();
	JOptionPane.showMessageDialog(null,"Changes Succesfully");
}

catch(IOException X)
{
	System.out.println("Error in saving");
}
		}
		});


JButton B13 = new JButton("Delete");
		B13.setFont(new Font("Arial",Font.PLAIN,20));
		B13.setBounds(350,310,100,30);
		B13.setForeground(Color.BLACK);
		P12.add(B13);

B13.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e)
	{
		int SelectedRow = tb.getSelectedRow();  //that lines are selected and pick up are stored in row variable
		if (SelectedRow == -1)
		{
			JOptionPane.showMessageDialog(null,"No Row Selected"); //When there is not row any selected then selected row variable vary -1
        }
		else
		{
			Tm.removeRow(SelectedRow);
		
	
		try
{ 
FileWriter W = new FileWriter("Bingo.txt",false);
//W.write(AccNo+" "+Accname+" "+Amt+" "+Type+" "+Date);
//W.write(System.lineSeperator());

for (int row=0;row<Tm.getRowCount();row++)
{
	String AccNo = Tm.getValueAt(row,0).toString();
	String Accname = Tm.getValueAt(row,1).toString();
	String Amt = Tm.getValueAt(row,2).toString();
	String Type = Tm.getValueAt(row,3).toString();

	
	
	
	W.write(AccNo+" "+Accname+" "+Amt+" "+Type);
	W.write(System.lineSeparator());
}
	W.close();
	JOptionPane.showMessageDialog(null,"Changes Succesfully");
}

catch(IOException X)
{
	System.out.println("Error in saving");
}
		}
	}
		});

J12.setContentPane(P12);
J12.setVisible(true);
}

public void Accopen(JFrame F)
{
JFrame J3 = new JFrame("BANK");
J3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
J3.setSize(1366,768);
J3.setLocationRelativeTo(F);
JPanel P2 = new JPanel();
P2.setLayout(null);
J3.setContentPane(P2);
J3.setVisible(true);
JLabel LB1 = new JLabel("ACCOUNT OPENING");
LB1.setBounds(450,50,550,70);            //600 coloumn 60 line 400 breadth 70 length
LB1.setFont(new Font("Digital-7 Mono",Font.PLAIN,50));
LB1.setForeground(Color.BLACK);
P2.add(LB1);
JLabel LB2 = new JLabel("Account No. ");
LB2.setBounds(380,200,400,30);            //600 coloumn 60 line 400 breadth 70 length
LB2.setFont(new Font("Dungeon",Font.PLAIN,30));
LB2.setForeground(Color.DARK_GRAY);
P2.add(LB2);

JTextField T2 = new JTextField();
T2.setBounds(640,200,350,30);            //600 coloumn 60 line 400 breadth 70 length
T2.setFont(new Font("Dungeon",Font.PLAIN,20));
T2.setForeground(Color.GRAY);
P2.add(T2);

JLabel L3 = new JLabel("Name  ");
L3.setBounds(380,270,400,30);            //600 coloumn 60 line 400 breadth 70 length
L3.setFont(new Font("Dungeon",Font.PLAIN,30));
L3.setForeground(Color.DARK_GRAY);
P2.add(L3);

JTextField T5 = new JTextField();
T5.setBounds(640,270,350,30);            //600 coloumn 60 line 400 breadth 70 length
T5.setFont(new Font("Dungeon",Font.PLAIN,20));
T5.setForeground(Color.GRAY);
P2.add(T5);

JLabel L4 = new JLabel("Amount");
L4.setBounds(380,340,400,30);            //600 coloumn 60 line 400 breadth 70 length
L4.setFont(new Font("Dungeon",Font.PLAIN,30));
L4.setForeground(Color.DARK_GRAY);
P2.add(L4);

JTextField T4 = new JTextField();
T4.setBounds(640,340,350,30);            //600 coloumn 60 line 400 breadth 70 length
T4.setFont(new Font("Dungeon",Font.PLAIN,20));
T4.setForeground(Color.GRAY);
P2.add(T4);

JLabel L5 = new JLabel("Type ");
L5.setBounds(380,410,400,30);            //600 coloumn 60 line 400 breadth 70 length
L5.setFont(new Font("Dungeon",Font.PLAIN,30));
L5.setForeground(Color.DARK_GRAY);
P2.add(L5);

JTextField T3 = new JTextField();
T3.setBounds(640,410,350,30);            //600 coloumn 60 line 400 breadth 70 length
T3.setFont(new Font("Dungeon",Font.PLAIN,20));
T3.setForeground(Color.GRAY);
P2.add(T3);

JLabel L6 = new JLabel("Date  ");
L6.setBounds(380,480,400,30);            //600 coloumn 60 line 400 breadth 70 length
L6.setFont(new Font("Dungeon",Font.PLAIN,30));
L6.setForeground(Color.DARK_GRAY);
P2.add(L6);

JTextField T6 = new JTextField();
T6.setBounds(640,480,350,30);            //600 coloumn 60 line 400 breadth 70 length
T6.setFont(new Font("Dungeon",Font.PLAIN,20));
T6.setForeground(Color.GRAY);
P2.add(T6);

JButton B12 = new JButton("Back");
B12.setBounds(660,550,118,30);            //760 coloumn 550 line 118 breadth 30 length
B12.setFont(new Font("Dungeon",Font.PLAIN,25));
B12.setForeground(Color.DARK_GRAY);
P2.add(B12);

B12.addActionListener(new ActionListener()
		{
	    public void actionPerformed(ActionEvent e)
	    {
				J3.setVisible(false);
		}
		});

JButton B4 = new JButton("Submit");
B4.setBounds(860,550,118,30);            //760 coloumn 550 line 118 breadth 30 length
B4.setFont(new Font("Dungeon",Font.PLAIN,25));
B4.setForeground(Color.DARK_GRAY);
P2.add(B4);

B4.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e)
	{
		String AccNo = T2.getText();
		String Accname = T5.getText();
		String Amt= T4.getText();
		String Type= T3.getText();
		String  Date = T6.getText();
		//String P = new String (T2.getPassword());
		JOptionPane.showMessageDialog(null,AccNo+" "+Accname+" "+Amt+" "+Type+" "+Date);
	

try{
	
	FileWriter W = new FileWriter("Bingo.txt",true);
	W.write(AccNo+" "+Accname+" "+Amt+" "+Type+" "+Date );
    W.write(System.lineSeparator());  
    W.close();

}
catch(IOException E)
{
	System.out.println("Error while file saving");
}

}
});


}
public void Deposit(JFrame J2)
{
JFrame J4 = new JFrame("BANK");
J4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
J4.setSize(1366,768);
J4.setLocationRelativeTo(J2);
JPanel P5 = new JPanel();
P5.setLayout(null);
JLabel L4 = new JLabel("Deposit");
L4.setBounds(595,50,550,70);            //600 coloumn 60 line 400 breadth 70 length
L4.setFont(new Font("Digital-7 Mono",Font.PLAIN,50));
L4.setForeground(Color.BLACK);
P5.add(L4);
JLabel L5 = new JLabel(" Account No.");
L5.setBounds(380,200,400,30);            //600 coloumn 60 line 400 breadth 70 length
L5.setFont(new Font("Dungeon",Font.PLAIN,30));
L5.setForeground(Color.DARK_GRAY);
P5.add(L5);

JTextField Q = new JTextField();
Q.setBounds(640,200,350,30);            //600 coloumn 60 line 400 breadth 70 length
Q.setFont(new Font("Dungeon",Font.PLAIN,20));
Q.setForeground(Color.GRAY);
P5.add(Q);

JLabel L6 = new JLabel("Name");
L6.setBounds(380,270,400,30);            //600 coloumn 60 line 400 breadth 70 length
L6.setFont(new Font("Dungeon",Font.PLAIN,30));
L6.setForeground(Color.DARK_GRAY);
P5.add(L6);

JTextField Z = new JTextField();
Z.setBounds(640,270,350,30);            //600 coloumn 60 line 400 breadth 70 length
Z.setFont(new Font("Dungeon",Font.PLAIN,20));
Z.setForeground(Color.GRAY);
P5.add(Z);

JLabel L7 = new JLabel("Balance");
L7.setBounds(380,340,400,30);            //600 coloumn 60 line 400 breadth 70 length
L7.setFont(new Font("Dungeon",Font.PLAIN,30));
L7.setForeground(Color.DARK_GRAY);
P5.add(L7);


JTextField M = new JTextField();
M.setBounds(640,340,350,30);            //600 coloumn 60 line 400 breadth 70 length
M.setFont(new Font("Dungeon",Font.PLAIN,20));
M.setForeground(Color.GRAY);
P5.add(M);



JButton L8 = new JButton("Enter");
L8.setBounds(890,410,100,30);            //600 coloumn 60 line 400 breadth 70 length
L8.setFont(new Font("Dungeon",Font.PLAIN,20));
L8.setForeground(Color.DARK_GRAY);
P5.add(L8);


JButton B14 = new JButton("Back");
B14.setBounds(640,410,118,30);            //760 coloumn 550 line 118 breadth 30 length
B14.setFont(new Font("Dungeon",Font.PLAIN,25));
B14.setForeground(Color.DARK_GRAY);
P5.add(B14);

B14.addActionListener(new ActionListener()
		{
	    public void actionPerformed(ActionEvent e)
	    {
				J4.setVisible(false);
		}
		}); 
Q.addFocusListener(new FocusListener()
{
	public void focusGained(FocusEvent Ei)
	{
		
	}
		public void focusLost(FocusEvent El)
		{
		JOptionPane.showMessageDialog(null,"Account not found ");
		
		String ano=Q.getText();
		try
	{
		String D;
    //String ano=Q.getText();
	FileReader R = new FileReader("Bingo.txt");
	BufferedReader Br = new BufferedReader(R);
	while((D = Br.readLine()) != null)
	{	
	String []Parts = D.split(" ");
		
	//RecordList.add(Parts);
	if(ano.equals(Parts[0]))
	{
	M.setText(Parts[2]);
    break;	
	}
	}
	 if(D==null)
	{
		JOptionPane.showMessageDialog(null,"Account not found ");
	}
	}
catch(IOException Ee)
{
	System.out.println("Error while file saving");
}
}
});
J4.setContentPane(P5);
J4.setVisible(true);
}
public void Withdraw(JFrame J2)
{
	JFrame J5 = new JFrame("BANK");
J5.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
J5.setSize(1366,768);
J5.setLocationRelativeTo(J2);
JPanel P6 = new JPanel();
P6.setLayout(null);
JLabel L9 = new JLabel("Withdraw");
L9.setBounds(450,50,550,70);            //600 coloumn 60 line 400 breadth 70 length
L9.setFont(new Font("Digital-7 Mono",Font.PLAIN,50));
L9.setForeground(Color.BLACK);
P6.add(L9);

JLabel L12 = new JLabel(" Account No.");
L12.setBounds(380,200,400,30);            //600 coloumn 60 line 400 breadth 70 length
L12.setFont(new Font("Dungeon",Font.PLAIN,30));
L12.setForeground(Color.DARK_GRAY);
P6.add(L12);

JTextField Q1 = new JTextField();
Q1.setBounds(640,200,350,30);            //600 coloumn 60 line 400 breadth 70 length
Q1.setFont(new Font("Dungeon",Font.PLAIN,20));
Q1.setForeground(Color.GRAY);
P6.add(Q1);

JLabel L0 = new JLabel("Name");
L0.setBounds(380,270,400,30);            //600 coloumn 60 line 400 breadth 70 length
L0.setFont(new Font("Dungeon",Font.PLAIN,30));
L0.setForeground(Color.DARK_GRAY);
P6.add(L0);

JTextField M1 = new JTextField();
M1.setBounds(640,270,350,30);            //600 coloumn 60 line 400 breadth 70 length
M1.setFont(new Font("Dungeon",Font.PLAIN,20));
M1.setForeground(Color.GRAY);
P6.add(M1);

JButton L11 = new JButton("Enter");
L11.setBounds(765,350,100,30);           //600 coloumn 60 line 400 breadth 70 length
L11.setFont(new Font("Dungeon",Font.PLAIN,20));
L11.setForeground(Color.DARK_GRAY);
P6.add(L11);
J5.setContentPane(P6);
J5.setVisible(true);

JButton B15 = new JButton("Back");
B15.setBounds(660,550,118,30);            //760 coloumn 550 line 118 breadth 30 length
B15.setFont(new Font("Dungeon",Font.PLAIN,25));
B15.setForeground(Color.DARK_GRAY);
P6.add(B15);

B15.addActionListener(new ActionListener()
		{
	    public void actionPerformed(ActionEvent e)
	    {
				J5.setVisible(false);
		}
		});

/*B2.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e)
	{
		
     Depos(J1);                  
		
	}
});
J2 .setContentPane(Pf);
J2.setVisible(true);
}*/
}

public static void main(String Args[])
{
	WindowBank BN1 = new WindowBank();
	BN1.login();
	//BN1.Accopen();
}
}











/* if(un.Equals"What text you want to match on the password section")&& p.Equals("Which password you want to Check or you want any password ")
{
	JOtionPane.showDialog(null);
	You are welcome (Show this greets);
     menu(J1);
	 }
	 

else
{
JOptionPane.showMessageDialog("Invalid user"
	);
}
*/


/*

int answer  = Integer.parse(t2.getText())+Integer.parse(t3.getText());
t3.setText(""+answer);
	
*/










/*
String ano = T1.getText ;
try{
	String D ;
	ArrayList <String> fileData= new ArrayList<>()); 
	FileReader R  =  new FileReader(bingo.txt);
	BufferReader data = new BufferedReader(R);
	
	//Read the data from the file and store it in an array list
	while ((d = data.readLine ()) ! = null) ;
	
	

    String[] parts = d.split(" ");
	if(AccountNumber.equal(parts[0]))
	{
		parts[1] = T3.getText();
	}
	fileData.add{parts[0] + " "+parts[1]+" "+parts[2];
	D.add(record);
	
	}
	
	FileWriter w  = new FileWriter ("Data.txt");
	BufferedWriter out  = new BufferedWriter(w);
	for (String line : fileData) 
	out.write(line);
    out.newLine();   
    }
	out.close();
	JoptionPane.showMessageDialog(nill,"balance updated succesfully")
	}
	catch (IOException ex)
	{
		JoptionPane.showMessageDialog(null,"Errors in updationg data")
	}  */























