package typesOfMethods;

public class DifferentMethod {
    public static int summerMonths(int april,int june){
        int temperature=(april+june);
        System.out.println(temperature);
        return temperature;
    }public String patientsINWaiting(String name1, String name2 ,String name3){
        String forBloodTest=(name1+name2+name3);
        return forBloodTest;
    }

    public static void main(String[] args) {
        DifferentMethod myObject = new DifferentMethod();
        System.out.println(myObject.patientsINWaiting("ravi raj","pavan sharma", "kiran rav"));
        summerMonths(15,12 );

    }
}
