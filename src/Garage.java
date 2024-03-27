import java.sql.*;
import java.util.ArrayList;

public class Garage extends Online {
    private String name;
    private Channel[] ch;
    
    public Garage(){
        ch = new Channel[10];
        ch[0] = new Channel();
        ch[1] = new Channel();
        ch[2] = new Channel();
        ch[3] = new Channel();
        ch[4] = new Channel();
        ch[5] = new Channel();
        ch[6] = new Channel();
        ch[7] = new Channel();
        ch[8] = new Channel();
        ch[9] = new Channel();
        try{
           ResultSet result = this.getStatement().executeQuery("select * from car_list");
           while (result.next()){
               Car car = new Car(result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getInt(6), result.getString(8), result.getString(9));
               int channel = result.getInt(7);
               switch (channel){
                    case 1 : ch[0].addCar(car);
                            break;
                    case 2 : ch[1].addCar(car);
                            break;
                    case 3 : ch[2].addCar(car);
                            break;
                    case 4 : ch[3].addCar(car);
                            break;
                    case 5 : ch[4].addCar(car);
                            break;
                    case 6 : ch[5].addCar(car);
                            break;
                    case 7 : ch[6].addCar(car);
                            break;
                    case 8 : ch[7].addCar(car);
                            break;
                    case 9 : ch[8].addCar(car);
                            break;
                    case 10 : ch[9].addCar(car);
                            break;
               }
                       
           }
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    public void addCar(Car car, int channel){
            switch (channel){
                case 1 : ch[0].addCar(car);
                        break;
                case 2 : ch[1].addCar(car);
                        break;
                case 3 : ch[2].addCar(car);
                        break;
                case 4 : ch[3].addCar(car);
                        break;
                case 5 : ch[4].addCar(car);
                        break;
                case 6 : ch[5].addCar(car);
                         break;
                case 7 : ch[6].addCar(car);
                        break;
                case 8 : ch[7].addCar(car);
                        break;
                case 9 : ch[8].addCar(car);
                        break;
                case 10 : ch[9].addCar(car);
                        break;
            }
    }
    public String getName(){
        return this.name;
    }
    
    public Channel getCh(int index){
        return this.ch[index];
    }
    
    public Channel[] getAllCh(){
        return this.ch;
    }
    
}
