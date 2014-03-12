/*Программа для работы с классами : линия; прямая, параллельная Oх; прямая; 
 парабола; кубическая парабола.*/
package ru.leonov.lab5;

import ru.leonov.lab5.*;
import java.io.*;
import java.util.*;
/**
Главный класс
 */
public class Lab5 {

    private static List<Line> list;

    private static void init() { // создание и заполнение списка
        list = new ArrayList<>();
        list.add(new StrLineOx(2.0));
        list.add(new StrLine(1.0, 0.0));
        list.add(new Parabola(1.0, 3.0, 7.0));
        list.add(new CubicParabola(8.0, 4.0, 1.0, 9.0));
        list.add(new StrLine(3.0, 5.0));
        list.add(new Parabola(4.0, 8.0, 7.0));
        list.add(new StrLineOx(10.0));
        list.add(new CubicParabola(1.0, 5.0, 4.0, 6.0));
        list.add(new StrLine(7.0, 7.0));
        list.add(new Parabola(2.0, 3.0, 8.0));
    }

    public static void main(String[] args) throws IOException {
        init();
// подготовка к вводу
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        for (;;) { // начинаем бесконечный цикл
            System.out.println();
            System.out.println("Выберите тип сортировки (выйти - пустая строка):");
            System.out.println("--------------------------------------------------");
            System.out.println("1 - по возраcтанию id");
            System.out.println("2 - по убыванию id");
            System.out.println("3 - по возраcтанию имени");
            System.out.println("4 - по убыванию имени");
            System.out.println("5 - по возрастанию степени х");
            System.out.println("6 - по убыванию убыванию степени х");
            System.out.println("7 - определить принадлежность точки линии");
            System.out.println("8 - сдвиг вдоль оси Ox");
            System.out.println("9 - сдвиг вдоль оси Oy");
            System.out.println("10 - добавить объект в список");
            System.out.println("11 - удалить объект из списка");
            System.out.println("--------------------------------------------------");
            String mode = br.readLine(); // читаем строку из буфера ввода
            if (mode.isEmpty()) {
                break; // прерываем цикл, если строка пустая
            }
            boolean sortUp = mode.equals("2") || mode.equals("4") || mode.equals("6");
            int sortMode = 0;
            switch (mode) {
                case "1": {
                    sortUp = false;
                    sortMode = 0;
                    break;
                }
                case "2": {
                    sortUp = true;
                    sortMode = 0;
                    break;
                }
                case "3": {
                    sortUp = false;
                    sortMode = 1;
                    break;
                }
                case "4": {
                    sortUp = true;
                    sortMode = 1;
                    break;
                }
                case "5": {
                    sortUp = false;
                    sortMode = 2;
                    break;
                }
                case "6": {
                    sortUp = true;
                    sortMode = 2;
                    break;
                }
                case "7": {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Введите координаты точки: ");
                    double x = sc.nextDouble();
                    double y = sc.nextDouble();
                    System.out.println("Введите id проверяемой линии: ");
                    int id = sc.nextInt();
                    Point p = new Point(x, y);
                    if (list.get(id - 1).isBelong(p) == true) {
                        System.out.println("Линия проходит ч/з точку!");
                    } else {
                        System.out.println("Линия не проходит ч/з точку!\n");
                    }
                    break;
                }
                case "8": {
                    Scanner sс = new Scanner(System.in);
                    System.out.println("Введите величину сдвига:");
                    double k = sс.nextDouble();
                    System.out.println("Введите id сдвигаемой линии: ");
                    int id = sс.nextInt();
                    if (k == 0) {
                        break;
                    } else {
                        list.get(id - 1).moveX(k);
                    }
                    break;
                }
                case "9": {
                    Scanner sс = new Scanner(System.in);
                    System.out.println("Введите величину сдвига:");
                    double k = sс.nextDouble();
                    System.out.println("Введите id сдвигаемой линии: ");
                    int id = sс.nextInt();
                    list.get(id - 1).moveY(k);
                    break;
                }
                case "10": {

                    System.out.println("1 - Прямая, параллельная Ox");
                    System.out.println("2 - Прямая");
                    System.out.println("3 - Парабола");
                    System.out.println("4 - Кубическая парабола");
                    mode = br.readLine();
                    switch (mode) {
                        case "1": {
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Введите коэф-т а:");
                            double aa = sc.nextDouble();
                            list.add(new StrLineOx(aa));
                            break;
                        }
                        case "2": {
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Введите коэф-т а:");
                            double aa = sc.nextDouble();
                            System.out.println("Введите коэф-т b:");
                            double bb = sc.nextDouble();
                            list.add(new StrLine(aa, bb));
                            break;
                        }
                        case "3": {
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Введите коэф-т а:");
                            double aa = sc.nextDouble();
                            System.out.println("Введите коэф-т b:");
                            double bb = sc.nextDouble();
                            System.out.println("Введите коэф-т c:");
                            double cc = sc.nextDouble();
                            list.add(new Parabola(aa, bb, cc));
                            break;
                        }
                        case "4": {
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Введите коэф-т а:");
                            double aa = sc.nextDouble();
                            System.out.println("Введите коэф-т b:");
                            double bb = sc.nextDouble();
                            System.out.println("Введите коэф-т c:");
                            double cc = sc.nextDouble();
                            System.out.println("Введите коэф-т d:");
                            double dd = sc.nextDouble();
                            list.add(new CubicParabola(aa, bb, cc, dd));
                            break;
                        }
                    }
                    break;
                }
                case "11": {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Введите id удаляемого объекта: ");
                    int id = sc.nextInt();
                    list.remove(id - 1);
                }
            }
            Collections.sort(list, new SortMode(sortUp, sortMode));
            for (Line l : list) {
                System.out.println(l);
            }

        }
    }
}
