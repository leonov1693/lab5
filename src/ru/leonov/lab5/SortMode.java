package ru.leonov.lab5;

import java.util.Comparator;
/**
Вспомогательный класс для сортировки
 */
public class SortMode implements Comparator<Line> {

    private boolean sortUp;
    private int sortMode;

    public SortMode(boolean sortUp, int sortMode) {
        this.sortUp = sortUp;
        this.sortMode = sortMode;
    }

    @Override
    public int compare(Line l1, Line l2) {
        int res = 0;
        if (sortMode == 0) {
            if (l1.getId() > l2.getId()) {
                res = 1;
            } else if (l1.getId() < l2.getId()) {
                res = -1;
            }
        } else if (sortMode == 1) {
            res = l1.getName().compareTo(l2.getName());
        } else {
            if (l1.degree() > l2.degree()) {
                res = 1;
            } else if (l1.degree() < l2.degree()) {
                res = -1;
            }
        }
        if (sortUp) {
            res *= (-1);
        }
        return res;
    }
}
