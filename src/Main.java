import com.packets.cars.car;
import com.packets.clients.client;

/**
 * Created by mihai on 10/26/2014.
 */
public class Main {
    public static void main(String[] args) {
        try {

            //classes Instances
            car c;
            c = new car("volvo", "verde", 120, 45, 200, 78);
            client cl;
            cl = new client("Coca Mihai", 100);
            cl.buy(c); //cumpar o masina prin asignarea valorii id-ului ei in variabila carId
            System.out.println("Numarul de inregistrare al masinii mele este : " + cl.getCarId());

            car[] cars = new car[5];
            System.out.println(cars.length);
            for (int i = 0; i <= cars.length; i++) { //arunca eroarea fiindca am depasit lungimea vectorului
                cars[i] = new car("dacia" + i, "visiniu", 23, 56, 122, 50);
                System.out.println("Numarul de inmatriculare pt dacia" + i + " este : " + cars[i].getId());
            }

            cl.buy(cars[0]);

        } catch (Exception e) {
            System.out.println("Error 1");
        }
    }
}