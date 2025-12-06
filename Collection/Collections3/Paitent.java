package Collections3;
import java.util.*;
 class PatientSimple {
    String name; int severity;
    PatientSimple(String n,int s){name=n;severity=s;}
}
public class Paitent {
    public static void main(String[] args) {
        List<PatientSimple> patients = Arrays.asList(
            new PatientSimple("Mayank",3),
            new PatientSimple("Ashish",5),
            new PatientSimple("Abhijeet",2),
            new PatientSimple("Maya",4),
            new PatientSimple("Ashi",6),
            new PatientSimple("Abhi",1)
        );
        patients.sort((a,b) -> b.severity - a.severity);
        for(PatientSimple p : patients) {
            System.out.println(p.name);
        }
    }
}