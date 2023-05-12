//package src.seminars.Kata.Block_3;
//
//public class Ex_3_2_4 {
//    public static void main(String[] args) {
//        BankClient client1 = new BankClient("Bad");
//        BankClient client2 = new BankClient("Problem with law");
//        BankClient client3 = new BankClient("Good history");
//        BankWorker employee = new BankEmployee();
//
//        System.out.println(getCreditForClient(employee, client1));
//        System.out.println(getCreditForClient(employee, client2));
//        System.out.println(getCreditForClient(employee, client3));
//    }
///*
//* Есть класс BankClient - это класс, описывающий клиента банка.
//
//Есть интерфейс BankWorker. Объект класса, который реализует этот интерфейс является работником банка,
//* в задачу которого входит одобрение или отклонение заявок на кредиты.
//
//У него есть метод checkClientForCredit, который на вход принимает экземпляр BankClient и возвращает true,
// если всё впорядке и кредит переданному клиенту можно выдавать, или false - если клиент не подходит под условия кредита.
//Также, этот метод может выбросить исключение BadCreditHistoryException, если у клиента плохая кредитная история.
//* Или ProblemWithLawException, если у клиента есть проблемы с законом.
//
//Ваша задача:
//
//Реализовать метод getCreditForClient, который принимает работника банка и клиента, который хочет получить кредит.
// Метод должен возвращать true - если кредит выдать можно и все условия соблюдены и false если есть какие-то проблемы.
//*  Если клиенту отказали в выдаче кредита по причине плохой банковской истории - метод должен выводить в
//* консоль сообщение "Проблемы с банковской историей", если клиенту отказали по причине проблем с законом то
//* ничего выводить на экран не нужно.
//*/
//
//
//
//    public boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) {
//        BankWorker bankWorker =new BankWorker;
//        BankClient bankClient = new BankClient;
//        try  {
//            return checkClientForCredit;
//        }
//    } catch(BadCreditHistoryException e) {
//        System.out.println("Проблемы с банковской историей");
//    } catch(ProblemWithLawException e) {
//
//    }
//}
//
//
//}
//
