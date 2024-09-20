import java.io.*;
import java.text.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		
		int monthTotal[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int D_Day = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		int nowYear = Integer.parseInt(st.nextToken());
		int nowMonth = Integer.parseInt(st.nextToken());
		int nowDay = Integer.parseInt(st.nextToken());

		int endYear = Integer.parseInt(st2.nextToken());
		int endMonth = Integer.parseInt(st2.nextToken());
		int endDay = Integer.parseInt(st2.nextToken());
		
		if(nowYear+1000<endYear
				||(nowYear+1000==endYear&&nowMonth<endMonth)
				||(nowYear+1000==endYear&&nowMonth==endMonth&&nowDay<=endDay)) {
			bw.write("gg");
		}else {
			for(int year = nowYear+1; year<endYear; year++) {
				if(((year%4==0 && year%100!=0)||year%400==0)) { //윤년 체크
					D_Day = D_Day + 366;
				} else{
					D_Day = D_Day + 365;
				}
				
			}
			if(nowYear == endYear) {//시작,종료 년도가 같을때
				
				if(nowMonth==endMonth) {//시작, 종료 월이 같은경우
					D_Day = D_Day + (endDay-nowDay);
					
				}else { //이외(시작월이 더 빠를때)
					for(int month = nowMonth+1; month<endMonth; month++) {
						D_Day = D_Day + monthTotal[month];
					}	
					
					if(((nowYear%4==0 && nowYear%100!=0) || nowYear%400==0)
                    	&& nowMonth<=2 && 3<=endMonth){
						D_Day = D_Day +1;
					}
					D_Day = D_Day + monthTotal[nowMonth-1]-nowDay;
					D_Day = D_Day + endDay;
				}
			}else {//시작,종료 년도가 다를때
				for(int month = 0; month<endMonth-1; month++) {
					D_Day = D_Day + monthTotal[month];
				}
				
				for(int month = nowMonth; month<12; month++) {
					D_Day = D_Day + monthTotal[month];
				}
				
				if(((nowYear%4==0 && nowYear%100!=0) || nowYear%400==0) && nowMonth<=2){ 
					D_Day = D_Day +1;
				}
				if(((endYear%4==0 && endYear%100!=0) || endYear%400==0) && 3<=endMonth){ 
					D_Day = D_Day +1;
				}
				
				D_Day = D_Day + monthTotal[nowMonth-1]-nowDay;
				D_Day = D_Day + endDay;
				
			}
			bw.write("D-"+D_Day);
		}
		bw.close();
		br.close();
	}
}