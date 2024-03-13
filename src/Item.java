public class Item {
    private String name;
    private int volume;
    private double price_per_piece;
    private double total;
    
    public Item(){
        this("", 0, 0);
    }
    
    public Item(String name, int volume, double price_per_piece){
        this.name = name;
        this.volume = volume;
        this.price_per_piece = price_per_piece;
        this.total = price_per_piece*volume;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public void setPrice(double price){
        this.price_per_piece = price;
        this.total = this.price_per_piece * volume;
    }
    
    public String getName(){
        return this.name;
    }
    public int getVolume(){
        return this.volume;
    }
    public double getPrice(){
        return this.price_per_piece;
    }
    public double getTotal(){
        return this.total;
    }
}
