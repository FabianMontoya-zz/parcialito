package paquete;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class evaluacion extends JFrame implements ActionListener {
        
    JLabel T1,T2,T3,T4,T5,T6,T7,T8,T9,T10;
    JTextField c1,c2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,enviar;
    JRadioButton R1,R2,R3,R4,A2,B2,C2,D2;
    JCheckBox A1,B1,C1,D1;
    
    private JTabbedPane tabbedPane;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    
    public evaluacion(){
        super("Cuestionario"); //No usar Set Layout
        
        //
        JPanel PANEL = new JPanel();
	PANEL.setLayout( new BorderLayout() );
	getContentPane().add( PANEL );

		// Se crean las paginas
		createPage1();
		createPage2();
		createPage3();
                createPage4();
                createPage5();

		// Create a tabbed pane
		tabbedPane = new JTabbedPane();
		tabbedPane.addTab( "Ciencias", panel1 );
		tabbedPane.addTab( "Historia", panel2 );
		tabbedPane.addTab( "Geografía", panel3 );
                tabbedPane.addTab( "Matemáticas", panel4 );
                tabbedPane.addTab( "Deportes", panel5 );
		PANEL.add( tabbedPane, BorderLayout.CENTER );
    }
    
    public void createPage1()
	{
		panel1 = new JPanel();
		panel1.setLayout( null );
                T1 = new JLabel("1 - ¿Cuántos reinos en total componen los llamados << Reinos de la Naturaleza >>?");
                T1.setBounds(10,2,800,50);
                panel1.add(T1);
                pregunta1();
                b1 = new JButton("Enviar");
                b1.setBounds(180, 60, 90, 30);
                b1.setEnabled(true);
                b1.addActionListener(this);
                panel1.add(b1);
                
                T2 = new JLabel("2 - Las bacterias pertenecen al reino...");
                T2.setBounds(10,120,800,50);
                panel1.add(T2);
                pregunta2();
                b2 = new JButton("Enviar");
                b2.setBounds(180, 190, 90, 30);
                b2.setEnabled(true);
                b2.addActionListener(this);
                panel1.add(b2);
                
                		
	}
    public void pregunta1(){
                ButtonGroup buttonGroup = new ButtonGroup();
                
                R1 = new JRadioButton("4.");
                R1.setBounds(20, 40, 150, 20);
                buttonGroup.add(R1);
                R1.setEnabled(true);
                panel1.add(R1);
                
                R2 = new JRadioButton("5.");
                R2.setBounds(20, 60, 150, 20);
                buttonGroup.add(R2);
                R2.setEnabled(true);
                panel1.add(R2);
                
                R3 = new JRadioButton("2.");
                R3.setBounds(20, 80, 150, 20);
                R3.setEnabled(true);
                buttonGroup.add(R3);
                panel1.add(R3);
                
                R4 = new JRadioButton("7.");
                R4.setBounds(20, 100, 150, 20);
                R4.setEnabled(true);
                buttonGroup.add(R4);
                panel1.add(R4);
    }
    
     public void pregunta2(){
         ButtonGroup buttonGroup2 = new ButtonGroup();
                A2 = new JRadioButton("Animal.");
                A2.setBounds(20, 160, 150, 20);
                A2.setEnabled(true);
                buttonGroup2.add(A2);
                panel1.add(A2);
                
                B2 = new JRadioButton("Protista.");
                B2.setBounds(20, 180, 150, 20);
                B2.setEnabled(true);
                buttonGroup2.add(B2);
                panel1.add(B2);
                
                C2 = new JRadioButton("Fungi.");
                C2.setBounds(20, 200, 150, 20);
                buttonGroup2.add(C2);
                C2.setEnabled(true);
                panel1.add(C2);
                
                D2 = new JRadioButton("Monera.");
                D2.setBounds(20, 220, 150, 20);
                D2.setEnabled(true);
                buttonGroup2.add(D2);
                panel1.add(D2);
     }
///////////////////////////////////////////////
	public void createPage2()
	{
		panel2 = new JPanel();
		panel2.setLayout( null );
                T3 = new JLabel("3 - ¿En qué año fue declara la independencia de Colombia?:");
                T3.setBounds(10,2,800,50);
                panel2.add(T3);
                pregunta3();
                b3 = new JButton("Enviar");
                b3.setBounds(180, 60, 90, 30);
                b3.setEnabled(true);
                b3.addActionListener(this);
                panel2.add(b3);
                
                T4 = new JLabel("4 - ¿Dentro de que años comprendio la denominada << Guerra Fria >>?:");
                T4.setBounds(10,120,800,50);
                panel2.add(T4);
                pregunta4();
                b4 = new JButton("Enviar");
                b4.setBounds(180, 190, 90, 30);
                b4.setEnabled(true);
                b4.addActionListener(this);
                panel2.add(b4);
	}
        //
        public void pregunta3(){
            c1 = new JTextField();
            c1.setBounds(20, 65, 100, 25);
            panel2.add(c1);
        }
        
        public void pregunta4(){
            ButtonGroup checksbox = new ButtonGroup();
            A1 = new JCheckBox("1960-1965");
            B1 = new JCheckBox("1950-1960");
            C1 = new JCheckBox("1953-1962");
            D1 = new JCheckBox("1940-1960");
            A1.setBounds(20, 160, 100, 20);
            B1.setBounds(20, 180, 100, 20);
            C1.setBounds(20, 200, 100, 20);
            D1.setBounds(20, 220, 100, 20);
            checksbox.add(A1);
            panel2.add(A1);
            checksbox.add(B1);
            panel2.add(B1);
            checksbox.add(C1);
            panel2.add(C1);
            checksbox.add(D1);
            panel2.add(D1);
        }
        ////////////////////////////////////////////
	public void createPage3()
	{
		panel3 = new JPanel();
		panel3.setLayout( null );

		
	}
        //
        public void createPage4(){
            panel4 = new JPanel();
	    panel4.setLayout( null );
        }
        //
        public void createPage5(){
            panel4 = new JPanel();
	    panel4.setLayout( null );
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
 
                
    }
    
    
    

