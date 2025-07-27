package Lib;

public class bird extends animal{
    public bird(String name){
        super(name);
    }

    @Override
    public String makesound() {
        return "Chirp Chirp an epic bird sound.";
    }
    
}
