package OOPS;

interface parent1{
    void love();
}
interface parent2{
    public void affection();
}
class Children implements parent1, parent2{
    @Override
    public void love(){
        System.out.println("Parent 1 loves");
    }
    @Override
    public void affection(){
        System.out.println("Parent 2 affection");
    }
}
public class Interface {
    public static void main(String[] args){
        Children children=new Children();
        children.love();
        children.affection();
    }
}
