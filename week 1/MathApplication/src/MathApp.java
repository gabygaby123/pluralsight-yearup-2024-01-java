public class MathApp {
    public static void main(String[] args){
        double garySalary = 200;
        double bobSalary = 20;
        double highestSalary = Math.max(bobSalary,garySalary);

        System.out.println("1) The highest salary is " + highestSalary);
        System.out.println(" ");

        double carPrice = 200;
        double truckPrice = 20;
        double lowPrice = Math.min(carPrice,truckPrice);

        System.out.println("2) The lowest price is " + lowPrice);
        System.out.println(" ");

        double area = Math.PI * Math.pow(7.25,2);
        System.out.println("3) Area: " + area);


    }
}
