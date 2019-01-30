Feature: Check google

@severity=blocker
Scenario: Check netBook category
  Given user opens "https://yandex.ru/"
  When user clicks on market button on yandex page
  And check "https://market.yandex.ru/" market site is opened
  And user chooses "Ноутбуки" category on market yandex page
  Then check "https://market.yandex.ru/catalog--noutbuki" market site is opened

@severity=critical
Scenario: Check if only Dell is listed.
  Given check "https://market.yandex.ru/catalog--noutbuki" market site is opened
  When user clicks on Dell generator on netBook market yandex page
  And user sets 50000 on minimum value in the filter by price on netBook market yandex page
  And user sets 150000 on maximum value in the filter by price on netBook market yandex page
  And user clicks 'по цене' sort button on netBook market yandex page
  Then check if only Dell is listed on netBook market yandex page
  And results are displayed in ascending order on netBook market yandex page