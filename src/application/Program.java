package application;

import entites.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String file = "/home/dayane/Documents/exercicio-generics";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");

                productList.add(new Product(fields[0], Double.parseDouble(fields[1])));


            }


        } catch (IOException e) {


        }

    }
}

