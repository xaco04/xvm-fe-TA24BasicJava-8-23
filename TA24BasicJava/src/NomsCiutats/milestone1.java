/**
 * 
 */
package NomsCiutats;

/**
 * 
 */
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class milestone1 {

	/**
	 * 
	 */
	public milestone1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ciudades = new ArrayList<>();

        // FASE 1
        for (int i = 0; i < 6; i++) {
            String ciudad = JOptionPane.showInputDialog("Introduce el nombre de la ciudad " + (i + 1));
            ciudades.add(ciudad);
        }

        JOptionPane.showMessageDialog(null, "Ciudades introducidas:\n" + ciudadesToString(ciudades));

        // FASE 2
        String[] arrayCiudades = ciudades.toArray(new String[0]);
        Arrays.sort(arrayCiudades);

        JOptionPane.showMessageDialog(null, "Ciudades ordenadas por orden alfabético:\n" + arrayToString(arrayCiudades));

        // FASE 3
        ArrayList<String> ciudadesModificadas = new ArrayList<>();
        for (String ciudad : ciudades) {
            String ciudadModificada = ciudad.replace('a', '4');
            ciudadesModificadas.add(ciudadModificada);
        }
        ciudadesModificadas.sort(String::compareToIgnoreCase);

        JOptionPane.showMessageDialog(null, "Ciudades modificadas y ordenadas:\n" + ciudadesToString(ciudadesModificadas));

        // FASE 4
        ArrayList<String> nombresInvertidos = new ArrayList<>();
        for (String ciudad : ciudades) {
            nombresInvertidos.add(invertirString(ciudad));
        }

        JOptionPane.showMessageDialog(null, "Ciudades con nombres invertidos:\n" + ciudadesToString(nombresInvertidos));
    }

    public static String ciudadesToString(ArrayList<String> ciudades) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String ciudad : ciudades) {
            stringBuilder.append(ciudad).append("\n");
        }
        return stringBuilder.toString();
    }

    public static String arrayToString(String[] array) {
        return String.join("\n", array);
    }

    public static String invertirString(String str) {
        return new StringBuilder(str).reverse().toString();
    }


}
