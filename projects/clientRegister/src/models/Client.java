package models;

public class Client {

    private Integer id;
    private String name;
    private Integer age;
    private String cpf;

    public Client(){}

    public Client(String name, int age, String cpf){
        this.setName(name);
        this.setAge(age);
        this.setCpf(cpf);
    }


    public void setId(Integer id){
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getId(){
        return this.id;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf.replace(" ", "");
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getCpf() {
        return this.cpf;
    }


    @Override
    public String toString() {
        return "Client{" +
                "id='" + this.getId() + '\'' +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", cpf='" + this.getCpf() + '\'' +
                '}';
    }
}
