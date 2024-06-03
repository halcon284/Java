public class Elefante extends AnimalBase{
    public Elefante() {
    }

    @Override
    public String sonido() {
        System.out.println("Barriten");
        super.sonido();
        return null;
    }

    @Override
    public void moverse() {
        System.out.println("Camina");
        super.moverse();
    }
}
