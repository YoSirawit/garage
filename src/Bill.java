
import java.util.*;

public class Bill {
    private ArrayList<Item> item_list;
    private double total;
    
    public Bill(){
        item_list = new ArrayList();
        total = 0;
    }
    
    public void addItem(Item item){
        this.item_list.add(item);
        this.total += item.getTotal();
    }
       
    public ArrayList getInfo(){
        for(int i=0; i<item_list.size(); i++){
            System.out.println(String.format("%s x%d pp:%.2f total:%.2f", this.item_list.get(i).getName(), this.item_list.get(i).getVolume(), this.item_list.get(i).getPrice(), this.item_list.get(i).getTotal()));
        }
        return this.item_list;
    }
}
