package com.example;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LessonService {

    private final List<Lesson> lessons = List.of(

        new Lesson(
            "mindset", "🧠",
            "Ты уже умеешь думать как программист",
            "You already think like a programmer",
            "Введение в философию",
            "Intro to the philosophy",
            """
            <p class="lead">Если ты дошёл до этой страницы — ты уже программист. Серьёзно. Просто ещё об этом не знаешь.</p>

            <p>Программирование — это не «выучить язык». Это <strong>умение разбить большую задачу на маленькие шаги</strong>. Этому ты научился ещё в детстве, когда собирал конструктор, готовил яичницу или объяснял бабушке, как открыть YouTube на телефоне.</p>

            <h3>Почему все боятся Java?</h3>
            <p>Потому что кто-то давно сказал, что это «сложный энтерпрайзный язык». И эту фразу повторили миллион раз. На деле Java — это:</p>
            <ul>
                <li>🦾 <strong>Надёжность</strong> — код, который не падает от случайной опечатки.</li>
                <li>🌍 <strong>Вездесущность</strong> — от Android-приложений до банковских систем и Minecraft.</li>
                <li>💼 <strong>Работа</strong> — вакансий в мире больше, чем на любом другом языке.</li>
            </ul>

            <blockquote>Ruby учит тебя кайфовать от кода. Java — кайфовать от того, что код не ломается через год.</blockquote>

            <p>Оба кайфа можно совмещать. Поехали.</p>
            """,
            """
            <p class="lead">If you got here, you're already a programmer. Seriously. You just don't know it yet.</p>

            <p>Programming is not «learning a language». It's <strong>breaking a big task into small steps</strong>. You learned it as a child, building Legos, making scrambled eggs, or explaining to your grandma how to open YouTube.</p>

            <h3>Why is everyone scared of Java?</h3>
            <p>Because someone long ago said it's «complex enterprise language». And the phrase got repeated a million times. In reality, Java is:</p>
            <ul>
                <li>🦾 <strong>Reliable</strong> — code that doesn't break from a typo.</li>
                <li>🌍 <strong>Everywhere</strong> — from Android apps to banking systems and Minecraft.</li>
                <li>💼 <strong>Career</strong> — more jobs worldwide than any other language.</li>
            </ul>

            <blockquote>Ruby teaches you to enjoy code. Java teaches you to enjoy code that doesn't break a year later.</blockquote>

            <p>You can combine both joys. Let's go.</p>
            """
        ),

        new Lesson(
            "hello-world", "☕",
            "Hello, World! — 5 секунд до первой победы",
            "Hello, World! — 5 seconds to your first win",
            "Первая программа на Java",
            "Your first Java program",
            """
            <p>Классика. Любой язык начинается с этой строчки. Java — не исключение.</p>

            <h3>Как запустить</h3>
            <ol>
                <li>Скачай <strong>JDK 17</strong> с сайта Oracle или Adoptium.</li>
                <li>Поставь <strong>IntelliJ IDEA Community</strong> — это бесплатно и красиво.</li>
                <li>Создай проект: <em>New Project → Java → Maven</em>.</li>
                <li>Вставь код ниже в файл <code>Main.java</code>.</li>
                <li>Нажми зелёный треугольник рядом с <code>main</code>.</li>
            </ol>

            <pre><code>public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, мир!");
    }
}</code></pre>

            <h3>Что тут происходит?</h3>
            <ul>
                <li><code>public class Main</code> — это твой класс. Всё в Java живёт внутри классов. Не пугайся, просто прими.</li>
                <li><code>public static void main</code> — точка входа. Java всегда ищет этот метод, чтобы начать выполнение.</li>
                <li><code>System.out.println</code> — «выведи это в консоль и перейди на новую строку».</li>
            </ul>

            <blockquote>Ты только что запустил программу на одном из самых мощных языков планеты. И это заняло меньше 10 секунд.</blockquote>

            <p>Дальше будет всё интереснее. Обещаю.</p>
            """,
            """
            <p>Classic. Every language begins with this line. Java — no exception.</p>

            <h3>How to run</h3>
            <ol>
                <li>Download <strong>JDK 17</strong> from Oracle or Adoptium.</li>
                <li>Install <strong>IntelliJ IDEA Community</strong> — free and beautiful.</li>
                <li>Create a project: <em>New Project → Java → Maven</em>.</li>
                <li>Paste the code below into <code>Main.java</code>.</li>
                <li>Press the green triangle next to <code>main</code>.</li>
            </ol>

            <pre><code>public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}</code></pre>

            <h3>What's happening?</h3>
            <ul>
                <li><code>public class Main</code> — your class. Everything in Java lives inside classes. Just accept it.</li>
                <li><code>public static void main</code> — the entry point. Java always looks for it to start.</li>
                <li><code>System.out.println</code> — «print this to console and go to a new line».</li>
            </ul>

            <blockquote>You just ran a program in one of the most powerful languages on the planet. In under 10 seconds.</blockquote>
            """),

        new Lesson(
            "variables", "📦",
            "Переменные — это подписанные коробки",
            "Variables — labeled boxes",
            "Как хранить данные",
            "How to store data",
            """
            <p>Переменная — это просто коробка с наклейкой. Ты кладёшь туда что-то и потом можешь достать. Вот и вся магия.</p>

            <h3>Три главные коробки</h3>
            <pre><code>int age = 25;              // целое число
double price = 19.99;      // число с точкой
String name = "Нормик";    // строка (текст)
boolean isCool = true;     // да/нет</code></pre>

            <h3>Почему Java требует указывать тип?</h3>
            <p>Потому что Java — надёжная. Если ты сказал, что в коробке лежит число — туда нельзя сунуть строку. Это спасает от 90% глупых ошибок.</p>

            <h3>Современный Java-стиль</h3>
            <p>Начиная с Java 10 можно писать <code>var</code> — Java сама поймёт тип по значению:</p>
            <pre><code>var age = 25;              // int
var name = "Нормик";       // String
var pi = 3.14;             // double</code></pre>

            <p>Это ближе к Ruby-ощущению: пишем меньше, делаем больше. Но под капотом всё та же строгость.</p>

            <h3>Склеиваем строки</h3>
            <pre><code>var name = "Нормик";
var age = 25;
System.out.println("Привет, " + name + "! Тебе " + age + " лет.");</code></pre>

            <blockquote>Переменные — это твой первый настоящий инструмент. Без них программа — просто Hello, World.</blockquote>
            """,
            """
            <p>A variable is just a labeled box. You put something in, you take it out. That's it.</p>

            <h3>Three main boxes</h3>
            <pre><code>int age = 25;              // integer
double price = 19.99;      // decimal
String name = "Normik";    // text
boolean isCool = true;     // yes/no</code></pre>

            <h3>Why does Java require a type?</h3>
            <p>Because Java is reliable. If you said it's a number — you can't shove a string in. Saves you from 90% of silly bugs.</p>

            <h3>Modern Java style</h3>
            <p>Since Java 10 you can use <code>var</code> — Java figures out the type:</p>
            <pre><code>var age = 25;              // int
var name = "Normik";       // String
var pi = 3.14;             // double</code></pre>
            """),

        new Lesson(
            "if-else", "🤔",
            "Учим программу думать",
            "Teaching your program to think",
            "Условия if/else",
            "Conditionals if/else",
            """
            <p>Программа без условий — это робот, который делает одно и то же. Скучно. Давай научим её принимать решения.</p>

            <pre><code>var age = 18;

if (age >= 18) {
    System.out.println("Проходи, ты взрослый.");
} else {
    System.out.println("Извини, приходи через пару лет.");
}</code></pre>

            <h3>Больше вариантов</h3>
            <pre><code>var score = 87;

if (score >= 90) {
    System.out.println("Отлично!");
} else if (score >= 70) {
    System.out.println("Хорошо.");
} else if (score >= 50) {
    System.out.println("Троечка.");
} else {
    System.out.println("Пересдача.");
}</code></pre>

            <h3>Логические операторы</h3>
            <ul>
                <li><code>&amp;&amp;</code> — И (оба условия верны)</li>
                <li><code>||</code> — ИЛИ (хотя бы одно верно)</li>
                <li><code>!</code> — НЕ (инвертирует)</li>
            </ul>
            <pre><code>if (age >= 18 &amp;&amp; hasTicket) {
    System.out.println("Заходи на концерт!");
}</code></pre>

            <h3>Современный switch (Java 17)</h3>
            <p>Красиво, без <code>break</code>, как в современных языках:</p>
            <pre><code>var day = "MON";

var type = switch (day) {
    case "SAT", "SUN" -&gt; "выходной";
    default -&gt; "рабочий";
};

System.out.println(type);</code></pre>

            <blockquote>С этого момента твоя программа перестаёт быть калькулятором и становится чем-то живым.</blockquote>
            """,
            """
            <p>A program without conditionals is a robot doing the same thing. Boring. Let's teach it to make decisions.</p>

            <pre><code>var age = 18;

if (age >= 18) {
    System.out.println("Come in, adult.");
} else {
    System.out.println("Sorry, come back in a couple of years.");
}</code></pre>

            <h3>Modern switch (Java 17)</h3>
            <pre><code>var day = "MON";

var type = switch (day) {
    case "SAT", "SUN" -&gt; "weekend";
    default -&gt; "workday";
};</code></pre>
            """),

        new Lesson(
            "loops", "🔁",
            "Циклы — не повторяйся",
            "Loops — don't repeat yourself",
            "for, while, for-each",
            "for, while, for-each",
            """
            <p>Программисты — ленивые люди. Если что-то нужно сделать 100 раз — они пишут цикл, а не 100 строк кода.</p>

            <h3>for — когда знаешь, сколько раз</h3>
            <pre><code>for (int i = 1; i &lt;= 5; i++) {
    System.out.println("Шаг номер " + i);
}</code></pre>

            <h3>while — когда не знаешь</h3>
            <pre><code>var energy = 100;

while (energy &gt; 0) {
    System.out.println("Работаю... энергии: " + energy);
    energy -= 20;
}
System.out.println("Перерыв!");</code></pre>

            <h3>for-each — красивый обход списка</h3>
            <pre><code>var fruits = java.util.List.of("яблоко", "банан", "вишня");

for (var fruit : fruits) {
    System.out.println("Я люблю " + fruit);
}</code></pre>
            <p>Читается почти как английский. Ruby-разработчики оценят.</p>

            <h3>Современный способ (Stream API)</h3>
            <p>Если хочется совсем кайфа — Java умеет функциональный стиль:</p>
            <pre><code>java.util.List.of("яблоко", "банан", "вишня")
    .forEach(f -&gt; System.out.println("Я люблю " + f));</code></pre>

            <blockquote>Это тот самый Ruby-дух: код читается как предложение. Java так тоже умеет.</blockquote>
            """,
            """
            <p>Programmers are lazy. If something must be done 100 times — they write a loop, not 100 lines.</p>

            <pre><code>for (int i = 1; i &lt;= 5; i++) {
    System.out.println("Step " + i);
}</code></pre>

            <h3>for-each — beautiful iteration</h3>
            <pre><code>var fruits = java.util.List.of("apple", "banana", "cherry");

for (var fruit : fruits) {
    System.out.println("I love " + fruit);
}</code></pre>

            <h3>Modern style (Stream API)</h3>
            <pre><code>java.util.List.of("apple", "banana", "cherry")
    .forEach(f -&gt; System.out.println("I love " + f));</code></pre>
            """),

        new Lesson(
            "methods", "🛠️",
            "Методы — твой конвейер",
            "Methods — your pipeline",
            "Разбиваем код на куски",
            "Split your code into pieces",
            """
            <p>Метод — это кусок кода с именем. Ты один раз его пишешь — и вызываешь когда захочешь. Как функция в Ruby, только с типами.</p>

            <pre><code>public class Main {
    public static void main(String[] args) {
        greet("Нормик");
        greet("Аня");
        var sum = add(2, 3);
        System.out.println("Сумма: " + sum);
    }

    static void greet(String name) {
        System.out.println("Привет, " + name + "!");
    }

    static int add(int a, int b) {
        return a + b;
    }
}</code></pre>

            <h3>Что тут важно</h3>
            <ul>
                <li><code>void</code> — метод ничего не возвращает, просто делает работу.</li>
                <li><code>int</code> перед <code>add</code> — метод возвращает число.</li>
                <li><code>return</code> — «вот результат, забирай».</li>
            </ul>

            <h3>Современный стиль: varargs</h3>
            <p>Хочешь принимать любое количество аргументов? Легко:</p>
            <pre><code>static int sum(int... numbers) {
    var total = 0;
    for (var n : numbers) total += n;
    return total;
}

// Вызов:
sum(1, 2, 3, 4, 5); // 15</code></pre>

            <blockquote>Методы — это то, что превращает твой код из каши в Lego. Мелкие кирпичики, из которых собирается что угодно.</blockquote>
            """,
            """
            <p>A method is a named piece of code. Write it once — call it whenever. Like a Ruby function, but typed.</p>

            <pre><code>public class Main {
    public static void main(String[] args) {
        greet("Normik");
        var sum = add(2, 3);
        System.out.println("Sum: " + sum);
    }

    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    static int add(int a, int b) {
        return a + b;
    }
}</code></pre>
            """),

        new Lesson(
            "classes", "🏗️",
            "Классы — почему ООП это не страшно",
            "Classes — why OOP isn't scary",
            "Объекты и классы",
            "Objects and classes",
            """
            <p>Слово «ООП» пугает. А на деле — это просто способ складывать данные и поведение в одну коробку.</p>

            <h3>Без классов (плохо)</h3>
            <pre><code>var dogName = "Рекс";
var dogAge = 3;
var dogBark = "Гав!";</code></pre>

            <h3>С классом (красиво)</h3>
            <pre><code>public class Dog {
    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void bark() {
        System.out.println(name + " говорит: Гав!");
    }
}

// Использование:
var rex = new Dog("Рекс", 3);
rex.bark();</code></pre>

            <h3>А зачем это всё?</h3>
            <p>Представь, у тебя 50 собак. Без классов ты заведёшь 150 переменных. С классом — просто список объектов:</p>
            <pre><code>var dogs = java.util.List.of(
    new Dog("Рекс", 3),
    new Dog("Бобик", 5),
    new Dog("Лайка", 2)
);

for (var dog : dogs) {
    dog.bark();
}</code></pre>

            <h3>Современный стиль: record</h3>
            <p>Java 16+ умеет делать короткие классы одной строкой:</p>
            <pre><code>public record Point(int x, int y) {}

var p = new Point(3, 5);
System.out.println(p.x()); // 3</code></pre>

            <blockquote>Классы — это способ думать о мире. Собака. Заказ. Пользователь. Как только ты начнёшь описывать мир через классы — Java станет понятнее.</blockquote>
            """,
            """
            <p>The word «OOP» is scary. But it's just a way to bundle data and behavior together.</p>

            <h3>Without classes (bad)</h3>
            <pre><code>var dogName = "Rex";
var dogAge = 3;</code></pre>

            <h3>With a class (beautiful)</h3>
            <pre><code>public class Dog {
    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void bark() {
        System.out.println(name + " says: Woof!");
    }
}

var rex = new Dog("Rex", 3);
rex.bark();</code></pre>

            <h3>Modern style: record</h3>
            <pre><code>public record Point(int x, int y) {}

var p = new Point(3, 5);
System.out.println(p.x()); // 3</code></pre>
            """),

        new Lesson(
            "spring-boot", "🚀",
            "Spring Boot — момент, когда Java становится кайфом",
            "Spring Boot — when Java becomes joy",
            "Финальный босс",
            "The final boss",
            """
            <p>Ты уже знаешь переменные, циклы, методы, классы. Пора сделать сайт. И тут на сцену выходит Spring Boot.</p>

            <p>Spring Boot — это фреймворк, который делает за тебя всю рутину: настраивает сервер, базу данных, обработку запросов. Ты пишешь только логику.</p>

            <h3>Как выглядит простой веб-эндпоинт</h3>
            <pre><code>@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Привет из Spring Boot!";
    }
}</code></pre>

            <p>Всё. Запустил — и по адресу <code>/hello</code> открывается страница. Никаких XML-конфигов, никакого ручного Tomcat. Он просто работает.</p>

            <h3>А теперь — то, что ты уже видел</h3>
            <p>Этот самый сайт, на котором ты сейчас читаешь этот урок, написан на Spring Boot. За всей красотой стоит:</p>
            <ul>
                <li>Роутинг — <code>@GetMapping</code></li>
                <li>Шаблоны — Thymeleaf</li>
                <li>Многоязычность — <code>messages_ru.properties</code></li>
                <li>Деплой — обычный JAR в Docker</li>
            </ul>

            <h3>Что дальше?</h3>
            <p>Ты прошёл главный путь. Теперь есть куча направлений:</p>
            <ul>
                <li>🗄️ База данных (Hibernate, JPA)</li>
                <li>🔐 Безопасность (Spring Security)</li>
                <li>📱 Android (на Java тоже пишут)</li>
                <li>🎮 Игры (libGDX, Minecraft-моды)</li>
                <li>🤖 Боты (Telegram, Discord на Java — красота)</li>
            </ul>

            <blockquote>Ты начал этот гайд с мыслью «Java — это страшно». Закончил — «Java — это кайф». Так и должно быть.</blockquote>

            <p>Удачи. И помни: лучший код — тот, который ты наконец запустил.</p>
            """,
            """
            <p>You already know variables, loops, methods, classes. Time to build a website. Enter Spring Boot.</p>

            <pre><code>@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }
}</code></pre>

            <h3>What's next?</h3>
            <ul>
                <li>🗄️ Databases (Hibernate, JPA)</li>
                <li>🔐 Security (Spring Security)</li>
                <li>📱 Android</li>
                <li>🎮 Games (libGDX, Minecraft mods)</li>
            </ul>

            <blockquote>You started with «Java is scary». Now it's «Java is joy». That's how it should be.</blockquote>
            """)
    );

    public List<Lesson> getAll() {
        return lessons;
    }

    public Optional<Lesson> findBySlug(String slug) {
        return lessons.stream().filter(l -> l.slug().equals(slug)).findFirst();
    }
}