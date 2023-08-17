/**
 * 
 */
package LletresRepetides;

/**
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		// FASE 1
        char[] nombreFase1 = { 'X', 'a', 'v', 'i', 'e', 'r', ' ', 'J', 'o', 'r', 'd', 'i' };
        for (char letra : nombreFase1) {
            System.out.println(letra);
        }

        // FASE 2
        List<Character> nombreFase2 = new ArrayList<>();
        nombreFase2.add('X');
        nombreFase2.add('a');
        nombreFase2.add('v');
        nombreFase2.add('i');
        nombreFase2.add('e');
        nombreFase2.add('r');
        nombreFase2.add(' ');
        nombreFase2.add('J');
        nombreFase2.add('o');
        nombreFase2.add('r');
        nombreFase2.add('d');
        nombreFase2.add('i');


        for (char letra : nombreFase2) {
            if (Character.isDigit(letra)) {
                JOptionPane.showMessageDialog(null, "Els noms de persones no contenen números!");
            } else if (Character.isLetter(letra)) {
                if ("AEIOUaeiou".contains(String.valueOf(letra))) {
                    JOptionPane.showMessageDialog(null, "VOCAL");
                } else {
                    JOptionPane.showMessageDialog(null, "CONSONTANT");
                }
            }
        }

        // FASE 3
        List<Character> nombreFase3 = new ArrayList<>();
        nombreFase3.add('X');
        nombreFase3.add('a');
        nombreFase3.add('v');
        nombreFase3.add('i');
        nombreFase3.add('e');
        nombreFase3.add('r');
        nombreFase3.add(' ');
        nombreFase3.add('J');
        nombreFase3.add('o');
        nombreFase3.add('r');
        nombreFase3.add('d');
        nombreFase3.add('i');


        Map<Character, Integer> letrasMap = new HashMap<>();

        for (char letra : nombreFase3) {
            if (Character.isLetter(letra)) {
                letrasMap.put(letra, letrasMap.getOrDefault(letra, 0) + 1);
            }
        }

        StringBuilder mensajeFase3 = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : letrasMap.entrySet()) {
            mensajeFase3.append(entry.getKey()).append(": ").append(entry.getValue()).append(" vegades\n");
        }
        JOptionPane.showMessageDialog(null, mensajeFase3.toString());

        // FASE 4
        List<Character> nameFase4 = new ArrayList<>();
        nameFase4.add('X');
        nameFase4.add('a');
        nameFase4.add('v');
        nameFase4.add('i');
        nameFase4.add('e');
        nameFase4.add('r');
        nameFase4.add(' ');
        nameFase4.add('J');
        nameFase4.add('o');
        nameFase4.add('r');
        nameFase4.add('d');
        nameFase4.add('i');

        List<Character> surnameFase4 = new ArrayList<>();
        surnameFase4.add('V');
        surnameFase4.add('i');
        surnameFase4.add('c');
        surnameFase4.add('o');
        surnameFase4.add(' ');
        surnameFase4.add('M');
        surnameFase4.add('a');
        surnameFase4.add('r');
        surnameFase4.add('t');
        surnameFase4.add('í');


        List<Character> fullNameFase4 = new ArrayList<>(nameFase4);
        fullNameFase4.add(' ');
        fullNameFase4.addAll(surnameFase4);

        JOptionPane.showMessageDialog(null, "FullName: " + fullNameFase4.toString());
    }



}
