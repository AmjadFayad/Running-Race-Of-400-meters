/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RunningRaceOf400meters;

/**
 *
 * @author Amjad Fayad
 * @version 1.0
 */
public class Race {

public static Thread runner[];

public static void main(String[] args) {
    Run rRacer = new Run();

    ThreadGroup country[] = new ThreadGroup[5];
    country[0] = new ThreadGroup("UAE");
    country[1] = new ThreadGroup("Russia");
    country[2] = new ThreadGroup("Italia");
    country[3] = new ThreadGroup("France");
    country[4] = new ThreadGroup("Brazil");

    runner = new Thread[10];
    runner[0] = new Thread(country[0] , rRacer, "UAE racer 1");
    runner[1] = new Thread(country[0] , rRacer, "UAE racer 2");
    runner[2] = new Thread(country[1] , rRacer, "Russia racer 1");
    runner[3] = new Thread(country[1] , rRacer, "Russia racer 2");
    runner[4] = new Thread(country[2] , rRacer, "Italia racer 1");
    runner[5] = new Thread(country[2] , rRacer, "Italia racer 2");
    runner[6] = new Thread(country[3] , rRacer, "France racer 1");
    runner[7] = new Thread(country[3] , rRacer, "France racer 2");
    runner[8] = new Thread(country[4] , rRacer, "Brazil racer 1");
    runner[9] = new Thread(country[4] , rRacer, "Brazil racer 2");

    runner[0].start();
    runner[2].start();
    runner[4].start();
    runner[6].start();
    runner[8].start();
}

    

}
