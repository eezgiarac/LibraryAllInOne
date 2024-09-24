package com.library.utility;

public class DatabaseHelper {


    public static String getBookByIdQuery(String bookID) {
        return "select * from books where id="+bookID;
    }

    public static String getCategoryIdQuery(String categoryName) {
        return "select id from book_categories where name='"+categoryName+"'";
    }
}
