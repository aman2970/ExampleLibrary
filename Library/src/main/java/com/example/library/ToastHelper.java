package com.example.library;

import android.content.Context;
import android.widget.Toast;

public class ToastHelper {
    public static void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
