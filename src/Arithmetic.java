public class Arithmetic {

        int a;
        int b;
        int addition;
        int subtraction;

        int largerNum;
        int smallerNum;

        public Arithmetic(int x, int y){
            this.a=x;
            this.b=y;
        }

        public void addition(){
            addition = a + b;
        }
        public void subtraction(){
            subtraction = a - b;
        }

        public void largerNum(){
            if(a < b){
                largerNum = b;
            } else {
                largerNum = a;
            }
        }


        public void smallerNum(){
            if(a < b){
                smallerNum = a;
            } else {
                smallerNum = b;
            }
        }



}
