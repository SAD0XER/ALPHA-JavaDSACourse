import java.util.*;

public class GreedyAlgorithms {
    public static void main(String[] args) {
//        int[] start = {1, 3, 0, 5, 8, 5};
//        int[] end = {2, 4, 6, 7, 9, 9};
        int[] start = {0, 1, 3, 5, 5, 8};
        int[] end = {6, 2, 4, 7, 9, 9};

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
        }
    }
}
