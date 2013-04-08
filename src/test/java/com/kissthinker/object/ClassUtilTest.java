package com.kissthinker.object;

import static com.kissthinker.object.ClassUtil.pathAndClassName;
import static org.junit.Assert.assertEquals;

import java.beans.Encoder;

import org.junit.Test;

/**
 * @author David Ainslie
 *
 */
public class ClassUtilTest
{
    /**
     *
     */
    public ClassUtilTest()
    {
        super();
    }

    /**
     *
     */
    @Test
    public void name()
    {
        String expectedName = "Encoder";

        assertEquals(expectedName, ClassUtil.name(Encoder.class));
        assertEquals(expectedName, ClassUtil.name(new Encoder()));
    }

    /**
     *
     */
    @Test
    public void path()
    {
        assertEquals("com/kissthinker/object/ClassUtil.properties", pathAndClassName(ClassUtil.class, ".properties"));
    }
}