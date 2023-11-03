package com.sparta.springauth.food;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary  // 같은 타입의 Bean이 여러개 있더라도 우선적으로 주입하게 해준다.
public class Chicken implements Food {
    @Override
    public void eat() {
        System.out.println("치킨을 먹습니다.");
    }
}