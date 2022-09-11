import java.util.List;

// 초기에 설계한 자판기 기능을 모두 담고 있음
// 백엔드 컨트롤러의 역할을 담당
public interface Machine<I> {
    /**
     * 아이템 리스트를 리턴하는 메서드
     * item의 일관성을 위해서 이 함수를 통해 객체를 받아와야한다
     */
    List<I> getItems();
    /**
     * 랭킹정보를 반환하는 메서드
     */
    void getRanking();
    /**
     * 현재 가지고 있는 잔돈을 반환하는 메서드
     */
    void moneyDisplay();
    /**
     * 현재 총 매출을 반환하는 메서드
     */
    int getSalesAll();
    /**
     * 구매 로직 메서드
     */
    boolean buy(int itemId);
    /**
     * 재고를 채우는 메서드
     */
    void stockUp(int itemId);
    /**
     * 잔돈을 채우는 메서드
     */
    int getInsert();
}
