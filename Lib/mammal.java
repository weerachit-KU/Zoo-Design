package Lib;

public class mammal extends animal{
    public mammal(String name){
        super(name);
    }

    @Override
    public String makesound() {
        return "mammal sound";
    }

}
