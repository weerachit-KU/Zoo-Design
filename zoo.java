import Lib.*;
import java.util.ArrayList;
public class zoo {
    public static void main(String[] args) {
        ArrayList<animal> zoo = new ArrayList<>();
        zoo.add(new penguin("pengu"));
        zoo.add(new dolphin("smart"));
        zoo.add(new eagle("mihawk"));
        zoo.add(new lion("simba"));

        for(animal animal : zoo){
            System.out.println(animal.getName() + " : " + animal.makesound());
        }
        System.out.println("-------------------------------------------------------");
        for(animal animal : zoo){
            if (animal instanceof flyable) {
                System.out.println((animal.getName()) + " : " + ((flyable) animal).fly());
            } else if (animal instanceof swimable) {
                System.out.println((animal.getName()) + " : " + ((swimable) animal).swim());
            } else{
                System.out.println(animal.getName() + " just walking in the zoo");
            }
        }
    }
}
