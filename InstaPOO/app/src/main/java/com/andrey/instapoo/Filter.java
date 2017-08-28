package com.andrey.instapoo;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by andrey on 24/08/17.
 */

public class Filter extends MainActivity {
    public Bitmap GetRGB(Bitmap bitmap){
        int x = 0;
        int y = 0;
        int color = bitmap.getPixel(x,y);
        int red = Color.red(color);
        int blue = Color.blue(color);
        int green = Color.green(color);
        int alpha = Color.alpha(color);
        int GrayFilter = (red+blue+green)/3;
        blue = GrayFilter;
        red = GrayFilter;
        green = GrayFilter;
        return bitmap;


    }
}
