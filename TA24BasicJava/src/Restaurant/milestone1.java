/**
 * 
 */
package Restaurant;

/**
 * 
 */
import java.util.ArrayList;
import java.util.List;
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
		int[] billetes = {500, 200, 100, 50, 20, 10, 5};
        int totalMenjar = 0;

        String[] menu = {"Plat 1", "Plat 2", "Plat 3", "Plat 4", "Plat 5"};
        int[] preus = {10, 15, 12, 8, 20};

        System.out.println("Benvinguts al restaurant!");
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - " + preus[i] + "€");
        }

        List<Integer> comanda = new ArrayList<>();
        int opcio;
        do {
            opcio = Integer.parseInt(JOptionPane.showInputDialog("Què voleu menjar? (1-5)"));
            if (opcio >= 1 && opcio <= 5) {
                comanda.add(opcio);
                totalMenjar += preus[opcio - 1];
                System.out.println("Afegit " + menu[opcio - 1] + " a la comanda.");
            } else {
                JOptionPane.showMessageDialog(null, "Opció incorrecta. Introduïu un número entre 1 i 5.");
            }
        } while (JOptionPane.showConfirmDialog(null, "Voleu afegir més plats?") == JOptionPane.YES_OPTION);

        System.out.println("Comanda:");
        for (int plat : comanda) {
            System.out.println(menu[plat - 1] + " - " + preus[plat - 1] + "€");
        }
        System.out.println("Preu total: " + totalMenjar + "€");

        int pagat = Integer.parseInt(JOptionPane.showInputDialog("Quina quantitat pagueu?"));
        int canvi = pagat - totalMenjar;

        System.out.println("Canvi: " + canvi + "€");
        calcularBitllets(billetes, canvi);
    }

    public static void calcularBitllets(int[] billetes, int canvi) {
        System.out.println("Bitllets i monedes a retornar:");
        for (int billete : billetes) {
            if (canvi >= billete) {
                int quantitat = canvi / billete;
                System.out.println(quantitat + " bitllet(s) de " + billete + "€");
                canvi %= billete;
            }
        }


	}

}
