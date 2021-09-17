package dev.lucas.codigos.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class TestaFormaSimples {

    public static void main(String[] args) {
        Consumer<String> print = System.out::println;

        Stream<String> clouds = Stream.of("AWS ", "Google Cloud ", "Azure\n");
        clouds.forEach(print);

        String[] clouds2 = {"IBM Cloud ", "Alibaba Cloud", "Oracle ", "Salesforce\n"};

        Stream.of(clouds2).forEach(print);
        Arrays.stream(clouds2).forEach(print);
        Arrays.stream(clouds2, 1, 4).forEach(print);

        List<String> clouds3 = Arrays.asList("DigitalOcean ", "Heroku ", "MaxiHost\n");

        // Sincrono
        clouds3.stream().forEach(print);

        // Assincrono
        clouds3.parallelStream().forEach(print);

    }
}
