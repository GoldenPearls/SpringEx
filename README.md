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

<!-- AOP에 관한 내용 -->
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

<!-- 스프링을 쓰게 된 계기 이유-->
<details><summary style="color:skyblue"> 스프링을 쓰는 이유 관련</summary>

<details><summary style="color:skyblue"> 프레임 워크의 중요</summary>

  > 💡 프레임워크는 말 그대로 뼈대나 근간을 이루는 코드들의 묶음으로 개발자 능력에 따라 결과 역시 큰 차이를 낳는데 이런상황을 극복하기 위해 나온 것이 프레임워크다. 프레임워크를 이용한다는 것은 프로그램의 기본 흐름이나 구조를 정하고, 모든 팀원이 이 구조에 자신의 코드를 추가하는 방식

즉, 프레임워크의 최대 장점은 개발에 필요한 구조를 이미 코드로 만들어 놓았기 때문에, 실력이 부족한 개발자라 해도 반쯤 완성된 상태에서 필요한 부분을 조립하는 형태의 개발이 가능
</details>

<details><summary style="color:skyblue"> 나오게 된 계기</summary>

> 💡 2000년대 초반부터 시작된 엔터프라이즈급의 개발은 안정된 품질의 개발이 절실했고, 그 결과 많은 프레임워크의 전성시대

spring은 가장 성공한 경량 프레임워크이다.
경량 프레임워크
90년대 말에 복잡한 구동 환경과 하드웨어적인 구성이 필요한 프레임워크의 반대되는 개념으로 등장
특정 기능을 위주로 간단한 jar 파일 등을 이용해서 모든 개발이 가능하도록 구성된 프레임워크
클라이언트 중심, 모바일 중심, Light weight, 생산성, 안전성, 다양한 개발 언어
</details>

<details><summary style="color:skyblue"> 그렇다면 그 많은 것 중에 왜 성공했을까?</summary>
  
1. 복잡함에 반기를 들어서 만들어진 프레임워크로 일반적으로 java클래스와 인터페이스를 이용하는 구조이기 때문에 진입장벽이 높지 않았기 때문이다.
2. 프로젝트의 전체 구조를 설계할 때 유용한 프레임워크로 스프링은 어느 한 분야에 집중하지 않고, 전체를 설계하는 용도로 사용하며 근본적인 사상 자체가 OOP 구조를 뒷받침하고 구조를 설계하는 사상
3. 다른 프레임워크들의 포용으로 다른 프레임워크들은 특정 프레임워크를 채택하면 해당 영역 전체를 수정해야 하는 고질적인 문제가 있으나, 스프링은 다른 프레임워크들과의 통합 지원했기 때문에 최소한의 수정이 가능했다. 스프링의 최대 장점은 기본 뼈대가 흔들지 않고 여러 종류의 프레임워크 혼용해서 사용 가능
4. 개발 생산성과 개발도구의 지원으로 플러그인도 빠른 업데이트 되었기에 별도의 개발도구에 적응 없이도 개발 가능
</details>

<details><summary style="color:skyblue"> 그렇다면 스프링의 특징은..?</summary>
  
1. 제어 역행(IoC, Inversion of Control) 기술
- 이용해 애플리케이션 간의 느슨한 결합을 제어함
2. 의존성 주입(DI, Dependency Injection) 을 통한 객체 간의 관계 구성
- 의존성(dependency)
    - 하나의 객체가 다른 객체 없이 제대로 된 역할을 할 수 없는 것을 말한다.
    - 하나의 객체가 다른 객체의 상태에 따라 영향을 받는 것을 의미
- 주입(Injection)
    - 말 그대로 외부에서 밀어 넣는 것
- 의존성 주입
    - 어떤 객체가 필요한 객체를 외부에서 밀어 넣는다.
- **왜 사용하는 걸까?**
    - 주입을 받는 입장에서는 어떤 객체인지 신경 쓸 필요가 없다.
    - 어떤 객체를 의존하든 자신의 역할은 변하지 않는다.
    - 스프링은 이러한 구조를 만드는데 적합한 구조로 설계되어 있다.
    - `ApplicationContext`라는 존재가 필요한 객체 생성하고 필요한 객체 주입시켜줌
    - `ApplicationContext` 이 관리하는 객체는 빈(bean)이라고 부름

3. 영속성과 관련된 다양한 서비스를 지원함

4. 수 많은 라이브러리와의 연동 기능을 지원함

5. APO의 지원

- 반복적인 코드를 줄이고 핵심 비즈니스 로직에만 집중할 수 있게 해줌
- APO 지원 관련은 여기서 적어둠

6. 트랜잭션의 지원

- 스프링은 이런 트랜잭션의 관리를 어노테이션이나 XML로 설정할 수 있기 때문에 매번 맞는 코드 작성 할 필요 없

7. POJO 방식 프레임워크

- 내부에는 `객체 간의 관계`를 구성할 수 있는 특징을 지님
- 다른 프레임워크와 달리 이 관계 구성 시 **별도의 API를 사용하지 않는** POJO(Plan Old Java Object)의 구성이 가능하도록 제작
- 즉, 일반적인 Java 코드를 이용해서 객체 구성하는 방식을 그대로 스프링에서 사용 가능
- 코드를 개발 시 개발자가 특정 라이브러리나 컨테이너의 기술에 종속적이지 않기 때문에, 생산성에도 유리하고, 코드에 대한 테스트 작업 역시 좀 더 유연하다.

</details>
</details>

<details><summary style="color:skyblue"> 스프링과 톰캣</summary>

> 💡 스프링은 **비즈니스 로직과 데이터 액세스를 처리**하고, 톰캣은 **사용자 요청을 받아서 애플리케이션과 상호 작용해 동적인 웹 페이지를 제공해.** 스프링은 서비스 레이어에서 비즈니스 로직을 구현하고, DAO 패턴을 이용해 데이터베이스와의 상호 작용을 캡슐화해. 이렇게 역할을 분리해서 서버를 운영하면 애플리케이션의 유지 보수성과 확장성을 향상시킬 수 있어.

<details><summary style="color:skyblue"> 스프링</summary>

1. 비즈니스 로직
- 스프링은 비즈니스 로직을 담당
- 비즈니스 로직은 애플리케이션의 핵심 로직으로 데이터 처리, 계산, 비즈니스 규칙 적용 등을 포함합니다. 스프링은 이러한 비즈니스 로직을 모듈화하고 추상화하여 높은 수준의 유연성과 재사용성을 제공합니다. 스프링은 일반적으로 서비스(Service) 레이어에서 비즈니스 로직을 구현하는 데 사용됩니다.

2. DAO(Data Access Object)
- 스프링은 데이터베이스와의 상호 작용을 담당하는 DAO 패턴을 구현하는 데 도움을 줍니다.
- DAO는 데이터베이스와의 CRUD(Create, Read, Update, Delete) 연산을 추상화하여 데이터 액세스를 캡슐화합니다.
- 이렇게 하면 비즈니스 로직에서 데이터베이스 액세스와 관련된 세부 사항을 분리할 수 있습니다.
- 스프링은 일반적으로 DAO 패턴을 사용하여 데이터 액세스 계층을 구현하는 데 사용됩니다. 
</details>

<details><summary style="color:skyblue"> 톰캣</summary>

1. 사용자 요청 처리
- 톰캣은 웹 서버(WEB Server)와 서블릿 컨테이너(Servlet Container)의 기능을 제공합니다.
- 사용자가 웹 브라우저를 통해 애플리케이션에 접속하면, 톰캣은 해당 요청을 받아서 처리합니다.
- 톰캣은 정적인 웹 페이지와 동적인 서블릿, JSP(JavaServer Pages) 등을 처리하여 사용자에게 응답을 제공합니다.
- 톰캣은 스프링의 비즈니스 로직과 DAO와는 직접적인 관련이 없으며, 단지 사용자의 요청을 받고 애플리케이션과 상호 작용하는 역할을 담당합니다.

</details>
</details>

<details><summary style="color:skyblue"> Bean</summary>

<details><summary style="color:skyblue"> Bean이란</summary>

> 💡 스프링 프레임워크에서 빈은 객체의 인스턴스를 의미한다. 스프링은 객체 지향 프로그래밍의 기본 원칙에 따라 작성된 클래스의 인스턴스를 생성하고 관리하는데 이러한 **인스턴스를 빈**이라고 하며, Bean은 스프링에서 사용하는 POJO 기반 객체다. 
> 스프링 컨테이너는 애플리케이션에서 필요한 빈 객체를 생성하고, 관리하며, 필요한 시점 제공해준다. 빈은 스프링의 IoC 컨테이너의 핵심 개념 중 하나이며, 컨테이너에 의해 생성되고 관리되기 때문에 객체의 생명주기와 의존성 주입등을 효율적으로 관리할 수 있다. 
>
> 스프링에서 빈은 주로 `XML 설정 파일이나 Java Config` 등을 통해 정의하고, 애플리케이션에서 필요한 위치에서 이 빈을 사용하게 된다. 빈은 대부분의 경우 싱글톤으로 생성되어 애플리케이션 전반에 걸쳐 하나의 인스턴스만 유지한다. 그 이유는 **싱글톤 패턴처럼 특정 타입의 Bean을 딱 하나만 만들고 모두 공유해서 사용하기 위함이다**
           
</details>

<details><summary style="color:skyblue">Bean Scope 종류</summary>

  > Bean Scope란? Bean의 사용범위를 말한다. 그리고 request, session, global session은 MVC 웹 어플리케이션에만 사용함
  
1. sigleton
: 해당 Bean에 대해 IoC컨테이너에서 `단 하나의 객체`로만 존재한다. 가장 많이 사용

2. prototype
:  해당 Bean에 대해 `다수의 객체`가 존재할 수 있다.

3. request
: 해당 Bean에 대해 `하나의 HTTP Request의 라이프사이클`에서 단 하나의 객체로만 존재한다.

4. session
: 해당 Bean에 대해 하나의 HTTP Session의 라이플사이클에서 단 하나의 객체로만 존재

5. global session
: 해당 Bean에 대해 하나의 Golbal HTTP Session의 라이프사이클에서 단 하나의 객체로만 존재한다.

> Scope들은 Bean으로 등록하는 클래스에 어노테이션으로 설정해줄 수 있다.

```java
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
 
@Scope("prototype")
@Component
public class UserController {
}
```
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
