package chapterEight;
import org.junit.jupiter.api.Test;

class StudentTest {
    @Test
    public void universityTest(){
        Student student = new Student();
        student.setName("green");
        student.setSchool(University.UNILAG);
//        University.UNILAG.setFullName("Green University");
        System.out.println(student.getSchool().getFullName());
    }

    @Test
    public void getStateTest(){
        University[] universities = University.values();
        for (University university : universities) {
//            System.out.println(university.getFullName());
        }
        University uniport = University.valueOf("UNIPORT");
        System.out.println(uniport.getState());

    }

}