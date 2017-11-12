package ru.geekbrains.java1.dz.dz6.KopeikinAleksey;

public class Main {
    public static void main(String[] Arg){

       Dogs Dog1=new Dogs(400,10,0.5);
        Dogs Dog2=new Dogs(600,10,0.5);
        Cats Cat1=new Cats(200,0,2);

      // Dog1.Info();
     //  Dog1.Run(100);
       System.out.println("Dog2.Run= " + Dog2.Run(600));
        System.out.println("Dog2.Swim= " + Dog2.Swim(9));
        System.out.println("Cat1.Run= " + Cat1.Run(150));
        System.out.println("Cat1.Jamp= " + Cat1.Jump(0.8));
    }
}
