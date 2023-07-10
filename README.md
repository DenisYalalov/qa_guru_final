# Проект по автоматизации тестирования для компании [EDNA](https://edna.io/)

> EDNA — лидер в сфере мобильного информирования и текстовых коммуникаций в России, единственная в России IT-компания, которая имеет прямые контракты с Viber, Apple, WhatsApp, VK.
> ## **Содержание:**
____

* <a href="#tools">Технологии и инструменты</a>
* <a href="#cases">Примеры автоматизированных тест-кейсов</a>
* <a href="#jenkins">Сборка в Jenkins</a>
* <a href="#allure">Allure отчет</a>
* <a href="#allure-testops">Интеграция с Allure TestOps</a>
* <a href="#telegram">Уведомление в Telegram при помощи бота</a>
____

## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/Github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>   
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://qameta.io/"><img src="images/logo/Allure2.svg" width="50" height="50"  alt="Allure TestOps"/></a>   
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>   
</p>

____
<a id="cases"></a>

## <a name="Примеры автоматизированных тест-кейсов">**Примеры автоматизированных тест-кейсов:**</a>
____
- ✓ *ContactFormEdnaProgramPage - Проверяем основные элементы формы*
- ✓ *ContactFormPage -Проверяем основные элементы формы далее Проверяем основные элементы  на обязательное заполнение полей*
- ✓ *MainPage - Переключаем язык на Индонезийский и проверяем, что язык переключился*
- ✓ *NewsOutput - Проверяем что вывелось больше новостей*
- ✓ *ResourcesPage - Проверяем, что выводятся новые ресурсы'*
- ✓ *SearchPage - Проверка результата положительного теста и произвольный набор символов негативного теста*
- ✓ *Поиск несуществующей строки в разделе 'Компания'*
____
<a id="jenkins"></a>

## <img alt="Jenkins" height="25" src="images/logo/Jenkins.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/qa_guru_final.D.Y_/)</a>
____

<p align="center">  
<a href="https://jenkins.autotests.cloud/job/qa_guru_final.D.Y_/"><img src="images/jenkinsMainPage.png" alt="Jenkins" width="950"/></a>  
</p>

### **Параметры сборки в Jenkins:**

- *browser (браузер, по умолчанию chrome)*
- *browserVersion (версия браузера, по умолчанию 100.0)*
- *browserSize (размер окна браузера, по умолчанию 1920x1080)*
### *Основная страница отчёта*
<p align="center">  
<img title="Allure Overview Dashboard" src="images/ALLUREREPORT.png" width="850">  
</p>

### *Тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="images/TestCaseUi.png" width="850">  
</p>

### *Основная страница отчёта API*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/AllureReportApi.png" width="850">  
</p>


### *Тест-кейсы API*
<p align="center">  
<img title="Allure Tests" src="images/TestCaseAPI.png" width="850">  
</p>

____

<a id="allure-testops"></a>
## <img alt="Allure" height="25" src="images/logo/Allure2.svg" width="25"/></a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/3468/dashboards">Allure TestOps</a>
____

### *Allure TestOps Dashboard*

<p align="center">  
<img title="Allure TestOps Dashboard" src="images/IntegrationAllureRep.png" width="850">  
</p>

### *Авто тест-кейсы*

<p align="center">  
<img title="Allure TestOps Tests" src="images/TestCaseAllureAuto.png" width="850">  
</p>

____

<a id="telegram"></a>

## <img alt="Allure" height="25" src="images/logo/Telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота
____

<p align="center">  
<img title="Allure Overview Dashboard" src="images/telegramAllure.png" width="550">  
</p>



