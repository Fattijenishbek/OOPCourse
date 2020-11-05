package boxes;

import java.util.ArrayList;

public class MaxWeightBox extends Box {
    private  int maxWeight;
    ArrayList<String> arr=new ArrayList<String >();
    double num=0;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public void add(Thing thing) {
        if(num+thing.getWeight()<=maxWeight){
            num+=thing.getWeight();
            arr.add(thing.getName());
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return arr.contains(thing.getName());
    }
}
