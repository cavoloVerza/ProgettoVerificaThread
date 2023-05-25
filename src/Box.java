public class Box {

    private int valore;

    public Box(int valore) {

        this.valore = valore;
    }

    public synchronized void P() {

        System.out.println("PIT-STOP " + Thread.currentThread().getName() + " è entrato ai box");
        System.out.println(" ");

        while(valore == 0) {

            try {

                System.out.println("---------- PIT-STOP " + Thread.currentThread().getName() + " è in attesa al box ----------");
                System.out.println(" ");
                wait();
            }

            catch(Exception e) {

                System.out.println(e.getMessage());
            }

        }

        valore--;

    }

    public synchronized void V() {

        valore++;
        notify();
    }
    
}