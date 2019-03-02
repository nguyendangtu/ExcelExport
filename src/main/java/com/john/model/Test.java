package com.john.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TEST")
public class Test {
    @Id
    @Column(name = "TEST_ID")
    private int testID;

    @Column(name = "NAME")
    private String name;

    public int getColumnCount() {
        return getClass().getDeclaredFields().length;
    }

}
