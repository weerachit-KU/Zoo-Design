package Lib;

public class eagle extends bird implements flyable{
    public eagle (String name){
        super(name);
    }

    @Override
    public String fly() {
        return "The eagle soars through the sky.";
    }
    
    @Override
    public String makesound() {
        return "Screech!";
    }
}
