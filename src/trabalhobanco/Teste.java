/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhobanco;

/**
 *
 * @author yanns
 */
public class Teste {

    public static void main(String[] args) {

        MinhaThread thread = new MinhaThread("Loading…\n█▒▒▒▒▒▒▒▒▒", 600);
        MinhaThread thread2 = new MinhaThread("30%\n"
                + "█████▒▒▒▒▒", 6000);
    }
}
