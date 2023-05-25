public class Monoposto extends Thread{

    /**
     * Classe che rappressenta la vettura in una gara
    */

    /**
     * numero della macchina
     */
    protected int numero;

    /**
     * Nome della scuderia
     */
    protected String scuderia;

    /**
     * Pilota della macchina
     */
    protected Pilota pilota;

    /**
     * Unico box presente nella gara
     */
    protected Box semaforo;

    /**
     * Costruttore della macchina
     * @param numero numero della macchina
     * @param scuderia Nome della scuderia
     * @param pilota Pilota della macchina
     * @param semaforo Unico box presente nella gara
     */
    public Monoposto(int numero, String scuderia, Pilota pilota, Box semaforo) {
        this.numero = numero;
        this.scuderia = scuderia;
        this.pilota = pilota;
        this.semaforo = semaforo;

        setName(pilota.getNome());
    }

    /**
     * Ritorna il numero della macchina
     * @return Ritorna il numero della macchina
     */
    public int getNumero() {
        return numero;
    }

    /**
     Ritorna la scuderia della macchina
     * @return Ritorna la scuderia della macchina
     */
    public String getScuderia() {
        return scuderia;
    }

    /**
     Ritorna il pilota della macchina
     * @return Ritorna il pilota della macchina
     */
    public Pilota getPilota() {
        return pilota;
    }

    /**
     * Metodo ereditato dalla classe Thread gestisce i giri e la entrata nei box
     */
    @Override
    public void run() { 

        for(int i = 1; i <= 10; i++) {

            int secGiro = (int) (Math.random() * 4) + 1;
            try {

                Thread.sleep(secGiro * 1000);
            }

            catch(Exception e) {

                System.out.println(e.getMessage());
            }

            if(i % 3 == 0) {

                int secCambio = (int) (Math.random() * 5) + 1;

                semaforo.P();
                System.out.println("PIT-STOP " + pilota.getNome() + " cambio gomma in corso");
                System.out.println(" ");

                try {

                    Thread.sleep(secCambio * 1000);
                }
    
                catch(Exception e) {
    
                    System.out.println(e.getMessage());
                }

                System.out.println("PIT-STOP " + pilota.getNome() + " completato");
                System.out.println(" ");
                semaforo.V();

            }

            System.out.println("GIRO - " + (i) + " " + pilota.getNome() + " completato");
            System.out.println(" ");

        }

    }

}