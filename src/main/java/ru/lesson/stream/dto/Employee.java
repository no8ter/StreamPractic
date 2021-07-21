package ru.lesson.stream.dto;

import java.util.Objects;

/**
 * Сущность сотрудник.
 */
public class Employee {
    /**
     * Идентификатор
     */
    private int id;
    /**
     * Имя
     */
    private String name;

    /**
     * Должность
     */
    private PositionType positionType;

    /**
     * Райтинг
     */
    private int rating;

    public Employee(int id, String name, PositionType positionType, int rating) {
        this.id = id;
        this.name = name;
        this.positionType = positionType;
        this.rating = rating;
    }

    public Employee(int id, String name, int rating) {
        this(id, name, PositionType.UNKNOWN, rating);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                rating == employee.rating &&
                Objects.equals(name, employee.name) &&
                positionType == employee.positionType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, positionType, rating);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", positionType=" + positionType +
                ", rating=" + rating +
                '}';
    }
}
