package actividad5;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author marcn
 */
public class Actividad5 extends JFrame implements ActionListener
{    
    private JLabel      x, y;//greetingLabel
    private JLabel Suma, Resta, Div,Multi, Modulo;
    private JTextField  val1, val2;//ageField
    private JTextField  suma;
    private JTextField  resta;
    private JTextField  div;
    private JTextField  multi;
    private JTextField  modu;
    private JButton     button;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        Actividad5 demo = new Actividad5();
        demo.setSize(200,450);
        demo.createGUI();
        demo.setVisible(true);
    }
    private void createGUI()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        x = new JLabel("X: ");
        window.add(x);
        val1 = new JTextField(15);
        window.add(val1);
                
        y = new JLabel("Y: ");
        window.add(y);
        val2 = new JTextField(15);
        window.add(val2);
        
        Suma = new JLabel("Suma: ");
        window.add(Suma);
        suma = new JTextField(15);
        window.add(suma);
        
        Resta = new JLabel("Resta: ");
        window.add(Resta); 
        resta = new JTextField(15);
        window.add(resta);
        
        Div = new JLabel("Division: ");
        window.add(Div);
        div = new JTextField(15);
        window.add(div);
        
        Multi = new JLabel("Multiplicación: ");
        window.add(Multi);
        multi = new JTextField(15);
        window.add(multi);
        
        Modulo = new JLabel("Modulo: ");
        window.add(Modulo);
        modu = new JTextField(15);
        window.add(modu);
        
        button = new JButton("Cargar");
        window.add(button);
        button.addActionListener(this);
    }    
    public void actionPerformed(ActionEvent event)
    {       
       double x = 0, y = 0, z = 0;
        x = Integer.parseInt(val1.getText());
        y = Integer.parseInt(val2.getText());//JLabel
        
        suma.setText(String.valueOf(x+y));
        resta.setText(String.valueOf(x-y));
        div.setText(String.valueOf(x/y));
        multi.setText(String.valueOf(x*y));
        modu.setText(String.valueOf(x%y));
    }
}
