/**
 * 
 */
package NomsCiutats;

/**
 * 
 */
import javax.swing.JOptionPane;

public class milestone3 {

	/**
	 * 
	 */
	public milestone3() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número N:"));

        String sequence = "Secuencia de Fibonacci hasta " + n + ":\n";
        for (int i = 0; i <= n; i++) {
            sequence += fibonacci(i) + " ";
        }

        JOptionPane.showMessageDialog(null, sequence);
    }

    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
