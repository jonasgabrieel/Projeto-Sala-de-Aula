
/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.

 */
public class Student
{
    // Nome completo do estudante
    private String name;
    // ID do estudante
    private String id;
    // A quantidade de créditos para o estudo feito até agora
    private int credits;

    /**
     *Crie um novo aluno com um determinado nome e número de identificação
     */
    public Student(String fullName, String studentID)
    {
        name = fullName;
        id = studentID;
        credits = 0;
    }

    /**
     * Retornar o nome completo deste aluno.  
     */
    public String getName()
    {
        return name;
    }

    /**
     *Defina um novo nome para este aluno.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Retorna o numero de identificação do aluno
     */
    public String getStudentID()
    {
        return id;
    }

    /**
     * Adicione alguns pontos de crédito aos créditos acumulados do aluno.
     */
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
    }

    /**
     *Retorne o número de pontos de crédito que este aluno acumulou.
     */
    public int getCredits()
    {
        return credits;
    }

    /**
     *Retorne o nome de login deste aluno. O nome de login é uma combinação
      * dos quatro primeiros caracteres do nome do aluno e dos três primeiros
      * caracteres do número de identificação do aluno.
     */
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }
    
    /**
     *Print o nome do estudante junto com o ID e sua quantidade de creditos
     */
    public void print()
    {
        System.out.println(name + ", student ID: " + id + ", credits: " + credits);
    }
}
