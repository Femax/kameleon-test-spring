package ru.fedosov.kameleon.test.model;

import javax.persistence.*;

@Entity
@Table(name = "quote")
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String text;
    private Integer count;
    private String by;

    public Quote() {
    }

    public Quote(String text, Integer count, String by) {
        this.text = text;
        this.count = count;
        this.by = by;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }
}
