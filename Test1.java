/*
狐进行了一次黑客马拉松大赛，全公司一共分为了N个组，每组一个房间排成一排开始比赛，
比赛结束后没有公布成绩，但是每个组能够看到自己相邻的两个组里比自己成绩低的组的成绩，
比赛结束之后要发奖金，以1w为单位，每个组都至少会发1w的奖金，另外，如果一个组发现
自己的奖金没有高于比自己成绩低的组发的奖金，就会不满意，作为比赛的组织方，根据成
绩计算出至少需要发多少奖金才能让所有的组满意。

输入描述:
每组数据先输入N，然后N行输入N个正整数，每个数表示每个组的比赛成绩。

输出描述:
输出至少需要多少w的奖金
示例1
输入
10
20
32
12
32
45
11
21
31
41
33

输出
20
*/
package linaxi0611;

import java.util.*;

public class Test1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){

            int n = in.nextInt();
            int[] nums = new int[n];
            int[] num = new int[n];

            for(int i = 0;i<n;i++){
                nums[i] = in.nextInt();
            }
            for(int i = 0;i<n;i++){
                num[i] = 1;
            }
            for(int i =1;i<n;i++){
                if(nums[i-1]<nums[i]){
                    num[i]  = num[i-1] +1;
                }
            }
            for(int i =n-2;i>-1;i--){
                if(nums[i]>nums[i+1]&&num[i]<num[i+1] +1){
                    num[i] = num[i+1]+1;
                }
            }

            int count = 0;
            for(int i = 0;i<n;i++){
                count += num[i];
            }
            System.out.println(count);
        }

    }
}
