package ru.geekbrains.java1.dz.dz7.AndreyMelchuk;

public class Cat {
    private static int hungrycats = 0;
    private static int totalcats = 0;

    private String name;
    public int appetite;
    private boolean satisfiedCat; //satiety

    public Cat ( String name, int appetite ) {
        this.name = name;
        this.appetite = appetite;
        this.satisfiedCat = appetite==0;
        hungrycats++;
        totalcats++;
    }
    public void eat ( Plate p ) {
        int p_state = p.getFood();
        System.out.print("\n" + name + getStringState());
        if(!satisfiedCat) {
            satisfiedCat = (appetite = p.decreaseFood ( appetite )) == 0 ;
            if(satisfiedCat){
                hungrycats--;System.out.print(" поел из ");
            }
            else{
                System.out.print(" не стал есть из ");
            }
        }
        else
            System.out.print(" безразличен к  ");
        System.out.print(p.getName()+"(" + p_state +")"+ " =>" + name + getStringState()+", "+ p.stringinfo());
    }

    public boolean isSatisfiedCat() {
        return satisfiedCat;
    }

    public String getName() {
        return name;
    }

    String getStringState(){
        return "(Аппетит " + appetite +"," + (satisfiedCat?"!!!!!!!!! СЫТЫЙ":" голодный") + ")";
    }

    public static void getHungrycats() {
        System.out.println("\nВсего котов: "+ totalcats +", из них голодных:" +  hungrycats);
    }
}