package org.wojcieszko.achilles;

public class AchilllesVsTurtle {


    public static int run(float turtleSpeed, float achillesSpeed, float distanceAT, float epsilon) {

        float time = 0;
        float tmpTime = 0;
        float achillesDistance = 0;
        int steps = 0;

//        while (distanceAT > epsilon) {
//            tmpTime = distanceAT / achillesSpeed;
//            achillesDistance += distanceAT;
//            distanceAT = tmpTime * turtleSpeed;
//            time += tmpTime;
//            ++steps;
//
//            System.out.println("Obecny dystans: " + distanceAT);
//            System.out.println("Achilles przebiegł: " + achillesDistance);
//            System.out.println("Czas biegu: " + time);
//        }

        while (true) {
            tmpTime = distanceAT / achillesSpeed;
            achillesDistance += distanceAT;
            distanceAT = tmpTime * turtleSpeed;
            time += tmpTime;
            ++steps;

            System.out.println("Obecny dystans: " + distanceAT);
            System.out.println("Achilles przebiegł: " + achillesDistance);
            System.out.println("Czas biegu: " + time);

            if (steps > 50){
                break;
            }
        }

        

        return steps;
    }


}
