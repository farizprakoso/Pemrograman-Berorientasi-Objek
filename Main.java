
public class Main {
    public static void main(String[] args) {
        Manusia person1 = new Manusia();
        Manusia person2 = new Manusia();

        person1.nama = "Dini";
        person1.tahunLahir = 2002;
        person1.beratBadan = 55;
        person1.tinggiBadan = 1.6;

        person2.nama = "Dino";
        person2.tahunLahir = 2000;
        person2.beratBadan = 70;
        person2.tinggiBadan = 1.7;

        System.out.println("=== DATA PERSON 1 ===");
        System.out.println("Nama         : " + person1.nama);
        System.out.println("Tahun Lahir  : " + person1.tahunLahir);
        System.out.println("Berat Badan  : " + person1.beratBadan + " kg");
        System.out.println("Tinggi Badan : " + person1.tinggiBadan + " m");
        System.out.println("BMI          : " + person1.hitungBMI());
        System.out.println("Status       : " + person1.getStatusBMI());
        
        System.out.println("\n----------------------------------\n");

        System.out.println("=== DATA PERSON 2 ===");
        System.out.println("Nama         : " + person2.nama);
        System.out.println("Tahun Lahir  : " + person2.tahunLahir);
        System.out.println("Berat Badan  : " + person2.beratBadan + " kg");
        System.out.println("Tinggi Badan : " + person2.tinggiBadan + " m");
        System.out.println("BMI          : " + person2.hitungBMI());
        System.out.println("Status       : " + person2.getStatusBMI());
    }
}