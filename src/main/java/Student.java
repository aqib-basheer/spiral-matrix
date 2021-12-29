public class Student {
    private String name;
    private String age;
    private String clas;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String age, String clas) {
        this.name = name;
        this.age = age;
        this.clas = clas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }
}
