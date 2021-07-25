package com.platzi.functional._15_streams_intro;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> courseList = NombresUtils.getList(
                "Java",
                "Frontend",
                "Backend",
                "FullStack");
        for (String course:courseList) {
            String newCourseName = course.toLowerCase().replace("!","!!");
            System.out.println("Platzi: "+course);
        }

        Stream<String> courseStrema = Stream.of("Java",
                "Frontend",
                "Backend",
                "FullStack");
        //Stream<Integer> courseLengthStream =courseStrema.map(course ->course.length());

        //Optional<Integer> longest = courseLengthStream.max((x, y)-> y-x);

        Stream<String> emphasisCourses = courseStrema.map(course -> course + "!");
        Stream<String> justJavaCourse = emphasisCourses.filter(course->course.contains("Java"));
        justJavaCourse.forEach(System.out::println);
        Stream<String> courseStrem2 = courseList.stream();

        addOperator(courseStrem2.map(course -> course +"!!")
                .filter(course ->course.contains("Java"))
        ).forEach(System.out::println);


    }
    static  <T> Stream<T> addOperator(Stream<T> stream){
        return stream.peek(data -> System.out.println("Dato: "+data));

    }
}

