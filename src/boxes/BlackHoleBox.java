package boxes;

import java.util.ArrayList;

public class BlackHoleBox extends Box {
    ArrayList<String> arr2=new ArrayList<String >();
    public BlackHoleBox() {
    }

    @Override
    public void add(Thing thing) {
        arr2.add(thing.getName());
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
