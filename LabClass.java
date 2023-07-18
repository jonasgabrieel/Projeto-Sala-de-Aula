import java.util.*;

/**
 *A classe LabClass representa uma lista de inscrição para uma classe de laboratório. ele armazena
 * o horário, sala e participantes do laboratório, bem como o nome do instrutor.

 */
public class LabClass
{
    private String instructor;
    private String room;
    private String timeAndDay;
    private ArrayList<Student> students;
    private int capacity;
    
    /**
     * Crie um LabClass com um número máximo de inscrições. Todos os outros detalhes
      * são definidos com valores padrão.
     */
    public LabClass(int maxNumberOfStudents)
    {
        instructor = "unknown";
        room = "unknown";
        timeAndDay = "unknown";
        students = new ArrayList<Student>();
        capacity = maxNumberOfStudents;
    }

    /**
     * Adicione um aluno a este LabClass.
     */
    public void enrollStudent(Student newStudent)
    {
        if(students.size() == capacity) {
            System.out.println("The class is full, you cannot enrol.");
        }
        else {
            students.add(newStudent);
        }
    }
    
    /**
     *Retorna o número de alunos atualmente matriculados neste LabClass.
     */
    public int numberOfStudents()
    {
        return students.size();
    }
    
    /**
* Defina o número da sala para este LabClass.  
*/
    public void setRoom(String roomNumber)
    {
        room = roomNumber;
    }
    
    /**
    * Defina o tempo para este LabClass. O parâmetro deve definir o dia
    * e a hora do dia, como "sexta-feira, 10h".
     */
    public void setTime(String timeAndDayString)
    {
        timeAndDay = timeAndDayString;
    }
    
    /**
       * Defina o nome do instrutor para este LabClass.   
       */
    public void setInstructor(String instructorName)
    {
        instructor = instructorName;
    }
    
    /**
     *Imprima uma lista de classe com outros detalhes LabClass para o padrão
      * terminal.
     */
    public void printList()
    {
        System.out.println("Lab class " + timeAndDay);
        System.out.println("Instructor: " + instructor + "   Room: " + room);
        System.out.println("Class list:");
        for(Student student : students) {
            student.print();
        }
        System.out.println("Number of students: " + numberOfStudents());
    }
}
