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
}
