package InClass;

import java.util.Scanner;

public class MainEntry {
    Generic_Calc<Integer> addTwoVar = new Generic_Calc<Integer>() {
        @Override
        public Integer compute(Integer[] numbers) {
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            return sum;
        }
    };

    Generic_Calc<Integer> subtractTwoVar = new Generic_Calc<Integer>() {
        @Override
        public Integer compute(Integer[] numbers) {
            int difference = 0;
            for (int i = 0; i < numbers.length; i++) {
                difference -= numbers[i];
            }
            return difference;
        }
    };

    Generic_Calc<Integer> multiplyTwoVar = new Generic_Calc<Integer>() {
        @Override
        public Integer compute(Integer[] numbers) {
            int product = 1;
            for (int i = 0; i < numbers.length; i++) {
                product *= numbers[i];
            }
            return product;
        }
    };

    Generic_Calc<Integer> divideTwoVar = new Generic_Calc<Integer>() {
        @Override
        public Integer compute(Integer[] numbers) {
            return numbers[0] / numbers[1];
        }
    };
}
