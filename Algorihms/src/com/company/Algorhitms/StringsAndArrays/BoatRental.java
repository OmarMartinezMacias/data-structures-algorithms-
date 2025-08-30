package com.company.Algorhitms.StringsAndArrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BoatRental {

    public static void main(String[] args) {
            // 🔹 Primera prueba (de la primera imagen)
            String input1 = String.join("\n",
                    "Dec 08 00 - Dec 12 24",
                    "Dec 01 06 - Dec 05 12",
                    "Dec 29 00 - Dec 30 24",
                    "Dec 17 12 - Dec 21 24",
                    "Dec 23 12 - Dec 27 06"
            );

            int result1 = solution(input1);
            System.out.println("Resultado de la primera prueba: " + result1 + " horas ocupadas en un día");

            // 🔹 Segunda prueba (de la segunda imagen)
            String input2 = String.join("\n",
                    "Dec 01 00 - Dec 15 00",
                    "Dec 16 00 - Dec 31 24"
            );

            int result2 = solution(input2);
            System.out.println("Resultado de la segunda prueba: " + result2 + " horas ocupadas en un día");
    }

    public static class Interval {
        int start;
        int end;

        Interval(int startDay, int startHour, int endDay, int endHour) {
            this.start = startDay * 24 + startHour;
            this.end = endDay * 24 + endHour;
        }
    }

    public static int solution(String input) {
        String[] lines = input.split("\n");
        List<Interval> intervals = new ArrayList<>();

        for (String line : lines) {
            String[] parts = line.split(" - ");
            String[] startParts = parts[0].split(" ");
            String[] endParts = parts[1].split(" ");

            int startDay = Integer.parseInt(startParts[1]) - 1;
            int startHour = Integer.parseInt(startParts[2]);
            int endDay = Integer.parseInt(endParts[1]) - 1;
            int endHour = Integer.parseInt(endParts[2]);

            intervals.add(new Interval(startDay, startHour, endDay, endHour));
        }

        intervals.sort(Comparator.comparingInt(i -> i.start));

        List<Interval> merged = new ArrayList<>();
        for (Interval curr : intervals) {
            if (merged.isEmpty() || curr.start > merged.get(merged.size() - 1).end) {
                merged.add(curr);
            } else {
                Interval last = merged.get(merged.size() - 1);
                last.end = Math.max(last.end, curr.end);
            }
        }

        int maxFree = 0;
        for (int i = 1; i < merged.size(); i++) {
            int gap = merged.get(i).start - merged.get(i - 1).end;
            maxFree = Math.max(maxFree, gap);
        }

        return maxFree;
    }
}
