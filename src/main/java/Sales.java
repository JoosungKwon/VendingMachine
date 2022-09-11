import java.util.List;
// 사실상 DB의 역할 -> 몇개가 팔렸는지 개수를 가지고 있음
public class Sales
{
    List<Item> items;
    int[] countItemList = new int[15];

    public Sales(List<Item> items) {
        this.items = items;
    } // Item의 정보를 활용할 필요가 있기 때문에 의존성 주입

    public int getsumAll()
    {
        int sumAll=0;

        for (int i=0; i<countItemList.length; i++)
        {
            int cnt = countItemList[i];
            sumAll += cnt * items.get(i).getPrice();

        }
        return sumAll;
    }

    public void countId(int itemId)
    {
        countItemList[itemId] += 1;

    }

    public void ranking()
    {
        int max=0;

        for (int k : countItemList) {
            if (max < k) {
                max = k;
            }
        }
        for (int j=0; j<countItemList.length; j++)
        {
            if (max == 0)
            {
                System.out.printf("현재 팔린 상품이 없습니다.%n");
                break;
            }
            else if (max == countItemList[j])
            {
                System.out.printf("현재 1위는 %s입니다 %n", items.get(j).getName());
            }
        }
    }
}
