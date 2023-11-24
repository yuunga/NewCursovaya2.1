package com.example.newcursovaya;

public class Utils {
    public static final String DATABASE_NAME = "obshaga";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLE_RESERVATION = "Reservation";
    public static final String COLUMN_RESERVATION_ID = "reservation_id";
    public static final String COLUMN_STUDENT_ID = "student_id";
    public static final String COLUMN_MACHINE_ID = "machine_id";
    public static final String COLUMN_RESERVATION_TIME = "reservation_time";
    public static final String COLUMN_OTHER_RESERVATION_DETAILS = "other_reservation_details";

    public static final String TABLE_STUDENTS = "Students";
    public static final String COLUMN_STUDENT_ID_STUDENTS = "student_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_EMAIL = "email";
    public static final String COLUMN_OTHER_STUDENT_DETAILS = "other_student_details";

    public static final String TABLE_WASHING_MACHINES = "WashingMachines";
    public static final String COLUMN_MACHINE_ID_WASHING_MACHINES = "machine_id";
    public static final String COLUMN_MACHINE_NAME = "machine_name";
    public static final String COLUMN_AVAILABILITY = "availability";
    public static final String COLUMN_OTHER_MACHINE_DETAILS = "other_machine_details";

    public static final String TABLE_WEEKLY_USAGE = "WeeklyUsage";
    public static final String COLUMN_STUDENT_ID_WEEKLY_USAGE = "student_id";
    public static final String COLUMN_WEEK_START_DATE = "week_start_date";
    public static final String COLUMN_USED_MACHINES_COUNT = "used_machines_count";
}
