package ch03.unit1;

import java.util.Scanner;

public class OretatorEx06hw3 {

	public static void main(String[] args) {
		//체중과 키를 입력->bmi 계산
		Scanner sc= new Scanner(System.in);
		double weight,heightM,heightCm,Bmi;
		System.out.print("체중(kg) ? ");
		weight = sc.nextDouble();
		System.out.print("키(cm) ? ");
		heightM = sc.nextDouble();
		heightCm =heightM/100;
		Bmi = (double)(weight/(double)(heightCm*heightCm));
		System.out.printf("몸무게 :%3.2f",weight,"kg");
		System.out.printf("키:%1.2f",heightCm,"m");
		System.out.printf("BMI :%.1f ",Bmi);
		sc.close();
	}
}
	