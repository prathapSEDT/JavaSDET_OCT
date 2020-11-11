package com.rehansqapoint.fso;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FoldersAutomation {
    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YY");
        Date d=new Date();
        String path="Results/"+sdf.format(d);
        File f=new File(path);

        if(!f.exists()){
            f.mkdirs();
        }



    }
}
