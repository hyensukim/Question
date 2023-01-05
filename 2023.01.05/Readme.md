# 강사님 질문이요!
## 접근제어자
- test.class extneds access.class( access <- test)
- access.class 내 정의된 protected 멤버 변수(name1)를 test.class에서 사용하려고 하는데,
  사용이 되지 않고, static으로 선언된 name2 멤버 변수만 보입니다. 원래 protected 접근제어자인 변수는
  외부 패키지에 상속받은 클래스 내부에서 멤버변수에 static 상관없이 접근할 수 있는거 아닌가요?