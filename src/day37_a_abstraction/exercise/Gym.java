package day37_a_abstraction.exercise;

public class Gym {
    public static void main(String[] args) {


        Running objRun = new Running();
        System.out.println(objRun.name);
        objRun.performExercise();
        System.out.println(objRun.caloriesBurned(5));
        objRun.generalInfo();
        System.out.println(objRun);


        System.out.println();

        PushUp objPU = new PushUp();
        System.out.println(objPU.name);
        objPU.performExercise();
        System.out.println(objPU.caloriesBurned(5));
        objPU.generalInfo();





    }
}



