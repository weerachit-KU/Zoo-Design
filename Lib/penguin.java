package Lib;

public class penguin extends bird implements swimable{
    public penguin (String name){
        super(name);
    }

    @Override
    public String makesound() {
        return "squawk!!!";
    }

    @Override
    public String swim() {
        return "The penguin dives gracefully in the water.";
    }
    
}
