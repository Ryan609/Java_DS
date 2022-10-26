package TopCoder.Graph;

import java.util.ArrayList;

/**
 * @author: xinyan
 * @data: 2022/10/26/12:40
 **/
public class Organism {
    public int matureOrganism(int[] parent, int deletedCell) {
        ArrayList<ArrayList<Integer>> childrenList = new ArrayList<>();
        for (int i = 0; i < parent.length; i++) {
            childrenList.add(new ArrayList<>());
        }
        int root = 0;
        for (int i = 0; i < parent.length; i++) {
            if (parent[i] >= 0) {
                childrenList.get(parent[i]).add(i);
            } else {
                root = i;
            }
        }
        ArrayList<Integer> mature = new ArrayList<>();

        getMature(childrenList, mature, root, deletedCell);
        return mature.size();
    }

    private void getMature(ArrayList<ArrayList<Integer>> childrenList, ArrayList<Integer> mature,
                           int currentCell, int deletedCell) {
        if (currentCell == deletedCell) return;
        if (childrenList.get(currentCell).size() == 0) {
            mature.add(currentCell);
        }
        for (Integer child : childrenList.get(currentCell)) {
            getMature(childrenList, mature, child, deletedCell);
        }
    }

    public static void main(String[] args) {
        Organism organism = new Organism();
        System.out.println(organism.matureOrganism(new int[]{-1, 0, 0, 1, 1}, 2));
        System.out.println(organism.matureOrganism(new int[]{-1, 0, 0, 1, 1}, 1));
        System.out.println(organism.matureOrganism(new int[]{-1, 0, 0, 1, 1}, 0));
        System.out.println(organism.matureOrganism(new int[]{-1, 0, 0, 2, 2, 4, 4, 6, 6}, 4));
        System.out.println(organism.matureOrganism(new int[]{26, 2, 32, 36, 40, 19, 43, 24, 30, 13, 21, 14, 24, 21, 19, 4, 30, 10, 44, 12, 7, 32, 17, 43, 35, 18, 7, 36, 10, 16, 5, 38, 35, 4, 13, -1, 16, 26, 1, 12, 2, 5, 18, 40, 1, 17, 38, 44, 14}, 24));
        System.out.println(organism.matureOrganism(new int[]{6, 5, 6, -1, 3, 3, 5}, 0));
        System.out.println(organism.matureOrganism(new int[]{5, 3, 6, 6, 3, -1, 5}, 3));
        System.out.println(organism.matureOrganism(new int[]{3, 2, 4, 2, -1, 7, 7, 4, 3}, 1));
        System.out.println(organism.matureOrganism(new int[]{9, 14, 13, 2, 2, -1, 14, 9, 13, 11, 11, 5, 10, 5, 10}, 10));
        System.out.println(organism.matureOrganism(new int[]{28, 6, 0, 16, 9, 18, 27, 15, 13, 34, 6, 18, 19, -1, 9, 19, 8, 0, 1, 32,
                4, 1, 4, 28, 32, 34, 27, 13, 15, 26, 3, 26, 8, 3, 16}, 8));
        System.out.println(organism.matureOrganism(new int[]{-1, 4, 36, 24, 10, 29, 19, 31, 7, 0, 26, 31, 4, 18, 7, 6, 14, 24, 23, 0,
                29, 14, 10, 35, 26, 1, 19, 1, 9, 36, 18, 6, 22, 35, 22, 9, 23}, 35));
        System.out.println(organism.matureOrganism(new int[]{38, 20, 34, 7, 6, 37, 5, 8, 10, 30, 6, 37, 20, 2, 16, 7, 21, 23, 22, 23,
                8, 33, 11, 21, 4, 30, 15, 34, 16, 15, 10, 36, 38, 5, 4, 33, 11, -1, 22, 2,
                36}, 39));
        System.out.println(organism.matureOrganism(new int[]{25, 34, 34, 27, 21, 21, 24, 36, 31, 2, 27, 8, 26, 8, 9, 35, 38, 30, 23,
                26, 36, 9, 24, 31, 15, 1, 0, 30, 0, 35, 25, 38, -1, 18, 32, 1, 23, 2, 32,
                18, 15}, 0));
        System.out.println(organism.matureOrganism(new int[]{24, 42, 4, 30, 29, 43, 22, 15, 26, 36, 26, 16, 3, 22, 21, 41, 18, 16, 34,
                41, 12, 29, 32, 30, 43, 15, 4, 38, 36, -1, 24, 42, 18, 6, 21, 38, 6, 17,
                32, 17, 3, 34, 12, 14, 14}, 24));
        System.out.println(organism.matureOrganism(new int[]{-1, 21, 24, 30, 46, 1, 16, 29, 30, 41, 18, 33, 26, 31, 12, 45, 29, 7, 16,
                45, 27, 32, 41, 18, 35, 6, 9, 1, 19, 32, 22, 33, 0, 9, 6, 0, 12, 19, 21,
                35, 46, 24, 31, 27, 26, 22, 7}, 28));
        //System.out.println(organism.matureOrganism(new int[]));
    }

}
