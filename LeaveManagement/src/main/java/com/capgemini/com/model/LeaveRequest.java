package com.capgemini.com.model;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LeaveRequest {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long requestId;

 @ManyToOne
 @JoinColumn(name="employee_id")
 private Employee employee;

 @ManyToOne
 @JoinColumn(name="leave_type_id")
 private String leaveType;

 private String startDate;
 private String endDate;
 private String status;
}
