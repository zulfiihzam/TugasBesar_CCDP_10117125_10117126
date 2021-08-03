package iteratorpatterndemo;

import java.util.ArrayList;
import java.util.List;


public class FoodProducts implements Products{

    List<Snacks> snacksList = new ArrayList<>();
    private int index = 0;

    public void add(Snacks snacks){
        snacksList.add(snacks);
    }

    @Override
    public FoodsProductIterator getIterator() {
        return new SnacksIterator();
    }

    private class SnacksIterator implements FoodsProductIterator{
        @Override
        public boolean hasMore() {
            return (index < snacksList.size());
        }

        @Override
        public Object getNext() {
            if (hasMore()) return snacksList.get(index++);
            return null;
        }
    }
    
}
