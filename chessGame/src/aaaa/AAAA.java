
package aaaa;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class AAAA extends JFrame implements ActionListener{
    JPanel board=new JPanel();
    AAAA(){
        // board.setSize(800, 800);
        this.setSize(800,800);
        this.setTitle("CHESS");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setVisible(true);
          this.setLocationRelativeTo(null);
          board.setLayout(new GridLayout(8,8,2,2));
         this.add(board);
          boarder();
    }
    void boarder(){
          boolean color=true;
            String arr[]={"White_Rook.svg.png","White_Knight.svg.png","White_Bishop.svg.png","White_Queen.svg.png","White_King.svg.png","White_Bishop.svg.png","White_Knight.svg.png","White_Rook.svg.png"};
            String arr2[]={"Black_Rock.svg.png","Black_Kinght.svg.png","Black_Bishop.svg.png","Black_Queen.svg.png","Black_King.svg.png","Black_Bishop.svg.png","Black_Kinght.svg.png","Black_Rock.svg.png"};
            for(int i=0;i<8;i++){
          if(i%2==0)color=true;
          else color=false; 
          boolean st=color;
          
            for(int j=0;j<8;j++){
         JButton b =new JButton();
            if(st==true){
                b.setBackground(new Color(120,155,85));
                st=false;
            }else{
                b.setBackground(new Color(237,238,205));
                st=true;
            }
            if(i==0){
            ImageIcon icon=new ImageIcon(arr2[j]);
            b.setIcon(icon);
            }
            if(i==7){
      
            ImageIcon icon=new ImageIcon(arr[j]);
            b.setIcon(icon);
           
            }
            
            
            if(i==1){
            ImageIcon icon=new ImageIcon("Chess_hdt45.svg.png");
            b.setIcon(icon);
            }
            else if(i==6){
          ImageIcon wh=new ImageIcon("Chess_white.svg.png");
            b.setIcon(wh);
            }
            board.add(b);
            }
             
        }
    }
public static void main(String[] args) {
    new AAAA();
    
}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    

