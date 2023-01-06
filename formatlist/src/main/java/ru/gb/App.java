package ru.gb;

/**
 * Имеются данные о группе студентов. 
 * У каждого студента есть средний балл (например, 4.6).
 * Создайте родительский класс ЗаписывательВФайл. 
 * Создайте три детских класса, которые записывают в файл информацию о студентах в разных формах.
 */

import java.io.*;
import java.util.*;

public class App 
{
    public static void main(String[] args) throws IOException {

        // формируем список объектов Student
        Map<String, Float> students = new HashMap<>();
        students.put("Иван Иванов", 4.8f);
        students.put("Мария Кузнецова", 5.0f);
        students.put("Степан Кузьмин", 3.6f);
        
        TxtFormat.saveAs(students);
        JsonFormat.saveAs(students);
        XmlFormat.saveAs(students);
    }

}