package noneAccessModifiers;

public class TimesTablesClass {
    public static void timesTables(int tables){

            System.out.println(" I want to print times table "  +  tables  );
            System.out.println("===========================");
            for (int a=1;a<=10;a++){
                System.out.println(tables + "X"  +  a  +"=" + a*tables);


            }


        }


    public static void main(String[] args) {
        timesTables(5);
        timesTables(4);


    }
}




