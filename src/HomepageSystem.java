public class HomepageSystem {
    private Garage slot;
    private Car car;
    
    public HomepageSystem(){
        slot = new Garage();
        car = new Car();
    }
    
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
