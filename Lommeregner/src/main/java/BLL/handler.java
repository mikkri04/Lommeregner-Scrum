package BLL;

public class handler {

    public double plus(double x, double y) {
        return x + y;
    }

    public double minus(double x, double y) {
        return x - y;
    }

    public double times(double x, double y) {
        return x * y;
    }

    public double devide(double x, double y) {
        return x / y;
    }

    public double modulo(double x, double y) {
        return x%y;
    }

    public double pmChange(double x) {
        return x * -1;
    }

    public String addUnit(String current, String unit){
        return current + unit;
    }

    private String execute(String input, String caller){
        // Split into [Seg1] [unit] [seg2]
        if (caller == "pm") {
            double val = Double.parseDouble(input);
            return pmChange(val) + "";
        }
        String[] segms = input.toLowerCase().split("(?<=[+*/x%]|(?<!^)-)|(?=[+*/x%]|(?<!^)-)");
        if(segms.length <= 2) {return input;}
        double num1 = Double.parseDouble(segms[0]);
        double num2 = Double.parseDouble(segms[2]);
        return String.valueOf(
                switch (segms[1]) {
                    case "+" -> plus(num1, num2);
                    case "-" -> minus(num1, num2);
                    case "*" -> times(num1, num2);
                    case "/" -> devide(num1, num2);
                    case "%" -> modulo(num1, num2);
                    default -> 0;
                });

    }

    private String execute(String input){
        return execute(input, "unknown");

    }




}
