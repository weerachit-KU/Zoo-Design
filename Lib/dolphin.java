package Lib;

public class dolphin extends mammal implements swimable{
    public dolphin (String name){
        super(name);
    }

    @Override
    public String makesound() {
        return "Clicking sounds";
    }

    @Override
    public String swim() {
        return "The dolphin playfully swims in the sea.";
    }
    
}
