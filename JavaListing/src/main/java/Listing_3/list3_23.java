package Listing_3;

class DivisionByZeroException3_23 extends Exception {

    public String getMessage() {
        return "Деление на ноль запрещено!";
    }
}

class ExceptionDemo {

    private static double divide (double dividend, double divisor)
        throws DivisionByZeroException3_23 {

        if (divisor == 0)
            throw new DivisionByZeroException3_23();
        return dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            divide (8, 0);
        } catch (DivisionByZeroException3_23 dz) {
            System.out.println(dz.getMessage());
        }
    }
}