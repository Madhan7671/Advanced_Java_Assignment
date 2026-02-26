package com.capgemini.com.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LeaveType {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long leaveTypeId;

 private String leaveName;
 private int maxDaysAllowed;
}
