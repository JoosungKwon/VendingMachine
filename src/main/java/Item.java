// 취급하는 품목의 타입을 두개로 나눠서 관리할 것임
// 공통된 속성을 뽑아서 인터페이스로 만들도록 설계 (상하의 / 잡화)
// getter/setter 인터페이스를 통해 필드를 지정
public abstract class Item {
    int itemId;
    String name;
    int price;
    final int MAX = 20;

    public Item(int itemId, String name, int price){
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    public abstract int getAmount();
    public abstract boolean setAmount(); // 수량 조절이 되어야 한다.

    /**
     * 품목을 초기값(max)로 채우는 메서드
     */
    public abstract void fill();
}