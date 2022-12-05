В данной документации при установках использовалась версии:
- Glassfish 4
- Java: 1.8.0_321 : [Link](https://mega.nz/file/6So2XYLB#sOhTcFXjavsLmitXU9flreFO5BoTu8YlJrJS9BgpYeo)

Дополнительная информация по Java:

    Java(TM) SE Runtime Environment (build 1.8.0_321-b07)
    Java HotSpot(TM) 64-Bit Server VM (build 25.321-b07, mixed mode)


## Установка и настройка JetBrain IntelliJ IDEA

- Скачать и разархивировать Glassfish: [Link](https://mega.nz/file/KHI0XbDT#4RzwBeyCo7KKHNs_qlYe2uMu-nItdN8jWQZToyXBPTg) 
- Перейти по пути `glassfish4` > `bin`
- Запустить файл `asadmin.bat`
  - если не запускается `asadmin.bat` то перейти по пути `glassfish4` > `glassfish` > `config` > 
  открыть в виде текстового файла `asenv.bat` > перейти в конец файла и написать команду `set AS_JAVA=Путь до версии JDK`
  - Пример: `set AS_JAVA=C:\Program Files\Java\jdk1.8.0_321`
- В открывшейся консоли написать команду `start-domain`
- Открыть браузер и в адресной строке написать `localhost:4848` для того чтобы перейти в админ-панель
- В меню слева прейти по пути `Resources` > `JDBC` > `JDBC Connection Pools` > `DnevnikPool` > Нажать `Ping` в открывшемся окне
- Если Ping прошёл удачно, то можно приступать к дальнейшей установке приложения `dnevnik`

## Установка приложения
- Установка приложения происходит в разделе `Applications` > кнопка `Deploy`.
- В открывшемся разделе нужно будет выбрать файл собранного приложения и его тип.

## Примечания

- Если при попытке `ping` происходит ошибка с неподдерживаемой аутентификацией, то возможно существует проблема с устаревшим драйвером подключения к базе данных.
Вы можете скачать более новый драйвер и поместить его в директорию `glassfish4\glassfish\modules` пример драйвера для бд PostgreSQL - `postgresql-42.5.0.jar`
- При прочих проблемах команды `ping` нужно уточнять самостоятельно причину проблемы. Возможно пользователю `dnevnik` не выдано право авторизации по паролю.