package OOPS;

public class Final {
    public static void main(String[] args){
        Childrens child=new Childrens();
        child.affection();
    }
}
class Parents{
    void love(){
        System.out.println("Parents love their children");
    }
}
class Childrens extends Parents{
    void affection(){
        System.out.println("Children have affection toward their parents");

    }
}
