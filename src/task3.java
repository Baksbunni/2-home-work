public class task3 {
    public static void main(String[] args) {
        // Задание 1.
        byte beverages = 8;
        System.out.println("гозировка = " + beverages);
        short loaf = 4;
        System.out.println(" батон = " + loaf);
        int tomatos = 5;
        System.out.println(" помидоры = " + tomatos);
        long cheese = 2;
        System.out.println( " сыр = " + cheese);
        float appleBox = 5.26F;
        System.out.println(" яблоки = " + appleBox);
        double pearsBox = 8.456;
        System.out.println(" груши = " + pearsBox);

        // Задание 2.
        byte sweets = 67;
        System.out.println(sweets);
        short peapers = -159;
        System.out.println(peapers);
        int hauses = 569;
        System.out.println(hauses);
        double bicycles = 2.786;
        System.out.println(bicycles);
        short peoples = 27897;
        System.out.println(peoples);
        long maneysBanks = 987678965549L;
        System.out.println(maneysBanks);
        float potatoWeight = 27.12F;
        System.out.println(potatoWeight);

        // Задание 3.
        byte ЛюдмилаПавловна = 23;
        System.out.println("у Людмилы Павловны " + ЛюдмилаПавловна + " ученика");
        byte АннаСергеевна = 27;
        System.out.println("У Анны Сергеевны " + АннаСергеевна + " учеников");
        byte ЕкатеринаАндреевна = 30;
        System.out.println("у Екатерины Андреевны " + ЕкатеринаАндреевна + " учеников");
        short sheetsPurchasedTotal = 480;
        System.out.println(sheetsPurchasedTotal);
        int totalStudents = ЛюдмилаПавловна + АннаСергеевна + ЕкатеринаАндреевна;
        System.out.println("всего учеников " + totalStudents);
        int sheetForEachStudent = sheetsPurchasedTotal / totalStudents;
        System.out.println("на каждого ученика расчитано " + sheetForEachStudent + " листов бумаги");

        // Задача 4.
        byte time2 = 16;
        System.out.println("производит машина за 2 минуты = " + time2 + " штук бутылок");
        int time20 = time2 * 20 / 2;
        System.out.println("производит машина за 20 минут = " + time20 + " штук бутылок");
        int time24 = time2 * 1440 / 2;
        System.out.println("производит машина за 1440 минут = " + time24 + " штук бутылок");
        int time4320 = time2 * 4320 / 2;
        System.out.println("производит машина за 4320 минут = " + time4320 + " штуук бутылок");
        int time43200 = time2 * 43200 / 2;
        System.out.println("производит машина за 43 200 минут = " + time43200 + " штук бутылок");

        // Задача 5.
        byte brownPaint = 4;
        byte whitePaint = 2;
        int allPaints = brownPaint + whitePaint;
        System.out.println("краски нужно на один класс = " + allPaints + " шт");
        byte paint = 120;
        byte allPaint = 6;
        int classesAtSchool = paint / allPaint;
        System.out.println("классов в школе = " + classesAtSchool + " шт");
        int whitePaintOneClass = classesAtSchool * whitePaint;
        System.out.println("В школе где 20 классов, нужно " + whitePaintOneClass + " банок белой краски");
        int brownPaintOneClass = classesAtSchool * brownPaint;
        System.out.println("В школе где 20 классов, нужно " + brownPaintOneClass + " банок коричневой краски");


        // Задачат 6.
        byte banans = 5;
        byte weightOneBanana = 80;
        int totalBanans = banans * weightOneBanana;
        System.out.println(" в 5 бананах = " + totalBanans + "грамм");

        int milk = 200;
        byte in100Ml = 105;
        int totalMilk = in100Ml * 2;
        System.out.println("в 200 мл молока = " + totalMilk + " грамм");

        byte iceCream = 2;
        byte oneBriquette = 100;
        int totalIceCream = oneBriquette * iceCream;
        System.out.println("в двух брикетах = " + totalIceCream + " грамм");

        byte rawEggs = 4;
        byte gtamOneEggs = 70;
        int gmTotalEggs = rawEggs * gtamOneEggs;
        System.out.println("в четырех сырых яйцах = " + gmTotalEggs + " грамм");

        int gmTotalProducts = totalBanans + totalMilk + totalIceCream + gmTotalEggs;
        System.out.println("во всех продуктах = " + gmTotalProducts + " граммов");

        float kg = gmTotalProducts / 1000;
        System.out.println("киллограмм = " + kg + " кг");

        // Задача 7.
        int everyDay1 = 250;
        int needThrowOff = 7000;
        int day1 = needThrowOff / everyDay1;
        System.out.println("дней нужно = " + day1 +" при 250 грамм в день");
        int everyDay2 = 500;
        int needThrowOff2 = 7000;
        int day2 = needThrowOff2 / everyDay2;
        System.out.println("дней нужно = " + day2 + " при 500 грамм в день");
        int averageDays = (day2 + day1) / 2;
        System.out.println("в среднем понадобиться дней = " + averageDays + " чтобы добиться результата");

        // Задача 8.
        int mashaReceives = 67760;
        float masha10 = mashaReceives * 0.01F;
        System.out.println("Маше повысят зарплату = " +  masha10);
        float nowGetsM = mashaReceives + masha10;
        System.out.println("теперь Маша получает "+ nowGetsM + " рублей");
        int beforePromotionM = mashaReceives * 12;
        System.out.println("до повышения Маши, она получала " + beforePromotionM + " рублей в год");
        float afterPromotionM = nowGetsM * 12;
        System.out.println("после повышения Маши, она получает " + afterPromotionM + " рублей в год");
        float differenceM = afterPromotionM - beforePromotionM;
        System.out.println("разница между годовым доходом Маши " + differenceM);

        int denisReceives = 83690;
        float denis10 = denisReceives * 0.01F;
        System.out.println("Денису повысят зарплату "+ denis10);
        float nowGetsD = denisReceives + denis10;
        System.out.println("теперь Денис получает " + nowGetsD + " рублей");
        int beforePromotionD = denisReceives * 12;
        System.out.println("до повышения Денис получал " + beforePromotionD + " рублей в год");
        float afterPromotionD = nowGetsD * 12;
        System.out.println("после повышения,Денис стал получать " + afterPromotionD + " рублей в год");
        float differeceD = afterPromotionD - beforePromotionD;
        System.out.println("разница между годовым доходом Дениса " + differeceD);

        int cristinaRecevies = 76230;
        float cristina10 = cristinaRecevies * 0.01F;
        System.out.println("Кристине повысят зарплату " + cristina10);
        float nowGetsC = cristinaRecevies + cristina10;
        System.out.println("теперь Кристина получает " + nowGetsC + "рублей");
        int beforePromotionC = cristinaRecevies * 12;
        System.out.println("получала Кристина до повышения " + beforePromotionC + " рублей в год");
        float afterPromotionC = nowGetsC * 12;
        System.out.println("получает Кристина после повышения " + afterPromotionC + " рублей в год");
        float differeceC = afterPromotionC - beforePromotionC;
        System.out.println("разница между годовым доходом Кристины " + differeceC);

    }
}

