package calculator; import javax.swing.*; import java.awt.*; import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener { private Container c; private JTextField t1; 
private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, ba, bs, bm, bd, bc, beq; int b=0, f=0, d=0, s=0;
MyFrame(){setTitle("Simple Calculator"); setSize(620, 280); setLocation(200, 200);
setDefaultCloseOperation(EXIT_ON_CLOSE); c=getContentPane(); c.setLayout(null);
t1=new JTextField(); t1.setBounds(20,20,560,40); t1.setBackground(Color.BLACK); 
t1.setForeground(Color.CYAN); t1.setEditable(false); c.add(t1); setVisible(true); 
b1=new JButton("1"); b1.setBounds(20,110,70,50);  c.add(b1); b1.setBackground(Color.GRAY); b1.setForeground(Color.WHITE);
b2=new JButton("2"); b2.setBounds(100,110,70,50); c.add(b2); b2.setBackground(Color.GRAY); b2.setForeground(Color.WHITE);
b3=new JButton("3"); b3.setBounds(180,110,70,50); c.add(b3); b3.setBackground(Color.GRAY); b3.setForeground(Color.WHITE);
b4=new JButton("4"); b4.setBounds(260,110,70,50); c.add(b4); b4.setBackground(Color.GRAY); b4.setForeground(Color.WHITE);
b5=new JButton("5"); b5.setBounds(20,150,70,50);  c.add(b5); b5.setBackground(Color.GRAY); b5.setForeground(Color.WHITE);
b6=new JButton("6"); b6.setBounds(100,150,70,50); c.add(b6); b6.setBackground(Color.GRAY); b6.setForeground(Color.WHITE);
b7=new JButton("7"); b7.setBounds(180,150,70,50); c.add(b7); b7.setBackground(Color.GRAY); b7.setForeground(Color.WHITE);
b8=new JButton("8"); b8.setBounds(260,150,70,50); c.add(b8); b8.setBackground(Color.GRAY); b8.setForeground(Color.WHITE);
b9=new JButton("9"); b9.setBounds(20,190,70,50);  c.add(b9); b9.setBackground(Color.GRAY); b9.setForeground(Color.WHITE);
b0=new JButton("0"); b0.setBounds(100,190,70,50); c.add(b0); b0.setBackground(Color.GRAY); b0.setForeground(Color.WHITE);
bd=new JButton("/"); bd.setBounds(500,150,70,50); c.add(bd); bd.setBackground(Color.BLACK); bd.setForeground(Color.WHITE);
ba=new JButton("+"); ba.setBounds(420,110,70,50); c.add(ba); ba.setBackground(Color.BLACK); ba.setForeground(Color.WHITE);
bs=new JButton("-"); bs.setBounds(500,110,70,50); c.add(bs); bs.setBackground(Color.BLACK); bs.setForeground(Color.WHITE);
bm=new JButton("x"); bm.setBounds(420,150,70,50); c.add(bm); bm.setBackground(Color.BLACK); bm.setForeground(Color.WHITE);
beq=new JButton("="); beq.setBounds(460,190,70,50); c.add(beq); beq.setBackground(Color.BLACK); beq.setForeground(Color.WHITE);
bc=new JButton("c"); bc.setBounds(260,190,70,30); c.add(bc); bc.setBackground(Color.BLACK); bc.setForeground(Color.WHITE);
b1.addActionListener(this); b2.addActionListener(this); b3.addActionListener(this); b4.addActionListener(this);
b5.addActionListener(this); b6.addActionListener(this); b7.addActionListener(this); b8.addActionListener(this);
b9.addActionListener(this); b0.addActionListener(this); bc.addActionListener(this); ba.addActionListener(this);
bs.addActionListener(this); bm.addActionListener(this); bd.addActionListener(this); beq.addActionListener(this);}
public void actionPerformed(ActionEvent e){int a=0; String t; if(e.getSource()==bc){t1.setText("");}
if(e.getSource()==b1){t=t1.getText(); a=t.length(); if(a==0){t1.setText("1");}
if(a>0 && a<4){t1.setText(t+"1");}}
if(e.getSource()==b2){t=t1.getText(); a=t.length(); if(a==0){t1.setText("2");}
if(a>0 && a<4){t1.setText(t+"2");}}
if(e.getSource()==b3){t=t1.getText(); a=t.length(); if(a==0){t1.setText("3");}
if(a>0 && a<4){t1.setText(t+"3");}}
if(e.getSource()==b4){t=t1.getText(); a=t.length(); if(a==0){t1.setText("4");}
if(a>0 && a<4){t1.setText(t+"4");}}
if(e.getSource()==b5){t=t1.getText(); a=t.length(); if(a==0){t1.setText("5");}
if(a>0 && a<4){t1.setText(t+"5");}}
if(e.getSource()==b6){t=t1.getText(); a=t.length(); if(a==0){t1.setText("6");}
if(a>0 && a<4){t1.setText(t+"6");}}
if(e.getSource()==b7){t=t1.getText(); a=t.length(); if(a==0){t1.setText("7");}
if(a>0 && a<4){t1.setText(t+"7");}}
if(e.getSource()==b8){t=t1.getText(); a=t.length(); if(a==0){t1.setText("8");}
if(a>0 && a<4){t1.setText(t+"8");}}
if(e.getSource()==b9){t=t1.getText(); a=t.length(); if(a==0){t1.setText("9");}
if(a>0 && a<4){t1.setText(t+"9");}}
if(e.getSource()==b0){t=t1.getText(); a=t.length(); if(a==0){t1.setText("0");}
if(a>0 && a<4){t1.setText(t+"0");}}
if(e.getSource()==ba){t=t1.getText(); a=t.length(); if(a>0){b=Integer.parseInt(t);
t1.setText(""); s=1;}}
if(e.getSource()==bs){t=t1.getText(); a=t.length(); if(a>0){b=Integer.parseInt(t);
t1.setText(""); s=2;}}
if(e.getSource()==bm){t=t1.getText(); a=t.length(); if(a>0){b=Integer.parseInt(t);
t1.setText(""); s=3;}}
if(e.getSource()==bd){t=t1.getText(); a=t.length(); if(a>0){b=Integer.parseInt(t);
t1.setText(""); s=4;}}
if(e.getSource()==beq){t=t1.getText(); a=t.length(); if(a>0){d=Integer.parseInt(t);
if(s==1){f=b+d;} if(s==2){f=b-d;} if(s==3){f=b*d;} if(s==4){f=b/d;} t1.setText(""+f);}}
}}
        
public class App {

    public static void main(String[] args) {
        MyFrame frame=new MyFrame();
    }
}
