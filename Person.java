public class Person {  // é o obj
    
    //atributos
    String name; // se colocarmos ela com static string... todos os objetos terão acsso a ela
    int age;

    //construtor

    Person(String parName, int parAge){   // tem que ter o nome da classe
        name = parName;
        age = parAge;  // a variavel tem tipo, identificado(que acontece nos atributos), e a atribuição dá aqui
    }

    //identidade

    public boolean equals(Object obj){
        if(obj instanceof Person){
            Person other = (Person) obj;  // é uma copia do person
            return this.name.equals(other.name);
        }

        return false;
    }

    //representação em string do objeto

    public String toString(){
        return this.getName() + this.getAge();
    }
    //operações
    String getName(){
        return name;  
    }    

    int getAge(){
        return age;
    }

    
}
