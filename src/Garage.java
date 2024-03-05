import java.sql.*;

public class Garage extends Online {
    private String name;
    private Channel[] ch;
    private Warehouse wh;
    private Log log;
    
    public Garage(){
        ch = new Channel[8];
        try{
           ResultSet result = this.getStatement().executeQuery("select * from car_list");
           while (result.next()){
               Car car = new Car(result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getInt(6));
               int channel = result.getInt(7);
               switch (channel){
                    case 1 : ch[1].addCar(car);
                            break;
                    case 2 : ch[2].addCar(car);
                            break;
                    case 3 : ch[3].addCar(car);
                            break;
                    case 4 : ch[4].addCar(car);
                            break;
                    case 5 : ch[5].addCar(car);
                            break;
                    case 6 : ch[6].addCar(car);
                            break;
                    case 7 : ch[7].addCar(car);
                            break;
                    case 8 : ch[8].addCar(car);
                            break;
                            
               }
                       
           }
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    public void addCar(Car car, int channel){
            switch (channel){
                 case 1 : ch[1].addCar(car);
                         break;
                 case 2 : ch[2].addCar(car);
                         break;
                 case 3 : ch[3].addCar(car);
                         break;
                 case 4 : ch[4].addCar(car);
                         break;
                 case 5 : ch[5].addCar(car);
                         break;
                 case 6 : ch[6].addCar(car);
                         break;
                 case 7 : ch[7].addCar(car);
                         break;
                 case 8 : ch[8].addCar(car);
                         break;
            }
    }
    public String getName(){
        return this.name;
    }
    
    public Channel getCh(int index){
        return this.ch[index];
    }
    
    public Warehouse getWarehouse(){
        return this.wh;
    }
    
    public Log getLog(){
        return this.log;
    }
    
}
