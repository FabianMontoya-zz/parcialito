package paquete;
import java.awt.event.*;
import javax.swing.*;
public class parcial extends JFrame implements ActionListener{
    JLabel T1,T2,T3,T4;
    JTextField c1,c2;
    JButton b1;
    String nombre,curso;
    public parcial (){
        super ("Parcial");
        setLayout(null);
        cajas();
        boton();
        labels();
    }
    //
    public void cajas(){
        c1 = new JTextField();
        c1.setBounds(120, 80, 190, 20);
        add(c1);
        //c1.addKeyListener(null);
        //
        c2 = new JTextField();
        c2.setBounds(155, 110, 155, 20);
        add(c2);
        //c2.addKeyListener(null);
        
    }
    //
    public void labels(){
        T1 = new JLabel("Bienvenido a su Parcial");
        T1.setBounds(120,2,180,50);
        add(T1);
        //
        T2 = new JLabel("Digite sus datos, son sobre los cuales se hara la calificación total.");
        T2.setBounds(10,25,500,50);
        add(T2);
        //
        T3 = new JLabel("Nombre completo:");
        T3.setBounds(10,65,200,50);
        add(T3);
        //
        T4 = new JLabel("Curso al cual pertenece:");
        T4.setBounds(10,95,200,50);
        add(T4);
    }
    //
    
    public void boton(){
        b1 = new JButton("Entrar");
        b1.setBounds(140, 160, 100, 30);
        b1.setEnabled(true);
        add(b1);
        b1.addActionListener(this);
    }
    ///
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==b1){
            if (c1.getText().length()==0 && c2.getText().length()>0){
               JOptionPane.showMessageDialog(null, "¡ERROR!\n\nNo se encontro ningun dato en el primer campo.\n\n Por favor intente de nuevo.", "Sin Datos", JOptionPane.ERROR_MESSAGE);
                c1.requestFocus();
           }
           if(c2.getText().length()==0 && c1.getText().length()>0){
               JOptionPane.showMessageDialog(null, "¡ERROR!\n\nNo se encontro ningun dato en el segundo campo.\n\n Por favor intente de nuevo.", "Sin Datos", JOptionPane.ERROR_MESSAGE);
               c2.requestFocus();
           }
           if(c1.getText().length()==0 && c2.getText().length()==0){
               JOptionPane.showMessageDialog(null, "¡ERROR!\n\nNo se encontro ningun dato.\n\n Por favor intente de nuevo.", "Sin Datos", JOptionPane.ERROR_MESSAGE);
               c1.requestFocus();
           }
           else{
               
               evaluacion form2 = new evaluacion();
               form2.setBounds(620, 240, 400, 200);
               form2.setSize(500, 400);
               form2.setResizable(false);
               form2.setVisible(true);
               //
               reporte form3 = new reporte (c1.getText(),c2.getText());
               b1.setEnabled(false);
           }
        }
    }
    //
    public void keyReleased( KeyEvent arg0 ) { // <-- Este es el importante  
        if(c1.getText().length() != 0){
            b1.setEnabled(true);
        } 
        
    }
            
    //
    public static void main(String[] args) {
      JFrame ventana = new parcial();
      ventana.setBounds(600, 250, 400, 600);
      ventana.setSize(400, 250);
      ventana.setVisible(true);
      ventana.setResizable(false);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    

}
