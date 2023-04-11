/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Project_test1;

/**
 *
 * @author dimaz
 */
public class Project_looping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello world");

        testfunction();
    }

    static void testfunction() {
        //            form1
        for (int i = 0; i < 100; i++) {
            if (i == 0) {
                System.out.print(i);
            } else {
                System.out.print("," + i);
            }
        }
        System.out.println("");
        System.out.println("================================");

        for (int j = 0; j < 100; j += 2) {
            if (j == 0) {
                System.out.print(j);
            } else {
                System.out.print(","+j);
            }
        }
        System.out.println("");
        System.out.println("================================");

    }

}
