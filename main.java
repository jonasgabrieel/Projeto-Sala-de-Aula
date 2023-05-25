public class main {
    public static  void main(String[] args) {
        LabClass sala01 = new LabClass(30);
        Student aluno01 = new Student("Jonas", "3");
        aluno01.addCredits(15);
        Student aluno02 = new Student("Michael","7");
        aluno02.addCredits(20);
        Student aluno03 = new Student("Michele","2");
        aluno03.addCredits(20);
        Student aluno04 = new Student("Miguel","4");
        aluno04.addCredits(20);
        Student aluno05 = new Student("Milena","5");
        aluno05.addCredits(20);

        sala01.enrollStudent(aluno01);
        sala01.enrollStudent(aluno02);
        sala01.enrollStudent(aluno03);
        sala01.enrollStudent(aluno04);
        sala01.enrollStudent(aluno05);

        sala01.setTime("35T34");
        sala01.setRoom("05");
        sala01.setInstructor("Estombelo" );
        sala01.printList();




    }
}
