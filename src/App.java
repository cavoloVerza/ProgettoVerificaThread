public class App {
    public static void main(String[] args) throws Exception {
        
        Box box = new Box(2);

        Pilota p1 = new Pilota("Leclerc");
        Pilota p2 = new Pilota("Bottas");
        Pilota p3 = new Pilota("Hamilton");
        Pilota p4 = new Pilota("Verstappen");
        Pilota p5 = new Pilota("Perez");

        Monoposto m1 = new Monoposto(1, "Ferrari", p1, box);
        Monoposto m2 = new Monoposto(2, "Red Bull", p2, box);
        Monoposto m3 = new Monoposto(3, "Mercedes", p3, box);
        Monoposto m4 = new Monoposto(4, "Ferrari", p4, box);
        Monoposto m5 = new Monoposto(5, "Red Bull", p5, box);

        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();

        m1.join();
        m2.join();
        m3.join();
        m4.join();
        m5.join();

        System.out.println("Gara finita");

    }
}
