public class Task10 {
    public static void main(String[] args) {
        //Работа в классе.
        String phone = "9604157537";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
//            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный ");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний!");
        }
        System.out.println("phone = " + phone);
        {
        }
        String street = "Манежная";
        String streetTrue = street.replace("М", "м");
        System.out.println(streetTrue);
        street = street + " площадь";
        System.out.println("Адресс магазина - " + street);
        System.out.println();
        String expectedPhone = "79604157537";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
        {
            String firstName = "Ivanov";
            String middleName = "Ivan";
            String lastName = "Ivanovich";
            String fullName = "Фамилия Имя Отчество";
            fullName = firstName + " " + middleName + " " + lastName;
            System.out.println("Ф.И.О. сотрудника - " + fullName);
        }
        //Задача 2.
        String fullName1 = "ivanov ivan ivanovich";
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName1.toUpperCase());
        {
        }
        // Задача 3.
        String fullName = "Иванов Семён Семёнович";
        String name = fullName.replace("ё", "е");
        System.out.println("Ф.И.О. сотрудника - " + name);

    }
}
