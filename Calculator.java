import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class Calculator implements ActionListener
{

JFrame jf;
 JLabel displaylabel;
 JButton sevenButton;
 JButton eightButton;
 JButton nineButton;
 JButton fourButton;
 JButton fiveButton;
 JButton sixButton;
 JButton oneButton;
 JButton twoButton;
 JButton threeButton;
 JButton zeroButton;
 JButton dotButton;
 JButton additionButton;
 JButton substractionButton;
 JButton multiplicationButton;
 JButton divisionButton;
 JButton clearButton;
 JButton equaltoButton;
 boolean isoperaterclicked=false;
 String currentvalue;
 boolean isnewcalculation=true;
 float result=0;
 String operation="";
float num=0;

    public Calculator()
    {
        jf=new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(550, 600);
        jf.setLocation(500, 150);
        displaylabel =new JLabel("");
        displaylabel.setBackground(Color.GRAY); 
        displaylabel.setOpaque(true);
        displaylabel.setBounds(0,40,520,60);
        displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(displaylabel);
        jf.setLayout(null);
        sevenButton=new JButton("7");
        sevenButton.setBounds(30,130,80,80);
        sevenButton.setFont(new Font("Arial", Font.BOLD, 40));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);
        eightButton=new JButton("8");
        eightButton.setBounds(120,130,80,80);
        eightButton.setFont(new Font("Arial", Font.BOLD, 40));
        eightButton.addActionListener(this);
        jf.add(eightButton);
        nineButton=new JButton("9");
        nineButton.setBounds(210,130,80,80);
        nineButton.setFont(new Font("Arial", Font.BOLD, 40));
        nineButton.addActionListener(this);
        jf.add(nineButton);
        fourButton=new JButton("4");
        fourButton.setBounds(30,230,80,80);
        fourButton.setFont(new Font("Arial", Font.BOLD, 40));
        fourButton.addActionListener(this);
        jf.add(fourButton);
        fiveButton=new JButton("5");
        fiveButton.setBounds(120,230,80,80);
        fiveButton.setFont(new Font("Arial", Font.BOLD, 40));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);
        sixButton=new JButton("6");
        sixButton.setBounds(210,230,80,80);
        sixButton.setFont(new Font("Arial", Font.BOLD, 40));
        sixButton.addActionListener(this);
        jf.add(sixButton);
        oneButton=new JButton("1");
        oneButton.setBounds(30,330,80,80);
        oneButton.setFont(new Font("Arial", Font.BOLD, 40));
        oneButton.addActionListener(this);
        jf.add(oneButton);
        twoButton=new JButton("2");
        twoButton.setBounds(120,330,80,80);
        twoButton.setFont(new Font("Arial", Font.BOLD, 40));
        twoButton.addActionListener(this);
        jf.add(twoButton);
        threeButton=new JButton("3");
        threeButton.setBounds(210,330,80,80);
        threeButton.setFont(new Font("Arial", Font.BOLD, 40));
        threeButton.addActionListener(this);
        jf.add(threeButton);
        zeroButton=new JButton("0");
        zeroButton.setBounds(30,430,80,80);
        zeroButton.setFont(new Font("Arial", Font.BOLD, 40));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);
        dotButton=new JButton(".");
        dotButton.setBounds(120,430,80,80);
        dotButton.setFont(new Font("Arial", Font.BOLD, 40));
        dotButton.addActionListener(this);
        jf.add(dotButton);
        clearButton=new JButton("C");
        clearButton.setBounds(210,430,80,80);
        clearButton.setFont(new Font("Arial", Font.BOLD, 40));
        clearButton.addActionListener(this);
        jf.add(clearButton);
        equaltoButton=new JButton("=");
        equaltoButton.setBounds(310,430,80,80);
        equaltoButton.setFont(new Font("Arial", Font.BOLD, 40));
        equaltoButton.addActionListener(this);
        jf.add(equaltoButton);
        multiplicationButton=new JButton("X");
        multiplicationButton.setBounds(310,230,80,80);
        multiplicationButton.setFont(new Font("Arial", Font.BOLD, 40));
        multiplicationButton.addActionListener(this);
        jf.add(multiplicationButton);
        divisionButton=new JButton("/");
        divisionButton.setBounds(400,230,80,80);
        divisionButton.setFont(new Font("Arial", Font.BOLD, 40));
        divisionButton.addActionListener(this);
        jf.add(divisionButton);
        additionButton=new JButton("+");
        additionButton.setBounds(310,330,80,80);
        additionButton.setFont(new Font("Arial", Font.BOLD, 40));
        additionButton.addActionListener(this);
        jf.add(additionButton);
        substractionButton=new JButton("-");
        substractionButton.setBounds(400,330,80,80);
        substractionButton.setFont(new Font("Arial", Font.BOLD, 40));
        substractionButton.addActionListener(this);
        jf.add(substractionButton);
        jf.setVisible(true);
        
    }
    public static void main( String args[] )
    {
        new Calculator();
    }
    public void actionPerformed (ActionEvent e)
    {
        if(e.getSource()==sevenButton)
    {
       if( isoperaterclicked==true)
       {
        displaylabel.setText("7");
        isoperaterclicked=false;
       }
       else{
        displaylabel.setText(displaylabel.getText()+"7");
       }
    }
      else if(e.getSource()==eightButton)
    {
        if(isoperaterclicked==true)
        {  
        displaylabel.setText("8");
        isoperaterclicked=false;
        }
        else{
            displaylabel.setText(displaylabel.getText()+"8");
        }
    }
       else if(e.getSource()==nineButton)
    {
        if(isoperaterclicked==true)
        {
        displaylabel.setText("9");
        isoperaterclicked=false;
        }
        else{
            displaylabel.setText(displaylabel.getText()+"9");
        }

    }
    else   if(e.getSource()==fourButton)
    {
        if(isoperaterclicked==true)
        {
        displaylabel.setText("4");
        isoperaterclicked=false;
        }
    else{
        displaylabel.setText(displaylabel.getText()+"4");
    }
    }
     else  if(e.getSource()==fiveButton)
    {
        if(isoperaterclicked==true)
        {
        displaylabel.setText("5");
        isoperaterclicked=false;
            }
    else{
            displaylabel.setText(displaylabel.getText()+"5");
        }
    }  
    else if(e.getSource()==sixButton)
    {
        if(isoperaterclicked==true)
        {
            displaylabel.setText("6");
            isoperaterclicked=false;
        }
        else
        {
        displaylabel.setText(displaylabel.getText()+"6");
        }
    }  
     else if(e.getSource()==oneButton)
    {
        if( isoperaterclicked==true)
        {
        displaylabel.setText("1");
        isoperaterclicked=false;
        }
        else{
             displaylabel.setText(displaylabel.getText()+"1");
        }

    }  
    else if(e.getSource()==twoButton)
    {
       if(  isoperaterclicked==true)
       {
        displaylabel.setText("2");
        isoperaterclicked=false;
       }
       else{
         displaylabel.setText(displaylabel.getText()+"2");
       }
    }   
    else if(e.getSource()==threeButton)
    {
        if(isoperaterclicked==true)
        {
        displaylabel.setText("3");
        isoperaterclicked=false;
        }
        else{
             displaylabel.setText(displaylabel.getText()+"3");
        }
    }
      else if(e.getSource()==zeroButton)
    {
        if(isoperaterclicked==true)
        {
            displaylabel.setText("0");
            isoperaterclicked=false;
        }
        else{
        displaylabel.setText(displaylabel.getText()+"0");
        }
    }
     else  if(e.getSource()==dotButton)
    {
        if(isoperaterclicked==true)
        {
        displaylabel.setText(".");
        isoperaterclicked=false;
        }
        else{
            displaylabel.setText(displaylabel.getText()+".");
        }
    }
      else if(e.getSource()==multiplicationButton)
    {
       
        currentvalue=displaylabel.getText();
        if(!currentvalue.isEmpty())
        {
            num=Float.parseFloat(currentvalue);
        }
        if(isnewcalculation==true)
        {
        result=num;
        isnewcalculation=false;
        }
        else{
            if(operation.equals("*"))result*=num;
            else if (operation.equals("/"))result/=num;
            else if(operation.equals("+"))result+=num;
            else if(operation.equals("-"))result-=num;

        }
         operation="*";
        isoperaterclicked=true;
    } else  if(e.getSource()==divisionButton)
    {
          
        currentvalue=displaylabel.getText();
        if(!currentvalue.isEmpty())
        {
             num=Float.parseFloat(currentvalue);
        }
        if(isnewcalculation==true)
        {
        result=num;
        isnewcalculation=false;
        }
         else{
            if (operation.equals("/"))result/=num;
           else if(operation.equals("*"))result*=num;
            else if(operation.equals("+"))result+=num;
            else if(operation.equals("-"))result-=num;

        }
         operation="/";
        isoperaterclicked=true;
   
    }  else if(e.getSource()==additionButton)
    {
          
        currentvalue=displaylabel.getText();
        if(!currentvalue.isEmpty())
        {
             num=Float.parseFloat(currentvalue);
        }
        if(isnewcalculation==true)
        {
        result=num;
        isnewcalculation=false;
        }
       else{
            if(operation.equals("+"))result+=num;
            else if (operation.equals("/"))result/=num;
            else if(operation.equals("*"))result*=num;
            else if(operation.equals("-"))result-=num;

        }
         operation="+";
        isoperaterclicked=true;
    }  else if(e.getSource()==substractionButton)
    {
          
        currentvalue=displaylabel.getText();
        if(!currentvalue.isEmpty())
        {
            num=Float.parseFloat(currentvalue);
        }
        if(isnewcalculation==true)
        {
        result=num;
        isnewcalculation=false;
        }
         else{
            if(operation.equals("-"))result-=num;
            else if (operation.equals("/"))result/=num;
            else if(operation.equals("+"))result+=num;
            else if(operation.equals("*"))result*=num;

        }
         operation="-";
        isoperaterclicked=true;
    }
      else if(e.getSource()==equaltoButton)
    {
        currentvalue=displaylabel.getText();
        if(!currentvalue.isEmpty())
        {
            num=Float.parseFloat(currentvalue);
        }
          if(operation.equals("*"))result*=num;
            else if (operation.equals("/"))result/=num;
            else if(operation.equals("+"))result+=num;
            else if(operation.equals("-"))result-=num;
       
        displaylabel.setText(result+"");
        isnewcalculation=true;
    }
        
   else if(e.getSource()==clearButton)
    {
        displaylabel.setText("");
        result=0;
        num=0;
        operation="";
        isnewcalculation=true;
    }
    }
}