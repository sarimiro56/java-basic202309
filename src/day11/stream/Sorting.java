package day11.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static day11.stream.Menu.*;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Sorting {

    public static void main(String[] args) {

        // 음식목록 중 칼로리가 낮은 순으로 정렬
        menuList.stream()
                .sorted(comparing(Dish::getCalories))
                .collect(toList())
                .forEach(System.out::println);
        ;

        System.out.println("======================");

        // 칼로리로 내림차 정렬(높은 순)
        menuList.stream()
                .sorted(comparing(Dish::getCalories).reversed())
                .collect(toList())
                .forEach(System.out::println);
        ;


        // 500 칼로리보다 작은 요리 중에 top3 필터링
        System.out.println("======= top3 filtering =======");
        menuList.stream()
                .filter(dish -> dish.getCalories() < 500)
                .sorted(comparing(Dish::getCalories).reversed())
                .limit(3)
                .collect(toList())
                .forEach(System.out::println);
    }
}