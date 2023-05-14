# otus-qa-kotlin-hw
## Научиться работать с основными конструкциями языка и применять их на практике.

### Описание/Пошаговая инструкция выполнения домашнего задания:
Дан интерфейс interface TestRunner { fun  runTest(steps: T, test: () -> Unit) }. Класс, передаваемый в steps,
содержит методы before*/after*, которые задают предусловия/чистят данные перед/после теста.
Напишите свою реализацию интерфейса TestRunner, а именно:

1. OK Создайте класс реализующий интерфейс
2. OK Внутри класса переопределите метод runTest
3. ОК Внутри этого метода необходимо сначала вызвать методы с before* из steps,
   далее прогнать тест (запустить передаваемую функцию test), и после вызвать методы с after* из steps.
4. ОК Вызовы before* и after* нужно обернуть в лог/печать в консоль.
5. ОК Проверьте работоспособность написанного кода (можно в методе main).
   Код залейте на github. Название репозитория - otus-qa-kotlin-hw, ветка hw01-testrunner.
   В ДЗ отправьте ссылку на pull request.
   Вам потребуется 90-120 минут на выполнения задания.
   Если возникнут сложности, вы всегда можете обсудить их с одногруппниками или задать вопрос преподавателю Slack

### Критерии приемки:

1. ОК При вызове метода runTest сначала вызываются методы before, далее идет прогон теста, после вызываются методы after
2. ОК Начало и конец каждого шага (пред/постусловия, тест) логируется/выводится в консоль

### Комментарии к ДЗ:
1. Все пункты ДЗ 1 выполнены - задание принято
Однако можно усовершенствовать код, усложнить и применить DSL:
2. build.gradle.kts отсутствует в GitHub, рекомендуется:
   1.1 Поставить последнюю стабильную https://www.jetbrains.com/ru-ru/idea/ Community Edition (Free)
   1.2 setup далее, далее , далее ...
   1.3 создать новый проект (теперь взять ветку из Git)
3. package лучше создавать, желательно писать комментарии, -  добавлен наставником package hw1
4. Kotlin позволяет писать более компактный код - начало предложено наставником (см по тексту)
5. Можно использовать DSL,- добавлен наставником простейший с вызовом в Main
6. Тестовые данные можно усложнить и проверить вызов пустого класса, вызов не по порядку, разное кол-во итд - Добавлено
7. Можно упростить и укоротить программу и прислать еще раз при желании на проверку с учетом 1-5


### Результат прогона кода слушателя:

========First Student================
Starting execution of method beforeAll
Before All
Ended execution of method beforeAll
Starting execution of method beforeEach
Before each test
Ended execution of method beforeEach
FirstTest func execution
Starting execution of method afterAll
After All
Ended execution of method afterAll
Starting execution of method afterEach
After each test
Ended execution of method afterEach

### Результат прогона кода с предлагаемыми изменениями:
========First DSL================
Starting execution of method beforeAll
Before All
Ended execution of method beforeAll
Starting execution of method beforeEach
Before each test
Ended execution of method beforeEach
§ invoke test FirstTest() RUNNING
Starting execution of method afterAll
After All
Ended execution of method afterAll
Starting execution of method afterEach
After each test
Ended execution of method afterEach
========SecondTest DSL================
Starting execution of method beforeAll
Before All
Ended execution of method beforeAll
Starting execution of method beforeEach
Before each test
Ended execution of method beforeEach
Starting execution of method beforeStart
Before Start
Ended execution of method beforeStart
§ invoke test SecondTest() RUNNING
Starting execution of method afterAll
After All
Ended execution of method afterAll
Starting execution of method afterEach
After each test
Ended execution of method afterEach
========Empty DSL================
§ invoke test EmptyTest() RUNNING

Process finished with exit code 0
