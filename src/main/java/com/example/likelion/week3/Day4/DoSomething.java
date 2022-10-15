package com.example.likelion.week3.Day4;

import java.util.List;

// List<T>를 리턴하는 인터페이스를 설계한다.
// T는 구현체에서 바꿀 수 있기 때문이다.
// T가 PopulationMove가 될 수 있고 T가 Patient가 될 수도 있다.
public interface DoSomething<T> {
    List<T> work(String str);
}
