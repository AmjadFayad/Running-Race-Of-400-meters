/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RunningRaceOf400meters;

/**
 *
 * @author Amjad fayad
 * @version 1.0
 */
public class Run implements Runnable {

    public static Boolean winnerYet = false;

    public void relayRace() {
        for (int distance = 1; distance <= 400; distance++) {
            System.out.println("current runner " + Thread.currentThread().getName()
                    + " has run " + distance + " meters");
            if (Thread.currentThread().getName().equals("UAE racer 1") && distance == 200) {
                threadJoin(distance, 1);
            } else if (Thread.currentThread().getName().equals("Russia racer 1") && distance == 200) {
                threadJoin(distance, 3);
            } else if (Thread.currentThread().getName().equals("Italia racer 1") && distance == 200) {
                threadJoin(distance, 5);
            } else if (Thread.currentThread().getName().equals("France racer 1") && distance == 200) {
                threadJoin(distance, 7);
            } else if (Thread.currentThread().getName().equals("Brazil racer 1") && distance == 200) {
                threadJoin(distance, 9);
            }

            if (isGroupRacerWinner(distance)) {
                System.out.println("Winning Country is " + Thread.currentThread().getThreadGroup().getName());
            }
        }
    }

    public void threadJoin(int distance, int nextRunner) {

        Race.runner[nextRunner].start();

        try {
            Race.runner[nextRunner].join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public Boolean isGroupRacerWinner(int distance) {

        if (distance == 400 && winnerYet == false) {
            winnerYet = true;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void run() {
        this.relayRace();
    }
}
