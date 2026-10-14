public class Manusia {
    // Atribut
    public String nama;
    public int tahunLahir;
    public double beratBadan; // dalam kg
    public double tinggiBadan; // dalam meter

    // Method untuk menghitung BMI
    public double hitungBMI() {
        double bmi = beratBadan / (Math.pow(tinggiBadan, 2));
        return bmi;
    }

    // Method tambahan untuk menentukan status berat badan
    public String getStatusBMI() {
        double bmi = hitungBMI();
        if (bmi < 18.5) {
            return "Kekurangan berat badan";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal (ideal)";
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            return "Kelebihan berat badan";
        } else {
            return "Kegemukan (Obesitas)";
        }
    }
}