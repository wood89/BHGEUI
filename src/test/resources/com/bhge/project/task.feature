Feature: Check google

@severity=blocker
Scenario: Check netBook category
  Given user opens "https://yandex.ru/"
  When user clicks on market button on yandex page
  And check "https://market.yandex.ru/" market site is opened
  And user chooses "Ноутбуки" category on market yandex page
  Then check netBook category is opened on "https://market.yandex.ru/catalog--noutbuki" url

#@severity=critical
#Scenario: Check if only Dell is listed.
#  Given check "Ноутбуки" category is opened on "https://market.yandex.ru/catalog--noutbuki" url
#  When user clicks on "Dell" generator on netBook market yandex page
#  And user sets "50000" on minimum value in the filter by price on netBook market yandex page
#  And user sets "150000" on maximum value in the filter by price on netBook market yandex page
#  And user clicks "По цене" sort button on netBook market yandex page
#  Then check if only Dell is listed on netBook market yandex page
#  Then results are displayed in ascending order on netBook market yandex page

#1. Зайти на yandex.ru
#
#2. Перейти в маркет, подраздел компьюеры -> ноутбуки.
#
#3. Сделай фильтрацию по производителю Dell.
#
#4. Сделай фильтр по цене от 50 000 до 150 000 рублей.
#
#5. Отфильтровать список по цене.
#
#6. Проверить, что резуьтаты выводятся по-возрастанию и в списке присутствует только Dell.