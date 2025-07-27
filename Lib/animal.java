package Lib;

public abstract class  animal {
    private final String name;

    public animal(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract String makesound();
}
