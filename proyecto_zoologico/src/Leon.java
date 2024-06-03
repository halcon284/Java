public class Leon extends AnimalBase{
    public Leon() {
    }

    @Override
    public String sonido() {
        System.out.println("Rugido");
        super.sonido();
        return null;
    }

    @Override
    public void moverse() {
        System.out.println("Corre");
        super.moverse();
    }

    @Override
    public String toString() {
        return "Leon{}";
    }
}
