package com.example.springbooth2console;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by mtumilowicz on 2018-07-15.
 */
@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer {
    @Id
    Long id;
    String name;
}
