package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;

import tn.esprit.gestionzoo.entities.Zoo;
import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {

               /* int nbrCages=20;
                String zooName="myZoo";
                System.out.println(zooName+" contient "+nbrCages+"cages");
                System.out.println("donner le nom du zoo");
                Scanner k=new Scanner(System.in);
                zooName=k.nextLine();
                System.out.println("donner le nombres des cages ");
                nbrCages=k.nextInt();
                System.out.println(zooName+" contient "+nbrCages+"  cages");*/
              /* tn.esprit.gestionzoo.entities.Animal lion = new tn.esprit.gestionzoo.entities.Animal();
                lion.name ="chmaykel";
                lion.age= 4;
                lion.family="wahch";
                lion.isMammal= true;
                tn.esprit.gestionzoo.entities.Zoo myZoo =new tn.esprit.gestionzoo.entities.Zoo();
                myZoo.nbrCages=25;
                myZoo.name="garena";
                myZoo.city="nabeul";
                myZoo.animals[0]=lion;*/
        Zoo myZoo = new Zoo("garena","nabeul");
        Animal dog =new Animal("wahch","fakroun",5,true);
        myZoo.displayZoo();

        System.out.println(myZoo);

        System.out.println(myZoo.toString());
        System.out.println(dog);

       System.out.println(dog.toString());


    }
}
