package typesOfMethods;

public class GradingSystemMethod {
    public static void main(String[] args) {
        int marks =55;
        if(marks!=55){
            System.out.println("fail");

            } else if (marks >=55 && marks <65) {
            System.out.println("D Grade");

        } else if (marks >=65 || marks <70) {
            System.out.println("C Grade");
            
        } else if (marks <=70 && marks >=80) {
            System.out.println("B Grade");

        } else if (marks==80 || marks <=90) {
            System.out.println("A Grade");

        } else if (marks >=90 || marks >100) {
            System.out.println("A+");

        }else {
            System.out.println("Wrong Result");

        }
    }
    }

