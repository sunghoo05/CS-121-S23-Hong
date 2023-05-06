package AbstractClasses;

public class Main {
    public static void main(String[] args)
    {
        MonWedFriStudent student1 = new MonWedFriStudent(1,"Josh", 7);
        TueThuStudent student2 = new TueThuStudent(2, "John", 7);
        System.out.println(student1.getName() + "'s Class Hour per week: " + student1.calculateClassHour());
        System.out.println(student2.getName() + "'s Class Hour per week: " + student2.calculateClassHour());
    }
}