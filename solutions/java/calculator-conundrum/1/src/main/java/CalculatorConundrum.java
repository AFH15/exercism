class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        try{
            if (operation == "+"){
                return operand1 + " + " + operand2 + " = " + (operand1 + operand2);
            }
            if (operation == "*"){
                return operand1 + " * " + operand2 + " = " + (operand1 * operand2);
            }
            if (operation == "/"){
                return operand1 + " / " + operand2 + " = " + (operand1 / operand2);
            }
            if (operation == null){
                throw new IllegalArgumentException("Operation cannot be null");
            } else if (operation == ""){
                throw new IllegalArgumentException("Operation cannot be empty");
            } else {
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }
        } catch (ArithmeticException e){
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }   
    }
}
