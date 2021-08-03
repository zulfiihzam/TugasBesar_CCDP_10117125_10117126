package iteratorpatterndemo;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        
        FoodProducts foodProducts = new FoodProducts();
        foodProducts.add(new Snacks("Oreo"));
        foodProducts.add(new Snacks("Biskuat"));
        foodProducts.add(new Snacks("Qutela"));
        foodProducts.add(new Snacks("Taro"));
        foodProducts.add(new Snacks("Doritos"));
        foodProducts.add(new Snacks("Tango"));
        foodProducts.add(new Snacks("Pocky"));
        foodProducts.add(new Snacks("Biskuit Roma"));
        foodProducts.add(new Snacks("Cheezit"));
          
        FoodsProductIterator foodsProductIterator = foodProducts.getIterator();

        while (foodsProductIterator.hasMore()) System.out.println(foodsProductIterator.getNext());
    }
    
}
