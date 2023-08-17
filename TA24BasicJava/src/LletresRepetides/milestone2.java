/**
 * 
 */
package LletresRepetides;

/**
 * 
 */
import javax.swing.JOptionPane;

public class milestone2 {

	/**
	 * 
	 */
	public milestone2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int alturaEscala = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura de la escala:"));

        System.out.println("Escala de números:");
        for (int i = 1; i <= alturaEscala; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        int alturaPiramide = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura de la pirámide invertida:"));

        System.out.println("\nPirámide invertida de asteriscos:");
        for (int i = alturaPiramide; i >= 1; i--) {
            for (int j = 1; j <= alturaPiramide - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
