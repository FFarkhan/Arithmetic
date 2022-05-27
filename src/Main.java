public class Main {
        public static void main(String[] args) {
            Arithmetic arithmetic=new Arithmetic(10,6);


            System.out.print("Addition : ");

            arithmetic.addition();
            System.out.println(arithmetic.addition);

            System.out.print("Subtraction : ");

            arithmetic.subtraction();
            System.out.println(arithmetic.subtraction);

            System.out.print("Larger Number : ");

            arithmetic.largerNum();
            System.out.println(arithmetic.largerNum);

            System.out.print("Smaller Number : ");

            arithmetic.smallerNum();
            System.out.println(arithmetic.smallerNum);








    }
}
