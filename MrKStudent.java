public class MrKStudent {

   private String name;
   private int period;
   private double GPA;
   private int grade;
   private int seatNum;
   private boolean isPassing;
   
   public static void main(String[] args) {
   
   }
      
   public void defaultStudent() {
      name = "Yousif";
      period = 1;
      GPA = 3.0;
      grade = 10;
      seatNum = 1;
      isPassing = false;
   }
   
   public MrKStudent(String name, int period, double GPA, int grade, int seatNum, boolean isPassing) {
      this.name = name;
      this.period = period;
      this.GPA = GPA;
      this.grade = grade;
      this.seatNum = seatNum;
      this.isPassing = isPassing;
   }
   
   public void goodScore(double differenceAfter) {
      GPA += differenceAfter;
      System.out.println("Added " + differenceAfter + " to GPA. New GPA is " + GPA);
   }
   public void badScore(double otherDifferenceAfter) {
      GPA -= otherDifferenceAfter;
      System.out.println("Subtracted " + otherDifferenceAfter + " from GPA. New GPA is " + GPA);
   }
   public void completesYear() {
      grade += 1;
      System.out.println("Added 1 to Grade. New Grade is " + grade);
   }
   public void seatingChange() {
      // seat gets randomized
   }
   public void checkIfPassing() {
      //checks to see if you GPA is less than 2.0
   }
}   