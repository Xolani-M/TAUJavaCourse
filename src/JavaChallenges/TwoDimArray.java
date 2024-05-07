package JavaChallenges;

public class TwoDimArray {

    public static void main(String[] args){
        int[][] numbers = new int[2][3];

        numbers[0][0] = 2;
        numbers[0][1] = 4;
        numbers[0][2] = 6;
        numbers[1][0] = 1;
        numbers[1][1] = 3;
        numbers[1][2] = 5;



        for(int i =0; i < 2; i++){
            System.out.println("i is = " + i);
            for(int j =0; j < 3; j++ ){
                System.out.print(numbers[i][j] + " ");
            }
        }


    }

}
