public class UserMode implements Mode {
    public UserMode(VendingMachine vendingmachine) {
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
