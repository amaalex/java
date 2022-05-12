package bonus;

import compulsory.items.City;
import homework.repositories.AbstractRepositoryJPA;

public class Main {
    public static void main(String[] args){
        ProducerRepositories producerRepositories = new ProducerRepositories();
        producerRepositories.chooseProvider("src/main/resources/initializationFile.txt");
        AbstractRepositoryJPA abstractRepository = (AbstractRepositoryJPA) producerRepositories.getCity();
        City city = (City) abstractRepository.findById(1);
        System.out.println(city.getName());
    }
}
