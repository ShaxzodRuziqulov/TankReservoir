package SpringCore;

public class VendingMachineHelper {
    private Tank tank;
    private int volumeNeeded;

    public VendingMachineHelper(Tank tank, int volumeNeeded) {
        this.tank = tank;
        this.volumeNeeded = volumeNeeded;
    }

    public void Drink() throws Exception {
        tank.use(volumeNeeded);
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }
}
