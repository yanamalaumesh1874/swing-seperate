import javax.swing.*;    
class sep    
{    
          JMenu menu, submenu;    
          JMenuItem i1, i2, i3, i4, i5;    
          sep()  {    
          JFrame f= new JFrame("Separator Example");    
          JMenuBar mb=new JMenuBar();    
          menu=new JMenu("Menu");    
          i1=new JMenuItem("new");    
          i2=new JMenuItem("open");   
		  i3=new JMenuItem("cut");
		  i4=new JMenuItem("copy");
		  i5=new JMenuItem("paste");
          menu.add(i1);  
          menu.addSeparator();  
          menu.add(i2);
		  menu.addSeparator();
		  menu.add(i3);
		  menu.addSeparator();
		  menu.add(i4);
		  menu.addSeparator();
		  menu.add(i5);
          mb.add(menu);  		  
		  f.setJMenuBar(mb);    
          f.setSize(400,400);    
          f.setLayout(null);    
          f.setVisible(true);    
}    
public static void main(String args[])    
{    
new sep();    
}
}    
