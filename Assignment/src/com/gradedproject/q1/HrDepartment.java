package com.gradedproject.q1;

public class HrDepartment extends SuperDepartment{
    public  String departmentName()
    {
        //check
        return "HR Department";
    }
    public String getTodaysWork()
    {
        return "Complete your documents Submission";
    }
    public  String getWorkDeadline()
    {
        return "Complete by EOD";
    }
    public  String doActivity()
    {
        return "Team Lunch";
    }

}
