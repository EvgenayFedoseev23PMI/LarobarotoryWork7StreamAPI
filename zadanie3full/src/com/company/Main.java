package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        clients.add(new Client(1,"Егор",34,"Мужчина",List.of(new Phone("43465346","Мобильный"))));
        clients.add(new Client(2,"Вера",67,"Женщина",List.of(new Phone("23647864","Стационарный"))));
        clients.add(new Client(3,"Юра",14,"Мужчина",List.of(new Phone("12376845","Мобильный"))));
        clients.add(new Client(4,"Света",28,"Жетщина",List.of(new Phone("3758947","Мобильный"))));
        clients.add(new Client(5,"Дима",10,"Мужчина",List.of(new Phone("3474668","Стационарный"))));
        clients.add(new Client(6,"Ольга",74,"Женщина",List.of(new Phone("34789690","Мобильный"))));
        Client oldestClientLandLine = clients.stream()
                .filter(client -> client.getPhones().stream()
                        .anyMatch(phone -> phone.getType().equals("Стационарный")))
                .max(Comparator.comparingInt(Client::getAge))
                .orElse(null);
        if (oldestClientLandLine != null) {
            System.out.println(oldestClientLandLine.getName());
            System.out.println(oldestClientLandLine.getAge());
        } else {
            System.out.println("Нет клиента со стационарным телефоном");
        }
        double averageAgeWithLandline = clients.stream()
                .filter(client -> client.getPhones().stream()
                        .anyMatch(phone -> phone.getType().equals("Стационарный")))
                .mapToInt(Client::getAge)
                .average()
                .orElse(0);
        System.out.println(averageAgeWithLandline);
        List<Client> clients18PlusWitnMobilePhone = clients.stream()
                .filter(client -> client.getAge() >= 18 && client.getPhones().stream()
                        .anyMatch(phone -> phone.getType().equals("Мобильный")))
                .collect(Collectors.toList());
        for (Client client : clients18PlusWitnMobilePhone) {
            System.out.println(client.getName());
            System.out.println(client.getAge());
        }
        boolean over60WithLandline = clients.stream()
                .anyMatch(client -> client.getGender().equals("Женщина") && client.getAge() > 60 && client.getPhones().stream()
                        .anyMatch(phone -> phone.getType().equals("Стационарный")));
        System.out.println(over60WithLandline);
    }
}
