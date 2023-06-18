package leetcode.easy;

public class NumbersOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }

    public static int numberOfSteps(int num) {
        var stepsCounter = 0;
        var temp = num;
        while (temp >= 1) {
            if (temp % 2 == 0) {
                temp = temp / 2;
            } else {
                temp = temp - 1;
            }
            stepsCounter++;
        }

        return stepsCounter;
    }
}
