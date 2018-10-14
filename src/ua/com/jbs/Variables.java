package ua.com.jbs;

public class Variables {

    public static void main(String[] args) {

        System.out.println("Урок 1. Переменные и операции с ними");

        System.out.println("В этом уроке приведены примеры кода, и комментарии.");
        System.out.println(" так что читаем комментарии");

        /* комментарии можно писать где угодно */

        // Объявление переменных
        // <тип> <имя переменной> ;
        // имена принято давать осмысленные, на английском языке, начиная с
        // маленькой буквы,
        // если в имени несколько слов, то каждое новой слово с большой буквы

        System.out.println("целое число от -128 до 127");
        byte byteValue;

        System.out.println("целое число от -32768 до 32767");
        short someShortValue;

        System.out.println("целое число от -2147483648 до 2147483647");
        int someIntVariable;

        // тоже целое число, только длинное.
        System.out.println("Принимает значения от -9223372036854775808 до 9223372036854775807");
        long myLongVariable;

        // число с с точкой, число с точкой хранит значения с определенной
        // точностью, потому надо быть с ними аккуратно, можно не досчитаться
        // последних цифр
        System.out.println("Пример объявление float");
        float f;

        // аналогично предыдущему. Число с точкой большего размера (аналогично
        // как long тоже что и int только большое, double ведет себя как float
        // только
        // большего размера)
        System.out.println("Пример объявление double");
        double doubleVariable;

        System.out.println("одна буква, просто буква, юникод символ");
        char letter;

        System.out.println("тип который принимает два значение true (правда) и false (неправда)");
        boolean trololo2;

        /**
         * если мы попытаемся вывести значение переменных, например
         * System.out.println(someVariable); то компилятор нам скажет, что
         * значение переменной должно быть переменной должно быть
         * проинициализированы перед использованием.
         */

        // Присвоим им значения.
        // Что бы записать значения в переменную используется символ =
        // <имя переменной> = <значение> ;
        // значение может быть просто числом
        byteValue = 2;
        someShortValue = 5;

        // теперь можно вывести значения этих переменных
        System.out.println(byteValue);
        System.out.println(someShortValue);

        // значение можно присвоить сразу при объявлении переменной, например
        // <тип> <имя> = <значение> ;
        int i = 9;
        System.out.println(i); // вывелось 9, значение присвоилось
        double d = 7;

        // так же значение можно задать в бинарном виде
        someShortValue = 0b0100110; // число 38 в двоичном виде
        System.out.println(someShortValue); // 38
        // или в шестнадцатеричном виде
        someShortValue = 0x0C5; // число 197 в двоичном виде
        System.out.println(someShortValue); // 197

        someIntVariable = 8;

        /*
         * если просто написать число, например 8, то но по умолчанию int,
         * потому если написать число 10000000000, то компилятор выдаст ошибку,
         * поскольку максимальное значение int 2147483647. Чтобы сделать его
         * long нужно дописать в конце букву l или L - это укажет компилятору,
         * что цифра типа long.
         */
        myLongVariable = 10000000000l;
        myLongVariable = 10000000000L;

        // можно сделать long любое целое число, например
        myLongVariable = 3L;
        // длинные числа можно сделать читабельней вставив в середину знак _
        // пример:
        myLongVariable = 10_000_000_000l;
        // или
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        // или
        long otherExample = 0b11010010_01101001_10010100_10010010;
        // то же можно делать и с другими типами
        int otherTypeExample = 45_15; // 4515

        doubleVariable = 8;
        doubleVariable = 8.5; // число 8 целых 5 десятых
        // буква d в конце указывает явно что число типа double
        doubleVariable = 8d;
        doubleVariable = 8.5d;
        // или
        doubleVariable = 8.5D;

        // присвоим число 123.4
        double d1 = 123.4;
        System.out.println(d1);
        // тоже число в научной нотации (после е идет на сколько порядков надо
        // сместить запятую)
        double d2 = 1.234e2;
        System.out.println(d2);

        // аналогично присвоим значение в float переменную
        f = 5;
        f = 5.7f; // буква f в конце указывает что число типа float
        f = 5.7F;
        // однако если мы напишем
        // f = 5.7;
        // то получим ошибку компиляции, потому что просто числа с точкой типа
        // 5.7 66.77 3.0
        // это числа типа double, потому надо явно указывать что они float

        // буква пишется в одинарных кавычках
        // тип char интерпретируется как unicode символы
        letter = 'w';

        // однако букве можно присвоить число
        letter = 55;
        System.out.println(letter); // вывелась цифра 7
        // Странно? Нет! Дело в том что 55 это код цифры 7
        // (http://book.itep.ru/10/ascii.htm)
        char символКопирайта = 169;
        System.out.println(символКопирайта); // знак копирайта
        // да-да-да имена переменных можно давать на любом языке
        // но так лучше не делать =)))

        // так же в char можна присваивать код символа в следующем формате

        letter = '\u0040'; //
        System.out.println(letter);

        // также есть спецсимволы, такие как табуляция или перевод строки
        // один начинаются с обратного слеша
        char enter = '\n'; // перевод строки
        char tab = '\t'; // табуляция
        // и так далее...

        // boolean принимает правду
        boolean flag = true;
        flag = false; // и неправду

        // =========================================================================
        // официальный источник (документация)
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        // =========================================================================

        // Теперь разберемся как присваиваются и взаимодействуют друг с друг эти
        // типы данных

        // объявим переменную типа int, и присвоим ей произвольное значение
        int big = 1234567890;
        // float это тип с плавающей запятой, и диапазон значений числа типа int
        // полностью влазит в float, потому мы модем присвоить их без проблем
        // однако число типа float хранит значения с определенной точностью
        float floatVariable = big;

        // float принимает гораздо больше значений чем int
        // например int не может принимать дробные значения
        // потому нельзя просто присвоить int в float
        //
        // Программист должен взять на себя ответственность, за то что
        // программа обрежет число, и явно указать тип в круглых скобках
        // пример:
        int testValue123 = (int) 15.7f;
        System.out.println("(int) 15.7f");
        System.out.println(testValue123);

        // вспомним про переменную big которую мы присвоили в float выше
        // присвоим её обратно назад в int, тут обрезание не происходит
        // потому что значения полностью помещается
        int value = (int) floatVariable;

        // однако мы видим, что значения отличается от исходного
        System.out.println(value);
        // оно отличается АЖ на 46!!!
        System.out.println("big - (int) floatVariable ");
        System.out.println(big - (int) floatVariable); // -46
        // это всё потому что числа с точкой хранят значения с определенной
        // точность, и как я писал выше, можно чего-то недосчитаться
        //
        // потому ВАЖНО: НЕЛЬЗЯ ИСПОЛЬЗОВАТЬ float и double для подсчета
        // денег!!!
        //
        // иначе кто-то обидеться

        // аналогичный пример с типами long и int
        // long больше int потому нельзя протос так присвоить long в int
        // надо явно указать тип, и возможно произойдет обрезание значения, если
        // оно не влезет
        long valLong = 8798465465487l;
        int valTrancated = (int) valLong;
        System.out.println("valTrancated");
        System.out.println(valTrancated);

        // в то время как int полностью влазит в long, такое присвоение можно
        // выполнять свободно
        int intVar = 10;
        long longVar = intVar;
        System.out.println("longVar");
        System.out.println(longVar);

        // ============================================
        /**
         * из примеров нетрудно вывести правило, можно присваивать меньшие
         * значение в большие при обратном присваивании надо явно указывать тип,
         */
        // ============================================

        char c = '1';
        // букву можно присвоить в int потому что char содержит код символа
        int ic = c;
        System.out.println("ic");
        System.out.println(ic);

        // в boolean можно присваивать только boolean

        /***********************************************/

        // Переменные мы объявили, теперь что можно с ними делать
        // первая операция суммирования
        int result = 1 + 2;
        int original_result = result;
        System.out.println("1 + 2 = " + result); // 3
        // результат ожидаемый - 3

        // НЮАНС!
        // как мы видим + также используется для объединения строк (только
        // строк, не букв)
        // при этом всё что идет после строки приводится к типу строки
        // (в данном случае строка "1 + 2 = " объединилась с числом 3, при это
        // число 3 привелось к типу строки
        // (как всё приводиться к строке в следующих уроках) )

        // ещё пример суммирования
        int one = 1;
        int two = 2;
        int three = one + two;
        System.out.println("one + two = " + three); // 3
        int qwerty = 4 + 999999;
        System.out.println("4 + 999999 = " + qwerty); // 1000003
        int testInt = 0;
        testInt += 5; // это выражение равносильно testInt = testInt + 5;
        // оно добавляем значение к указанной переменной, и присваивает в неё

        System.out.println("testInt = " + testInt);

        testInt += two;
        System.out.println("testInt + = two " + testInt);

        // не путать с testInt = +2; это просто присвоение положительного числа
        // 2
        // в данном случае + это не операция, а просто знак числа
        testInt = +2;
        System.out.println("testInt = +2 " + testInt);

        testInt++; // эта операция выполняет увеличение числа на 1 (просто + 1)
        System.out.println("testInt++ " + testInt);
        ++testInt; // и эта операция выполняет увеличение числа на 1
        System.out.println("++testInt " + testInt);

        // так какая между ними разница?
        int incremetTestValue = 0;
        int prefixForm = ++incremetTestValue;
        System.out.println("refixForm = ++incremetTestValue; " + prefixForm);
        System.out.println("incremetTestValue " + incremetTestValue);
        // вывелся в обоих случаях один, логично, операция увеличила значение
        // переменной incremetTestValue на 1,
        // а потом присвоила результат в prefixForm

        incremetTestValue = 0; // вернём 0
        int prostfixForm = incremetTestValue++;
        System.out.println("refixForm = incremetTestValue++; " + prostfixForm);
        System.out.println("incremetTestValue " + incremetTestValue);
        // тут incremetTestValue = 1, а prostfixForm = 0
        // почему же?
        // потому что при форме записи переменная = другаяПеременная++; сначала
        // переменной присваивается значение другой переменной, а только потом
        // значение другой переменной увеличивается

        int maxValue = 2147483647; // присвоим максимально допустимое значение
        // для типа int
        maxValue++;
        System.out.println("maxValue + 1 =" + maxValue);
        // результат -2147483648
        // такое значение потому что диапазон чисел int
        // -2147483648 ... 0 ... 2147483647
        // если к число прибавить 1, то оно станет на один больше (логично), и
        // так далее
        // пока не станет максимальным допустимым
        // если к максимальному допустимому числу добавить 1, то значение
        // переполняется и становиться минимальным допустимым для данного типа
        //
        // (короче если мы плюсуем один, то значение движется слева
        // на право (см. диапазон выше), доходит до конца и начинает с начала)

        // --------

        // операция отнимания аналогична операции суммирования, только наоборот
        // =))
        int val = 0;
        val = val - 1;
        System.out.println("0 - 1 = " + val); // -1
        int minusFive = -5; // присвоение отрицательного чиста, минут пять
        System.out.println("minusFive = " + minusFive); // -1

        int decrement = 1;
        // тут есть аналогичные опреации
        decrement--;
        System.out.println("decrement--; " + decrement);
        --decrement;
        System.out.println("--decrement; " + decrement);

        // все нюансы описанные для операции ++, справедливы и для --

        decrement -= 5;
        System.out.println("decrement -= 5; " + decrement);

        val = decrement - 7;

        System.out.println("val = decrement - 7; " + val);

        // так же сть операция умножения

        int r = 6 * 2;
        System.out.println(r);

        double v = 4;

        // при умножении результирующий тип тот который вмещает более значение,
        // тоесть если long умножить на int то выйдет long, а если double на int
        // то double
        double k = v * 2;
        int ik = (int) (v * 2);

        int z = 7;
        z *= 5; // равносильно z = z * 5;

        // следующей операцией является деление

        int a = 5 / 2;
        System.out.println("5 / 2 = " + a); // 2
        System.out.println("5.0 / 2 = " + 5.0 / 2); // 2.5
        System.out.println("5 / 2.0 = " + 5 / 2.0); // 2.5
        // тут как и с умножением, тип результата будет такое же как и тип с
        // наибольшим диапазоном значений среди используемых в выражении
        // тоесть если мы делим целое число на целое число, то получим тоже
        // целое число
        // (дробная часть просто отбрасывается, не округляется!!!)

        // float и double может принимать три интересных значения
        System.out.println(0f / 0f); // Nan (Not-a-number) - это значит
        // неопределённость
        System.out.println(1f / 0f); // Infinity - бесконечность
        System.out.println(-1f / 0f); // -Infinity - минус бесконечность
        // эти термины напрямую соотносятся с математикой, и применяются
        // исключительно в научных вычислениях
        // если будет интересно то вам сюда
        // (https://en.wikipedia.org/wiki/IEEE_754-1985)

        // последняя операция которую мы рассмотрим это остаток от деления
        // используется очень часто на практике

        int rez = 13 % 5;
        System.out.println("13 % 5 = " + rez);
        // если поделить 13 на 5, то получиться 2 целых части, и остаток 3

        System.out.println("12 % 5 = " + (12 % 5));
        System.out.println("11 % 5 = " + (11 % 5));
        System.out.println("15 % 5 = " + (15 % 5));

        double k2 = 12.3;
        k2 = k2 % 5;
        System.out.println("12.3 % 5 = " + k2);
        // результат 2.3000000000000007, потому что если 12.3 поделить на 5,
        // получиться 2 целых части, а остальное остаток
        // как вы думаете с чем связана семерка в конце?
        // как уже упоминалось выше связана она с тем что double как и float
        // хранят данные с определенной точностью, вот потеря точности и
        // вызывает
        // появление этих странных маленьких частей

        // всё просто =))

        // приоритет операций совпадает с правилами математики
        int fun = 1 + 1 + 1 + 1 + 1 + 1 + 1 * 0;
        System.out.println("1 + 1 + 1 + 1 + 1 + 1 + 1 * 0 = " + fun);

        // что бы изменить приоритет используются скобки
        fun = (1 + 1 + 1 + 1 + 1 + 1 + 1) * 0;
        System.out.println("(1 + 1 + 1 + 1 + 1 + 1 + 1) * 0 = " + fun);

        double divided = (fun + 7 + 9) / 2;
        System.out.println("(fun + 7 + 9) / 2 = " + divided);

        // Так же есть битовые опреации, но я не помню когда их последний раз с
        // числами
        // использовал, потому вот вам ссылочка
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op3.html
        // если будет нужно, всё можно подробненько почитать тут

        // Однако битовые опреации очень часто используются с типом boolean
        System.out.println("Есть такие операции как логическое или");
        // если или одно или другое правда, то результат правда
        // если представить true как 1, а ложь как 0, то логическое или, оно же
        // OR, являеться еквивалетнов логического сложения
        System.out.println("true | true = " + (true | true));
        boolean vt = true;
        boolean vf = false;
        System.out.println("true | false = " + (vt | vf));
        boolean vr = vf | vt;
        System.out.println("false | true = " + vr);
        boolean var1 = false;
        boolean var2 = false;
        var1 |= var2; // аналог += или -= еквивалентна var1 = var1 | var2
        System.out.println("false | false = " + (false | false));

        System.out.println("логическое и");
        // если и одно и другое правда, то результат правда
        // если представить true как 1, а ложь как 0, то логическое и, оно же
        // AND, являеться еквивалетнов логического умножения
        System.out.println("true & true = " + (true & true));
        vt = true;
        vf = false;
        System.out.println("true & false = " + (vt & vf));
        vr = vf & vt;
        System.out.println("false & true = " + vr);
        var1 = false;
        var2 = false;
        var1 &= var2; // аналог += или -= еквивалентна var1 = var1 & var2
        System.out.println("false & false = " + (false & false));

        // операция XOR
        System.out.println("логическое исключающее или XOR");
        // если значени разные то правда, если одинаковые, то ложь
        System.out.println("true ^ true = " + (true ^ true));
        vt = true;
        vf = false;
        System.out.println("true ^ false = " + (vt ^ vf));
        vr = vf ^ vt;
        System.out.println("false ^ true = " + vr);
        var1 = false;
        var2 = false;
        var1 ^= var2; // аналог += или -= еквивалентна var1 = var1 ^ var2
        System.out.println("false ^ false = " + (false ^ false));

        System.out.println("логическое инверсия");
        // если и одно и другое правда, то результат правда
        System.out.println("!true = " + (!true));
        var2 = !false;
        System.out.println("!false = " + var2);


        // с java 10 можно писать так
        var var = false;
        // но так нельзя
        // int int = 1;

        System.out.println(+5);

        System.out.println(-5);

        https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html

        System.out.println(1+-5);

    }
}
