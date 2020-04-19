/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tehtava13;

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
                HashTable hashTable = new HashTable(7);
                int data, removed;
                do {

                        System.out.println("\n\t\t\t1. Lisää avain.");
                        System.out.println("\t\t\t2. Hae avaimella.");
                        System.out.println("\t\t\t3. lopetus ");
                        System.out.print("\n\n"); // tehdään tyhjiä rivejä
                        select = Lue.merkki();
                        switch (select) {
                        case '1':
                            System.out.println("Anna uusi avain (kokonaisluku)");
                            data = Lue.kluku();
                            hashTable.add(data);
                            hashTable.showAll();
                            break;
                        case '2':                           
                            System.out.println("Anna haettava avain: ");
                            data = Lue.kluku();
                            int place = hashTable.search(data);
                            if(place != -1) {
                            	System.out.println("Avain " + data + " löytyi paikalta " + place);
                            } else {
                            	System.out.println(data + " ei löytynyt hajautustaulusta!");
                            }
                            ;
                            break;
                        case '3':
                            break;
                        }
                }
                while (select != '3');
        }
//printMenu loppuu ----------------------------------------------------------------
}

