package service;

import java.util.List;

public class CalculationService {
//outra maneira de declarar o metodo é: "<Tipe extends Comparable<? super Tipe>> Tipe max (List <Tipe>list)"
    public static <Tipe extends Comparable<Tipe>> Tipe max(List<Tipe> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("list can't be empty");
        }
        Tipe max = list.get(0);
        for (Tipe item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }


}
