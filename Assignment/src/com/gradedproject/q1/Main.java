package com.gradedproject.q1;

public class Main {
    public static void main(String[] args)
    {
        AdminDepartment ad=new AdminDepartment();
        HrDepartment hr=new HrDepartment();
        TechDepartment tech=new TechDepartment();
        System.out.println("Welcome to "+ad.departmentName());
        System.out.println(ad.getTodaysWork());
        System.out.println(ad.getWorkDeadline());
        System.out.println(ad.isTodayAHoliday());
        System.out.println();
        System.out.println("Welcome to "+hr.departmentName());
        System.out.println(hr.doActivity());
        System.out.println(hr.getTodaysWork());
        System.out.println(hr.getWorkDeadline());
        System.out.println(hr.isTodayAHoliday());
        System.out.println();
        System.out.println("Welcome to "+tech.departmentName());
        System.out.println(tech.getTodaysWork());
        System.out.println(tech.getWorkDeadline());
        System.out.println(tech.getTechStackInformation());
        System.out.println(tech.isTodayAHoliday());







    }
}
