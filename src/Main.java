import java.awt.datatransfer.SystemFlavorMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var box = 7;
        System.out.println(box);
        box = box + 4;
        System.out.println(box);
        box = box - 6;
        System.out.println(box);
        box = box * 5;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);


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
        System.out.println("Общий вес продуктов" + productsWeight + "кг!");

        var leftWeight = liftingCapacity - staffWeight - productsWeight;
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

        var cats = 3.6 + 4;
        System.out.println(cats);
        var dogs = 8.0 + 4;
        System.out.println(dogs);
        var papers = 763789 + 4;
        System.out.println(papers);

        (dog) = 12.0 - 3.5;
        System.out.println((dog));
        (cat) = 7.6 - 1.6;
        System.out.println(cat);
        (paper) = 763793 - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        var friends = 19 + 2;
        System.out.println(friends);
        (friend) = 21 / 7;
        System.out.println((friend));

        var frog = 3.5;
        System.out.println(frog);
        var frogs = 3.5 * 10;
        System.out.println(frogs);
        frog = frogs / 3.5;
        System.out.println(frog);
        (frog) = frog + 4;
        System.out.println((frog));

        var firstBoxer = 78.2;
        System.out.println(firstBoxer);
        var secondBoxer = 82.7;
        System.out.println(secondBoxer);

        var totalWeight = (firstBoxer + secondBoxer);
        System.out.println(totalWeight);

        secondBoxer = 82.7;
        firstBoxer = 78.2;
        var differenceBetweenFighters = secondBoxer - firstBoxer;
        System.out.println("на " + differenceBetweenFighters + "кг перевес!");

        secondBoxer = 82.7;
        firstBoxer = 78.2;
        var ReSult = (secondBoxer / firstBoxer);
        System.out.println(ReSult);

        var openingHours = 640;
        var everyEmployee = 8;
        var totalWorkers = openingHours / everyEmployee;
        System.out.println("Всего работников в компании " + totalWorkers + " человек");

        var ifWork = 94;
        totalWorkers = 80;
        var onWorkers = ifWork + totalWorkers;
        System.out.println(onWorkers);
        var ifWorksTheCompany = 174;
        var oneWorkers = 8;
        var ifWorksAcompany = ifWorksTheCompany * oneWorkers;
        System.out.println("Если в компании работает 174 человека " + "то часов может быть поделенно между сотрудниками " + ifWorksTheCompany + oneWorkers);


    }
}