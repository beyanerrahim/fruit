
package fruit1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Fruit1 {

    
    static int next=-1;
    static int sn=0;
    static fruit []v=new fruit[1000];
      
    
    public static void main(String[] args) {
       
        for(int i=0;i<1000;i++)
        {
           v[i]=new fruit();
        }
         JFrame f=new JFrame("meyve listesi");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTextArea area=new JTextArea("");
        area.setBounds(350,60,400,260);
        
        JTextField t1=new JTextField();
        t1.setBounds(100,60,150,30);
        JLabel L1 = new JLabel("meyve isim:");
        L1.setBounds(20,60,100,30);
        
        JTextField t2=new JTextField();
        t2.setBounds(100,100,150,30);
        JLabel L2=new JLabel("Renk:");
        L2.setBounds(20,100,100,30);
        
        JTextField t3=new JTextField();
        t3.setBounds(100,140,150,30);
        JLabel L3=new JLabel("Agirlik:");
        L3.setBounds(20,140,100,30);
        
        JTextField t4=new JTextField();
        t4.setBounds(100,180,150,30);
        t4.setText("0");
        JLabel L4=new JLabel("Sira No:");
        L4.setBounds(20,180,100,30);
      
        JButton b1=new JButton("ekle");
         b1.setBounds(150,250,95,30);
        
        JButton b2=new JButton("baştan sona listele");
        b2.setBounds(350,20,200,30);

        JButton b3=new JButton("bir sonraki göre listele");
        b3.setBounds(560,20,200,30);
        
        b1.setBounds(150,250,95,30);
        f.add(b1);    f.add(b2);    f.add(b3);
        
        f.add(t1);     f.add(L1);
        f.add(t2);     f.add(L2);
        f.add(t3);     f.add(L3);
        f.add(t4);     f.add(L4);
        f.add(area);
        f.setSize(800,400);        
        f.setLayout(null);
        f.setVisible(true);
     
       
        
        
         b1.addActionListener(new ActionListener() {  
         public void actionPerformed(ActionEvent e) {
             
        String isim=t1.getText(),renk=t2.getText();
        float agirlik=Float.parseFloat(t3.getText());
        sn=Integer.parseInt(t4.getText());
        int ful=1;
        v[sn]=new fruit(isim,renk,agirlik,ful);
        if(sn!=0)
            v[next].setnext(sn);
        next=sn; 
        
                  
                }  
        });   
      
         b2.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {
         
         int sn=0;
        area.setText("");
        while(v[sn].getnext()!=-1)
        {
            area.setText(area.getText()+v[sn].print(sn));
            sn=v[sn].getnext();
        }
        area.setText(area.getText()+v[sn].print(sn));
           //System.out.println(f[i]);
        sn=0;          
                }  
             });   
        b3.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {
           area.setText(v[sn].print(sn));
           sn=v[sn].getnext();
           if(sn==-1)sn=0;
                
                }  
             });     
    }
    
}
