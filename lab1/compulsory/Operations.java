package lab1.compulsory;

class Operations {
    /**
     * the function will add a binary number to a given integer
     * the binary number will be converted to int
     *
     * @param number the integer which binary will be added to
     * @param binaryString the binary number taken as a String
     * @return the sum between the number and the binary in base 10
     */
    int addBinary(String binaryString, int number){
        number = number + Integer.parseInt(binaryString, 2);
        return number;
    }

    /**
     * the function will add a hexadecimal number to a given integer
     * the hexa number will be converted to int
     *
     * @param number the integer which binary will be added to
     * @param hexaString the hexadecimal number taken as a String
     * @return the sum between the number and the hexa number in base 10
     */
    int addHexa(String hexaString, int number){
        number = number + Integer.parseInt(hexaString, 16);
        return number;
    }

    /**
     * this function will make the sum of the digits from a given number
     * the function has to return a number < 10, otherwise repeat the same action

     * @param number the given number which we make the sum from
     * @return the final sum
     *
     */
    int sumOfDigits(int number){
        int sum = 0;
        while(number != 0)
        {
            sum = sum + (number % 10);
            number = number / 10;
        }
        while (sum != 0){
            number = number + (sum % 10);
            sum = sum / 10;
        }
        return number;
    }
}
