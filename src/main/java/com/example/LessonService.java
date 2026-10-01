package com.example;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class LessonService {

    private static Map<String, String> map(String ru, String en, String zhCn, String zhTw, String uk) {
        return Map.of(
            "ru", ru,
            "en", en,
            "zh_CN", zhCn,
            "zh_TW", zhTw,
            "uk", uk
        );
    }

    private final List<Lesson> lessons = List.of(

        new Lesson("mindset", "🧠",
            map(
                "Ты уже умеешь думать как программист",
                "You already think like a programmer",
                "你已经会像程序员一样思考了",
                "你已經會像程式設計師一樣思考了",
                "Ти вже вмієш думати як програміст"
            ),
            map(
                "Введение в философию",
                "Intro to the philosophy",
                "哲学导论",
                "哲學導論",
                "Вступ до філософії"
            ),
            map(
                """
                <p class="lead">Если ты дошёл до этой страницы — ты уже программист. Серьёзно. Просто ещё об этом не знаешь.</p>
                <p>Программирование — это не «выучить язык». Это <strong>умение разбить большую задачу на маленькие шаги</strong>. Этому ты научился ещё в детстве, когда собирал конструктор, готовил яичницу или объяснял бабушке, как открыть YouTube.</p>
                <h3>Почему все боятся Java?</h3>
                <p>Потому что кто-то давно сказал, что это «сложный энтерпрайзный язык». На деле Java — это надёжность, вездесущность (от Android до банков и Minecraft) и куча вакансий. Ruby учит кайфовать от кода. Java — кайфовать от того, что код не ломается через год.</p>
                <blockquote>Оба кайфа можно совмещать. Поехали.</blockquote>
                """,
                """
                <p class="lead">If you got here, you're already a programmer. Seriously. You just don't know it yet.</p>
                <p>Programming is not «learning a language». It's <strong>breaking a big task into small steps</strong>. You learned it as a child, building Legos, making scrambled eggs, or explaining to your grandma how to open YouTube.</p>
                <h3>Why is everyone scared of Java?</h3>
                <p>Because someone long ago said it's «complex enterprise language». In reality, Java is reliable, everywhere (from Android to banks to Minecraft), and there are tons of jobs. Ruby teaches you to enjoy code. Java teaches you to enjoy code that doesn't break a year later.</p>
                <blockquote>You can combine both joys. Let's go.</blockquote>
                """,
                """
                <p class="lead">如果你看到了这一页——你已经是个程序员了。真的。你只是还不知道而已。</p>
                <p>编程不是「学一门语言」，而是<strong>把大任务拆成小步骤的能力</strong>。你小时候搭积木、煎鸡蛋、教外婆开 YouTube 时就已经学会了。</p>
                <h3>为什么大家都怕 Java？</h3>
                <p>因为很久以前有人说它是「复杂的企业级语言」。实际上 Java 意味着可靠、无处不在（从安卓到银行到 Minecraft）和大量工作岗位。Ruby 教你享受代码。Java 教你享受一年后不会坏掉的代码。</p>
                <blockquote>两种快乐可以兼得。出发吧。</blockquote>
                """,
                """
                <p class="lead">如果你看到了這一頁——你已經是程式設計師了。真的。你只是還不知道而已。</p>
                <p>程式設計不是「學一門語言」，而是<strong>把大任務拆成小步驟的能力</strong>。你小時候組樂高、煎蛋、教奶奶開 YouTube 時就已經學會了。</p>
                <h3>為什麼大家都怕 Java？</h3>
                <p>因為很久以前有人說它是「複雜的企業級語言」。實際上 Java 意味著可靠、無處不在（從 Android 到銀行到 Minecraft）和大量工作崗位。Ruby 教你享受程式碼。Java 教你享受一年後不會壞掉的程式碼。</p>
                <blockquote>兩種快樂可以兼得。出發吧。</blockquote>
                """,
                """
                <p class="lead">Якщо ти дійшов до цієї сторінки — ти вже програміст. Серйозно. Просто ще про це не знаєш.</p>
                <p>Програмування — це не «вивчити мову». Це <strong>вміння розбити велику задачу на маленькі кроки</strong>. Цьому ти навчився ще в дитинстві, коли складав конструктор, готував яєчню або пояснював бабусі, як відкрити YouTube.</p>
                <h3>Чому всі бояться Java?</h3>
                <p>Бо хтось давно сказав, що це «складна ентерпрайзна мова». Насправді Java — це надійність, всюдисущість (від Android до банків і Minecraft) і купа вакансій. Ruby вчить кайфувати від коду. Java — кайфувати від того, що код не ламається через рік.</p>
                <blockquote>Обидва кайфи можна поєднувати. Поїхали.</blockquote>
                """
            )
        ),

        new Lesson("hello-world", "☕",
            map(
                "Hello, World! — 5 секунд до первой победы",
                "Hello, World! — 5 seconds to your first win",
                "Hello, World！—— 5 秒获得首次胜利",
                "Hello, World！—— 5 秒獲得首次勝利",
                "Hello, World! — 5 секунд до першої перемоги"
            ),
            map(
                "Первая программа на Java",
                "Your first Java program",
                "你的第一个 Java 程序",
                "你的第一個 Java 程式",
                "Перша програма на Java"
            ),
            map(
                """
                <p>Классика. Любой язык начинается с этой строчки. Java — не исключение.</p>
                <h3>Как запустить</h3>
                <ol>
                    <li>Скачай <strong>JDK 17</strong>.</li>
                    <li>Поставь <strong>IntelliJ IDEA Community</strong>.</li>
                    <li>Создай проект: <em>New Project → Java → Maven</em>.</li>
                    <li>Вставь код ниже в <code>Main.java</code> и нажми зелёный треугольник.</li>
                </ol>
                <pre><code>public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, мир!");
    }
}</code></pre>
                <h3>Что тут происходит?</h3>
                <ul>
                    <li><code>public class Main</code> — всё в Java живёт внутри классов.</li>
                    <li><code>public static void main</code> — точка входа, Java всегда ищет этот метод.</li>
                    <li><code>System.out.println</code> — «выведи это в консоль».</li>
                </ul>
                <blockquote>Ты только что запустил программу на одном из самых мощных языков планеты.</blockquote>
                """,
                """
                <p>Classic. Every language begins with this line. Java — no exception.</p>
                <h3>How to run</h3>
                <ol>
                    <li>Download <strong>JDK 17</strong>.</li>
                    <li>Install <strong>IntelliJ IDEA Community</strong>.</li>
                    <li>Create a project: <em>New Project → Java → Maven</em>.</li>
                    <li>Paste the code below into <code>Main.java</code> and press the green triangle.</li>
                </ol>
                <pre><code>public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}</code></pre>
                <h3>What's happening?</h3>
                <ul>
                    <li><code>public class Main</code> — everything in Java lives inside classes.</li>
                    <li><code>public static void main</code> — the entry point Java always looks for.</li>
                    <li><code>System.out.println</code> — «print this to console».</li>
                </ul>
                <blockquote>You just ran a program in one of the most powerful languages on the planet.</blockquote>
                """,
                """
                <p>经典。任何语言都从这一行开始。Java 也不例外。</p>
                <h3>如何运行</h3>
                <ol>
                    <li>下载 <strong>JDK 17</strong>。</li>
                    <li>安装 <strong>IntelliJ IDEA Community</strong>。</li>
                    <li>创建项目：<em>New Project → Java → Maven</em>。</li>
                    <li>把下面的代码粘到 <code>Main.java</code>，点击绿色三角形。</li>
                </ol>
                <pre><code>public class Main {
    public static void main(String[] args) {
        System.out.println("你好，世界！");
    }
}</code></pre>
                <h3>发生了什么？</h3>
                <ul>
                    <li><code>public class Main</code> — Java 里一切都活在类中。</li>
                    <li><code>public static void main</code> — 入口点，Java 总是找这个方法。</li>
                    <li><code>System.out.println</code> — 「把这段输出到控制台」。</li>
                </ul>
                <blockquote>你刚刚用地球上最强的语言之一跑起了程序。</blockquote>
                """,
                """
                <p>經典。任何語言都從這一行開始。Java 也不例外。</p>
                <h3>如何執行</h3>
                <ol>
                    <li>下載 <strong>JDK 17</strong>。</li>
                    <li>安裝 <strong>IntelliJ IDEA Community</strong>。</li>
                    <li>建立專案：<em>New Project → Java → Maven</em>。</li>
                    <li>把下面的程式碼貼到 <code>Main.java</code>，點擊綠色三角形。</li>
                </ol>
                <pre><code>public class Main {
    public static void main(String[] args) {
        System.out.println("你好，世界！");
    }
}</code></pre>
                <h3>發生了什麼？</h3>
                <ul>
                    <li><code>public class Main</code> — Java 裡一切都活在類別中。</li>
                    <li><code>public static void main</code> — 進入點，Java 總是找這個方法。</li>
                    <li><code>System.out.println</code> — 「把這段輸出到主控台」。</li>
                </ul>
                <blockquote>你剛剛用地球上最強的語言之一跑起了程式。</blockquote>
                """,
                """
                <p>Класика. Будь-яка мова починається з цього рядка. Java — не виняток.</p>
                <h3>Як запустити</h3>
                <ol>
                    <li>Завантаж <strong>JDK 17</strong>.</li>
                    <li>Встанови <strong>IntelliJ IDEA Community</strong>.</li>
                    <li>Створи проєкт: <em>New Project → Java → Maven</em>.</li>
                    <li>Встав код нижче у <code>Main.java</code> і натисни зелений трикутник.</li>
                </ol>
                <pre><code>public class Main {
    public static void main(String[] args) {
        System.out.println("Привіт, світе!");
    }
}</code></pre>
                <h3>Що тут відбувається?</h3>
                <ul>
                    <li><code>public class Main</code> — усе в Java живе всередині класів.</li>
                    <li><code>public static void main</code> — точка входу, Java завжди шукає цей метод.</li>
                    <li><code>System.out.println</code> — «виведи це в консоль».</li>
                </ul>
                <blockquote>Ти щойно запустив програму однією з найпотужніших мов планети.</blockquote>
                """
            )
        ),

        new Lesson("variables", "📦",
            map(
                "Переменные — это подписанные коробки",
                "Variables — labeled boxes",
                "变量 —— 带标签的盒子",
                "變數 —— 帶標籤的盒子",
                "Змінні — це підписані коробки"
            ),
            map(
                "Как хранить данные",
                "How to store data",
                "如何存储数据",
                "如何儲存資料",
                "Як зберігати дані"
            ),
            map(
                """
                <p>Переменная — это просто коробка с наклейкой. Ты кладёшь туда что-то и потом можешь достать.</p>
                <h3>Три главные коробки</h3>
                <pre><code>int age = 25;
double price = 19.99;
String name = "Нормик";
boolean isCool = true;</code></pre>
                <h3>Современный Java-стиль</h3>
                <p>С Java 10 можно писать <code>var</code> — Java сама поймёт тип:</p>
                <pre><code>var age = 25;
var name = "Нормик";
var pi = 3.14;</code></pre>
                <blockquote>Переменные — твой первый настоящий инструмент.</blockquote>
                """,
                """
                <p>A variable is just a labeled box. You put something in, you take it out.</p>
                <h3>Three main boxes</h3>
                <pre><code>int age = 25;
double price = 19.99;
String name = "Normik";
boolean isCool = true;</code></pre>
                <h3>Modern Java style</h3>
                <p>Since Java 10 you can use <code>var</code> — Java figures out the type:</p>
                <pre><code>var age = 25;
var name = "Normik";
var pi = 3.14;</code></pre>
                <blockquote>Variables are your first real tool.</blockquote>
                """,
                """
                <p>变量就是一个带标签的盒子。你放进去，然后拿出来。</p>
                <h3>三个主要盒子</h3>
                <pre><code>int age = 25;
double price = 19.99;
String name = "诺米克";
boolean isCool = true;</code></pre>
                <h3>现代 Java 风格</h3>
                <p>从 Java 10 起可以写 <code>var</code> —— Java 会自己推断类型：</p>
                <pre><code>var age = 25;
var name = "诺米克";
var pi = 3.14;</code></pre>
                <blockquote>变量是你的第一个真正的工具。</blockquote>
                """,
                """
                <p>變數就是一個帶標籤的盒子。你放進去，然後拿出來。</p>
                <h3>三個主要盒子</h3>
                <pre><code>int age = 25;
double price = 19.99;
String name = "諾米克";
boolean isCool = true;</code></pre>
                <h3>現代 Java 風格</h3>
                <p>從 Java 10 起可以寫 <code>var</code> —— Java 會自己推斷型別：</p>
                <pre><code>var age = 25;
var name = "諾米克";
var pi = 3.14;</code></pre>
                <blockquote>變數是你的第一個真正的工具。</blockquote>
                """,
                """
                <p>Змінна — це просто коробка з наліпкою. Ти кладеш туди щось і потім можеш дістати.</p>
                <h3>Три головні коробки</h3>
                <pre><code>int age = 25;
double price = 19.99;
String name = "Нормік";
boolean isCool = true;</code></pre>
                <h3>Сучасний Java-стиль</h3>
                <p>З Java 10 можна писати <code>var</code> — Java сама зрозуміє тип:</p>
                <pre><code>var age = 25;
var name = "Нормік";
var pi = 3.14;</code></pre>
                <blockquote>Змінні — твій перший справжній інструмент.</blockquote>
                """
            )
        ),

        new Lesson("if-else", "🤔",
            map(
                "Учим программу думать",
                "Teaching your program to think",
                "教程序思考",
                "教程式思考",
                "Вчимо програму думати"
            ),
            map(
                "Условия if/else",
                "Conditionals if/else",
                "条件语句 if/else",
                "條件語句 if/else",
                "Умови if/else"
            ),
            map(
                """
                <p>Программа без условий — это робот, который делает одно и то же. Скучно.</p>
                <pre><code>var age = 18;

if (age >= 18) {
    System.out.println("Проходи, ты взрослый.");
} else {
    System.out.println("Извини, приходи через пару лет.");
}</code></pre>
                <h3>Современный switch (Java 17)</h3>
                <pre><code>var day = "MON";

var type = switch (day) {
    case "SAT", "SUN" -> "выходной";
    default -> "рабочий";
};</code></pre>
                <blockquote>С этого момента твоя программа становится чем-то живым.</blockquote>
                """,
                """
                <p>A program without conditionals is a robot doing the same thing.</p>
                <pre><code>var age = 18;

if (age >= 18) {
    System.out.println("Come in, adult.");
} else {
    System.out.println("Sorry, come back in a couple of years.");
}</code></pre>
                <h3>Modern switch (Java 17)</h3>
                <pre><code>var day = "MON";

var type = switch (day) {
    case "SAT", "SUN" -> "weekend";
    default -> "workday";
};</code></pre>
                <blockquote>Your program is now alive.</blockquote>
                """,
                """
                <p>没有条件的程序就是重复做同一件事的机器人。无聊。</p>
                <pre><code>var age = 18;

if (age >= 18) {
    System.out.println("请进，你是成年人了。");
} else {
    System.out.println("抱歉，过两年再来吧。");
}</code></pre>
                <h3>现代 switch（Java 17）</h3>
                <pre><code>var day = "MON";

var type = switch (day) {
    case "SAT", "SUN" -> "周末";
    default -> "工作日";
};</code></pre>
                <blockquote>从这一刻起你的程序活了。</blockquote>
                """,
                """
                <p>沒有條件的程式就是重複做同一件事的機器人。無聊。</p>
                <pre><code>var age = 18;

if (age >= 18) {
    System.out.println("請進，你是成年人了。");
} else {
    System.out.println("抱歉，過兩年再來吧。");
}</code></pre>
                <h3>現代 switch（Java 17）</h3>
                <pre><code>var day = "MON";

var type = switch (day) {
    case "SAT", "SUN" -> "週末";
    default -> "工作日";
};</code></pre>
                <blockquote>從這一刻起你的程式活了。</blockquote>
                """,
                """
                <p>Програма без умов — це робот, який робить одне й те саме. Нудно.</p>
                <pre><code>var age = 18;

if (age >= 18) {
    System.out.println("Заходь, ти дорослий.");
} else {
    System.out.println("Вибач, приходь за пару років.");
}</code></pre>
                <h3>Сучасний switch (Java 17)</h3>
                <pre><code>var day = "MON";

var type = switch (day) {
    case "SAT", "SUN" -> "вихідний";
    default -> "робочий";
};</code></pre>
                <blockquote>З цього моменту твоя програма стає чимось живим.</blockquote>
                """
            )
        ),

        new Lesson("loops", "🔁",
            map(
                "Циклы — не повторяйся",
                "Loops — don't repeat yourself",
                "循环 —— 不要重复自己",
                "迴圈 —— 不要重複自己",
                "Цикли — не повторюйся"
            ),
            map(
                "for, while, for-each",
                "for, while, for-each",
                "for、while、for-each",
                "for、while、for-each",
                "for, while, for-each"
            ),
            map(
                """
                <p>Программисты — ленивые люди. Если что-то нужно сделать 100 раз — они пишут цикл.</p>
                <h3>for — когда знаешь, сколько раз</h3>
                <pre><code>for (int i = 1; i <= 5; i++) {
    System.out.println("Шаг номер " + i);
}</code></pre>
                <h3>for-each — красивый обход списка</h3>
                <pre><code>var fruits = java.util.List.of("яблоко", "банан", "вишня");

for (var fruit : fruits) {
    System.out.println("Я люблю " + fruit);
}</code></pre>
                <h3>Stream API — функциональный стиль</h3>
                <pre><code>java.util.List.of("яблоко", "банан", "вишня")
    .forEach(f -> System.out.println("Я люблю " + f));</code></pre>
                <blockquote>Это тот самый Ruby-дух: код читается как предложение.</blockquote>
                """,
                """
                <p>Programmers are lazy. If something must be done 100 times — they write a loop.</p>
                <h3>for — when you know how many times</h3>
                <pre><code>for (int i = 1; i <= 5; i++) {
    System.out.println("Step " + i);
}</code></pre>
                <h3>for-each — beautiful iteration</h3>
                <pre><code>var fruits = java.util.List.of("apple", "banana", "cherry");

for (var fruit : fruits) {
    System.out.println("I love " + fruit);
}</code></pre>
                <h3>Stream API — functional style</h3>
                <pre><code>java.util.List.of("apple", "banana", "cherry")
    .forEach(f -> System.out.println("I love " + f));</code></pre>
                <blockquote>That's the Ruby spirit: code reads like a sentence.</blockquote>
                """,
                """
                <p>程序员都是懒人。需要做 100 次的事——他们写循环。</p>
                <h3>for —— 当你知道次数</h3>
                <pre><code>for (int i = 1; i <= 5; i++) {
    System.out.println("第 " + i + " 步");
}</code></pre>
                <h3>for-each —— 优雅遍历列表</h3>
                <pre><code>var fruits = java.util.List.of("苹果", "香蕉", "樱桃");

for (var fruit : fruits) {
    System.out.println("我喜欢 " + fruit);
}</code></pre>
                <h3>Stream API —— 函数式风格</h3>
                <pre><code>java.util.List.of("苹果", "香蕉", "樱桃")
    .forEach(f -> System.out.println("我喜欢 " + f));</code></pre>
                <blockquote>这就是 Ruby 的精神：代码读起来像句子。</blockquote>
                """,
                """
                <p>程式設計師都是懶人。需要做 100 次的事——他們寫迴圈。</p>
                <h3>for —— 當你知道次數</h3>
                <pre><code>for (int i = 1; i <= 5; i++) {
    System.out.println("第 " + i + " 步");
}</code></pre>
                <h3>for-each —— 優雅走訪清單</h3>
                <pre><code>var fruits = java.util.List.of("蘋果", "香蕉", "櫻桃");

for (var fruit : fruits) {
    System.out.println("我喜歡 " + fruit);
}</code></pre>
                <h3>Stream API —— 函數式風格</h3>
                <pre><code>java.util.List.of("蘋果", "香蕉", "櫻桃")
    .forEach(f -> System.out.println("我喜歡 " + f));</code></pre>
                <blockquote>這就是 Ruby 的精神：程式碼讀起來像句子。</blockquote>
                """,
                """
                <p>Програмісти — ліниві люди. Якщо щось треба зробити 100 разів — вони пишуть цикл.</p>
                <h3>for — коли знаєш, скільки разів</h3>
                <pre><code>for (int i = 1; i <= 5; i++) {
    System.out.println("Крок " + i);
}</code></pre>
                <h3>for-each — гарний обхід списку</h3>
                <pre><code>var fruits = java.util.List.of("яблуко", "банан", "вишня");

for (var fruit : fruits) {
    System.out.println("Я люблю " + fruit);
}</code></pre>
                <h3>Stream API — функціональний стиль</h3>
                <pre><code>java.util.List.of("яблуко", "банан", "вишня")
    .forEach(f -> System.out.println("Я люблю " + f));</code></pre>
                <blockquote>Це той самий Ruby-дух: код читається як речення.</blockquote>
                """
            )
        ),

        new Lesson("methods", "🛠️",
            map(
                "Методы — твой конвейер",
                "Methods — your pipeline",
                "方法 —— 你的流水线",
                "方法 —— 你的流水線",
                "Методи — твій конвеєр"
            ),
            map(
                "Разбиваем код на куски",
                "Split your code into pieces",
                "把代码拆成小块",
                "把程式碼拆成小塊",
                "Розбиваємо код на шматки"
            ),
            map(
                """
                <p>Метод — это кусок кода с именем. Пишешь один раз — вызываешь когда хочешь.</p>
                <pre><code>public class Main {
    public static void main(String[] args) {
        greet("Нормик");
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
                <blockquote>Методы превращают код из каши в Lego.</blockquote>
                """,
                """
                <p>A method is a named piece of code. Write it once — call it whenever.</p>
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
                <blockquote>Methods turn code from porridge into Lego.</blockquote>
                """,
                """
                <p>方法就是一块有名字的代码。写一次，随时调用。</p>
                <pre><code>public class Main {
    public static void main(String[] args) {
        greet("诺米克");
        var sum = add(2, 3);
        System.out.println("和：" + sum);
    }

    static void greet(String name) {
        System.out.println("你好，" + name + "！");
    }

    static int add(int a, int b) {
        return a + b;
    }
}</code></pre>
                <blockquote>方法把代码从粥变成乐高。</blockquote>
                """,
                """
                <p>方法就是一塊有名字的程式碼。寫一次，隨時呼叫。</p>
                <pre><code>public class Main {
    public static void main(String[] args) {
        greet("諾米克");
        var sum = add(2, 3);
        System.out.println("和：" + sum);
    }

    static void greet(String name) {
        System.out.println("你好，" + name + "！");
    }

    static int add(int a, int b) {
        return a + b;
    }
}</code></pre>
                <blockquote>方法把程式碼從粥變成樂高。</blockquote>
                """,
                """
                <p>Метод — це шматок коду з іменем. Пишеш один раз — викликаєш коли захочеш.</p>
                <pre><code>public class Main {
    public static void main(String[] args) {
        greet("Нормік");
        var sum = add(2, 3);
        System.out.println("Сума: " + sum);
    }

    static void greet(String name) {
        System.out.println("Привіт, " + name + "!");
    }

    static int add(int a, int b) {
        return a + b;
    }
}</code></pre>
                <blockquote>Методи перетворюють код з каші на Lego.</blockquote>
                """
            )
        ),

        new Lesson("classes", "🏗️",
            map(
                "Классы — почему ООП это не страшно",
                "Classes — why OOP isn't scary",
                "类 —— 为什么面向对象不可怕",
                "類別 —— 為什麼物件導向不可怕",
                "Класи — чому ООП це не страшно"
            ),
            map(
                "Объекты и классы",
                "Objects and classes",
                "对象与类",
                "物件與類別",
                "Об'єкти та класи"
            ),
            map(
                """
                <p>Слово «ООП» пугает. А на деле — это просто способ складывать данные и поведение в одну коробку.</p>
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

var rex = new Dog("Рекс", 3);
rex.bark();</code></pre>
                <h3>Современный стиль: record</h3>
                <pre><code>public record Point(int x, int y) {}

var p = new Point(3, 5);
System.out.println(p.x());</code></pre>
                <blockquote>Классы — способ думать о мире.</blockquote>
                """,
                """
                <p>The word «OOP» is scary. But it's just a way to bundle data and behavior together.</p>
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
System.out.println(p.x());</code></pre>
                <blockquote>Classes are a way of thinking about the world.</blockquote>
                """,
                """
                <p>「面向对象」听起来很吓人。其实它只是把数据和行为装进一个盒子的方法。</p>
                <pre><code>public class Dog {
    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void bark() {
        System.out.println(name + " 说：汪！");
    }
}

var rex = new Dog("雷克斯", 3);
rex.bark();</code></pre>
                <h3>现代风格：record</h3>
                <pre><code>public record Point(int x, int y) {}

var p = new Point(3, 5);
System.out.println(p.x());</code></pre>
                <blockquote>类是一种思考世界的方式。</blockquote>
                """,
                """
                <p>「物件導向」聽起來很嚇人。其實它只是把資料和行為裝進一個盒子的方法。</p>
                <pre><code>public class Dog {
    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void bark() {
        System.out.println(name + " 說：汪！");
    }
}

var rex = new Dog("雷克斯", 3);
rex.bark();</code></pre>
                <h3>現代風格：record</h3>
                <pre><code>public record Point(int x, int y) {}

var p = new Point(3, 5);
System.out.println(p.x());</code></pre>
                <blockquote>類別是一種思考世界的方式。</blockquote>
                """,
                """
                <p>Слово «ООП» лякає. А насправді — це просто спосіб скласти дані й поведінку в одну коробку.</p>
                <pre><code>public class Dog {
    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void bark() {
        System.out.println(name + " каже: Гав!");
    }
}

var rex = new Dog("Рекс", 3);
rex.bark();</code></pre>
                <h3>Сучасний стиль: record</h3>
                <pre><code>public record Point(int x, int y) {}

var p = new Point(3, 5);
System.out.println(p.x());</code></pre>
                <blockquote>Класи — спосіб думати про світ.</blockquote>
                """
            )
        ),

        new Lesson("spring-boot", "🚀",
            map(
                "Spring Boot — момент, когда Java становится кайфом",
                "Spring Boot — when Java becomes joy",
                "Spring Boot —— Java 变成快乐的时刻",
                "Spring Boot —— Java 變成快樂的時刻",
                "Spring Boot — момент, коли Java стає кайфом"
            ),
            map(
                "Финальный босс",
                "The final boss",
                "最终 boss",
                "最終 boss",
                "Фінальний бос"
            ),
            map(
                """
                <p>Ты уже знаешь переменные, циклы, методы, классы. Пора сделать сайт. На сцену выходит Spring Boot.</p>
                <p>Spring Boot делает за тебя всю рутину: настраивает сервер, базу данных, обработку запросов. Ты пишешь только логику.</p>
                <pre><code>@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Привет из Spring Boot!";
    }
}</code></pre>
                <p>Всё. Запустил — и по адресу <code>/hello</code> открывается страница.</p>
                <blockquote>Ты начал этот гайд с мыслью «Java — это страшно». Закончил — «Java — это кайф».</blockquote>
                <p>Удачи. Лучший код — тот, который ты наконец запустил.</p>
                """,
                """
                <p>You already know variables, loops, methods, classes. Time to build a website. Enter Spring Boot.</p>
                <p>Spring Boot does all the boring stuff for you: sets up the server, database, request handling. You just write logic.</p>
                <pre><code>@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }
}</code></pre>
                <p>Done. You run it — and <code>/hello</code> opens a page.</p>
                <blockquote>You started with «Java is scary». Now it's «Java is joy».</blockquote>
                <p>Good luck. The best code is the code you finally ran.</p>
                """,
                """
                <p>你已经掌握了变量、循环、方法、类。是时候做个网站了。Spring Boot 登场。</p>
                <p>Spring Boot 替你处理所有琐事：配置服务器、数据库、请求处理。你只需要写逻辑。</p>
                <pre><code>@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "来自 Spring Boot 的问候！";
    }
}</code></pre>
                <p>就这样。一运行——<code>/hello</code> 就打开一个页面。</p>
                <blockquote>你带着「Java 很可怕」开始这份指南。现在变成「Java 很快乐」。</blockquote>
                <p>祝你好运。最好的代码，是你最终跑起来的那段。</p>
                """,
                """
                <p>你已經掌握了變數、迴圈、方法、類別。是時候做個網站了。Spring Boot 登場。</p>
                <p>Spring Boot 替你處理所有雜事：設定伺服器、資料庫、請求處理。你只需要寫邏輯。</p>
                <pre><code>@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "來自 Spring Boot 的問候！";
    }
}</code></pre>
                <p>就這樣。一執行——<code>/hello</code> 就打開一個頁面。</p>
                <blockquote>你帶著「Java 很可怕」開始這份指南。現在變成「Java 很快樂」。</blockquote>
                <p>祝你好運。最好的程式碼，是你最終跑起來的那段。</p>
                """,
                """
                <p>Ти вже знаєш змінні, цикли, методи, класи. Час робити сайт. На сцену виходить Spring Boot.</p>
                <p>Spring Boot робить за тебе всю рутину: налаштовує сервер, базу даних, обробку запитів. Ти пишеш лише логіку.</p>
                <pre><code>@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Привіт зі Spring Boot!";
    }
}</code></pre>
                <p>Усе. Запустив — і за адресою <code>/hello</code> відкривається сторінка.</p>
                <blockquote>Ти почав цей гайд з думкою «Java — це страшно». Закінчив — «Java — це кайф».</blockquote>
                <p>Удачі. Найкращий код — той, який ти нарешті запустив.</p>
                """
            )
        )
    );

    public List<Lesson> getAll() {
        return lessons;
    }

    public Optional<Lesson> findBySlug(String slug) {
        return lessons.stream().filter(l -> l.slug().equals(slug)).findFirst();
    }
}