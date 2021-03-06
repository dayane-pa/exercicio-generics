package application;

import entites.Product;
import service.CalculationService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        String file = "/home/dayane/Documents/exercicio-generics";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");

                productList.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = bufferedReader.readLine();
            }
            Product product = CalculationService.max(productList);
            System.out.println("max: ");
            System.out.println(product);

        } catch (IOException e) {
            System.out.println("Erroe:" + e.getMessage());


        }

    }
}

