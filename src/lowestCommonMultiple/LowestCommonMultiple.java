
     package lowestCommonMultiple;

    public class LowestCommonMultiple {


        private static int findLargestNumber(int[] numbers) {
            int largest = numbers[0];
            for (int index = 1; index < numbers.length; index++) {
                if (numbers[index] > largest) {
                    largest = numbers[index];
                }
            }
            return largest;
        }



        public static int lcmCalculation(int[] numbers) {
            int largest = findLargestNumber(numbers);
            int lcm = largest;

            while (true) {
                boolean isLcm = true;
                for (int count = 0; count < numbers.length; count++) {
                    if (lcm % numbers[count] != 0) {
                        isLcm = false;
                        break;
                    }
                }

                if (isLcm) {
                    return lcm;
                }
                lcm += largest;
            }
        }

    }

