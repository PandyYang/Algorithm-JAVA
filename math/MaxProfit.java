package math;

/**
 * @author Pandy
 * @version 1.0
 * @date 18:00
 * 股票的最大利润
 */
public class MaxProfit {
    public int max(int[] prices){
        if (prices == null || prices.length == 0)
            return 0;
        //卖出的价格
        int soFarMin = 0;
        //最大的利润
        int maxProfit = 0;
        for (int i = 1;i<prices.length;i++){
            soFarMin = Math.min(soFarMin,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i] -soFarMin);
        }
        return maxProfit;
    }
}
