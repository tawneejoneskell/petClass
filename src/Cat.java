public class Cat {
    private String name;
    private int age;
    private String breed;

    public Cat() {
        super();
    }

    ;

    public Cat(String name, String breed) {
        this.name=name;
        this.breed=breed;
    }

    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    };
    public String getName() {
        return name;
    }

    ;

    public int getAge() {
        return age;
    }

    ;

    public String getBreed() {
        return breed;
    }

    ;
    public void setName(String name){
        this.name=name;
    };
    public void setAge(int age){
        this.age=age;
    };
    public void setBreed(String breed) {
        this.breed = breed;
    };
    public String meow(){
        return "MEEEEOOOWWWW!";
    }
    public boolean isCute(){
        return true;
    }

}

