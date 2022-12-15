
public class Ingridients{
   Map<String, Integer> ingridentsMap = new HashMap<>();
   
   public Ingridients(){
   }
   
   public void addIngridients(int coffee, int tea, int milk, int water){
	ingridentsMap.put("coffee", coffee);
	ingridentsMap.put("tea", tea);
	ingridentsMap.put("milk", milk);
	ingridentsMap.put("water", water);
   }
}



