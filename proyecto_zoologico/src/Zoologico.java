import java.util.ArrayList;
import java.util.List;

public class Zoologico  {

    private List<Animal> animales = new ArrayList<>();

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
        if (animales.add(animal))
            System.out.println("Se agrego correctamente.");

    }

    public void mostrarListaAnimales() {
        for (Animal animal : animales) {
            System.out.println("Animal: " + getClass().getSimpleName());
            animal.sonido();
            animal.moverse();
            System.out.println(animales);
        }

    }

    public void accion (int accionador, String accion) {
        if (accionador >= 0 && accionador < animales.size()){
            Animal animal = animales.get(accionador);
            if (accion.equals("sonido")) {
                animal.sonido();
            } else if (accion.equals("movimiento")) {
                animal.moverse();
            } else {
                System.out.println("Accion invalida.");
            }
        } else {
            System.out.println("Menu invalido");
        }
    }

}
