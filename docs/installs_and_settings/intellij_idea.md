## Установка и настройка JetBrain IntelliJ IDEA
В данной документации при установках использовалась версии:
- Java version 8 update 351 x64
- JDK 19.0.1 x64
- IntelliJ IDEA 2022.1.2 Ultimate | torrent: [magnet-link](magnet:?xt=urn:btih:9E7F9BEC6CEC3006D32478DFF69FA034487D2B6C&tr=http%3A%2F%2Fbt2.t-ru.org%2Fann%3Fmagnet&dn=JetBrains%20IntelliJ%20IDEA%20Ultimate%202022.1.2%20x64%20%5B2022%2C%20ENG%5D) 

### Установка
- Скачать и установить Java | [Link](https://www.java.com/ru/download/manual.jsp)
- Скачать и установить JDK | [Link](https://www.oracle.com/java/technologies/downloads/)
- Скачать и установить IntelliJ IDEA | [Link](https://www.jetbrains.com/idea/download/)
- Скачать и разархивировать ja-netfilter (активатор) | [Link](https://mega.nz/file/ST4SXL6T#bCNSYo9hCBYNPkYfk3VB9bP0U4QC1zB9-dOOYq8Vjss)
- Расположить папки IntelliJ IDEA и ja-netfilter-all в одном каталоге.
  (В папке `C:\Program Files\JetBrains\` должна быть и папка `IntelliJ IDEA 2022.1.2` и папка `ja-netfilter-all`)

### Активация IntelliJ IDEA
Активатор `ja-netfilter-all` позволяет активировать все среды разработок от компании JetBrains.
Потому достаточно найти самый актуальный активатор и выполнить через него активацию.
Обычно в комплекте с активатором (в его архиве) содержится файл `readme.txt` в котором указывается ссылка на сайт со всеми ключами активаций для всех сред.

  - Перейти в каталог `ja-netfilter-all` > `script`
  - Запустить файл `install-all-users.vbs` (с правами администратора)
  - Перейти по ссылке: https://jetbra.in/5d84466e31722979266057664941a71893322460 (может устареть или быть другой для конкретного активатора)
  - Выбрать любой доступный домен, и перейти по нему.
  - Среди списка IDE выбрать `IntelliJ IDEA` (ключ должен копироваться автоматически)
  - Открыть IntelliJ IDEA и вставить скопированный ключ
  - Активация должна быть успешной, но если ключ не подходит, необходимо искать другой активатор или сайт с ключами.

### Настройка
Перейти в раздел настроек IDE | `ctrl + alt + S`

- `Editor` > `Natural languages` и добавляете русский язык. (Для того чтобы не подчеркивались русские строки в переменных и т.п.)
- `Version Control` > `GitHub` добавляете ваш аккаунт. (Для того, чтобы вносить изменения в систему контроля версий проекта)

### Проверка работоспособности

- Создать тестовый проект с любым названием.
  - `Language` (_Java_), `Build system` (_IntelliJ_), JDK (_Которое устанавливали сами_)
  - Создать в папке `src` тестового проекта _Java Class_ c названием `Main`.
  - В классе Main разместить содержимое:

  
    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello, World!");
        }
    }

- Добавить конфигурацию запуска `Add Configuration` > `Add New` > `Application` 
  и указать в поле `Main class` файл созданного класс `Main`.
- Запустить тестовый проект кнопкой запуска или сочетанием клавиш `Shift + F10`
- Если после запуска в терминале отобразиться `Hello, World!` - среда разработки IDEA и Java настроены правильно.
- Удалить тестовый проект
