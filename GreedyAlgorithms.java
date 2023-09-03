import java.util.*;

public class GreedyAlgorithms {

    //Creating class for object.
    static class Job {
        int id; //0(A), 1(B), 2(C)...
        int deadline;
        int profit;

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {

        //Activity Selection.
        /*int[] start = {1, 3, 0, 5, 8, 5}; //int[] start = {0, 1, 3, 5, 5, 8};
        int[] end = {2, 4, 6, 7, 9, 9}; //int[] end = {6, 2, 4, 7, 9, 9};

        //Question: End time is NOT sorted. O(nLog n)
        int[][] activities = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //Lambda Function: shortform of a big function.
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        //Now End time is Sorted.
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //Always choose First activity as an answer.
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Max Activities: " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }*/

        //Fractional Knapsack
        /*int[] val = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int W = 50;

        double[][] ratio = new double[val.length][2];
        //0th column => index; 1st column => ratio;

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }

        //Ascending Order Sorting.
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W, finalval = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) { //Include Full Item
                finalval += val[idx]; //Adding values.
                capacity -= weight[idx]; //Subtracting weight from whole total capacity.
            } else { //Include Fractional Item.
                finalval += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("Final Value = " + finalval);*/

        //Minimum Absolute Difference of Pairs. O(nLog n)
        /*int[] A = {4, 1, 8, 7}; //int A[] = {1, 2, 3};
        int[] B = {2, 3, 6, 5}; //int B[] = {2, 1, 3};

        //Sorting Array Using Sort Function.
        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for (int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }

        System.out.print("Absolute Difference of Pairs is " + minDiff);*/

        //Max Length Chain of Pairs. O(nLog n)
        /*int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1, chainEnd = pairs[0][1]; //Last selected pair or End of Chain.

        for (int i = 0; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) {
                chainLen++; //
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("Maximum Length of Chain is " + chainLen);*/

        //Indian Coins: Find a minimum number of coins and notes to make change for a value.
        /*Integer[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0, amount = 1059;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i]; //amount = amount - coins[i];
                }
            }
        }
        System.out.println("Total Minimum Coins Used = " + countOfCoins);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }*/

        //Job Sequencing Problem. (In this question, we've sorted objects for first time.)
        /*int[][] jobsInfo = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<Job> jobs = new ArrayList<>(); //This is Job(class) type array.

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit); //Descending Order sorting.

        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0; //counter for time.

        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        //Print Sequence.
        System.out.println("Max Jobs = " + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }*/

        //Chocola (chocolate) Problem. Level: Hard
        int n = 4, m = 6; //n: Rows, m: Columns
        Integer[] costVer = {2, 1, 3, 1, 4}; //m - 1
        Integer[] costHor = {4, 1, 2}; //n - 1

        //Descending Order Sorting of Costs.
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0, hp = 1, vp = 1, cost = 0; //'v' and 'h' are the pointers to  the cost array.

        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] <= costHor[h]) { //Horizontal Cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else { //Vertical Cut
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }

        //Cuts for remaining Horizontal Pieces.
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }

        //Cuts for remaining Vertical Pieces.
        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.print("Minimum cost of cuts is " + cost);
    }
}
