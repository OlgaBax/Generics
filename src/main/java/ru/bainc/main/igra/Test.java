package ru.bainc.main.igra;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar ("Ivan", 12);
        Schoolar schoolar2 = new Schoolar("Katy",14);
        Schoolar schoolar3 = new Schoolar("Denis",15);
        Schoolar schoolar4 = new Schoolar("Nastya",13 );

        Student student1 = new Student("Petr", 25);
        Student student2 = new Student("Irina", 32);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Marya",45);

        Team <Schoolar> schoolarTeam1 = new Team <> ("Drakoni");
        schoolarTeam1.addNewParticipant(schoolar1);
        schoolarTeam1.addNewParticipant(schoolar2);

        Team <Schoolar> schoolarTeam2 = new Team <> ("Mudresi");
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        Team <Student> studentTeam = new Team <> ("Vpered!");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team <Employee> employeeTeam = new Team<>("Rabotyagi");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        schoolarTeam1.playWith(schoolarTeam2);











    }
}
