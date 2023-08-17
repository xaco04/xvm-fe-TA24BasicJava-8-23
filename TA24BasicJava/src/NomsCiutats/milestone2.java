/**
 * 
 */
package NomsCiutats;

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
        double[][] notas = new double[5][3]; 

        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota " + (j + 1) + " para el alumno " + (i + 1)));
            }
        }

        System.out.println("Resultados:");
        for (int i = 0; i < 5; i++) {
            double sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += notas[i][j];
            }
            double average = sum / 3;
            System.out.println("Alumno " + (i + 1) + ": Nota media = " + average + ", " + (average >= 5 ? "Aprobado" : "Suspenso"));
        }
    }
	

}
