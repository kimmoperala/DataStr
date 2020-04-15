/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tehtava12;

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
                MinHeap minHeap = new MinHeap(30);
                int data, removed;
                do {

                        System.out.println("\n\t\t\t1. Lisää avain.");
                        System.out.println("\t\t\t2. Poista pienin (deleteMin).");
                        System.out.println("\t\t\t3. Näytä binäärikasa.");
                        System.out.println("\t\t\t4. lopetus ");
                        System.out.print("\n\n"); // tehdään tyhjiä rivejä
                        select = Lue.merkki();
                        switch (select) {
                        case '1':
                            System.out.println("Anna uusi avain (kokonaisluku)");
                            data = Lue.kluku();
                            minHeap.insert(data);
                            minHeap.minHeap();
                            break;
                        case '2':                           
                            System.out.println("Poistetaan pienin...");
                            removed = minHeap.remove();
                            System.out.println("Avain " + removed + " poistettu.");                    
                            break;
                        case '3':
                            minHeap.print();
                            break;
                        case '4':
                            break;
                        }
                }
                while (select != '4');
        }
//printMenu loppuu ----------------------------------------------------------------
}

