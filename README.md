### 🌠 Spring 초보자 타이틀 떼기
- intellj를 통한 spring 공부 
- 초보자를 벗어나자..
- 구조와 의존성 분리에 대해 이해하고 적용하도록 노력하자.

### 🌈 Rule ૮꒰ ྀི〃´꒳`〃꒱ა
- 그 날 배운 거는 수업도중 바뀔 때마다 Commit and Push 
- COMMIT 메세지는 협업 대비 최대한 자세히 쓰는 걸 연습
- 그날 공부해서 정리한 것은 VELOG에 업로드
- intellJ 익숙해지기
- 하루에 하나씩이라도 개념 여기 readme에 정리

### 🖊 spring에 대한 개념 + 면접식 대답할 수 있게
<details><summary style="color:skyblue">AOP</summary>
<details><summary style="color:skyblue">AOP란 무엇인가?</summary>
AOP는 Aspect-Oriented Programming의 약자로, 주요한 비즈니스 로직과 공통적인 부가 기능을 분리하여 관리하는 프로그래밍 패러다임  
</details>

<details><summary style="color:skyblue">AOP의 핵심 개념은 무엇인가요?</summary>
AOP의 핵심 개념은 '관점(Aspect)'입니다. 이는 어플리케이션 전반에 걸쳐 사용되는 부가적인 기능들을 의미하며, 예를 들어 로깅, 보안, 트랜잭션 관리 등이 있습니다. 
</details>

<details><summary style="color:skyblue"> AOP의 장점은 무엇인가요?</summary>
AOP를 사용하면 주요 비즈니스 로직과 부가 기능이 분리되므로 코드의 재사용성과 유지보수성이 향상됩니다. 또한, 공통된 기능을 여러 부분에서 중복해서 구현하지 않아도 되므로 코드 중복을 줄일 수 있습니다.
</details>

<details><summary style="color:skyblue"> AOP에서 핵심 로직과 부가 기능을 어떻게 분리하나요?</summary>
AOP에서는 '어드바이스(Advice)', '포인트컷(Pointcut)', '위빙(Weaving)' 등의 개념을 사용하여 핵심 로직과 부가 기능을 분리합니다. 어드바이스는 부가 기능의 내용을 담고 있고, 포인트컷은 어떤 메소드나 위치에서 어드바이스를 적용할지를 정의합니다. 위빙은 이러한 부가 기능을 실제로 핵심 로직에 적용하는 작업을 의미합니다.
</details>

<details><summary style="color:skyblue"> AOP의 예시를 들어볼까요?</summary>
예를 들어, 트랜잭션 관리는 여러 비즈니스 메소드에서 공통적으로 필요한 기능입니다. AOP를 사용하면 이런 트랜잭션 관리 로직을 핵심 비즈니스 메소드와 분리하여 따로 관리할 수 있습니다. 또 다른 예로 로깅 기능도 있습니다. 핵심 로직의 실행 전후에 로깅을 추가하는 것도 AOP를 통해 간단하게 구현할 수 있습니다.
</details>

<details><summary style="color:skyblue"> AOP가 실제 어떻게 동작하나요?</summary>
AOP는 런타임 시점에 위빙 작업을 통해 부가 기능을 핵심 로직에 적용합니다. 이를 위해서는 프록시(Proxy)라는 중간 객체를 사용합니다. 프록시는 핵심 로직을 호출하기 전에 어드바이스를 실행하고, 그 후에도 필요한 부가 기능을 수행한 후 핵심 로직을 호출합니다.
</details>

<details><summary style="color:skyblue"> AOP를 스프링에서 어떻게 사용하나요?</summary>
스프링 프레임워크는 AOP를 지원하여 개발자가 편리하게 부가 기능을 관리할 수 있도록 도와줍니다. 스프링에서 AOP를 사용하려면 어노테이션을 이용한 설정 방식이나 XML 설정 방식을 선택하여 어드바이스와 포인트컷을 정의하고, 위빙을 설정할 수 있습니다.
</details>

<details><summary style="color:skyblue"> AOP를 사용하면 어떤 상황에서 유용한가요?</summary>
AOP는 주로 다양한 모듈에서 공통으로 사용되는 부가 기능을 분리하여 관리할 때 유용합니다. 트랜잭션 관리, 보안, 로깅 등 여러 곳에서 반복적으로 필요한 기능을 AOP를 통해 중앙에서 관리하면 코드의 효율성과 유지보수성을 높일 수 있습니다.
</details>

<details><summary style="color:skyblue">  AOP를 사용할 때 주의해야 할 점은 무엇인가요?</summary>
AOP를 오용하지 않도록 주의해야 합니다. 너무 많은 부가 기능을 AOP로 분리하면 코드가 복잡해질 수 있으며, 디버깅이 어려울 수 있습니다. 또한, AOP의 성능도 고려해야 합니다. 핵심 로직을 실행하기 전후에 부가 기능을 실행하므로, 불필요한 오버헤드가 발생할 수 있습니다.
</details>
  
</details>

### 🔖 정리한 글
| 날짜     | 내용  | 정리한 글 블로그 가기                                                                 |
| :------- | :---: | -------------------------------------------------------------------- |
| 8월 3일  | intellj, 스프링을 쓰는 이유, 스프링 | [👉🏻 velog 바로가기](https://velog.io/@prettylee620/ss-3ucb99gz) |
| 8월 4일-7일  | intellj, mariadb, mapper, tdd, 의존성 주입 | [👉🏻 velog 바로가기](https://velog.io/@prettylee620/%EB%A9%80%ED%8B%B0%EC%BA%A0%ED%8D%BC%EC%8A%A4-%EB%B0%B1%EC%97%94%EB%93%9C-%EA%B3%BC%EC%A0%9543%EC%9D%BC%EC%B0%A8-44%EC%9D%BC%EC%B0%A88%EC%9B%94-4%EC%9D%BC-8%EC%9B%94-7%EC%9D%BC-intellj-mariadb-mapper-tdd-%EC%9D%98%EC%A1%B4%EC%84%B1-%EC%A3%BC%EC%9E%85) |
| 8월 8일  | controller, 스프링 Web MVC[DispatcherServlet, Front-Controller] | [👉🏻 velog 바로가기](https://velog.io/@prettylee620/%EB%A9%80%ED%8B%B0%EC%BA%A0%ED%8D%BC%EC%8A%A4-%EB%B0%B1%EC%97%94%EB%93%9C-%EA%B3%BC%EC%A0%9545%EC%9D%BC%EC%B0%A88%EC%9B%94-8%EC%9D%BC-controller-%EC%9D%B8%ED%85%94%EB%A6%AC%EC%A0%9C%EC%9D%B4%EB%9E%91-github%EC%97%B0%EB%8F%99-%EC%8A%A4%ED%94%84%EB%A7%81-Web-MVCDispatcherServlet-Front-Controller) |
| 8월 9일  | controller, service, mapper 게시글 추가 목록보기 | [👉🏻 velog 바로가기](https://velog.io/@prettylee620/%EB%A9%80%ED%8B%B0%EC%BA%A0%ED%8D%BC%EC%8A%A4-%EB%B0%B1%EC%97%94%EB%93%9C-%EA%B3%BC%EC%A0%95-46%EC%9D%BC%EC%B0%A88%EC%9B%94-9%EC%9D%BC-controller-service-mapper-%EA%B2%8C%EC%8B%9C%EA%B8%80-%EC%B6%94%EA%B0%80-%EB%AA%A9%EB%A1%9D%EB%B3%B4%EA%B8%B0) |
| 8월 10일  | 게시글 목록, 수정, 삭제 구현, 페이징 | [👉🏻 velog 바로가기](https://velog.io/@prettylee620/ss-e0zelktg) |
| 8월 11일  | 검색 구현, 필터링, 팀작업에서 배운 tip, 프로젝트 고민 | [👉🏻 velog 바로가기](https://velog.io/@prettylee620/dd) |
