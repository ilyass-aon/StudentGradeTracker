import java.util.ArrayList;

public class Student {
   private final String nom;
   private Double note;

   public Student(String nom, Double note) {
       this.nom = nom;
       if (note < 0 || note > 20) {
           System.out.println("Note invalid");
       }else {
           this.note = note;
       }
   }
   public String getNom() {
       return nom;
   }
   public Double getNote() {
       return note;
   }
   public void setNote(Double note) {
       this.note = note;
   }
   @Override
    public String toString() {
       return "Student [nom=" + nom + ", note=" + note + "]";
   }
  // calculate Average :
   public static Double Calculermoy(ArrayList<Student> s){
       Double total = 0.0;
       for (Student student: s){
           total += student.getNote();
       }
       return total/s.size();
   }
   // find Min Grade :
    public static String findMinGrade(ArrayList<Student> s){
        double min = s.get(0).getNote();
        String name="";
        for (Student student : s) {
            if (student.getNote() < min) {
                min = student.getNote();
                name=student.getNom();
            }
        }
        return "Student [nom=" + name + ", note=" + min + "]";
    }
    // find Max Grade :
    public static String findMaxGrade(ArrayList<Student> s){
       double max = s.get(0).getNote();
       String nom=s.get(0).getNom();
       for (Student student : s) {
           if (student.getNote() > max) {
               max = student.getNote();
               nom = student.getNom();
           }
       }
        return "Student [nom=" + nom + ", note=" + max + "]";
    }


}
