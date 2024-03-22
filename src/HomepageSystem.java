public class HomepageSystem {
    private HomepageFrame hpf;
    private Garage slot;
    private Car car;
    
    public void checkslot(){
        if (slot.getCh(0) != null){
            car = slot.getCh(0).getCar();
            hpf.statusPn0.setVisible(true);
            hpf.statusBn0.setText(this.status(car.getStatus()));
        }
        if (slot.getCh(1) != null){
            car = slot.getCh(1).getCar();
            hpf.statusPn1.setVisible(true);
            hpf.statusBn1.setText(this.status(car.getStatus()));
        }
        if (slot.getCh(2) != null){
            car = slot.getCh(2).getCar();
            hpf.statusPn2.setVisible(true);
            hpf.statusBn2.setText(this.status(car.getStatus()));
        }
        if (slot.getCh(3) != null){
            car = slot.getCh(3).getCar();
            hpf.statusPn3.setVisible(true);
            hpf.statusBn3.setText(this.status(car.getStatus()));
        }
        if (slot.getCh(4) != null){
            car = slot.getCh(4).getCar();
            hpf.statusPn4.setVisible(true);
            hpf.statusBn4.setText(this.status(car.getStatus()));
        }
        if (slot.getCh(5) != null){
            car = slot.getCh(5).getCar();
            hpf.statusPn5.setVisible(true);
            hpf.statusBn5.setText(this.status(car.getStatus()));
        }
        if (slot.getCh(6) != null){
            car = slot.getCh(6).getCar();
            hpf.statusPn6.setVisible(true);
            hpf.statusBn6.setText(this.status(car.getStatus()));
        }
        if (slot.getCh(7) != null){
            car = slot.getCh(7).getCar();
            hpf.statusPn7.setVisible(true);
            hpf.statusBn7.setText(this.status(car.getStatus()));
        }
        if (slot.getCh(8) != null){
            car = slot.getCh(8).getCar();
            hpf.statusPn8.setVisible(true);
            hpf.statusBn8.setText(this.status(car.getStatus()));
        }
        if (slot.getCh(9) != null){
            car = slot.getCh(9).getCar();
            hpf.statusPn9.setVisible(true);
            hpf.statusBn9.setText(this.status(car.getStatus()));
        }
    }
    
    public String status(int status){
        String statustxt = "None";
        switch(status){
            case 0 :
                statustxt = "Waiting...";
                break;
            case 1 :
                statustxt = "Reparing...";
                break;
            case 2 :
                statustxt = "Finished!";
                break;
            case 3 :
                statustxt = "Completed!";
                break;
        }
        return statustxt;
    }
}
