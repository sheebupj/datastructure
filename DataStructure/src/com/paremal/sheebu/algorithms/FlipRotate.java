package com.paremal.sheebu.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Rotating and flipping image
rows and columns must be equal
image inputs are in  List of List Integers

1 2 3
4 5 6
7 8 9
after rotating clockwise 90 degree
7 4 1
8 5 2
9 6 3

1 2 3
4 5 6
7 8 9
After rotating anti-clockwise 90 degree
3 6 9
2 5 8
1 4 7

1 2 3
4 5 6
7 8 9
after flipping horizontally
3 2 1
6 5 4
9 8 7


1 2 3
4 5 6
7 8 9
after flipping  vertically
7 8 9
4 5 6
1 2 3




 */
public class FlipRotate {
    public static void main(String[] args) {




        List<List<Integer>> llist = new ArrayList<>();
        llist.add(Arrays.asList(1,2,3));
        llist.add(Arrays.asList(4,5,6));
        llist.add(Arrays.asList(7,8,9));

        llist.stream().forEach(System.out::println);

        Integer[][] IntArr2d = llist.stream().map(l -> l.stream().toArray(Integer[]::new)).toArray(Integer[][]::new);

        displayArray(IntArr2d);

        List<List<Integer>> rlist = rotateClockWise(llist);
        System.out.println("after rotating clockwise 90 degree");
        display(rlist);

        List<List<Integer>> rlist5 = rotateAntiClockWise(llist);
        System.out.println("After rotating anti-clockwise 90 degree");
        display(rlist5);

        List<List<Integer>> rlist6 = horizondalFlip(llist);
        System.out.println("after flipping horizontally");
          display(rlist6);

        List<List<Integer>> rlist7 = verticalFlip(llist);
        System.out.println("after flipping  vertically");
        display(rlist7);



    }

    static List<List<Integer>> verticalFlip(List<List<Integer>> inputList) {
        int size = inputList.size();
        Integer[][] arr2d = inputList.stream().map(l -> l.stream().toArray(Integer[]::new)).toArray(Integer[][]::new);
        Integer[][] resultArr2d = new Integer[size][size];
        int indexsize = size - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                resultArr2d[indexsize - i][j] = arr2d[i][j];
            }
        }

        return Arrays.stream(resultArr2d).map(Arrays::asList).collect(Collectors.toList());

    }

    static List<List<Integer>> horizondalFlip(List<List<Integer>> inputList) {
        int size = inputList.size();
        Integer[][] arr2d = inputList.stream().map(l -> l.stream().toArray(Integer[]::new)).toArray(Integer[][]::new);
        Integer[][] resultArr2d = new Integer[size][size];
        int indexsize = size - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                resultArr2d[i][indexsize - j] = arr2d[i][j];
            }
        }

        return Arrays.stream(resultArr2d).map(Arrays::asList).collect(Collectors.toList());

    }


    static List<List<Integer>> rotateClockWise(List<List<Integer>> inputList) {
        int size = inputList.size();
        Integer[][] arr2d = inputList.stream().map(l -> l.stream().toArray(Integer[]::new)).toArray(Integer[][]::new);
        Integer[][] resultArr2d = new Integer[size][size];
        int indexsize = size - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                resultArr2d[j][indexsize - i] = arr2d[i][j];

            }
        }

        return Arrays.stream(resultArr2d).map(Arrays::asList).collect(Collectors.toList());

    }

    static List<List<Integer>> rotateAntiClockWise(List<List<Integer>> inputList) {
        int size = inputList.size();
        Integer[][] arr2d = inputList.stream().map(l -> l.stream().toArray(Integer[]::new)).toArray(Integer[][]::new);
        Integer[][] resultArr2d = new Integer[size][size];
        int indexsize = size - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                resultArr2d[indexsize - j][i] = arr2d[i][j];

            }
        }

        return Arrays.stream(resultArr2d).map(Arrays::asList).collect(Collectors.toList());

    }


    static void display(List<List<Integer>> inputList) {
        for (List<Integer> olist : inputList) {
            for (Integer igr : olist) {
                System.out.print(igr + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void displayArray(Integer[][] ar2d) {
        List<List<Integer>> inputList = Arrays.stream(ar2d).map(Arrays::asList).collect(Collectors.toList());
        display(inputList);
    }


}
