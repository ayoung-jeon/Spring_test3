package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    // 방법 1
//    @Autowired
//    Food pizza;
//
//    @Autowired
//    Food chicken;
//
//    @Test
//    @DisplayName("테스트")
//    void test1() {
//        pizza.eat();
//        chicken.eat();
//    }


    // 방법 2
    // @Qualifier("pizza") 가 없으면 @Primary 가 있는 chicken이 주입된다.
    @Autowired
    @Qualifier("pizza") // @Primary 보다 우선순위
    Food food;

    @Test
    @DisplayName("테스트")
    void test1() {
    food.eat();
    }
}
