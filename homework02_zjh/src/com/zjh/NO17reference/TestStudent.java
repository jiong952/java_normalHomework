package com.zjh.NO17reference;

import java.util.function.Consumer;

public class TestStudent {
    public static void main(String[] args) {
        Student underGraduate = new Student("3120005043", "张俊鸿", 99, 1);
        Scholarship s1 = underGraduate::calUnderScholarship;
        s1.calScholarship(underGraduate.rank);
        Student postGraduate = new Student("3120008888", "洪俊章", 66, 10);
        Scholarship s2 = postGraduate::calPostScholarship;
        s2.calScholarship(postGraduate.rank);
    }
}
