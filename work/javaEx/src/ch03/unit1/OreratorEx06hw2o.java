package ch03.unit1;

import java.util.Scanner;

public class OreratorEx06hw2o {

	public static void main(String[] args) {
		int dis, vec;
		float time;
		int hour, min;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주행거리(km) ? ");
		dis = sc.nextInt();
		System.out.print("시속(km) ? ");
		vec = sc.nextInt();
		
		time = (float) dis / vec;
		float sec, sec1;
		hour = (int) (time);
		min = (int) (time * 60.0 % 60);
		sec = (float) (time * 3600.0 % 60);
		// time*60.0%60 => 61/60=0나오는 이유? float 정확도 문제
		sec1 = (int) (sec * 100) / 100.f;
		System.out.printf("%d시간 %d분  %.2f초 소요", hour, min, sec1);
		sc.close();
	}
}