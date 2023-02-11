package day01vairables.day23encapsulationInheritance_V34.dependencies;

public class Main {
    /*
    1- Bağımlılık (Dependency) / “uses a” İlişkisi
    eğer bir sınıfın metotlarından en az biri başka bir sınıfa ait bir parametre alıyorsa,
    parametre alan metoda ait sınıf diğeri sınıfa bağımlıdır ya da onu kullanır (uses) denir.
    2- Birleştirme (Composition) / "has a" İlişkisi
    eğer bir sınıfın değişkenlerinden en az bir tanesi başka bir sınıf türünden ise,
    değişkene sahip olan sınıf diğer sınıfı içerir yani "has a" olarak adlandırılır.

     */
    public static void main(String[] args) {

        Student st1 = new Student("Enver",11);
        Student st2 = new Student("Enver2",12);

        Course mat = new Course("Math",101);
        Student [] stu = {st1,st2};
        mat.average(stu);
        System.out.println("Average: "+ mat.average(stu));

    }
}
