package constructorWork;
// user define parametrise constructor
public class PatientsDetails {
    String patientName;
    int patientBill;
    char   patientGender;

    public void displayDetails(String Name,int Bill,char Gender){
        patientName = Name;
        patientBill = Bill;
        patientGender = Gender;




    }public void PatientsDetails() {
        System.out.println("patient name is " + patientName);

        System.out.println("patient bill is paid which is " + patientBill);
        System.out.println(" patient is female so select gender " + patientGender);
    }

    public static void main(String[] args) {
        PatientsDetails patientsDetails = new PatientsDetails();
        patientsDetails.displayDetails("amy jones",3000,'f');
        patientsDetails.PatientsDetails();

        patientsDetails.displayDetails("anna wood",2500,'f');
        patientsDetails.PatientsDetails();






    }
}
