package questions;
//https://leetcode.com/problems/richest-customer-wealth/
public class MaximumWealth {
    public int maximumWealth(int[][] accounts) {
        int maxWeal=0;
        int accountSize= accounts.length;
        int walletSize = accounts[0].length;
        for (int i = 0; i <accountSize; i++) {
            int temp=0;
            for (int j = 0; j < walletSize; j++) {
                temp+= accounts[i][j];
            }
            if (temp>= maxWeal){
                maxWeal=temp;
            }
        }
        return  maxWeal;
    }
}
