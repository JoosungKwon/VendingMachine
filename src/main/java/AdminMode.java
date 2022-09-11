public class AdminMode implements Mode {
    public AdminMode(VendingMachine vendingmachine) {
    }

    @Override
    public int display() {
        return 0;
    }

    @Override
    public boolean process(int sel) {
        return false;
    }
}
