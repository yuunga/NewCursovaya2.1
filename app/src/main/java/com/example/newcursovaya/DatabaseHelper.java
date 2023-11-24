package com.example.newcursovaya;

import com.example.newcursovaya.ui.DataObshaga.Student;
import com.example.newcursovaya.ui.broadcast.BroadcastFragment;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.newcursovaya.Utils.*;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {
    public DatabaseHelper(BroadcastFragment context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE_RESERVATION = "CREATE TABLE " + TABLE_RESERVATION +
                "(" + COLUMN_RESERVATION_ID + " INTEGER NOT NULL PRIMARY KEY," +
                COLUMN_STUDENT_ID + " INTEGER NOT NULL," +
                COLUMN_MACHINE_ID + " INTEGER NOT NULL," +
                COLUMN_RESERVATION_TIME + " TEXT," +
                COLUMN_OTHER_RESERVATION_DETAILS + " TEXT," +
                "FOREIGN KEY(" + COLUMN_STUDENT_ID + ") REFERENCES " + TABLE_STUDENTS + "(" + COLUMN_STUDENT_ID_STUDENTS + ")," +
                "FOREIGN KEY(" + COLUMN_MACHINE_ID + ") REFERENCES " + TABLE_WASHING_MACHINES + "(" + COLUMN_MACHINE_ID_WASHING_MACHINES + "))";
        db.execSQL(CREATE_TABLE_RESERVATION);

        String CREATE_TABLE_STUDENTS = "CREATE TABLE " + TABLE_STUDENTS +
                "(" + COLUMN_STUDENT_ID_STUDENTS + " INTEGER NOT NULL," +
                COLUMN_NAME + " TEXT NOT NULL," +
                COLUMN_EMAIL + " TEXT NOT NULL," +
                COLUMN_OTHER_STUDENT_DETAILS + " TEXT NOT NULL," +
                "PRIMARY KEY(" + COLUMN_STUDENT_ID_STUDENTS + "))";
        db.execSQL(CREATE_TABLE_STUDENTS);

        String CREATE_TABLE_WASHING_MACHINES = "CREATE TABLE " + TABLE_WASHING_MACHINES +
                "(" + COLUMN_MACHINE_ID_WASHING_MACHINES + " INTEGER NOT NULL," +
                COLUMN_MACHINE_NAME + " TEXT NOT NULL," +
                COLUMN_AVAILABILITY + " INTEGER NOT NULL," +
                COLUMN_OTHER_MACHINE_DETAILS + " TEXT NOT NULL," +
                "PRIMARY KEY(" + COLUMN_MACHINE_ID_WASHING_MACHINES + "))";
        db.execSQL(CREATE_TABLE_WASHING_MACHINES);

        String CREATE_TABLE_WEEKLY_USAGE = "CREATE TABLE " + TABLE_WEEKLY_USAGE +
                "(" + COLUMN_STUDENT_ID_WEEKLY_USAGE + " INTEGER NOT NULL," +
                COLUMN_WEEK_START_DATE + " INTEGER NOT NULL," +
                COLUMN_USED_MACHINES_COUNT + " INTEGER NOT NULL," +
                "FOREIGN KEY(" + COLUMN_STUDENT_ID_WEEKLY_USAGE + ") REFERENCES " + TABLE_STUDENTS + "(" + COLUMN_STUDENT_ID_STUDENTS + "))";
        db.execSQL(CREATE_TABLE_WEEKLY_USAGE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Обновление базы данных при изменении версии
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_RESERVATION);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_STUDENTS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_WASHING_MACHINES);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_WEEKLY_USAGE);
        onCreate(db);
    }

    public void addStudent(Student student) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_NAME, student.getName());
        contentValues.put(COLUMN_EMAIL, student.getEmail());
        contentValues.put(COLUMN_OTHER_STUDENT_DETAILS, student.getOtherDetails());

        db.insert(TABLE_STUDENTS, null, contentValues);
        db.close();
    }

    public Student getStudent(int studentId) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_STUDENTS, new String[]{COLUMN_STUDENT_ID_STUDENTS, COLUMN_NAME, COLUMN_EMAIL,
                        COLUMN_OTHER_STUDENT_DETAILS}, COLUMN_STUDENT_ID_STUDENTS + "=?", new String[]{String.valueOf(studentId)},
                null, null, null, null);
        if (cursor != null) {
            cursor.moveToFirst();
        }
        Student student = new Student(Integer.parseInt(cursor.getString(0)), cursor.getString(1),
                cursor.getString(2), cursor.getString(3));
        return student;
    }

    public List<Student> getAllStudent() {
        SQLiteDatabase db = this.getReadableDatabase();
        List<Student> studentList = new ArrayList<>();
        String selectAllStudents = "SELECT * FROM " + TABLE_STUDENTS;
        Cursor cursor = db.rawQuery(selectAllStudents, null);

        if (cursor.moveToFirst()) {
            do {
                Student student = new Student();
                student.setStudentId(Integer.parseInt(cursor.getString(0)));
                student.setName(cursor.getString(1));
                student.setEmail(cursor.getString(2));
                student.setOtherDetails(cursor.getString(3));
                studentList.add(student);
            } while (cursor.moveToNext());

        }
        return studentList;
    }
}