public interface Mode {
    /**
     * 메뉴판(선택화면)을 보여주는 메서드,
     * 콘솔화면의 UI를 담당
     */
    int display(); //메뉴판을 보여줘야 한다

    /**
     * 선택에 따른 로직을 실핼하는 메서드,
     * 사용자의 구매부터 결제까지 이뤄지는 하나의 세션을 담당
     */
    boolean process(int sel);
}
