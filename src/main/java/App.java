import java.util.Scanner;

// 시작점(엔트리 포인트)
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 객체 데이터의 일관성을 유지하기 위해 시작시 생성하고 의존성을 주입하는 패턴 -> DB 사용X
        Machine vendingmachine = new VendingMachine();

        // 두가지 모드 구현 (사용자 모드. 관리자 모드)
        Mode am = new AdminMode(vendingmachine);
        Mode um = new UserMode(vendingmachine);

        try{
            boolean button = true; // 프로그램 유지 버튼
            int menu; // 모드 선택 버튼

            System.out.println("의류 자판기 프로그램이 실행합니다. 초기 진입 모드를 선택해주세요");
            System.out.println("1.관리자 모드 | 2.판매 모드");
            int mode = Integer.parseInt(sc.nextLine());

            // 모드 간의 전환은 App-main에서 수행
            do { // 프로그램 종료 버튼을 누르기 전까지 반복
                switch (mode) {
                    // case1 : 관리자 cae2: 판매모드
                    // 메뉴판을 보여주고 선택한 값을 다시 해당 모드에 매개변수로 넣는 방식
                    // 이렇게 한 이유는 해당 모드에서 종료하거나, 모드를 변경할 수 있게 하기 위해서..
                    case 1:
                        System.out.println("관리자 모드가 실행됩니다.");
                        menu = am.display();
                        button = am.process(menu);
                        if (menu == 5){ mode = 2 ;}
                        break;
                    case 2:
                        System.out.println("판매 모드가 실행됩니다.");
                        menu = um.display();
                        button = um.process(menu);
                        if (menu == 99){ mode = 1 ;}
                        break;
                    default:
                        System.out.println("잘못 입력하셨습니다.");

                }
            } while (button) ;

        } catch (Exception e){ // 오류 처리 정책은 어떻게 할것인가?
            e.printStackTrace();
            System.out.println("오류가 발생하였습니다.다시 실행해주세요.");

        }finally {
            System.out.println("프로그램을 종료합니다.");
            System.exit(-1);
        }
    }
}
