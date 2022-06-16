package trabalhobanco;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MinhaThread extends Thread { 

        private String nome;
        private int tempo;

        public MinhaThread(String nome, int tempo) {
            this.nome = nome;
            this.tempo = tempo;
            start();

        }

        public void run() {
            try {
                for (int i = 0; i < 2; i++) {
                    System.out.println(nome);
                    Thread.sleep(1000);

                }
            } catch (InterruptedException ex) {
                Logger.getLogger(MinhaThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

