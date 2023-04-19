public class differentClass {
public static void main(String[] args){
    Fish f1=new Fish("blue","male",true);
    f1.makeSound();
}
}

class Fish{
    public String color;
    public String gender;
    public boolean IsFreshwater;
    public Fish(String color,String gender,boolean IsFreshwater)
    {
        this.color=color;
        this.gender=gender;
        this.IsFreshwater=IsFreshwater;
    }
    public void makeSound()
    {
        System.out.println("Hissssssssssssss");


    }

}
