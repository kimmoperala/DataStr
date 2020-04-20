/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tehtava14;

import tehtava1.Lue;

/**
 *
 * @author kamaj
 */
public class Menu {
//main alkaa-----------------------------------------------------------------------------
        public static void main(String[] args) {

                        printMenu();

        }
//main loppuu --------------------------------------------------------------------------
//printMenu alkaa------------------------------------------------------------------
        private static void printMenu() {
                char select;
                Stack s = new Stack(); // pino-olio
                String data; // Pinon data-kenttä
                do {

                        System.out.println("\n\t\t\t1. Anna lauseke postfix-muodossa.");
                        System.out.println("\t\t\t2. Lopetus.");
                        System.out.print("\n\n"); // tehdään tyhjiä rivejä
                        select = Lue.merkki();
                        switch (select) {
                        case '1':
                            System.out.println("Anna lauseke:");
                            data = new String(Lue.rivi());
                            PostFix postFix = new PostFix(data);
                            String outcome = postFix.calculate();
                            if (outcome != null) {
                                System.out.println("Tulos: " + outcome);
                            }
                            break;
                        case '2':
                            break;
                        }
                }
                while (select != '2');
        }
//printMenu loppuu ----------------------------------------------------------------
}

