package sextaLista;
import java.util.Scanner;
public class buildingHeight {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double manHeight = sc.nextDouble(); double buildingShadow = sc.nextDouble(); double manShadow = sc.nextDouble();
        double buildingHeight = ValueOfBuildingHeight(manHeight,buildingShadow,manShadow);
        System.out.println(buildingHeight);
    }    
    public static double ValueOfBuildingHeight(double manHeight, double buildingShadow, double manShadow){
        double buildingHeight = (manHeight * buildingShadow)/manShadow;
        return buildingHeight;
    }
}
