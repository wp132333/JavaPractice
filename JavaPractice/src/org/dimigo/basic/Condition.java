package org.dimigo.basic;  

public class Condition {

	public static void main(String[] args) {
		/* 1. 기본요금 - 고속버스 : 850원, 경차 : 300원 , 그외 600원
		 * 2. 10km 초과 시 마다 고속버스는 300원씩 추가, 경차와 그 외는 200원 씩 추가
		 */
		int distance = 30;
		String car = "고속버스";
		int pay =0;
		int which = 0;
		
		switch(car){
		case "고속버스":
			which+=1;//고속버스
			break;
		case "경차":
			which+=2;//경차
			break;
		default :
			which+=3;//그 외
		}
		if(which == 1){
			pay = 850;
			if(distance >= 0 && distance <= 10){
				pay+=0;
			}else if(distance <= 20){
				pay+=300;
			}
			else {
				if(distance % 10 == 0){
					pay +=(int)(distance / 10)*300-300;	
				}
				else
					pay +=(int)(distance / 10)*300;
			}
		}else if(which ==2){
			pay = 300;
			if(distance >= 0 && distance <= 10){
				pay+=0;
			}else if(distance <= 20){
				pay+=200;
			}
			else {
				if(distance % 10 == 0){
				pay +=(int)(distance / 10)*300-300;	
			}
			else
				pay +=(int)(distance / 10)*300;
			}	
		}else{
			pay = 600;
			if(distance >= 0 && distance <= 10){
				pay+=0;
			}else if(distance <= 20){
				pay+=200;
			}
			else {
				if(distance % 10 == 0){
					pay +=(int)(distance / 10)*300-300;	
				}
				else
					pay +=(int)(distance / 10)*300;
			}
		}
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + car);
		System.out.println("통행료 : " + pay + "원");
		

	}

}
