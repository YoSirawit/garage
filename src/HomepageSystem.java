import javax.swing.*;
public class HomepageSystem {
    private Garage slot;
    private Car car;
    private JInternalFrame carDetailFrame;
    private JDesktopPane dtp;
    
    public HomepageSystem(Garage gr, JDesktopPane dtp){
        this.slot = gr;
        this.dtp = dtp;
        this.car = new Car();
    }
    
    //Show car owner and car id for tooltip
    public String ShowCarDetail(int index){
        car = slot.getCh(index).getCar();
        if (car != null){
            return String.format("<html>Owner : %s <br>Car ID : %s <html/>", car.getCarOwner(), car.getCarID());
        }
        return "No data";
    }
    
    //Show more car detail MDI
    public void ShowMoreCarDetail(int index){
        carDetailFrame = new JInternalFrame("View "+index, false, true, false, true);
        car = slot.getCh(index).getCar();
        carDetailFrame.add(new CarInfoPanel(index, car.getCarOwner(), car.getCarID(), car.getBrand(), this.status(car.getStatus())+""));
        carDetailFrame.pack();
        carDetailFrame.setVisible(true);
        dtp.add(carDetailFrame);
        dtp.repaint();
    }
    
    //Check data in channel arr for show car on table
    public void checkslot(HomepageFrame hpf){
        for (int i=0; i<=9; i++){
            if (slot.getCh(i).getCar() != null){
                car = slot.getCh(i).getCar();
                hpf.pnArr[i].setVisible(true);
                hpf.bnArr[i].setText(this.status(car.getStatus()));
            }else{
                hpf.pnArr[i].setVisible(false);
            }
        }
    }
    
    //change num status to text status
    public String status(int status){
        String statustxt = "None";
        switch(status){
            case 0 :
                statustxt = "รอคิวซ่อม";
                break;
            case 1 :
                statustxt = "กำลังซ่อม";
                break;
            case 2 :
                statustxt = "รอรับรถ!";
                break;
            case 3 :
                statustxt = "ออกบิลแล้ว";
                break;
        }
        return statustxt;
    }
}
