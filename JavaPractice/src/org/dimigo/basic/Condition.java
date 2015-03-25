package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		// 고속버스: 850 경차: 300 그외 : 600 고속버스 300원  경차200원 추가
		int distance = 21;
		String car = "경차";
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
				pay += (int)(distance / 10)*200;
			}	
		}else{
			pay = 600;
			if(distance >= 0 && distance <= 10){
				pay+=0;
			}else if(distance <= 20){
				pay+=200;
			}
			else {
				pay += (int)(distance / 10)*200;
			}
		}
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + car);
		System.out.println("통행료 : " + pay + "원");
		

	}

}
