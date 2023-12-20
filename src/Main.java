import java.awt.datatransfer.SystemFlavorMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var Box = 7;
        System.out.println(Box);
        Box = Box + 4;
        System.out.println(Box);
        Box = Box - 6;
        System.out.println(Box);
        Box = Box * 5;
        System.out.println(Box);
        Box = Box / 4;
        System.out.println(Box);


        var liftingCapacity = 50;
        var staffWeight = 20;
        var copacityLeft = liftingCapacity - staffWeight;
        System.out.println("Еще можно положить" + copacityLeft + "кг вещей");
        var appleWeight = 4;
        var orangesWeight = 6;
        var fruitWeight = appleWeight + orangesWeight;
        System.out.println("Общий вес фруктов" + fruitWeight);

        var meatWeight = 3;
        var waterWeight = 4;
        var tomatoesWeight = 2;
        var cucumberWeight = 3;
        var peppersWeight = 2;
        var zucchiniWeight = 2;
        var vegetableWeight = tomatoesWeight + cucumberWeight + peppersWeight + zucchiniWeight;
        var productsWeight = fruitWeight + vegetableWeight + meatWeight + waterWeight;
        System.out.println("Общий вес продуктов" + productsWeight +"кг!");

        var leftWeight  = liftingCapacity - staffWeight - productsWeight;
        System.out.println("Места осталось" + leftWeight + "кг!");

        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов" + productsWeight);

        leftWeight = liftingCapacity - staffWeight - productsWeight;
        System.out.println("Теперь места осталось" + leftWeight + "кг!");

        var overload = (staffWeight + productsWeight) % liftingCapacity;
        System.out.println("Прегруз на" + overload + "кг!");

        var productsInOneCar = productsWeight / 2;
        System.out.println("Продуктов в одной машине теперь" + productsInOneCar);

        var cat = 3.6;
        System.out.println(cat);
        var dog = 8.0;
        System.out.println(dog);
        var paper = 763789;
        System.out.println(paper);

        var X = 3.6;
        var Y = 4;
        var Result = X + Y;
        System.out.println("X + Y" + Result);
        var x = 8.0;
        var y = 4;
        var result = x + y;
        System.out.println("x + y" + result);
        var xx = 763789;
        var yy = 4;
        var rEsult = xx + yy;
        System.out.println("xx + yy" + rEsult);

        var xxx = 12.0;
        var yyy = 3.5;
        var reSult = xxx - yyy;
        System.out.println("xxx - yyy" + reSult);
        var xxxx = 7.6;
        var yyyy = 1.6;
        var resUlt = xxxx - yyyy;
        System.out.println("xxxx - yyyy" + resUlt);
        var xxxxx = 763793;
        var yyyyy = 7639;
        var ressuLt = xxxxx - yyyyy;
        System.out.println("xxxxx - yyyyy" + ressuLt);

        var friend = 19;
        System.out.println(friend);
        var a = 19;
        var q = 2;
        var resulT = a + q;
        System.out.println("a + q" + resulT);
        var A = 21;
        var Q =7;
        var reSUlt = A / Q;
        System.out.println("A / Q" + reSUlt);

        var frog = 3.5;
        System.out.println(frog);
        var w = 3.5;
        var r = 10;
        var resuLT = w * r;
        System.out.println("w * r" + resuLT);
        var t = 35;
        var u = 3.5;
        var reSuLt = t / u;
        System.out.println("t / u" + reSuLt);
        var W = 10.0;
        var R = 4;
        var RESult = W + R;
        System.out.println("W + R" + RESult);

        var firstBoxer = 78.2;
        System.out.println(firstBoxer);
        var secondBoxer = 82.7;
        System.out.println(secondBoxer);
        var f = 78.2;
        var g = 82.7;
        var resULT = f + g;
        System.out.println("f + g" + resULT);
        var G = 82.7;
        var F = 78.2;
        var  resUlT = G - F;
        System.out.println("G - F" + resUlT);

        var j = 82.7;
        var k = 78.2;
        var ReSult = (j / k);
        System.out.println("j / k" + ReSult);

        var openingHours = 640;
        var everyEmployee = 8;
        var totalWorkers = openingHours / everyEmployee;
        System.out.println("Всего работников в компании " + totalWorkers + "человек");

        var o = 94;
        var p = 80;
        var onWorkers = o + p;
        System.out.println("o + p" + onWorkers);
        var ifWorksTheCompany = 174;
        var oneWorkers = 8;
        var ifWorksAcompany = ifWorksTheCompany * oneWorkers;
        System.out.println("Если в компании работает 174 человека " + "то часов может быть поделенно между сотрудниками " + ifWorksTheCompany + oneWorkers);










    }
}