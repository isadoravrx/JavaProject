public class app{
    public static void main(String[]args){
        Person person1 = new Person("Almir",19);  // person é a class
        //esse personq e 2 são objetos
        Person person2 = new Person("Gabriel", 20);

        //System.out.println(person1);  //essa linha 7 e 8 tem a mesma função
        //System.out.println(person2.getName() + ":" + person2.getAge());
        //System.out.println(person2);
        //System.out.println("Hello, World!");
        boolean isEqual = person1.equals(person2);
        System.out.println(isEqual);
    }
}
