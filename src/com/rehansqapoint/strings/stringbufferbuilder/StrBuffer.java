package com.rehansqapoint.strings.stringbufferbuilder;

public class StrBuffer {
    public static void main(String[] args) {

        StringBuffer buffer=new StringBuffer("india");//max 16 characters
        //beyond 16 character --size will auto adjust by the compiler no error
        buffer.append("hello");
        buffer.reverse();
        System.out.println(buffer);

        StringBuilder builder=new StringBuilder();
        builder.append("hey java");
        System.out.println(builder);


    }
}
