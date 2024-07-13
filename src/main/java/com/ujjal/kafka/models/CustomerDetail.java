package com.ujjal.kafka.models;

import lombok.Data;

@Data
public class CustomerDetail {
    private int id;
    private String name;
    private String email;
    private String contactNo;
    private Integer age;
}
