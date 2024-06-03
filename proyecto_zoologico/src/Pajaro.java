public class Pajaro extends AnimalBase {
    public Pajaro() {
    }

    @Override
    public String sonido() {
        System.out.println("Chirrido");
        return super.sonido();
    }

    @Override
    public void moverse() {
        System.out.println("Vuela");
        super.moverse();
    }
}
