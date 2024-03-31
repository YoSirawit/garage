import java.sql.*;
import java.util.ArrayList;

public class Garage extends Online {
    private GarageController gc;
    private String name;
    private Channel[] ch;
    
    public Garage(GarageController gc){
        this.gc = gc;
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
           ResultSet result = gc.getStatement().executeQuery("select * from car_list");
           while(result.next()){
               Car car = new Car(result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getInt(6), result.getString(8), result.getString(9));
               int channel = result.getInt(7);
               Bill new_bill = new Bill();
               if(channel == 1){
                    ResultSet bill_result = this.getStatement().executeQuery("select * from bill_1");
                    new_bill = new Bill();
                    while(bill_result.next()){
                        Item item = new Item(bill_result.getString(1), bill_result.getInt(2), bill_result.getInt(3));
                        new_bill.addItem(item);
                    }
                    car.setBill(new_bill);
                    ch[0].addCar(car);
               }else if(channel == 2){
                    ResultSet bill_result = this.getStatement().executeQuery("select * from bill_2");
                    new_bill = new Bill();
                    while(bill_result.next()){
                        Item item = new Item(bill_result.getString(1), bill_result.getInt(2), bill_result.getInt(3));
                        new_bill.addItem(item);
                    }
                    car.setBill(new_bill);
                    ch[1].addCar(car);
               }else if(channel == 3){
                   ResultSet bill_result = this.getStatement().executeQuery("select * from bill_3");
                    new_bill = new Bill();
                    while(bill_result.next()){
                        Item item = new Item(bill_result.getString(1), bill_result.getInt(2), bill_result.getInt(3));
                        new_bill.addItem(item);
                    }
                    car.setBill(new_bill);
                    ch[2].addCar(car);
               }else if(channel == 4){
                    ResultSet bill_result = this.getStatement().executeQuery("select * from bill_4");
                    new_bill = new Bill();
                    while(bill_result.next()){
                        Item item = new Item(bill_result.getString(1), bill_result.getInt(2), bill_result.getInt(3));
                        new_bill.addItem(item);
                    }
                    car.setBill(new_bill);
                    ch[3].addCar(car);
               }else if(channel == 5){
                    ResultSet bill_result = this.getStatement().executeQuery("select * from bill_5");
                    new_bill = new Bill();
                    while(bill_result.next()){
                        Item item = new Item(bill_result.getString(1), bill_result.getInt(2), bill_result.getInt(3));
                        new_bill.addItem(item);
                    }
                    car.setBill(new_bill);
                    ch[4].addCar(car);
               }else if(channel == 6){
                    ResultSet bill_result = this.getStatement().executeQuery("select * from bill_6");
                    new_bill = new Bill();
                    while(bill_result.next()){
                        Item item = new Item(bill_result.getString(1), bill_result.getInt(2), bill_result.getInt(3));
                        new_bill.addItem(item);
                    }
                    car.setBill(new_bill);
                    ch[5].addCar(car);
               }else if(channel == 7){
                    ResultSet bill_result = this.getStatement().executeQuery("select * from bill_7");
                    new_bill = new Bill();
                    while(bill_result.next()){
                        Item item = new Item(bill_result.getString(1), bill_result.getInt(2), bill_result.getInt(3));
                        new_bill.addItem(item);
                    }
                    car.setBill(new_bill);
                    ch[6].addCar(car);
               }else if(channel == 8){
                    ResultSet bill_result = this.getStatement().executeQuery("select * from bill_8");
                    new_bill = new Bill();
                    while(bill_result.next()){
                        Item item = new Item(bill_result.getString(1), bill_result.getInt(2), bill_result.getInt(3));
                        new_bill.addItem(item);
                    }
                    car.setBill(new_bill);
                    ch[7].addCar(car);
               }else if(channel == 9){
                    ResultSet bill_result = this.getStatement().executeQuery("select * from bill_9");
                    new_bill = new Bill();
                    while(bill_result.next()){
                        Item item = new Item(bill_result.getString(1), bill_result.getInt(2), bill_result.getInt(3));
                        new_bill.addItem(item);
                    }
                    car.setBill(new_bill);
                    ch[8].addCar(car);
               }else if(channel == 10){
                    ResultSet bill_result = this.getStatement().executeQuery("select * from bill_10");
                    new_bill = new Bill();
                    while(bill_result.next()){
                        Item item = new Item(bill_result.getString(1), bill_result.getInt(2), bill_result.getInt(3));
                        new_bill.addItem(item);
                    }
                    car.setBill(new_bill);
                    ch[9].addCar(car);
               }
                       
           }
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    public void update(){
        ch[0].removeCar();
        ch[1].removeCar();
        ch[2].removeCar();
        ch[3].removeCar();
        ch[4].removeCar();
        ch[5].removeCar();
        ch[6].removeCar();
        ch[7].removeCar();
        ch[8].removeCar();
        ch[9].removeCar();
        
         try{
           ResultSet result = gc.getStatement().executeQuery("select * from car_list");
           while(result.next()){
               Car car = new Car(result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getInt(6), result.getString(8), result.getString(9));
               int channel = result.getInt(7);
               Bill new_bill = new Bill();
               if(channel == 1){
                    ResultSet bill_result = this.getStatement().executeQuery("select * from bill_1");
                    new_bill = new Bill();
                    while(bill_result.next()){
                        Item item = new Item(bill_result.getString(1), bill_result.getInt(2), bill_result.getInt(3));
                        new_bill.addItem(item);
                    }
                    car.setBill(new_bill);
                    ch[0].addCar(car);
               }else if(channel == 2){
                    ResultSet bill_result = this.getStatement().executeQuery("select * from bill_2");
                    new_bill = new Bill();
                    while(bill_result.next()){
                        Item item = new Item(bill_result.getString(1), bill_result.getInt(2), bill_result.getInt(3));
                        new_bill.addItem(item);
                    }
                    car.setBill(new_bill);
                    ch[1].addCar(car);
               }else if(channel == 3){
                   ResultSet bill_result = this.getStatement().executeQuery("select * from bill_3");
                    new_bill = new Bill();
                    while(bill_result.next()){
                        Item item = new Item(bill_result.getString(1), bill_result.getInt(2), bill_result.getInt(3));
                        new_bill.addItem(item);
                    }
                    car.setBill(new_bill);
                    ch[2].addCar(car);
               }else if(channel == 4){
                    ResultSet bill_result = this.getStatement().executeQuery("select * from bill_4");
                    new_bill = new Bill();
                    while(bill_result.next()){
                        Item item = new Item(bill_result.getString(1), bill_result.getInt(2), bill_result.getInt(3));
                        new_bill.addItem(item);
                    }
                    car.setBill(new_bill);
                    ch[3].addCar(car);
               }else if(channel == 5){
                    ResultSet bill_result = this.getStatement().executeQuery("select * from bill_5");
                    new_bill = new Bill();
                    while(bill_result.next()){
                        Item item = new Item(bill_result.getString(1), bill_result.getInt(2), bill_result.getInt(3));
                        new_bill.addItem(item);
                    }
                    car.setBill(new_bill);
                    ch[4].addCar(car);
               }else if(channel == 6){
                    ResultSet bill_result = this.getStatement().executeQuery("select * from bill_6");
                    new_bill = new Bill();
                    while(bill_result.next()){
                        Item item = new Item(bill_result.getString(1), bill_result.getInt(2), bill_result.getInt(3));
                        new_bill.addItem(item);
                    }
                    car.setBill(new_bill);
                    ch[5].addCar(car);
               }else if(channel == 7){
                    ResultSet bill_result = this.getStatement().executeQuery("select * from bill_7");
                    new_bill = new Bill();
                    while(bill_result.next()){
                        Item item = new Item(bill_result.getString(1), bill_result.getInt(2), bill_result.getInt(3));
                        new_bill.addItem(item);
                    }
                    car.setBill(new_bill);
                    ch[6].addCar(car);
               }else if(channel == 8){
                    ResultSet bill_result = this.getStatement().executeQuery("select * from bill_8");
                    new_bill = new Bill();
                    while(bill_result.next()){
                        Item item = new Item(bill_result.getString(1), bill_result.getInt(2), bill_result.getInt(3));
                        new_bill.addItem(item);
                    }
                    car.setBill(new_bill);
                    ch[7].addCar(car);
               }else if(channel == 9){
                    ResultSet bill_result = this.getStatement().executeQuery("select * from bill_9");
                    new_bill = new Bill();
                    while(bill_result.next()){
                        Item item = new Item(bill_result.getString(1), bill_result.getInt(2), bill_result.getInt(3));
                        new_bill.addItem(item);
                    }
                    car.setBill(new_bill);
                    ch[8].addCar(car);
               }else if(channel == 10){
                    ResultSet bill_result = this.getStatement().executeQuery("select * from bill_10");
                    new_bill = new Bill();
                    while(bill_result.next()){
                        Item item = new Item(bill_result.getString(1), bill_result.getInt(2), bill_result.getInt(3));
                        new_bill.addItem(item);
                    }
                    car.setBill(new_bill);
                    ch[9].addCar(car);
               }
            }
        }catch (Exception e){
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
