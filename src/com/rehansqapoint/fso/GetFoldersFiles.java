package com.rehansqapoint.fso;

import java.io.File;

public class GetFoldersFiles {
    public static void main(String[] args) {
        File f=new File("Results");
        File[] arr=f.listFiles();
        for (File file:arr) {

            if(file.isFile()){
                System.out.println(file);
            }
        }
    }
}
