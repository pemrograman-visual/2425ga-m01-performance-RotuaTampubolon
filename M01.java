// 12S24028 - Rotua Immanuela Tampubolon
// 12S24002 - Petra Ignatius Pengayoman Naibaho
import java.util.*;
import java.lang.Math;

public class M01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int totalcredit;
        int indeks;
        double performa;
        double indekssementara;
        double performaakhir;
        double score;
        double a, aB, b, bC, c, d, e;
        String grade;
        String credit;

        totalcredit = 4.0;
        credit = input.nextLine();
        while (!credit.equals("---")) {
            grade = input.nextLine();
            if (grade.equals("A")) {
                score = 4.0;
            } else {
                if (grade.equals("AB")) {
                    score = 3.5;
                } else {
                    if (grade.equals("B")) {
                        score = 3.0;
                    } else {
                        if (grade.equals("BC")) {
                            score = 2.5;
                        } else {
                            if (grade.equals("C")) {
                                score = 2.0;
                            } else {
                                if (grade.equals("D")) {
                                    score = 1.0;
                                } else {
                                    if (grade.equals("E")) {
                                        score = 0.0;
                                    } else {
                                        score = 0.0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            performa = totalcredit * score;
            System.out.println(performa);
            credit = input.nextLine();
        }
    }
}
