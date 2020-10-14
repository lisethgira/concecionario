package com.example.concecionario;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class basedatossqlite extends SQLiteOpenHelper {

    //definir las variable con las instrucciones necesarias para crear las tablas de la BD

    String tblvendedor = "Create Table usuario (email text primary key, nombre text, clave text, rol text)";
    String tblvehiculo = "Create Table material (idmat text primary key, email text, nombre text, genero text)";

    public basedatossqlite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(tblvendedor); //esto crea la tabla previamente creada arriba

        db.execSQL(tblvehiculo);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE vendedor"); //esto lo que hace es para cuando uno modifique la tabla esto la actualiza automaticamente.
        db.execSQL(tblvendedor);            // estas dos lineas deben ponerse siempre que se cree una tabla.

        db.execSQL("DROP TABLE vehiculo");
        db.execSQL(tblvehiculo);


    }
}
