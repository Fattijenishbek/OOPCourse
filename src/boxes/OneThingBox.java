package boxes;

import java.util.ArrayList;

public class OneThingBox extends Box {
    ArrayList<String> arr1=new ArrayList<String >();
    public OneThingBox() {
    }

    @Override
    public void add(Thing thing) {
        arr1.add(thing.getName());
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return arr1.get(0).contains(thing.getName());
    }
}
