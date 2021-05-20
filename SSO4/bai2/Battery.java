package bai2;

public class Battery {

    private int energy;

    public Battery(){
        energy = 100;
    }

    public void setEnerfy(int value){
        energy= value;
    }

    public int getEnergy(){
        return energy;
    }

    public void dereaseEnerfy(){
        energy--;
    }
    
}
