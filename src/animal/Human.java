package animal;

public class Human extends Animal implements Thinkable {
    private String hoby;
    
    
    
    
    public Human(String name, int age, String hoby) {
        super(name, age);
        this.hoby = hoby;
    }
   
    public String getHoby() {
        return hoby;
    }


    public void setHoby(String hoby) {
        this.hoby = hoby;
    }

    @Override
    public void think() {
        System.out.println("私は" + this.hoby + "について考えています");
    }
    
    

}
