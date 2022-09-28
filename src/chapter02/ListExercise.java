package chapter02;

import java.util.ArrayList;
import java.util.List;


public class ListExercise {

    public static void  main(String[] args){
        List<String> names = new ArrayList<>(); // String type을 List에 저장할 준비
        // String 타입의 데이터 삽입
        names.add("홍길동");
        names.add("MIN");
        names.add("Lee");

         // for문으로 데이터를 출력
        for (String name : names){
            System.out.println(name);
        }
    }
}
