# BHGEUI

Running the tests
- mvn test

If you want to see test statistic, you need to use:
- mvn allure:serve

Test plan:

Scenario: Check laptop category
  - Given user opens "https://yandex.ru/"
  - When user clicks on market button on yandex page
  - And check "https://market.yandex.ru/" market site is opened
  - And user chooses "Ноутбуки" category on market yandex page
  - Then check "https://market.yandex.ru/catalog--noutbuki" market site is opened

Scenario: Check if only Dell is listed and displayed in ascending order.
  Given check "https://market.yandex.ru/catalog--noutbuki" market site is opened
  When user clicks on Dell generator on laptop market yandex page
  And user sets 50000 on minimum value in the filter by price on laptop market yandex page
  And user sets 150000 on maximum value in the filter by price on laptop market yandex page
  And user clicks 'по цене' sort button on laptop market yandex page
  Then check if only Dell is listed on laptop market yandex page
  And results are displayed in ascending order on laptop market yandex page


Задание 1:

1. Зайти на yandex.ru
2. Перейти в маркет, подраздел компьюеры -> ноутбуки.
3. Сделай фильтрацию по производителю Dell.
4. Сделай фильтр по цене от 50 000 до 150 000 рублей.
5. Отфильтровать список по цене.
6. Проверить, что резуьтаты выводятся по-возрастанию и в списке присутствует только Dell.

Сценарий выполнить с использованием Selenium WebDriver + BDD.
