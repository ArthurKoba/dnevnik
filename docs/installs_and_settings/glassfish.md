В данной документации при установках использовалась версии:
- Java: 1.8.0_321 : [Link](https://mega.nz/file/6So2XYLB#sOhTcFXjavsLmitXU9flreFO5BoTu8YlJrJS9BgpYeo)
  - Java(TM) SE Runtime Environment (build 1.8.0_321-b07)
  - Java HotSpot(TM) 64-Bit Server VM (build 25.321-b07, mixed mode)
- Glassfish 4.0:

## Установка и настройка JetBrain IntelliJ IDEA

- Скачать и разархивировать Glassfish: [Link](https://mega.nz/file/KHI0XbDT#4RzwBeyCo7KKHNs_qlYe2uMu-nItdN8jWQZToyXBPTg) 
- Перейти по пути `glassfish4` > `bin` > `asadmin.bat`
  - если не запускается `asadmin.bat` то перейти по пути `glassfish4` > `glassfish` > `config` > открыть в виде текстового файла `asenv.bat` > спуститься в самый низ файла и написать команду `set AS_JAVA= Путь до версии JDK` > `Пример:(C:\Program Files\Java\jdk1.8.0_321)`
- В открывшейся консоли написать команду `start-domain`
- Открыть браузер и в адресной строке написать `localhost:4848`
- В меню слева прейти по пути `Resources` > `JDBC` > `JDBC Connection Pools` > `DnevnikPool` > `Нажать Ping в открывшемся окне`
- Если Ping прошёл удачно, то можно приступать к установке приложения `dnevnik`