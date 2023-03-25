package abstractionConcepts;

public abstract class PatientInTreatment {
    public static void patientName(){
        System.out.println("patient name is alex bevan");
        System.out.println("========================");

    }
    public static void patientAge(){
        System.out.println("she is 35 years old");
        System.out.println("she is fit for the treatment");
    }
    abstract void bloodTest();


    public static void main(String[] args) {

    }

    
}
