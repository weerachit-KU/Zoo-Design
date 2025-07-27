package Lib;

public class lion extends mammal{
    public lion (String name){
        super(name);
    }

    @Override
    public String makesound() {
        return "Roar!";
    }
}
