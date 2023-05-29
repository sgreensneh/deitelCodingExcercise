package chapterSix;

public class Person {
public String getName() {
    return name;
}

public void setName (){
    this.name = name;
}

public int getAge () {
    return age;
}
public void  setName (int age){
    this.name = name;
}

public Gender getGender (){
    return gender;
}

public void setGender (Gender gender){
    this.gender = gender;
}

private String name;
private int age;
private Gender gender;

public Person (String name, int age, Gender gender){
    this.name = name;
    this.age = age;
    this.gender = gender;

}

}
