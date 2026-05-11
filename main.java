public class Main {
    public static void main(String[] args) {

        int mark = 40;

        if(mark>= 95){
            System.out.println("exllent");
        }
        else if(mark >= 89){
            System.out.println("v.good");
        }
        else if(mark >= 75){
            System.out.println("good");
        }
        else if(mark >= 60){
            System.out.println("avg");
        }
        else{
            System.out.println("failed");
        }
    }
}