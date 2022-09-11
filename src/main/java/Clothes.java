import java.util.Scanner;
// 상하의 (특징: 사이즈가 있음)
public class Clothes extends Item
{
    private int[] size; // clothes는 사이즈 별로 개수가 나눠져있다.
    Scanner input = new Scanner(System.in); // 사이즈를 입력받기 위해 필요함

    public Clothes(int itemId, String name, int price, int[] size) {
        super(itemId, name, price);
        this.size = size;
    }

    @Override
    public int getAmount() {
        return getSize();
    }

    public int getAmount(int num) {
        return getSize(num);
    }

    @Override
    public boolean setAmount() {
        return setSize();
    }


    /**
     * 사이즈를 입력받아서 해당 사이즈에 개수, 잘 못 입력하면 0
     * @return 개수 or 0
     */
    public int getSize() {

        System.out.print("사이즈를 입력해주세요(S/M/L) : ");
        String s = input.nextLine();
        if (s.equalsIgnoreCase("S")) {
            return size[0];
        } else if (s.equalsIgnoreCase("M")) {
            return size[1];
        } else if (s.equalsIgnoreCase("L")) {
            return size[2];
        } else {
            System.out.print("잘 못 입력하셨습니다. ");
            return 0; // 받는 쪽 에서 재입력 받게 끔 구현해야함
        }
    }

    /**
     *  번호를 통해 size를 선택할 수 있게 만든 메서드
     * @param num  0은 S, 1은 M, 2는 L
     * @return 해당 size의 개수 or -1
     */
    public int getSize(int num) {
        if( 0 <= num && num <= 2)
            return this.size[num];
        return -1;
    }

    /**
     * 수량을 조절하는 메서드, 개수는 하나씩만 줄어들게 되어 있으며, 개수가 0개 이하로 내려갈 시에는 false
     * @return true or false
     */
    public boolean setSize() {

        System.out.print("사이즈를 입력해주세요(S/M/L) : ");
        String s = input.nextLine();
        int size_menu ;
        if (s.equalsIgnoreCase("S")) {
            size_menu = 0;
        } else if (s.equalsIgnoreCase("M")) {
            size_menu = 1;
        } else if (s.equalsIgnoreCase("L")) {
            size_menu = 2;
        } else {
            System.out.print("잘못 입력하셨습니다. ");
            return false ;
        }
        if (this.size[size_menu] == 0) {
            System.out.println("<<품절>> 구매 불가능 합니다.");
            return false ;
        } else {
            this.size[size_menu] -= 1;
        }
        return true;
    }

    public void fill() {
        System.out.print("사이즈를 입력해주세요(S/M/L) : ");
        String s = input.nextLine();

        if (s.equals("S") || s.equals("s")) {

            this.size[0] += 5;

        } else if (s.equals("M") || s.equals("m")) {

            this.size[1] += 5;
        } else if (s.equals("L") || s.equals("l")) {

            this.size[2] += 5;
        }
        //System.out.println(this.size[0]+ " " +this.size[1] + " " +this.size[2]);
    } // 일단 5개씩 추가

    @Override
    public String toString() {
        return itemId + ". " + name + "는 현재 S: " + size[0] + "개 M: " + size[1] + "개 L: " + size[2] + "개 입니다.";
    }
}