
package binomio;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener{
    
        
    private JTextField num1, num2, mensaje;
    private JButton resultado;
    private JLabel titulo, CantidadTxt, MensajeTxt, MensajeTxt2;
    
    public Ventana(){
        configurarVentana();
        iniciarComponentes();
    }
        private void configurarVentana (){
        
        setTitle("BINOMIO CUADRADO");
        setSize(650,510);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setBackground(new Color (220, 216, 255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        
        private void iniciarComponentes(){

        /*
            *Texto mostrado en la pantalla
            */
        
        titulo = new JLabel("Binomio cuadrado (ax+b)^2");
        titulo.setBounds(230,40,300,30);
        titulo.setFont (new Font("TimesRoman", Font.BOLD,18));
        add(titulo);
        titulo.setVisible(true);
        
        CantidadTxt = new JLabel("Coeficiente:");
        CantidadTxt.setBounds(40,120,200,30);
        add(CantidadTxt);
        CantidadTxt.setVisible(true);

        MensajeTxt = new JLabel("Número: ");
        MensajeTxt.setBounds(40,160,200,30);
        add(MensajeTxt);
        MensajeTxt.setVisible(true);
        
        MensajeTxt2 = new JLabel("Resultado: ");
        MensajeTxt2.setBounds(40,220,250,30);
        add(MensajeTxt2);
        MensajeTxt2.setVisible(true);
        
        
        /*
        *Cuadros de texto para ingresar la información 
        */
        num1 = new JTextField();
        num1.setBounds(150, 120, 100, 20);
        add(num1);
        num1.setVisible(true);  

        num2 = new JTextField();
        num2.setBounds(150, 160, 100, 20);
        add(num2);
        num2.setVisible(true); 
        
        mensaje = new JTextField();
        mensaje.setBounds(150, 220, 250, 20);
        add(mensaje);
        mensaje.setVisible(true); 
    
        
        
        //buttons              
        
        resultado = new JButton("Resultado");
        resultado.setBounds(450, 340, 100, 50);
        add(resultado);
        resultado.addActionListener(this);
        resultado.setVisible(true);         
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
            
        double cantidad,numero;
            if (e.getSource()==resultado){
                cantidad=Double.parseDouble(num1.getText());
                numero=Double.parseDouble(num2.getText());
                double x=Math.pow(cantidad, 2);
                double y=Math.pow(numero, 2);
                double z=2*(cantidad*numero);
                String total=""+x+"x^2 + "+z+"x + "+y;
                mensaje.setText(total);
            }    
    }
    
}