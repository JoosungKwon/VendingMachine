//잡화클래스
public class Accessories extends Item
{
    private int amount;

    public Accessories(int itemId, String name, int price, int amount) {
        super(itemId,name,price);
        this.amount = amount;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    /**
     * 매개변수 없다면 디폴트로 -1이 줄어든다.
     * 개수가 0개여서 더이상 줄어들 개수가 없다면
     * @return false ;
     */
    @Override
    public boolean setAmount() {
        if (this.amount > 0)
            return setAmount(-1);

//        System.out.println("<<품절>> 구매 불가능 합니다.");
        return false;
    }

    /**
     * 매개변수 Amount를 입력받아 개수를 조절한다.
     * Ex) -1 -> 1개 감소 1 -> 1개 증가
     * 요청이 MAX 혹은 0을 벗어나면
     * @return false ;
     */
    public boolean setAmount(int amount) {
        if (MAX>=this.amount+amount && this.amount+amount >= 0) {
            this.amount += amount;
            return true;
        }
//        System.out.println("범위를 초과하는 주문입니다. 수량을 다시 확인하여 선택해주세요.");
        return false;
    } // 오버로딩

    @Override
    public void fill() {this.amount = amount + 5;} // 일단은 5개씩 증가로 구현

    @Override
    public String toString() {
        return itemId + ". " + name + "는 현재 " + amount + "개 입니다.";
    }
}