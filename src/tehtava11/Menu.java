/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tehtava11;

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
                BinarySearch bsearch = new BinarySearch();
                String data;
                do {

                        System.out.println("\n\t\t\t1. Lisää avain.");
                        System.out.println("\t\t\t2. Etsi avaimella.");
                        System.out.println("\t\t\t3. Luettele taulukko.");
                        System.out.println("\t\t\t4. lopetus ");
                        System.out.print("\n\n"); // tehdään tyhjiä rivejä
                        select = Lue.merkki();
                        switch (select) {
                        case '1':
                            System.out.println("Anna uusi avain (merkkijono)");
                            data = new String(Lue.rivi());
                            bsearch.insert(data);
                            break;
                        case '2':                           
                                System.out.println("Anna etsittävä avain (merkkijono)");
                                data = Lue.rivi();
                                if (bsearch.binarySearch(data)!=-1){
                                    System.out.println("Avain löytyi paikasta " + bsearch.binarySearch(data));
                                }
                                else
                                    System.out.println("Avainta ei löytynyt.");
                                                           
                            break;
                        case '3':
                        	bsearch.showAll();
                            break;
                        case '4':
                            break;
                        }
                }
                while (select != '4');
        }
//printMenu loppuu ----------------------------------------------------------------
}

