## 브랜치별 확인

크론 표현식 생성 및 계산
http://www.cronmaker.com/

Spring Scheduler
스프링에서 간단하게 제공

Spring Quartz
다양한 기능들을 제공하나 제대로된 학습필요

* 참고 https://stackabuse.com/guide-to-quartz-with-spring-boot-job-scheduling-and-automation/
* folk by https://github.com/StackAbuse/spring-boot-quartz

---

1. Scheduler : 지정된 일정에 따라 Job 을 실행하는 역할 담당. 아래와 같은 작업 수행
    * Job, Trigger 관리
    * 실행 시점을 지정
    * 재시작
    * 중지
    * 삭제
2. Job : Quartz 에서 실행될 수 있는 코드 조각.
    * 스케쥴러에 의해 실행되며, 한번 실행 된 후에는 스케쥴러에 의해 삭제
    * JobDetail 로 정의하면 이를 통해 JobBuilder 가 생성
3. JobDetail : Job 을 실행시키기 위한 아래와 같은 정보 필요.
    * Job 이름
    * Job 파라미터인 JobDataMap
    * Job 실행시점 정보인 Trigger
4. Trigger : Job 이 실행될 시점을 지정하는 방법.
    * 일정주기, 특정 시각에 Job 을 실행하도록 지정
    * 주기나 조건 변경가능
    * 실행주기가 만료되거나 Job 이 더이상 실행되지 않아도 자동으로 삭제
5. JobDataMap : Job 을 동작시키는데 필요한 Parameter 정보
    * 날짜, 횟수 에 대한 정보
6. JobListener : Job 이 실행될때 이벤트 정보
    * Job 이 실행되기전, 중단, 실행 완료 후 각종 이벤트 등록가능