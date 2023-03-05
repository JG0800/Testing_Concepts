import Tools.*;
import java.util.Scanner;
import casting.*;

public class Main {
    int x;

    private String name;

    public void thisKey(int x){
        this.x = x;
    }

    public void setName(String ganzerName){ //public = die Methode gehört zum Objekt und nicht zur Klasse wie bei static
        this.name = ganzerName; //this ist ein Keyword, das die aktuelle Klasse in ein Objekt verpackt man könnte auch
        System.out.println(name);
    }

    static void staticMethod(){
        System.out.println("Ich bin eine statische Methode und kann von überall aus der Klasse abgerufen werden");
    }
    public void publicMethod(){
        System.out.println("Ich bin eine öffentliche Methode die erst als Objekt initialisiert werden muss allerdings auch von anderen Klassen abgerufen werden kann");

    }


    public static void main(String[] args) {
        Main mainObj = new Main();
        Scanner scan = new Scanner(System.in);
        System.out.println("Gib etwas in die Konsole ein: ");
        String scanOutput = scan.nextLine();
        System.out.println("Dein input war: " + scanOutput);

        Objektorientierung testObj = new Objektorientierung(); /*Ein Objekt aus der Klasse Objektorientierung wird mit dem Namen TestObj deklariert
        und als neues Objekt aus Test initialisiert. Das Objekt enthält alle Attribute und Methoden der Klasse "Objektorientierung".
        */

        mainObj.thisKey(4);

        mainObj.setName("Peter");
        System.out.println(mainObj.x);
        Tools werkzeuge = new Tools();
        werkzeuge.packageAusgabe();

        SubClass test = new SubClass();
        test.someMethod();

        int laengeDesArrays = 5;
        int x[] = new int[laengeDesArrays];
        x[0]=5;
        x[0] = x[0] -4;
        System.out.println(x[0]);

        //Upcast: Subklasse --> Superklasse (Verallgemeintern)
        //Downcast: Superklasse --> Subklasse (Spezialisierung)
        //dadurch kann ein einzelnes Objekt von verschiedenen Klassen erben

        Person schüler = new Schüler(); //Upcast Objekt einer Subklasse wurde in einer Superklasse gebildet
        //Schüler hat alle Attribute und Methoden von Person
        Schüler schüler1 = (Schüler) schüler; //downcast

        schüler1.rechnen();


    }


}
