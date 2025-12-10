class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String num = Integer.toString(numberToCheck);
        int totalDigits = num.length();
        int sum = 0;
        for (int i = 0; i < totalDigits; i++){
            sum += Math.pow(Character.getNumericValue(num.charAt(i)), totalDigits);
        }

        return sum == numberToCheck;
    }

}
