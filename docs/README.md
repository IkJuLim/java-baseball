## 기능 구현 목록

### 기능 흐름

- 플레이 시작되면 랜덤 숫자 생성
- 사용자 입력에 대한 평가(낫싱 / 스트라이크 / 볼 / 정답)
- 사용자 인터페이스
- 사용자의 정답 후 재시작 / 종료
- 잘못된 입력에 대한 예외 발생

### 패키지 별 기능 구현

- Controller
    - GameController
        - 전반적인 게임 실행 관리하는 기능
        - 게임 종료 후 다음 게임과 종료에 대한 분기 기능

- View
    - InputView
        - 사용자의 입력을 받는다.
    - OutputView
        - 게임에 관한 출력을 담당한다.

- Exception
    - IllegalInputNumberException
        - 사용자가 게임 플레이 중 잘못된 입력을 입력한 경우 발생시키는 예외
    - IllegalGameParameterException
        - 사용자가 게임 반복 관련 파라미터를 잘못 입력한 경우 발생시키는 예외

- Domain
    - ComputerNum
        - 컴퓨터의 랜덤 넘버
        - 사용자 입력에 대한 평가(낫싱 / 스트라이크 / 볼 / 정답) 기능
    - UserNum
        - 유저의 게임 넘버

- Util
    - StringNum2IntegerListParser
        - 사용자의 입력 문자열을 IntegerList로 파싱 하는 기능
        - 잘못된 입력에 대한 `IllegalArgumentException` 발생