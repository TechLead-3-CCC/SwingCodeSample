import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SwingDemo {
	SwingDemo() {  
		 JFrame jfrm = new JFrame("A Simple Swing Program");  
		 jfrm.setSize(275, 100);   
		 JLabel jlab = new JLabel(" Swing powers the modern Java GUI.");  
		 jfrm.getContentPane().add(jlab);  
		 jfrm.setVisible(true);  
		 }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {   public void run() {  
			 new SwingDemo();  
			 }  
			 });  
	}

}
