package com.sun.btrace.runtime;

import org.junit.Test;

/**
 * Created by aaa on 18-1-17.
 */
public class AAATest extends InstrumentorTest {
    
    @Test
    public void methodEntryArgsDurationErrAAA() throws Exception {
        loadTargetClass("OnMethodTest");
        transform("onmethod/ArgsDurationErrAAA");
    
        checkTransformation(
                "TRYCATCHBLOCK L0 L1 L1 java/lang/Throwable\n" +
                        "LCONST_0\n" +
                        "LSTORE 6\n" +
                        "INVOKESTATIC java/lang/System.nanoTime ()J\n" +
                        "LSTORE 8\n" +
                        "FRAME FULL [resources/OnMethodTest java/lang/String J [Ljava/lang/String; [I J J] [java/lang/Throwable]\n" +
                        "INVOKESTATIC java/lang/System.nanoTime ()J\n" +
                        "LLOAD 8\n" +
                        "LSUB\n" +
                        "LSTORE 6\n" +
                        "DUP\n" +
                        "ASTORE 10\n" +
                        "ALOAD 0\n" +
                        "LLOAD 6\n" +
                        "ALOAD 10\n" +
                        "INVOKESTATIC resources/OnMethodTest.$btrace$traces$onmethod$ArgsDurationErrAAA$args (java/lang/String J [Ljava/lang/String; [I Ljava/lang/Object;JLjava/lang/Throwable;)V\n" +
                        "ATHROW\n" +
                        "MAXSTACK = 5\n" +
                        "MAXLOCALS = 11"
        );
    }
}
