public class School {
    public static void main (String[] args){
        Aluno student = new Aluno();

        student.setName("Pedro");
        student.setAge(20);

        System.out.println(student.getName());
        System.out.println(student.getAge());

        student.setName("David");
        student.setAge(18);

        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
