package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    //어떠한 Bean 객체인지 몰라서 발생하는 오류
    //@Autowired
    //Food food;

    //방법1 : 직접 지정방법
    @Autowired
    Food pizza;

    @Autowired
    Food chicken;

    @Test
    @DisplayName("테스트")
    void test1() {
        pizza.eat();
        chicken.eat();
    }
    
    //방법2 : Food 타입의 주 객체 지정
    //Chicken 클래스 -> @Primary 지정
    @Autowired
    Food food2;

    @Test
    @DisplayName("테스트")
    void test2() {
        food2.eat();
    }

    //방법3 : Food 타입의 객체 지정
    //@Qualifier("pizza")
    @Autowired
    @Qualifier("pizza")
    Food food3;

    @Test
    @DisplayName("테스트")
    void test3() {
        food3.eat();
    }

}
