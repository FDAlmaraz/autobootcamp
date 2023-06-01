//primera parte del ejercicio
package auto.bootcamp;

public class Main {

    public static void main(String[] args) {
        Auto elAuto = new Auto();
        elAuto.incrementopuertas();
        System.out.println(elAuto.numpuertas);
    }

}
class Auto {
    public int numpuertas = 4;

    public void incrementopuertas(){
        this.numpuertas++;
    }

}