package ru.skypro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 1) {
                System.out.print(nums.get(i) + " ");
            }
        }
        System.out.println();

        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 3, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums2.size(); i++) {
            if (nums2.get(i) % 2 == 0) {
                System.out.print(nums2.get(i) + " ");
            }
        }
        System.out.println();
        final Set<String> tracking = new HashSet<>();
        final Set<String> duplicates = new HashSet<>();
        List<String> nums3 = new ArrayList<>(List.of("привет", "учеба", "еда", "работа", "торт", "привет", "гора"));
        for (String user : nums3) {
            if (!tracking.add(user)) {
                 duplicates.add(user);
            }
        }
        System.out.println(duplicates);
        System.out.println(tracking);


        }
    }


